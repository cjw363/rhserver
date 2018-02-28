package com.cjw.rhserver.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserContextHolder {
	private static Log logger=LogFactory.getLog(UserContextHolder.class);
	private static ThreadLocal<WebSecurityUser> userHolder=new ThreadLocal<WebSecurityUser>();
	/**
	 * 取当前登录的用户信息。如果没有登录则返回空
	 * @return
	 */
	public static WebSecurityUser getCurUser() {
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		if(authentication==null){
			return userHolder.get();
		}
		Object userObj=authentication.getPrincipal();
		if (userObj instanceof WebSecurityUser) {
			return (WebSecurityUser) userObj;
		}else{
			String errorMsg="当前的用户信息不是"+WebSecurityUser.class.getName()+"的子类，不符合规范！";
			logger.error(errorMsg);
			return null;
		}
	}
	
	public static void setCurUser(WebSecurityUser user){
		userHolder.set(user);
	}
	
	public static void clearUser(){
		SecurityContextHolder.clearContext();
	}
}
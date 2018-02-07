package cn.com.gzkit.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.gzkit.utils.CommUtil;
import cn.com.gzkit.utils.CommConst;

/**
 * 登录验证成功处理器
 */
public class LoginSuccessHandler implements AuthenticationSuccessHandler{
	private static Logger logger = LoggerFactory.getLogger(LoginSuccessHandler.class);
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    private String defaultTargetUrl;

    @Override  
    @Transactional(readOnly=false,propagation= Propagation.REQUIRED,rollbackFor={Exception.class})  
    public void onAuthenticationSuccess(HttpServletRequest request,  
            HttpServletResponse response, Authentication authentication) throws IOException, ServletException {  
    	saveLoginInfo(request, authentication);
    	request.getSession().removeAttribute(CommConst.AUTHENTICATION_EXCEPTION);
        redirectStrategy.sendRedirect(request, response, defaultTargetUrl);  
    }  
      
    @Transactional(readOnly=false,propagation= Propagation.REQUIRED,rollbackFor={Exception.class})  
    public void saveLoginInfo(HttpServletRequest request,Authentication authentication){  
        WebSecurityUser user = (WebSecurityUser)authentication.getPrincipal();  
        try {  
            String ip = CommUtil.getIpAddress(request);
            String message = String.format("用户 %s 成功登陆,当前IP地址为:%s",new Object[]{user.getUsername(),ip});
            logger.info(message);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }  
    }  
      
    public void setDefaultTargetUrl(String defaultTargetUrl) {
        this.defaultTargetUrl = defaultTargetUrl;  
    }  
}
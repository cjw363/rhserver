package com.cjw.rhserver.security;

import com.cjw.rhserver.utils.CommConst;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DefaultDeniedHandler implements AccessDeniedHandler {  
	private String accessDeniedUrl;
	  
    @Override
    public void handle(HttpServletRequest request,HttpServletResponse response,
    		AccessDeniedException accessDeniedException) throws IOException,ServletException {
    	if(request.getHeader("x-requested-with") != null 
    			&& request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){
    		throw new ServletException(CommConst.ACCESS_DENIED_403);
    	}else{
    		response.sendRedirect(request.getContextPath()+accessDeniedUrl);
    	}
    }
  
    public void setAccessDeniedUrl(String accessDeniedUrl) {
        this.accessDeniedUrl = accessDeniedUrl;
    }
}
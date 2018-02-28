package com.cjw.rhserver.security;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author 老毕
 * @version 1.0
 * @since 2017/3/3 0003
 */
public class WebAccessDecisionManager implements AccessDecisionManager{
    @Override
    public void decide(Authentication authentication, Object object,
    		Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        if(configAttributes == null){
            return;
        }
        Iterator<ConfigAttribute> itor = configAttributes.iterator();
        while (itor.hasNext()){
            ConfigAttribute configAttr = itor.next();
            String roleNeed = configAttr.getAttribute();
            for (GrantedAuthority hasAuth : authentication.getAuthorities()){
                if (roleNeed.equals(hasAuth.getAuthority())){
                    return;
                }
            }
        }

        throw new AccessDeniedException("No Right");
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
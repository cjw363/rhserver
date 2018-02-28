package com.cjw.rhserver.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.AntPathRequestMatcher;
import org.springframework.security.web.util.RequestMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author 老毕
 * @version 1.0
 * @since 2017/3/6 0006
 */
public class WebSecurityMetadataSource implements FilterInvocationSecurityMetadataSource{
	
    private static Logger logger = LoggerFactory.getLogger(WebSecurityMetadataSource.class);

    public static Map<String, Collection<ConfigAttribute>> resourceMap = new HashMap<String, Collection<ConfigAttribute>>();

    @Autowired
//    private NaviService securityService;

    /**
     * 初始化资源配置，启动时执行
     * spring 调用该方法的方式有2种
     * 方式1，方法上加注解：@PostConstruct
     * 方式2，配置文件中 init-method 属性指定：
     * <beans:bean id="xxxxx" init-method="initResource" class="xxxxx.xxxxx"/>
     */
    public void initResource(){
        //已经移到登录中加载了
    }

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        HttpServletRequest request = ((FilterInvocation)object).getRequest();
        Iterator<String> ite = resourceMap.keySet().iterator();
        while (ite.hasNext()) {
            String resourceUrl = ite.next();
            //还可以选择使用更强大的RegexRequestMatcher，它支持使用正则表达式对URL地址进行匹配
            RequestMatcher requestMatcher = new AntPathRequestMatcher(resourceUrl);
            if (requestMatcher.matches(request)) {
            	logger.info("已拦截地址："+resourceUrl+"需要权限："+resourceMap.get(resourceUrl));
                return resourceMap.get(resourceUrl);
            }
        }

        //防止数据库中没有数据，不能进行权限拦截，注释该代码块，数据库中没有分配权限的菜单不会被拦截
        /*Collection<ConfigAttribute> collection = new LinkedList<ConfigAttribute>();
        collection.add(new SecurityConfig("ROLE_ADMIN"));
        return collection*/;
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        Set<ConfigAttribute> allAttributes = new HashSet<ConfigAttribute>();
        for (Map.Entry<String, Collection<ConfigAttribute>> entry : resourceMap.entrySet()) {
            allAttributes.addAll(entry.getValue());
        }
        return allAttributes;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return FilterInvocation.class.isAssignableFrom(clazz);
    }
}
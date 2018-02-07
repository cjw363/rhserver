package cn.com.gzkit.security;

import cn.com.gzkit.entity.system.Menu;
import cn.com.gzkit.entity.system.Role;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;
import java.util.*;

public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired  
    private MessageSource messageSource;
	@Resource
//	private NaviService securityService;
	
	/**
	 * @param username 登录帐号
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /*String passwordStr = CommUtil.encodePassword("123",username);
        System.out.println(passwordStr);*/
        //登录验证类, 该对象用于和前台传入的值进行比较
        WebSecurityUser userDetails = null;//securityService.loadUserByUserName(username);
        if(userDetails == null){
        	throw new UsernameNotFoundException(
        			messageSource.getMessage("UserDetails.userNotFound",new Object[]{username}, null));  
        }
        initResource();
        Set<Role> roles = loadRoles(userDetails.getUserId());
        userDetails.setRoles(roles);
        Set<Menu> menus = loadMenus(userDetails.getUserId());
        userDetails.setMenus(menus);
        Collection<GrantedAuthority> auths = loadUserAuthorities(roles);
        userDetails.setAuthorities(auths);
        return userDetails;
	}

    /**
     * 根据用户获取该用户拥有的角色
     * @return
     */
	private Set<GrantedAuthority> loadUserAuthorities(Set<Role> roles) {
		Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
		for(Role role : roles){
			grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleId()));
		}
        return grantedAuthorities;
	}

    private Set<Role> loadRoles(Long userId){
        List<Role> roleList = null;//securityService.loadRoleByUser(userId);
        Set<Role> roles = new HashSet<Role>(roleList);
        return roles;
    }

    private Set<Menu> loadMenus(Long userId){
        List<Menu> menuList = null;//securityService.loadMenuByUser(userId);
        Set<Menu> menus = new HashSet<Menu>(menuList);
        return menus;
    }
    
    public void initResource(){
    	WebSecurityMetadataSource.resourceMap.clear();
        
        List<Menu> menuList = null;//securityService.loadMenuWithAll();
        Collection<ConfigAttribute> atts = null;
        ConfigAttribute ca = null;
        for(Menu menu : menuList){
            Long roleId = menu.getRoleId();
            if(!"".equals(roleId) && roleId!=null)
                ca = new SecurityConfig("ROLE_"+roleId);
            else
                ca = new SecurityConfig("ROLE_X");
            
            String menuUrl = menu.getMenuUrl();
            if(StringUtils.isBlank(menuUrl)){
                continue;//不是菜单地址，跳过
            }
            //如果是URL资源，则建立角色与资源关系
            if(WebSecurityMetadataSource.resourceMap.containsKey(menuUrl)) {
                WebSecurityMetadataSource.resourceMap.get(menuUrl).add(ca);
            } else {
                atts = new ArrayList<ConfigAttribute>();
                atts.add(ca);
                WebSecurityMetadataSource.resourceMap.put(menuUrl, atts);
            }
        }
    }
}
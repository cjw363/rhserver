package cn.com.gzkit.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import cn.com.gzkit.entity.system.User;

/**
 * spring security的用户类
 * @author laobi
 *
 */
public class WebSecurityUser extends User implements UserDetails{

	private static final long serialVersionUID = 1L;
	private Collection<GrantedAuthority> authorities;
	
	public WebSecurityUser() {
		super();
	}

	public WebSecurityUser(String username, String password, Collection<GrantedAuthority> authorities) {
		super();
		this.setUsername(username);
		this.setPassword(password);
		this.authorities = authorities;
	}
	
	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	
	public void setAuthorities(Collection<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}
}
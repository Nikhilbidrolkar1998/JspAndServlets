package com.insurenceapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public class AppUserMapper {
	public AppUser convertToUser(UserDetails userDetails) {
		String username=userDetails.getUsername();
		String password=userDetails.getPassword();
		AppUser appUser=new AppUser();
		appUser.setUserName(username);
		appUser.setPassword(password);
		return appUser;
	}
	
	//from db to frontend
	public UserDetails convertToUserDetails(AppUser appUser) {
		String username=appUser.getUserName();
		String password=appUser.getUserId();
		List<GrantedAuthority> authorities=new ArrayList<>();
		List<String> roles=Arrays.asList("user","admin");
		for(String role:roles) {
			SimpleGrantedAuthority simpleAuthority =new SimpleGrantedAuthority(role);
			authorities.add(simpleAuthority);
		}
		UserDetails details=new User(username, password, authorities);
		return details;
	}
}

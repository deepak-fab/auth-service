package com.deepak.authservice.security;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.exception.LoginException;

@RestController
public class LoginController {

	final List<UserInfo> users = Arrays.asList(
			new UserInfo( "user", "12345", "USER"),
			new UserInfo( "admin", "admin", "ADMIN"),
			new UserInfo( "deepak", "admin", "ADMIN"),
			new UserInfo( "ram", "12345", "USER")
		);
		
	
	@PostMapping("/login")
	public UserInfo login(@RequestBody UserInfo userInfo) throws LoginException {
		
		for(UserInfo appUser: users) {
			if(appUser.getUsername().equals(userInfo.getUsername())) {
                 if(appUser.getPassword().equals(userInfo.getPassword())) {
     				return new UserInfo(appUser.getUsername(), appUser.getPassword(), appUser.getRole());               	 
                 }else {
                	 return new UserInfo();              	 
                 }
			}
		}
		
		// If user not found. Throw this exception.
		 return new UserInfo(); 
		
	}
}

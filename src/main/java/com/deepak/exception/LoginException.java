package com.deepak.exception;

public class LoginException extends RuntimeException{

	public LoginException() {
		
	}
	
	public LoginException(String message) {
		super(message);
	}	
	
}

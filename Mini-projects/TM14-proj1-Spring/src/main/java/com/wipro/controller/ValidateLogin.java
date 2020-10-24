package com.wipro.controller;

import javax.servlet.http.HttpSession;

public class ValidateLogin {

	HttpSession session;
	
	public ValidateLogin(HttpSession session){
		this.session = session;
	}
	
	public boolean isLoggedIn() {
		
		boolean validUser = false;
		
		if(session!=null) {
			
			String username = (String) session.getAttribute("username");
			String password = (String) session.getAttribute("password");
			
	        if(username!=null && password!=null){  
	        	validUser = true;
	        }
		}
		
		return validUser;
	}
	
}

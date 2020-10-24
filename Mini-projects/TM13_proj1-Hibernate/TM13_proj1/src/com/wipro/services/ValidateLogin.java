package com.wipro.services;

import javax.servlet.http.HttpSession;

public class ValidateLogin {

	HttpSession session = null;
	
	public ValidateLogin(HttpSession session){
		this.session = session;
	}
	
	public boolean isLoggedIn() {
		
		boolean validUser = false;
		
		if(session!=null) {
	        if(session.getAttribute("username")!=null && session.getAttribute("password")!=null){  
	        	String username = (String)session.getAttribute("username"); 
	            String password = (String)session.getAttribute("password");
		        System.out.println(username+"::"+password);
				if(username.equals("admin") && password.equals("admin")) {
					validUser = true;
				}  
	        }  
		}
		
		return validUser;
	}
	
}

package com.wipro.demo;

public class DefaultMessage {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void display() {
		System.out.println("DefaultMessage [message=" + message + "]");
	}
	
	
	
}

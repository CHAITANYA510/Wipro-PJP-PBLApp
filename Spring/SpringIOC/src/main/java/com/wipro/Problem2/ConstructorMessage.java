package com.wipro.Problem2;

public class ConstructorMessage {

	private String message = null;

	public ConstructorMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ConstructorMessage [message=" + message + "]";
	}
	
}

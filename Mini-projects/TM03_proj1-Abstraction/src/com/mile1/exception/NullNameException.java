package com.mile1.exception;

@SuppressWarnings("serial")
public class NullNameException extends Exception{
	
	public String toString(){
		return ((char)34+"NullNameException occurred"+(char)34+
				" inside the toString function.");
	} 
}
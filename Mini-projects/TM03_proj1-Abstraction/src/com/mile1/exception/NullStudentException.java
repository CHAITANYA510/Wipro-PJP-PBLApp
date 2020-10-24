package com.mile1.exception;

@SuppressWarnings("serial")
public class NullStudentException extends Exception{
	
	public String toString(){
		return ((char)34+"NullStudentException occurred"+(char)34+
				" inside the toString function.");
	} 
}
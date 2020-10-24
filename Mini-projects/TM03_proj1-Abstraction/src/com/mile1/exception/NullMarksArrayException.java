package com.mile1.exception;

@SuppressWarnings("serial")
public class NullMarksArrayException extends Exception{
	
	public String toString(){
		return ((char)34+"NullMarksException occurred"+(char)34+
				" inside the toString function.");
	} 
}
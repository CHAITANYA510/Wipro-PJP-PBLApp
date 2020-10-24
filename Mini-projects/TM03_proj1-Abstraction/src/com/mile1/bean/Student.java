package com.mile1.bean;

public class Student{
	
	private String name;
	private int[] marks = new int[3];
	
	public Student() { }
	
	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int[] getMarks() {
		
		return marks;
	}
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
}
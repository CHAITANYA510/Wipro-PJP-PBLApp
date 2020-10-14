package com.wipro.Problem4;

public class Student {

	private String studentId;
	private String studentName;
	private Test test;
	
	public Student() {
		
	}
	
	public Student(String studentId, String studentName, Test test) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.test = test;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", test=" + test + "]";
	}
	
	
}

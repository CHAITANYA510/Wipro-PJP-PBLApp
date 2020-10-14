package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_table_1")
public class Student {

	@Id
	@Column(name="regno")
	private int regNo;
	
	@Column(name="name", length=10)
	private String name;
	
	@Column(name="fees")
	private float fees;

	public Student() {
		
	}

	public Student(int regNo, String name, float fees) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.fees = fees;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", fees=" + fees + "]";
	}
	
}

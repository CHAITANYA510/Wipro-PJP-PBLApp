package com.wipro.bean;

public class Employee {

	private String name;
	private int ID;
	private String gender;
	private String designation;
	private String city;
	private String emailID;
	public float salary;
	private long mobileNo;

	public Employee() {
		
	}

	public Employee(String name, int iD, String gender, String designation, String city, String emailID, float salary,
			long mobileNo) {
		super();
		this.name = name;
		ID = iD;
		this.gender = gender;
		this.designation = designation;
		this.city = city;
		this.emailID = emailID;
		this.salary = salary;
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", ID=" + ID + ", gender=" + gender + ", designation=" + designation
				+ ", city=" + city + ", emailID=" + emailID + ", salary=" + salary + ", mobileNo=" + mobileNo + "]";
	}
	
}

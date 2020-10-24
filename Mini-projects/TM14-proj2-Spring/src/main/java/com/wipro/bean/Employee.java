package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="employee_table_2")
public class Employee {

	@Id
	@Column(name="Employee_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_generator")
	@SequenceGenerator(name = "ID_generator", sequenceName = "id_sequence", initialValue = 1, allocationSize = 1)
	private int ID;
	
	@Column(name="Employee_Name", length=10)
	private String name;
	
	@Column(name="Gender", length=6)
	private String gender;
	
	@Column(name="Designation", length=15)
	private String designation;
	
	@Column(name="City", length=10)
	private String city;
	
	@Column(name="EmailID", length=20)
	private String emailID;
	
	@Column(name="Salary")
	public float salary;
	
	@Column(name="Phone_number")
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

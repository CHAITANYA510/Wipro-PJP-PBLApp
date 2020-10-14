/*Create a class called Employee with properties name(String),dateOfBirth(java.util.Date),department(String),designation(String) and Salary(double).
Create respective getter and setter methods and constructors (no-argument constructor and parameterized constructor) for the same.
Create an object of the Employee class and save this object in a file called "data" using serialization.
Later using deserialization read this object and print the properties of this object.
*/

import java.io.*;
//import java.util.Calendar;
import java.util.Date;
//import java.util.GregorianCalendar;

@SuppressWarnings("serial")
public class Employee implements Serializable{ 

	String name;
	@SuppressWarnings("deprecation")
	Date DOB;/// = new Date(1998,03,03);
	//Calendar cal = new GregorianCalendar(2000,03,03);
	String department;
	String designation;
	
	Employee(){}

	Employee(String name,Date DOB,String dept,String desig){
		this.name=name;
		//this.date.setDate(date);
		//this.date.setMonth(month);
		//this.date.setYear(year);
		//this.DOB = cal.set(year, month, date);
		this.DOB=DOB;
		this.department=dept;
		this.designation=desig;
	}
	/*
	public Calendar getCal() {
		return cal;
	}

	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	*/
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDOB() {
		return DOB;
	}

	
	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}
	
	
	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}

}

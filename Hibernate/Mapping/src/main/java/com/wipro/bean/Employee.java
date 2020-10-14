package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="ename", length=10)
	private String ename;
	
	@Column(name="enum", length=3)
	private int enumber;
	
	@Embedded
	private Address address;

	public Employee() {
	
	}

	public Employee(String ename, int enumber, Address address) {
		super();
		this.ename = ename;
		this.enumber = enumber;
		this.address = address;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEnumber() {
		return enumber;
	}

	public void setEnumber(int enumber) {
		this.enumber = enumber;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", enumber=" + enumber + ", passport=" + address.toString() + "]";
	}

}

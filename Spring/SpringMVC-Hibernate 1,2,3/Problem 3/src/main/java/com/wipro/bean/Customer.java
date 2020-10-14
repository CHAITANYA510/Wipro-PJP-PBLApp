package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_table_1")
public class Customer {

	@Id
	@Column(name="customerID", length=10)
	private String customerID;
	
	@Column(name="password", length=16)
	private String password;
	
	@Column(name="balance")
	private float balance;

	public Customer() {
		
	}
	
	public Customer(String customerID, String password, float balance) {
		
		this.customerID = customerID;
		this.password = password;
		this.balance = balance;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", password=" + password + ", balance=" + balance + "]";
	}
	
	
}
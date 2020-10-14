package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(name="city_name", length=10)
	private String city;
	@Column(name="state_name", length=10)
	private String state;
	@Column(name="pincode", length=6)
	private int pincode;
	
	public Address() {
		
	}

	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [City=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

	
}

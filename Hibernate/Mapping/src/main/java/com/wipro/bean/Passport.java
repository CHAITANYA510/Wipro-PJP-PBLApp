package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class Passport {

	@Id
	@Column(name="country_code", length=3)
	private int country_code;
	
	@Column(name="country_name", length=10)
	private String country_name;
	
	public Passport() {
		
	}

	public Passport(int country_code, String country_name) {
		super();
		this.country_code = country_code;
		this.country_name = country_name;
	}

	public int getCountry_code() {
		return country_code;
	}

	public void setCountry_code(int country_code) {
		this.country_code = country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	@Override
	public String toString() {
		return "Passport [country_code=" + country_code + ", country_name=" + country_name + "]";
	}

	
	
}

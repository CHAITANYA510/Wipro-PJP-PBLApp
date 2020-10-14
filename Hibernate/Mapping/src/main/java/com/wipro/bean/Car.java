package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car_details")
public class Car {
	
	@Id
	@Column(name="regno", length = 5)
	private String regNo;
	
	@Column(name="model", length = 20)
	private String model;
	
	@Column(name="color", length = 20)
	private String color;
	
	@Column(name="manufacturer", length = 20)
	private String manufacturer;

	public Car() {
		
	}
	
	public Car(String regNo, String model, String color, String manufacturer) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.color = color;
		this.manufacturer = manufacturer;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", model=" + model + ", color=" + color + ", manufacturer=" + manufacturer + "]";
	}
	
	
}

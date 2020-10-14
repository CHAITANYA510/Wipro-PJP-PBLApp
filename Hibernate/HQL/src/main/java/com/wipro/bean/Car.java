package com.wipro.bean;


public class Car {
	
	private String regNo;
	private String model;
	private String color;
	private String manufacturer;

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", model=" + model + ", color=" + color + ", manufacturer=" + manufacturer + "]";
	}
	
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
	
	
}

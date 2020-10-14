package com.wipro.bean;

public class Flower {
	
	private String flowerID;
	private String flowerName;
	private String color;
	private int price;
	
	public Flower() {
		
	}
	
	public Flower(String flowerID, String flowerName, String color, int price) {
		super();
		this.flowerID = flowerID;
		this.flowerName = flowerName;
		this.color = color;
		this.price = price;
	}
	
	public String getFlowerID() {
		return flowerID;
	}
	public void setFlowerID(String flowerID) {
		this.flowerID = flowerID;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}

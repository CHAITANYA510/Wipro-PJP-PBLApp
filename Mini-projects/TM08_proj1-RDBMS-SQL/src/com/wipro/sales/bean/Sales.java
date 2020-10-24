package com.wipro.sales.bean;

import java.util.Date;

public class Sales {

	String salesID;
	Date salesDate;
	String productID;
	int quantitySold;
	double salesPricePerUnit;
	
	
	public String getSalesID() {
		return salesID;
	}
	public void setSalesID(String salesID) {
		this.salesID = salesID;
	}
	public java.util.Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(Date date) {
		this.salesDate = date;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	public double getSalesPricePerUnit() {
		return salesPricePerUnit;
	}
	public void setSalesPricePerUnit(double salesPricePerUnit) {
		this.salesPricePerUnit = salesPricePerUnit;
	}

	
}

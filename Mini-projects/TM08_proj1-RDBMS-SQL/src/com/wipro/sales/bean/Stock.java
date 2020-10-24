package com.wipro.sales.bean;

public class Stock {

	String stockID;
	String stockName;
	int quantityOnHand;
	double productUnitPrice;
	int recorderLevel;
	
	
	public String getStockID() {
		return stockID;
	}
	public void setStockID(String stockID) {
		this.stockID = stockID;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	public double getProductUnitPrice() {
		return productUnitPrice;
	}
	public void setProductUnitPrice(double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}
	public int getRecorderLevel() {
		return recorderLevel;
	}
	public void setRecorderLevel(int recorderLevel) {
		this.recorderLevel = recorderLevel;
	}
	

}

package com.wipro.sales.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.bean.Stock;
import com.wipro.sales.dao.SalesDao;
import com.wipro.sales.dao.StockDao;
import com.wipro.sales.util.DButil;

public class Administrator {
	
	public String insertStock(Stock stockobj) throws SQLException {
		
		StockDao s1 = new StockDao();
		
		if(stockobj != null) {
			String ID = stockobj.getStockID();
			if(ID.length()>1) {
				String proID = s1.generateStockID(ID);
				stockobj.setStockID(proID);
				s1.insertStock(stockobj);
				return "Stock inserted";
			}
			else {
				return "Data not Valid for insertion";
			}
		}
		
		else {
			return "Data not Valid for insertion";
		}
	}
	
	
	public String deleteStock(String ProductID) {
		try {
			StockDao s1 = new StockDao();
			s1.deleteStock(ProductID);
			return "Deleted";
		}
		catch(SQLException s) {
			return "Stock cannot be deleted";
		}
	}

	
	public String insertSales(Sales salesobj) throws SQLException {
	
		if(salesobj != null) {
			
			String prodID = salesobj.getProductID();
			//System.out.println("input product id is "+prodID);
			String query;
			Connection conn = DButil.getDBConnection();
			
			query = "select PRODUCT_ID from TBL_STOCK WHERE PRODUCT_ID LIKE ?";
			//System.out.println(query);
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, prodID);
			ResultSet pst = pstmt.executeQuery();
			pst.next();
			String productID = pst.getString(1);
			//System.out.println("productID from databbase is "+productID);
			
			
			if(productID.equals(prodID) ) {
		
				String query1 = "SELECT QUANTITY_SOLD FROM TBL_SALES WHERE PRODUCT_ID LIKE ?";
				//System.out.println(query1);
				PreparedStatement pstmt1 = conn.prepareStatement(query1);
				pstmt1.setString(1, prodID);
				ResultSet result1 = pstmt1.executeQuery();
				result1.next();
				int sold=0;
				if(result1.next()) {
					sold = result1.getInt(1);
					//System.out.println("sold :"+sold);
				}
				//System.out.println("sold :"+sold);
				
				String query2 = "SELECT QUANTITY_ON_HAND FROM TBL_STOCK WHERE PRODUCT_ID LIKE ?";
				//System.out.println(query2);
				PreparedStatement pstmt2 = conn.prepareStatement(query2);
				pstmt2.setString(1, prodID);
				ResultSet result2 = pstmt2.executeQuery();
				result2.next();
				//int onHand = 0;
				//if(result2.next()) {
				int onHand = result2.getInt(1);
					//System.out.println("onHand "+onHand);
				//}
				
				conn.close();
				
				//System.exit(0);
				if(onHand >= sold) {
					
					///get preset date into string
					java.util.Date date = new java.util.Date();
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
					String s1 = formatter.format(date);
					////get sales date into string
					Date dateSales = new Date(salesobj.getSalesDate().getTime());  ///convert java.util date to java.sql date
					String s2 = dateSales.toString();
					
					if(s1.compareTo(s2)>0 || s1.compareTo(s2)==0) {
						//System.out.println("date 1 is before date 2");
						SalesDao saleDA = new SalesDao();
						String sale_ID = saleDA.generateSalesID(dateSales);
						salesobj.setSalesID(sale_ID);
						
						if(saleDA.insertSales(salesobj) == 1) {
							
							StockDao stockDA = new StockDao();
							stockDA.updateStock(prodID, salesobj.getQuantitySold());
							return "Sales Completed";
						}
						else {
							return "Error";
						}
						
					}
					else {
						return "Invalid date";
					}
					
				}
				else {
					return "Not enough stock on hand for sales";
				}
				
			}
			else {
				conn.close();
				return "Unknown product for sales";
			}
			
		}
		
		else {
			return "Object not valid for insertion";
		}
		
	}
	
	
	public ArrayList<SalesReport> getSalesReport() throws SQLException{
	
		SalesDao saleDA = new SalesDao();
		return saleDA.getSalesReport();
	}

}
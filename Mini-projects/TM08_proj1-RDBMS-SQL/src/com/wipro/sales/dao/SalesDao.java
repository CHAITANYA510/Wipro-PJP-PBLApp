package com.wipro.sales.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.util.*;

public class SalesDao {
	
	public int insertSales(Sales sales) throws SQLException {
		
		String query;
		Connection conn = DButil.getDBConnection();
		query = "INSERT INTO TBL_SALES VALUES (?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, sales.getSalesID());
		Date sqldate = new Date(sales.getSalesDate().getTime());  ///convert java.util date to java.sql date
		pstmt.setDate(2, sqldate);
		pstmt.setString(3, sales.getProductID());
		pstmt.setInt(4, sales.getQuantitySold());
		pstmt.setDouble(5, sales.getSalesPricePerUnit());
		pstmt.executeUpdate();
		conn.close();
		return 1;
	}
	
	
	public String generateSalesID(java.util.Date salesDate) throws SQLException {
		
		java.util.Date date = new java.util.Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String s1 = formatter.format(date);
		s1 = s1.substring(8);
		
		String s2;
		String query;
		Connection conn = DButil.getDBConnection();
		query = "select SEQ_SALES_ID.nextval from dual";
		PreparedStatement pstmt = conn.prepareStatement(query);
		ResultSet pst = pstmt.executeQuery();
		pst.next();
		int num = pst.getInt(1);
		s2 = Integer.toString(num);
		
		String saleID = s1.concat(s2);
		conn.close();
		return saleID;
	}
	
	
	public ArrayList<SalesReport> getSalesReport() throws SQLException{
		
		ArrayList<SalesReport> arr = new ArrayList<SalesReport>();
		
		String query;
		Connection conn = DButil.getDBConnection();
		query = "SELECT * FROM V_SALES_REPORT";
		PreparedStatement pstmt = conn.prepareStatement(query);
		ResultSet pst = pstmt.executeQuery();
		
		while(pst.next()) {
			SalesReport report = new SalesReport();
			report.setSalesID(pst.getString(1));
			report.setSalesDate(pst.getDate(2));
			report.setProductID(pst.getString(3));
			report.setProductName(pst.getString(4));
			report.setQuantitySold(pst.getInt(5));
			report.setProductUnitPrice(pst.getDouble(6));
			report.setSalesPricePerUnit(pst.getDouble(7));
			report.setProfitAmount(pst.getDouble(8));
			arr.add(report);
		}
		
		conn.close();
		return arr;
	}
	
	
}

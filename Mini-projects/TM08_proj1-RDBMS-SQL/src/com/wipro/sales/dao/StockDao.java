package com.wipro.sales.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.sales.bean.Stock;
import com.wipro.sales.util.DButil;

public class StockDao {

	public void insertStock(Stock sales) throws SQLException{
		
		String query;
		Connection conn = DButil.getDBConnection();
		query = "INSERT INTO TBL_STOCK VALUES (?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, sales.getStockID());
		pstmt.setString(2, sales.getStockName());
		pstmt.setInt(3, sales.getQuantityOnHand());
		pstmt.setDouble(4, sales.getProductUnitPrice());
		pstmt.setInt(5, sales.getRecorderLevel());
		pstmt.executeUpdate();
		conn.close();
		
	}
	
	public String generateStockID(String productName) throws SQLException{
		
		String s1 = productName;
		s1 = s1.substring(0, 2);
		
		String s2;
		String query;
		Connection conn = DButil.getDBConnection();
		query = "select SEQ_PRODUCT_ID.nextval from dual";
		PreparedStatement pstmt = conn.prepareStatement(query);
		ResultSet pst = pstmt.executeQuery();
		
		pst.next();
		int num = pst.getInt(1);
		s2 = Integer.toString(num);
		
		String stockID = s1.concat(s2);
		System.out.println("StockID is "+stockID);
		conn.close();
		
		return stockID;
	}
	
	public void updateStock(String productID, int soldQty) throws SQLException{
		
		String query;
		Connection conn = DButil.getDBConnection();
		query = "UPDATE TBL_STOCK SET QUANTITY_ON_HAND=QUANTITY_ON_HAND-? WHERE PRODUCT_ID LIKE ?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, soldQty);
		pstmt.setString(2, productID);
		pstmt.executeUpdate();
		conn.close();
	}
	
	Stock getStock(String productID) throws SQLException {
		
		String query;
		Connection conn = DButil.getDBConnection();
		query = "select * from TBL_STOCK WHERE PRODUCT_ID LIKE ?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, productID);
		ResultSet pst = pstmt.executeQuery();
		pst.next();
		
		Stock stock = new Stock();
		stock.setStockID(pst.getString(1));
		stock.setStockName(pst.getString(2));
		stock.setQuantityOnHand(pst.getInt(3));
		stock.setProductUnitPrice(pst.getDouble(4));
		stock.setRecorderLevel(pst.getInt(5));
		
		conn.close();
		return stock;
	}
	
	public void deleteStock(String productID) throws SQLException{
		
		String query;
		Connection conn = DButil.getDBConnection();
		
		query = "select PRODUCT_ID from TBL_STOCK WHERE PRODUCT_ID LIKE ?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1,productID);
		ResultSet rst = pstmt.executeQuery();
		if(rst.next()) {

			query = "DELETE FROM TBL_STOCK WHERE PRODUCT_ID LIKE ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,productID);
			pstmt.executeUpdate();
			//System.out.println(pstmt.executeUpdate());
			conn.close();
		}
		else {
			throw new SQLException();
		}
		
	}
	
}

package com.wipro.sales.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {
	
	public static Connection getDBConnection(){
		
		Connection conn = null;
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String USER = "hr";
		String PASS = "hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			return conn;
		}
		catch(Exception e){
			System.out.println("Connection not established");
			e.printStackTrace();
		}
		return conn;
	}
}

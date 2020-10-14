package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Problem2 {

	public static void main(String[] args) {

		String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String USER = "hr";
		String PASS = "hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String tablename1 = "STUDENTINFO";
			String tablename2 = "STUDENTLOG";
			String query = null;
			PreparedStatement stmt;
			
			query = "Create table "+tablename1+" (Rollno number(4) NOT NULL PRIMARY KEY, StudentName varchar(20) NOT NULL, Standard varchar2(2), Date_Of_Birth date, Fees number(9,2))";
			stmt = conn.prepareStatement(query);
			stmt.executeUpdate();
			System.out.println("Table STUDENTINFO created successfully");
			
			query = "Create table "+tablename2+" (Rollno number(4) NOT NULL PRIMARY KEY, StudentName varchar(20) NOT NULL, Standard varchar2(2), Leaving_date date)";
			stmt = conn.prepareStatement(query);
			stmt.executeUpdate();
			System.out.println("Table STUDENTLOG created successfully");
			
			stmt.close();
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}

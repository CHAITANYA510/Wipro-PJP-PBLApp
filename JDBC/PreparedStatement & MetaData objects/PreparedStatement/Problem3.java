package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Problem3 {

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
			
			int Rollno = Integer.parseInt(args[0]);
			query = "INSERT INTO "+tablename2+" SELECT Rollno,StudentName,Standard,SYSDATE FROM "+tablename1+" WHERE ROLLNO = "+Rollno;
			//System.out.println(query);
			stmt = conn.prepareStatement(query);
			stmt.executeUpdate();
			System.out.println("Data logged in table "+tablename2+" successfully");
			
			query = "DELETE FROM "+tablename1+" WHERE ROLLNO = "+Rollno;
			//System.out.println(query);
			stmt = conn.prepareStatement(query);
			stmt.executeUpdate();
			System.out.println("Data deleted successfully");
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}

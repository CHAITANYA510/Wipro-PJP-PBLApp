package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Problem4 {

	public static void main(String[] args) {
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String USER = "hr";
		String PASS = "hr";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String tablename1 = "STUDENTINFO";
			String query = null;
			PreparedStatement stmt;
			
			int Rollno = Integer.parseInt(args[0]);
			float Fees = Float.parseFloat(args[1]);
			//query = "Update "+tablename1+" set dept_name = "+args[1]+" where dept_id = "+args[2];
			query = "UPDATE "+tablename1+" SET FEES="+Fees+" WHERE Rollno="+Rollno;
			//System.out.println(query);
			stmt = conn.prepareStatement(query);
			stmt.executeUpdate();
			System.out.println("Data modified successfully");
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}

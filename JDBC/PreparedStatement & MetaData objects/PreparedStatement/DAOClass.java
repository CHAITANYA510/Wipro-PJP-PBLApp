package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOClass {
	
	Connection conn; 
	DAOClass(){
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		final String USER = "hr";
		final String PASS = "hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			//conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public void insert(String[] args) throws SQLException {
		
		int rollno = Integer.parseInt(args[1]);
		String name = args[2];
		String std = args[3];
		String date = args[4];
		Float fees = Float.parseFloat(args[5]);
		String query = "INSERT INTO STUDENTINFO VALUES(?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, rollno);
		pstmt.setString(2, name);
		pstmt.setString(3, std);
		pstmt.setString(4, date);
		pstmt.setFloat(5, fees);
		pstmt.executeUpdate();
		conn.close();
		System.out.println("Data inserted");
		
	}

	public void delete(String[] args) throws SQLException {

		int rollno = Integer.parseInt(args[1]);
		String query = "INSERT INTO STUDENTLOG SELECT Rollno,StudentName,Standard,SYSDATE FROM STUDENTINFO WHERE ROLLNO = "+rollno;
		//System.out.println(query);
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.executeUpdate();
		System.out.println("Data logged in table STUDENTLOG successfully");

		query = "DELETE FROM STUDENTINFO WHERE ROLLNO = "+rollno;
		//System.out.println(query);
		stmt = conn.prepareStatement(query);
		stmt.executeUpdate();
		conn.close();
		System.out.println("Data deleted successfully");
	}

	public void update(String[] args) throws SQLException {
		
		int Rollno = Integer.parseInt(args[1]);
		float Fees = Float.parseFloat(args[2]);
		//query = "Update "+tablename1+" set dept_name = "+args[1]+" where dept_id = "+args[2];
		String query = "UPDATE STUDENTINFO SET FEES="+Fees+" WHERE Rollno="+Rollno;
		//System.out.println(query);
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.executeUpdate();
		System.out.println("Data modified successfully");
		conn.close();
	}

	public void display(String[] args) throws SQLException {
		
		String query;
		PreparedStatement stmt;
		ResultSet rs;
		
		if(args.length == 1) {
			query = "SELECT * FROM STUDENTINFO ORDER BY ROLLNO ASC";
			//System.out.println(query);
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();
			//System.out.println("Rollno\tStudentName\t\tStandard\tDate_Of_Birth\t\tFees");

			while(rs.next()) {
				System.out.println(rs.getInt("ROLLNO")+"\t"+rs.getString("STUDENTNAME")+"\t\t"
						+ rs.getString("STANDARD")+"\t"+rs.getDate("DATE_OF_BIRTH")+"\t\t"+rs.getFloat("FEES"));
			}
		}

		else {
			int Rollno = Integer.parseInt(args[1]);
			query = "SELECT * FROM STUDENTINFO WHERE Rollno="+Rollno;
			//System.out.println(query);
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();
			if(rs.next()) {
			System.out.println(rs.getInt("ROLLNO")+"\t"+rs.getString("STUDENTNAME")+"\t\t"
					+ rs.getString("STANDARD")+"\t"+rs.getDate("DATE_OF_BIRTH")+"\t\t"+rs.getFloat("FEES"));
		
			}
			else {
				System.out.println("Entry of given roll number not found.");
			}
		conn.close();
		
		}
	}
}

package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Problem5 {

	public static void main(String[] args) {

		String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String USER = "hr";
		String PASS = "hr";
		String query;
		String tablename = "STUDENTINFO";
		PreparedStatement stmt;
		ResultSet rs;

		try {
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			if(args.length == 1) {
				query = "SELECT * FROM "+tablename+" ORDER BY ROLLNO ASC";
				//System.out.println(query);
				stmt = conn.prepareStatement(query);
				rs = stmt.executeQuery();
				//System.out.println("Rollno\tStudentName\t\tStandard\tDate_Of_Birth\t\tFees");

				while(rs.next()) {
					System.out.println(rs.getInt("Rollno")+"\t"+rs.getString("StudentName")+"\t\t"
							+ rs.getString("Standard")+"\t"+rs.getDate("Date_Of_Birth")+"\t\t"+rs.getFloat("Fees"));
				}
			}

			else {
				int Rollno = Integer.parseInt(args[0]);
				query = "SELECT * FROM "+tablename+" WHERE Rollno = "+Rollno;
				//System.out.println(query);
				stmt = conn.prepareStatement(query);
				rs = stmt.executeQuery();
				rs.next();
				System.out.println(rs.getInt("Rollno")+"\t"+rs.getString("StudentName")+"\t\t"
						+ rs.getString("Standard")+"\t"+rs.getDate("Date_Of_Birth")+"\t\t"+rs.getFloat("Fees"));
			}

			conn.close();

		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}

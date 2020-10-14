/*
Write a java program that connects to oracle database, queries the inbuilt table “emp” 
and displays the first two columns (empno using column index and ename using column name ) of all the rows.
*/

package executingQuery;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem1 {

	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	static final String USER = "hr";
	static final String PASS = "hr";
	
	public static void main(String[] args){

		Connection conn = null;
		Statement stmt = null;
	
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		    System.out.println("Connection Established successfully");
		    
		    stmt = conn.createStatement();
		    String query;
		    query = "SELECT * FROM DEPT";
		    ResultSet rs = stmt.executeQuery(query);
		   
		    while(rs.next()){
		    	System.out.println(rs.getInt(1)+" -- "+rs.getString(2));
		    }
			rs.close();
			stmt.close();
			conn.close();
		}
		
		catch(Exception e){
			//System.out.println("Connection could not be established");
			e.printStackTrace();
		}
	}

}

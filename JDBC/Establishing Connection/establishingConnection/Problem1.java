/*
Write a java program that establishes a connection to oracle database successfully. 
If the connection is successful, it should display a message “Connection Established successfully”. 
In case, it is not able to do so due to any exception, it should display the message “Connection could  not be established “. 
If there is an exception, it should also display the description of the exception.
*/

package establishingConnection;
import java.sql.*;

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
		    /*
		    stmt = conn.createStatement();
		    String query;
		    query = "SELECT * FROM EMP";
		    ResultSet rs = stmt.executeQuery(query);
		   
		    while(rs.next()){
		    	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "
		    						+rs.getString(3)+"  "+rs.getInt(4));
		    }
		      
			rs.close();
			stmt.close();
			*/
			conn.close();
			
		}
		
		catch(Exception e){
			System.out.println("Connection could not be established");
			e.printStackTrace();
		}
	}

}

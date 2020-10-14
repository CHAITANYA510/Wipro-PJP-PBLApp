/*Modify the above program to display all the rows where sal is greater than 1000 and less than 2000. 
Display the columns ename, job, sal and comm.
*/

package executingQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem2 {

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
		    query = "SELECT FIRST_NAME,JOB_ID,SALARY,COMMISSION_PCT FROM EMPLOYEES WHERE SALARY > 1000 AND SALARY < 2000";
		    ResultSet rs = stmt.executeQuery(query);
		    
		    System.out.println("ename\t\tjob\t\tsal\t\tcomm");
		    
		    while(rs.next()){
		    	System.out.println(rs.getString("FIRST_NAME")+"\t\t"+rs.getString("JOB_ID")+"\t\t"
		    					+rs.getLong("SALARY")+"\t\t"+rs.getString("COMMISSION_PCT"));
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

/*
Create a stored procedure that calculates net salary of all the employees whose records are stored in table "EMPLOYEES".
The criteria for calculating net salary is as follows :
Gross salary = sal + comm.
Net Salary = gross salary - IT
If the employee's commission is null then IT is calculated as
IT =  10% of gross salary
else if the employees commission is less than 500, then IT is calculated as
IT =  15% of gross salary
else
IT = 20% of gross salary.
Develop a jdbc program that invokes this stored procedure by passing the empno. and in return gets the net salary of each employee. 
Display on screen the empno., ename and net salary of all the employees.
*/

package CallableStatement;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class Problem1 {

	Float getSalary(int empid,Connection conn) throws SQLException {
		
		CallableStatement cstmt;
		cstmt = conn.prepareCall("{call netSal(?,?)}");
		cstmt.setInt(1, empid);
		cstmt.registerOutParameter(2, Types.FLOAT);
		cstmt.execute();
		float netSal = cstmt.getFloat(2);
		return netSal;
	}
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		
		//int empid = 100;
		//float netSal;
		String query;
		Statement stmt;
		
		Problem1 p1 = new Problem1();
		//netSal = p1.getSalary(empid,conn);
		
		query = "select employee_id,first_name,last_name from employees";
		stmt = conn.prepareStatement(query);
		ResultSet rst = stmt.executeQuery(query);
		
		System.out.println("empno.\tename\t\tnet salary");
				
		while(rst.next()) {
			
			System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+" "
					+ rst.getString(3)+"\t"+p1.getSalary(rst.getInt(1),conn));
		}
		
		conn.close();
	}
}






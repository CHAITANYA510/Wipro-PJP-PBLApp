/*Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender 
v)float salary
vi) void GetEmployeeDetails() -> prints employee details
*/

public class Employee {
	
	int empId;
	String empName;
	String email;
	String gender; 
	float salary;
	
	void GetEmployeeDetails() {
		System.out.println("Employee ID is: "+empId);
		System.out.println("Employee name is: "+empName);
		System.out.println("Employee email is: "+email);
		System.out.println("Employee gender is: "+gender);
		System.out.println("Employee salary is: "+salary);
	}
}

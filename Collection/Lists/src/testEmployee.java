

/*Create an application for employee management with the following classes:

a) Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender 
v)float salary
vi) void GetEmployeeDetails() -> prints employee details

b) Create one more class EmployeeDB with the following attributes and behaviors.
(i)ArrayList list;
ii) boolean addEmployee(Employee e)  -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId)  ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId)  -> returns the payslip of the employee with the given empId

Provide implementation for all the methods and test your program.
*/

public class testEmployee {

	public static void main(String[] args) {
		
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		EmployeeDB edb1 = new EmployeeDB();		
		
			e2.empId=123;
			e2.email="23@45";
			e2.empName="raj";
			e2.gender="male";
			e2.salary= 60.98f;
			e2.GetEmployeeDetails();
			edb1.addEmployee(e2);
			System.out.println();
			
			e3.empId=321;
			e3.email="45@12";
			e3.empName="jan";
			e3.gender="female";
			e3.salary= 45.78f;
			e3.GetEmployeeDetails();
			edb1.addEmployee(e3);
			System.out.println();
			
			System.out.println(edb1.showPaySlip(321));
			System.out.println(edb1.showPaySlip(1));
			System.out.println(edb1.showPaySlip(123));
			
			edb1.deleteEmployee(123);
			edb1.deleteEmployee(1);
			//edb1.deleteEmployee(321);
			
			System.out.println();
			System.out.println("Final size of list is " + edb1.list.size());
	}

}

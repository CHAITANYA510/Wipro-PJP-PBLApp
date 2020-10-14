import java.util.ArrayList;

public class test_demo1 {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		EmployeeDB edb1 = new EmployeeDB();
		ArrayList list = new ArrayList();
		
		e.empId=123;
		e.email="23@45";
		e.empName="raj";
		e.gender="male";
		e.salary= 60.98f;
		e.GetEmployeeDetails();
		edb1.addEmployee(e);
		list.contains(e);
		System.out.println(list.getClass());
		System.out.println(list.indexOf(e));
		System.out.println(list.size());
		
	}
}

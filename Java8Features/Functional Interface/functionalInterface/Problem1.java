/*
 * Given an ArrayList with 5 employee(id,name,location,salary) objects,
 * WAP to extract the location detail of each Employee and store it in an ArrayList, with help of function
 */

package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee{
	
	String name;
	int empID;
	String location;
	float salary;
	
	public Employee(String name, int empID, String location, float salary) {
		super();
		this.name = name;
		this.empID = empID;
		this.location = location;
		this.salary = salary;
	}
}

public class Problem1 {

	public static void main(String[] args) {
		
		List<Employee> arr = new ArrayList<Employee>();
		List<String> location = new ArrayList<String>();
		
		arr.add(new Employee("Raj",345,"Banglore",30000));
		arr.add(new Employee("John",456,"Mumbai",40000));
		arr.add(new Employee("Jonny",678,"Pune",50000));
		arr.add(new Employee("Sneha",12,"Chennai",30000));
		arr.add(new Employee("Vivek",987,"Pune",500000));

		Function<Employee,String> func1 = emp -> (emp.location);
		
		arr.forEach(n -> location.add(func1.apply(n)));
		
		System.out.println("Location array is as follows: ");
		System.out.println(location);
			
	}
}



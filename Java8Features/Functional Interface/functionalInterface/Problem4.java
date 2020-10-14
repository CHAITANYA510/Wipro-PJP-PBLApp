/*
 * Create an Employee class with: 
 * 1. private variables: empID, name, salary.
 * 2. Generate getters and setters and parameterized constructor to initialize them.
 * 
 * 
 * WAP to
 * 1. Create and ArrayList to store 5 to 10 Employee object in it,
 * 2. Filter and display the name of the employees whose salary < 10000, using Predicate.
 */

package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employeeee{
	
	private String name;
	private int empID;
	private float salary;
	
	public Employeeee(String name, int empID, float salary) {
		super();
		this.name = name;
		this.empID = empID;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}

public class Problem4 {

	public static void main(String[] args) {
	
		List<Employeeee> list = new ArrayList<Employeeee>();
		
		list.add(new Employeeee("Rajan",123,30000));
		list.add(new Employeeee("Aman",345,10000));
		list.add(new Employeeee("Raju",234,5000));
		list.add(new Employeeee("Nagur",145,7000));
		list.add(new Employeeee("Kani",45,20000));
		
		Predicate<Employeeee> pred = e ->
		{
			if(e.getSalary()<10000) {
				return true;
			}
			return false;
		};
		
		list.forEach(e ->
		{
			if(pred.test(e)) {
				System.out.println(e.getName());
			}
		});
	}

}

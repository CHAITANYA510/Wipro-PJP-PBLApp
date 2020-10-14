/*
 * Create an Employee class with: 
 * 1. Instance variables: empNo, name, age, location.
 * 2. Parameterized constructor to initialize them.
 * 
 * WAP to
 * 1. Add 5 Employee object into ArrayList,
 * 2. Filter employee whose location is "Pune",
 * 3. Store them in separate ArrayList and print their details.
 */

package streamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Employee{
	String name;
	int empNo;
	int age;
	String location;
	public Employee(String name, int empNo, int age, String location) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.age = age;
		this.location = location;
	}
	
	public String toString() {
		return "Employee name: "+name+"\nEmployee Number: "+empNo+"\nAge: "+age+"\nLocation: "+location+"\n";
	}
}

public class Problem2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> arr = new ArrayList<Employee>();
		arr.add(new Employee("Raj",345,40,"Banglore"));
		arr.add(new Employee("John",456,30,"Mumbai"));
		arr.add(new Employee("Jonny",678,34,"Pune"));
		arr.add(new Employee("Sneha",12,56,"Banglore"));
		arr.add(new Employee("Vivek",987,58,"Pune"));
		
		ArrayList<Employee> newArr = (ArrayList<Employee>) arr.stream().filter(emp -> emp.location.equalsIgnoreCase("Pune")).collect(Collectors.toList());
		
		System.out.println("Original List\n");
		System.out.println(arr.toString());
		
		System.out.println("\nList of Employee who live in Pune");
		System.out.println(newArr.toString());
	}
}

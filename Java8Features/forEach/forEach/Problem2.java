///Create ArrayList, add data(id,name,address,salary) using data of 5 employee using Employee Object.
///Display using forEach()

package forEach;

import java.util.ArrayList;

class Employee{
	
	int id;
	String name;
	String address;
	float salary;
	
	Employee(int id,String name,String address,float salary){
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
}

public class Problem2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> arr = new ArrayList<>();
		arr.add(new Employee(12,"Ron","Winterfell",60000));
		arr.add(new Employee(14,"John","Beyond the wall",40000));
		arr.add(new Employee(15,"Arya","Valar Morguris",70000));
		arr.add(new Employee(17,"Robert","King's Landing",100000));
		arr.add(new Employee(19,"Stark","North",80000));
		
		arr.forEach((Employee emp) -> {
				System.out.println("ID: "+emp.id);
				System.out.println("Name: "+emp.name);
				System.out.println("Address: "+emp.address);
				System.out.println("Salary: "+emp.salary);
				System.out.println();
			});
	}

}

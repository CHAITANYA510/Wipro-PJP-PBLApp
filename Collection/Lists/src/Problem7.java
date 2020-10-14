/*Write a program that will have a Vector which is capable of storing Employee objects.
 * Use an Iterator and enumeration to list all the elements of the Vector.
 */
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Problem7 {

	public static void main(String[] args) {
		
		Vector<Employee> vector = new Vector<Employee>();
		
		// add details of Object Employee
		Employee e = new Employee();
		e.empId=123;
		e.email="23@45";
		e.empName="raj";
		e.gender="male";
		e.salary= 60.98f;
		vector.add(e);
		
		Employee e1 = new Employee();
		e1.empId=321;
		e1.email="45@12";
		e1.empName="jan";
		e1.gender="female";
		e1.salary= 45.78f;
		vector.add(e1);
		
		// using Iterator
		Iterator<Employee> itr =  vector.iterator();
		System.out.println("Elements of the Vector using Iterator are: ");
		System.out.println();
		while(itr.hasNext()) {
			itr.next().GetEmployeeDetails();
			System.out.println();
		}
		// using Enumeration	
		Enumeration<Employee> enum1 = vector.elements();
		System.out.println("Elements of the Vector using Enumeration are: ");
		System.out.println();
		while(enum1.hasMoreElements()) {
			enum1.nextElement().GetEmployeeDetails();
			System.out.println();
		}
	}

}

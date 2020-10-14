
/*Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee that will inherit the Person class.The other data members of the Employee class are 
annual salary (double), the year the employee started to work, and the national insurance number which is a String.
 Save this in a file called Employee.java
Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
*/

package Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setPersonName("Raj");
		e1.setyear_joined("2000");
		e1.setannual_salary(2000000);
		e1.setinsurance_number("EN740");

			
		System.out.println("Employee name is: "+e1.getPersonName());
		System.out.println("Annual salary is "+e1.getannual_salary());
		System.out.println("Year joined is: "+e1.getyear_joined());
		System.out.println("Insurance number is: "+e1.getinsurance_number());
		
		}		
}



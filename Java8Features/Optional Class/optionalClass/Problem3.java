/*
 * Given an Employee Object which may be initialized to null, use Optional Class to check,
 * if it is null and to throw an user defined exception InvalidEmployeeException.
 */

package optionalClass;

import java.util.Optional;

@SuppressWarnings("serial")
class InvalidEmployeeException extends Exception{
	public InvalidEmployeeException(String s) 
    {  
        super(s); 
    } 
}

class Employee{
	int empID;
	String name;
}

public class Problem3{

	public static void main(String[] args) throws InvalidEmployeeException {
		
		//Employee e1 = new Employee();
		Employee e1;
		e1 = null;
		
		Optional<Employee> opt = Optional.ofNullable(e1);
		//throws exception
		opt.orElseThrow(() -> new InvalidEmployeeException("Employee instance is null"));
	}

}

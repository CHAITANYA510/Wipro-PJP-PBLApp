package programs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {

Employee e1 = new Employee();
	
	@Test
	public void test() {

		ArrayList<String> employees = new ArrayList<String>();
		employees.add("Ram");
		employees.add("Rahim");
		employees.add("John");
		employees.add("Ramesh");
		
		assertEquals("FOUND",e1.findName(employees,"Ram"));
		assertEquals("FOUND",e1.findName(employees,"John"));
		assertEquals("NOT FOUND",e1.findName(employees,"Ronny"));
	}

}

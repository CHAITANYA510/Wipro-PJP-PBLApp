package practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class testEmployee {

	Employee e1 = new Employee();
	
	@Test
	void testEmployee() {
		
		ArrayList a1 = new ArrayList(); //{"Raj","Sagar","Heena"};
		a1.add("Raj");
		a1.add("Raju");
		a1.add("Sagar");
		assertEquals("FOUND",e1.findName(a1,"Raj"));
	}

}

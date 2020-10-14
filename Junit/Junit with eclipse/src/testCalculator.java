package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCalculator {
	
	Demo1 d1 = new Demo1();
	
	@Test
	void teststringConcat() {
		assertEquals("Hello World", d1.stringConcat("Hello ","World"));
	}
	
	@Test
	void testAdd() {
		assertEquals(5, d1.add(3,2));
	}
	
}

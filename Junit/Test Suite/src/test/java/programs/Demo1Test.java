package programs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Demo1Test {

	Demo1 d1 = new Demo1();
	@Test
	public void teststringConcat() {
		assertEquals("HelloWorld", d1.stringConcat("Hello","World"));
	}
	@Test
	public void testAdd() {
		assertEquals(5, d1.add(3,2));
	}

}

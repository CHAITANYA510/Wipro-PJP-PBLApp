package programs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Demo2Test {
	Demo2 d2 = new Demo2();
	@SuppressWarnings("static-access")
	@Test
	public void testPalindromeCheck() {
		assertEquals(true,d2.palindromeCheck("ababa"));
	}

}

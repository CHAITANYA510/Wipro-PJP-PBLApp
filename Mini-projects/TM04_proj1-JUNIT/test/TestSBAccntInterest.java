import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestSBAccntInterest {

	@Test
	public void testSBCalc() {
		SBAccount accnt = new SBAccount();
		
		accnt.setType(1);
		accnt.setAmount(100);
		assertEquals(4,accnt.calculateInterest(),"Type 1 test failed");
		
		accnt.setType(2);
		accnt.setAmount(100);
		assertEquals(6,accnt.calculateInterest(),"Type 2 test failed");
	}
	
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRDAccntInterest {

	@Test
	public void testRDCalc() {
		RDAccount accnt = new RDAccount();
		
		//age 65+
		
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(65);
		accnt.setNoOfMonths(2);
		assertEquals(0.0,accnt.calculateInterest(),"Test failed");
		
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(65);
		accnt.setNoOfMonths(6);
		assertEquals(8.0,accnt.calculateInterest(),"Test failed");
		
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(65);
		accnt.setNoOfMonths(9);
		assertEquals(8.25,accnt.calculateInterest(),"Test failed");
		
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(65);
		accnt.setNoOfMonths(12);
		assertEquals(8.5,accnt.calculateInterest(),"Test failed");
		
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(65);
		accnt.setNoOfMonths(15);
		assertEquals(8.75,accnt.calculateInterest(),"Test failed");
	
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(65);
		accnt.setNoOfMonths(18);
		assertEquals(9.0,accnt.calculateInterest(),"Test failed");
		
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(65);
		accnt.setNoOfMonths(21);
		assertEquals(9.25,accnt.calculateInterest(),"Test failed");
		
		
		//age less than 65
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(10);
		accnt.setNoOfMonths(2);
		assertEquals(9.25,accnt.calculateInterest(),"Test failed");
		
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(10);
		accnt.setNoOfMonths(6);
		assertEquals(7.5,accnt.calculateInterest(),"Test failed");
		
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(10);
		accnt.setNoOfMonths(9);
		assertEquals(7.75,accnt.calculateInterest(),"Test failed");
		
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(10);
		accnt.setNoOfMonths(12);
		assertEquals(8.0,accnt.calculateInterest(),"Test failed");
		
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(10);
		accnt.setNoOfMonths(15);
		assertEquals(8.25,accnt.calculateInterest(),"Test failed");
	
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(10);
		accnt.setNoOfMonths(18);
		assertEquals(8.5,accnt.calculateInterest(),"Test failed");
		
		accnt.setMonthlyAmount(100);
		accnt.setAgeOfACHolder(10);
		accnt.setNoOfMonths(21);
		assertEquals(8.75,accnt.calculateInterest(),"Test failed");

	}
}

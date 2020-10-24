import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFDAccntInterest {

	@Test
	public void testFDCalc() {
		FDAccount accnt = new FDAccount();
		
		//age less 65
		accnt.setAmount(100);
		accnt.setNoOfDays(6);
		accnt.setAgeOfACHolder(50);
		assertEquals(0.0,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(10);
		accnt.setAgeOfACHolder(50);
		assertEquals(4.5,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(20);
		accnt.setAgeOfACHolder(50);
		assertEquals(4.75,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(35);
		accnt.setAgeOfACHolder(50);
		assertEquals(5.5,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(50);
		accnt.setAgeOfACHolder(50);
		assertEquals(7.0,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(65);
		accnt.setAgeOfACHolder(50);
		assertEquals(7.5,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(200);
		accnt.setAgeOfACHolder(50);
		assertEquals(8.0,accnt.calculateInterest(),"Test failed");
	
		accnt.setAmount(100);
		accnt.setNoOfDays(400);
		accnt.setAgeOfACHolder(50);
		assertEquals(8.0,accnt.calculateInterest(),"Test failed");
	
		///age 65+
		accnt.setAmount(100);
		accnt.setNoOfDays(6);
		accnt.setAgeOfACHolder(70);
		//assertEquals(0.0,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(10);
		accnt.setAgeOfACHolder(70);
		assertEquals(5.0,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(20);
		accnt.setAgeOfACHolder(70);
		assertEquals(5.25,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(35);
		accnt.setAgeOfACHolder(70);
		assertEquals(6.0,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(50);
		accnt.setAgeOfACHolder(70);
		assertEquals(7.5,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(65);
		accnt.setAgeOfACHolder(70);
		assertEquals(8.0,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(100);
		accnt.setNoOfDays(200);
		accnt.setAgeOfACHolder(70);
		assertEquals(8.5,accnt.calculateInterest(),"Test failed");
	
		accnt.setAmount(100);
		accnt.setNoOfDays(400);
		accnt.setAgeOfACHolder(70);
		assertEquals(8.5,accnt.calculateInterest(),"Test failed");
		
		//amount 1cr+
		accnt.setAmount(10000001);
		accnt.setNoOfDays(6);
		accnt.setAgeOfACHolder(0);
		assertEquals(850000.085,accnt.calculateInterest(),"Test failed");
	
		accnt.setAmount(10000001);
		accnt.setNoOfDays(6);
		accnt.setAgeOfACHolder(10);
		assertEquals(850000.085,accnt.calculateInterest(),"Test failed");
	
		accnt.setAmount(10000001);
		accnt.setNoOfDays(10);
		accnt.setAgeOfACHolder(20);
		assertEquals(650000.065,accnt.calculateInterest(),"Test failed");
	
		accnt.setAmount(10000001);
		accnt.setNoOfDays(35);
		accnt.setAgeOfACHolder(30);
		assertEquals(675000.0675,accnt.calculateInterest(),"Test failed");
	
		accnt.setAmount(10000001);
		accnt.setNoOfDays(50);
		accnt.setAgeOfACHolder(30);
		assertEquals(800000.08,accnt.calculateInterest(),"Test failed");
	
		accnt.setAmount(10000001);
		accnt.setNoOfDays(100);
		accnt.setAgeOfACHolder(40);
		assertEquals(850000.085,accnt.calculateInterest(),"Test failed");
	
		accnt.setAmount(10000001);
		accnt.setNoOfDays(200);
		accnt.setAgeOfACHolder(50);
		assertEquals(1000000.1,accnt.calculateInterest(),"Test failed");
		
		accnt.setAmount(10000001);
		accnt.setNoOfDays(400);
		accnt.setAgeOfACHolder(70);
		assertEquals(1000000.1,accnt.calculateInterest(),"Test failed");
	
	}
	
}

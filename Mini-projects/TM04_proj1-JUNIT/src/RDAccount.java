
public class RDAccount extends Account{
	private double interestRate;
	private double monthlyAmount;
	private int noOfMonths;
	private int AgeOfACHolder;
	
	void getinterestRate() {
		if(AgeOfACHolder<65) {
			if(noOfMonths==6) {
				interestRate = 7.50;
			}
			else if(noOfMonths==9) {
				interestRate = 7.75;
			}
			else if(noOfMonths==12) {
				interestRate = 8.00;
			}
			else if(noOfMonths==15) {
				interestRate = 8.25;
			}
			else if(noOfMonths==18) {
				interestRate = 8.50;
			}
			else if(noOfMonths==21) {
				interestRate = 8.75;
			}
			else {
				System.out.println("Invalid number of months");
			}	
		}
		
		else{
			if(noOfMonths==6) {
				interestRate = 8.00;
			}
			else if(noOfMonths==9) {
				interestRate = 8.25;
			}
			else if(noOfMonths==12) {
				interestRate = 8.50;
			}
			else if(noOfMonths==15) {
				interestRate = 8.75;
			}
			else if(noOfMonths==18) {
				interestRate = 9.00;
			}
			else if(noOfMonths==21) {
				interestRate = 9.25;
			}
			else {
				System.out.println("Invalid number of months");
			}	
		}
		
	}
		
	@Override
	double calculateInterest() {
		getinterestRate();
		double interest = (interestRate*monthlyAmount) / 100;
		return interest;
	}

	public double getMonthlyAmount() {
		return monthlyAmount;
	}

	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}

	public int getNoOfMonths() {
		return noOfMonths;
	}

	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}

	public int getAgeOfACHolder() {
		return AgeOfACHolder;
	}

	public void setAgeOfACHolder(int AgeOfACHolder) {
		this.AgeOfACHolder = AgeOfACHolder;
	}
}

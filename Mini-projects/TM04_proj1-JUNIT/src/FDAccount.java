
public class FDAccount extends Account{
	private double interestRate;
	private double amount;
	private int noOfDays;
	private int ageOfACHolder;
	
	void getInterestOflessThan1CR() {
		
		if(ageOfACHolder<65) {
			if(noOfDays>=7 && noOfDays<=14) {
				interestRate = 4.50;
			}
			else if(noOfDays>=15 && noOfDays<=29) {
				interestRate = 4.75;
			}
			else if(noOfDays>=30 && noOfDays<=45) {
				interestRate = 5.50;
			}
			else if(noOfDays>=45 && noOfDays<=60) {
				interestRate = 7;
			}
			else if(noOfDays>=61 && noOfDays<=184) {
				interestRate = 7.50;
			}
			else if(noOfDays>=185 && ageOfACHolder<=365) {
				interestRate = 8.00;
			}
			else{
				System.out.println("Invalid number of days");
			}
		}
		
		
		else {
			if(noOfDays>=7 && noOfDays<=14) {
				interestRate = 5.00;
			}
			else if(noOfDays>=15 && noOfDays<=29) {
				interestRate = 5.25;
			}
			else if(noOfDays>=30 && noOfDays<=45) {
				interestRate = 6.00;
			}
			else if(noOfDays>=45 && noOfDays<=60) {
				interestRate = 7.50;
			}
			else if(noOfDays>=61 && noOfDays<=184) {
				interestRate = 8.0;
			}
			else if(noOfDays>=185 && noOfDays<=365) {
				interestRate = 8.50;
			}
			else{
				System.out.println("Invalid number of days");
			}
		}
	}
	
	void getInterestOfgreaterThan1CR(){
		
		if(noOfDays>=7 && noOfDays<=14) {
			interestRate = 6.50;
		}
		else if(noOfDays>=15 && noOfDays<=29) {
			interestRate = 6.75;
		}
		else if(noOfDays>=30 && noOfDays<=45) {
			interestRate = 6.75;
		}
		else if(noOfDays>=45 && noOfDays<=60) {
			interestRate = 8;
		}
		else if(noOfDays>=61 && noOfDays<=184) {
			interestRate = 8.50;
		}
		else if(noOfDays>=185 && noOfDays<=365) {
			interestRate = 10.00;
		}
		else{
			System.out.println("Entered number of days are not eligible.");
		}
	}
	
	
	@Override
	double calculateInterest() {
		if(amount<=10000000) {
			getInterestOflessThan1CR();
		}
		else {
			getInterestOfgreaterThan1CR();
		}
		double interest = (interestRate*amount) / 100;	
		return interest;
	}
	
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}
	
}

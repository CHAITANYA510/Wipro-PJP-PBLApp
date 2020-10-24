
public class SBAccount extends Account{
	private double interestRate;
	private double amount;
	private int type;
	
	@Override
	double calculateInterest() {
		
		if(type == 1) {
			interestRate = 4;
		}
		else if(type == 2) {
			interestRate = 6;
		}
		else {
			System.exit(0);
		}
		double interest = (interestRate*amount) / 100;
		return interest;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}

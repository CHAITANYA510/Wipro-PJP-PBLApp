
abstract class GeneralBank {
		public double getSavingsInterestRate(){
			double saving_interest_rate=0.0;
			return saving_interest_rate;
		}
		public double getFixedDepositInterestRate(){	
			double FD_interest_rate = 0.0;
			return FD_interest_rate;
		}		
}

class ICICIBank extends GeneralBank{
	public double getSavingsInterestRate(){
		return 4;
	}	
	public double getFixedDepositInterestRate(){	
		return 8.5;
	}	
}

class KotMBank extends GeneralBank{
	public double getSavingsInterestRate(){
		return 6;
	}
	public double getFixedDepositInterestRate(){
		return 9;
	}
}

public class testBank{
	
	public static void main(String[] args) {
		
		//ICICIBank i = new ICICIBank();
		//KotMBank k = new KotMBank();
		//GeneralBank g1 = new ICICIBank();
		GeneralBank g2 = new KotMBank();
		
		System.out.println("Savings Interest Rate is "+g2.getSavingsInterestRate()+"%");
		System.out.println("Fixed Deposit Interest Rate is "+g2.getFixedDepositInterestRate()+"%");
	}
}



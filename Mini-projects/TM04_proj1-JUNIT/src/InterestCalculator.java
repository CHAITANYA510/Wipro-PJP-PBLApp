import java.util.Scanner;

public class InterestCalculator {
	
	static void display() {
		System.out.println("MAIN MENU");
		System.out.println("---------");
		System.out.println("1. Interest Calculator - SB");
		System.out.println("2. Interest Calculator - FD");
		System.out.println("3. Interest Calculator - RD");
		System.out.println("4. Exit");
		System.out.print("Enter your option (1..4) : ");
	}
	
	public static void main(String[] args) {
		
		//Account a1;
		SBAccount sb1 = new SBAccount();
		FDAccount fd1 = new FDAccount();
		RDAccount rd1 = new RDAccount();
		Scanner sc = new Scanner(System.in);
		int option;
		//people below age 65 are asssumed general and age above or equal to 65 is assumed as senior. 
		
		while(true) {
			
			display();
			option = 0;
			try {
				option = Integer.parseInt(sc.next());
				double input;
				int in;
				switch(option) {
				case 1:
						System.out.print("Enter the average amount in your account: ");
						input = sc.nextDouble();
						if(input<0) {
							throw new negativeInputException("Amount cannot be negative");
						}
						else {
							sb1.setAmount(input);
						}
						
						System.out.println("1.Normal\n2.NRI");
						in = Integer.parseInt(sc.next()); 
						if(in==1||in==2) {
							sb1.setType(in);
						}
						else {
							System.out.println("Incorrect option");
						}
						
						System.out.println("Interest gained: Rs. "+sb1.calculateInterest());
						break;
				
				case 2:
						System.out.print("Enter the FD amount: ");
						input = sc.nextDouble(); 
						if(input<0) {
							throw new negativeInputException("Amount cannot be negative");
						}
						else {
							fd1.setAmount(input);
						}
						
						System.out.print("Enter the number of days: ");
						in = Integer.parseInt(sc.next()); 
						if(in<0) {
							throw new negativeInputException("Number of days cannot be negative");
						}
						else {
							fd1.setNoOfDays(in);
						}
						
						System.out.print("Enter your age: ");
						in = Integer.parseInt(sc.next()); 
						if(in<0) {
							throw new negativeInputException("Age cannot be negative");
						}
						else {
							fd1.setAgeOfACHolder(in);
						}
						
						System.out.println("Interest gained: Rs. "+fd1.calculateInterest());
						break;
					
				case 3:
						System.out.print("Enter the RD amount: ");
						input = sc.nextDouble(); 
						if(input<0) {
							throw new negativeInputException("Amount cannot be negative");
						}
						else {
							rd1.setMonthlyAmount(input);
						}
						
						System.out.print("Enter the number of months: ");
						in = Integer.parseInt(sc.next()); 
						if(in<0) {
							throw new negativeInputException("Number of months cannot be negative");
						}
						else {
							rd1.setNoOfMonths(in);
						}
						
						System.out.print("Enter your age: ");
						in = Integer.parseInt(sc.next()); 
						if(in<0) {
							throw new negativeInputException("Age cannot be negative");
						}
						else {
							rd1.setAgeOfACHolder(in);
						}
						
						System.out.println("Interest gained: Rs. "+rd1.calculateInterest());
						break;
				
				case 4:
						System.out.println("Exiting..");
						System.exit(0);
						break;
						
				default:
						System.out.println("Invalid choice");
						System.exit(0);
						break;
			}
			}
			
			catch(NumberFormatException e) {
				System.out.println("Input should be integer");
				//e.printStackTrace(); 
			}
			catch(Exception e) {
				e.printStackTrace();
			}
				
		System.out.println("");
		}
	}
}

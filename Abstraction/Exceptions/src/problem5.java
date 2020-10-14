/*Write a Program with a division method which receives two integer numbers and performs the division operation. 
The method should declare that it throws ArithmeticException. This exception should be handled in the main method.
*/

public class problem5 {
		
	public static int division(int x, int y) throws ArithmeticException{
		int ans = x/y;
		return ans;
	}
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		try {
		System.out.println("Divsion of "+num1+ " and "+num2+" is: "+division(num1,num2));
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}

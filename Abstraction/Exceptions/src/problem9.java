/*Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.
This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. 
In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally block”.
Example1)
Enter the 2 numbers
5
2
The quotient of 5/2 = 2
Inside finally block

Example2)
Enter the 2 numbers
5
DivideByZeroException caught
Inside finally block
*/

import java.util.Scanner;

public class problem9 {

	public static void main(String[] args){
		System.out.println("Enter the 2 numbers");
		Scanner sc = new Scanner(System.in);
		try {
			int num1 = Integer.parseInt(sc.nextLine());
			int num2 = Integer.parseInt(sc.nextLine());
			int quotient = num1/num2;
			System.out.println("The quotient of "+num1+"/"+num2+" = "+quotient);
		}
		catch(ArithmeticException e) {
			System.out.println("DivideByZeroException caught");
			//e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside finally block");
		}
		sc.close();
	}

}

/*Write a Java program that reads an integer number (between 1 and 255) from the user and prints the binary representation of the number. 
The answer should be printed as a String.
Note: The output displayed should contain 8 digits and should be padded with leading 0s(zeros), in case the returned String contains less than 8 characters.
For example, if the user enters the value 16, then the output should be 00010000
and if the user enters the value 100, the output should be 01100100
You are expected to use Integer class conversion method/s described in the PDF file. 
Use Scanner class to accept user inputs.
(Hint : You may use String.format() method for the expected output)
 */

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args){
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter an integer between 1 to 255: ");
		try{
			int i = Integer.parseInt(sc.next());
			if(i>=0 && i<=255) {
				Integer number = i;
				int s = Integer.parseInt(number.toBinaryString(number));
				//// "%08d" gived 8 digit output and auto padding og zeros in answer
				String padded = String.format("%08d",s); 
				System.out.println("Binary output is: "+padded);
			}
			else {
				System.out.println("Please enter an integer within specified range");
			}
		}
	
	catch(NumberFormatException e) {
		System.out.println(e.toString());
		System.out.println("Please enter valid input");
	}
	}
}

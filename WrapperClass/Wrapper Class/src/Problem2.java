/*Write a program to receive an integer number as a command line argument, and print the binary, octal and hexadecimal equivalent of the given number.
Sample Output:
java  Test 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
 */

public class Problem2 {

	public static void main(String[] args) {
		
		Integer i = Integer.parseInt(args[0]);
		String s;
		System.out.println("Given number: "+i);
		s = i.toBinaryString(i);
		System.out.println("Binary equivalent: "+s);
		s = i.toOctalString(i);
		System.out.println("Octal equivalent: "+s);
		s = i.toHexString(i);
		System.out.println("Hexadecimal equivalent: "+s);
		
	}

}

/* Write a program to count the number of times a character appears in a File. 
[Note :  The character check is case insensitive... i.e, 'a' and 'A' are considered to be the same]
Sample Input and Output:
Enter the file name
Input.txt
Enter the character to be counted
r
File 'Input.txt' has 99 instances of letter 'r'.
*/


import java.util.Scanner;
import java.io.*;
public class Problem1 {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name or location:");
		String loc = sc.nextLine();
		try {
			//FileReader in  = new FileReader("inputFile.txt");
			FileReader in  = new FileReader(loc);
			System.out.print("Enter the character to be counted: ");
			char repOf = 0;
			String input = sc.next();
			if(input.length() == 1) {
				repOf = input.charAt(0);
			}
			else {
				System.out.println("Input is not a character");
				System.exit(0);
			}
			int c;
			int count=0;
			while((c=in.read()) != -1){	
				if((((int)c) == (int)repOf) || (((int)c)+32 == (int)repOf) || (((int)c)-32 == (int)repOf))  {
					count++;
				}
			}
			System.out.println("File '"+loc+"' has "+count+" instances of letter '"+repOf+"'");
			in.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.out.println("Enter valid file name or location");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}

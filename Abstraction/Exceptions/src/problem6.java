/* Write a Program to take care of Number Format Exception 
if user enters values other than integer for calculating average marks of 2 students. 
The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
*/

import java.util.Scanner;

	@SuppressWarnings("serial")
	class NegativeValueException extends Exception {
		public NegativeValueException() {
			System.out.println("Marks cannot be negative value");
		}
	}
	
	@SuppressWarnings("serial")
	class ValueOutOfRangeException extends Exception {
		public ValueOutOfRangeException(){
			System.out.println("Marks cannot be greater then 100");
		}
	}

public class problem6 {
	
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of student 1 ");
		String s1 = sc.next();
		System.out.print("Enter name of student 2 ");
		String s2 = sc.next();
		int sum1=0,sum2=0;
		
		try {
			System.out.println("Enter "+s1+" marks");
			for(int i=0;i<3;i++) {
				int n = Integer.parseInt(sc.next());
				if(n < 0) {
					throw new NegativeValueException();
				}
				else if(n > 100) {
					throw new ValueOutOfRangeException();
				}
				else{
					sum1 = sum1 + n;
					
				}
			}
			System.out.println("Total marks of "+s1+" is: "+sum1);
			
			System.out.println("Enter "+s2+" marks");
			for(int i=0;i<3;i++) {
				int n = sc.nextInt();
				if(n < 0) {
					throw new NegativeValueException();
				}
				else if(n > 100) {
					throw new ValueOutOfRangeException();
				}
				else{
				sum2 = sum2 + n;
				}
			}
			System.out.println("Total marks of "+s2+" is: "+sum2);
			sc.close();
			int average = (sum1+sum2) / 2;
			System.out.println("Average is: "+average);
		}
		
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(ValueOutOfRangeException e) {
			System.out.println(e);
		}
		catch(NegativeValueException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


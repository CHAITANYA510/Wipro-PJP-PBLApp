/*
Write a class MathOperation which accepts 5 integers through command line.
 Create an array using these parameters.
Loop through the array and obtain the sum and average of all the elements
 and display the result. 
Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
*/

public class MathOperation {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int sum=0;
		try {
			for(int i=0;i<5;i++) {
					arr[i] = Integer.parseInt(args[i]);
					sum = sum + arr[i];
			}
			int average = sum/5;
			System.out.println("Sum is: "+sum);
			System.out.println("Average is: "+average);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

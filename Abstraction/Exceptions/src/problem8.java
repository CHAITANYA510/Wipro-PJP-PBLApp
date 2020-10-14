/*Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) 
 * and ensure that the age entered is >=18 and < 60. 
Display proper error messages. 

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)
 */

	
@SuppressWarnings("serial")
class AgeException extends Exception{
	public AgeException() {
		System.out.println("Age group entered is not eligible.");	
	}
}

public class problem8 {
	
	public static void main(String[] args) {
		
		try {
			String name = args[0];
			int age = Integer.parseInt(args[1]);
			
			if(age >= 18 && age < 60) {
				System.out.println("Data stored.");
			}
			else {
				throw new AgeException();
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid input arguments..");
			e.printStackTrace();
		}
		catch(AgeException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

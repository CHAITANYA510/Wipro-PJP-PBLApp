/*Create a package called test package.
Define a class called foundation inside the test package.
Inside the class, you need to define 4 integer variables:
var1 with private access modifier
var2 with default access modifier
var3 with protected access modifier
var4 with public access modifier
Import this class and packages in another class. 
Try to access all 4 variables of the foundation class and 
see what variables are accessible and what are not accessible.
*/

import testPackage.foundation;

public class problem1 {

	public static void main(String[] args) {
		
		foundation f1 = new foundation();
		//System.out.println(f1.var1); //not accessible
		//System.out.println(f1.var2); //not accessible
		//System.out.println(f1.var3); //not accessible
		System.out.println(f1.var4); //accessible
		
	}

}

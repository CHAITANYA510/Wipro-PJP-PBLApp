/*
 * Interface Test(I), abstract method "int myFunction(int a,int b,int c)",
 * Create 2 Test(I) variables, t1 and t2, 
 * t1 - add 3 numbers using Lamda expression
 * t2 - multiply 3 numbers using Lamda expression
 * call myFunction() using t1 and t2 and print the result.
 */

package interfaceJava8;

interface Test{
	int myFunction(int a,int b,int c);
}

public class Problem2 {

	public static void main(String[] args) {
		Test t1;
		Test t2;
		
		t1 = (a,b,c) -> a+b+c;
		t2 = (a,b,c) -> a*b*c;
		
		System.out.println("Using t1 sum of (3, 4, 5): "+t1.myFunction(3, 4, 5));
		System.out.println("Using t2 product of (3, 4, 5): "+t2.myFunction(3, 4, 5));
	}

}

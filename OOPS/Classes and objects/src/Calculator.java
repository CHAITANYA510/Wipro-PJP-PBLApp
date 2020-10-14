
/*Create a new class called Calculator with the following methods: 
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power. */


class Calculator {

	static int powerInt(int num1,int num2) {
		
		return((int)(Math.pow(num1, num2)));
	}
	
	static double powerDouble(double num1,int num2) {
		
		return(Math.pow(num1, num2));
	}
	
	
	public static void main(String[] args) {
		
		
		int n1 = 3;
		int n2 = 2;
		Calculator c1 = new Calculator();
		System.out.println("Power Int executed.\n"+n1+" to power "+n2+" is: "+c1.powerInt(n1,n2));
		System.out.println("Power Float executed.\n"+n1+" to power "+n2+" is: "+c1.powerDouble(n1,n2));
		
	}

}

/*
 * Write a java program that generates the minimum and maximum value for each of the Numeric Wrapper classes (Byte, Short, nteger, Long, Float, Double)
Sample Output:
Integer range: 
min: -2147483648 
max: 2147483647 
Double range: 
min: 4.9E-324 
max: 1.7976931348623157E308 
Long range: 
min: -9223372036854775808 
max: 9223372036854775807 
Short range: 
min: -32768 
max: 32767 
Byte range: 
min: -128 
max: 127 
Float range: 
min: 1.4E-45 
max: 3.4028235E38

 */

public class Problem1 {

	public static void main(String[] args) {
		
		Integer i = 0;
		System.out.println("Integer range:");
		System.out.println(i.MIN_VALUE);
		System.out.println(i.MAX_VALUE);
		
		Double d = 0d;
		System.out.println("Double range:");
		System.out.println(d.MIN_VALUE);
		System.out.println(d.MAX_VALUE);
		
		Long l = 0l;
		System.out.println("Long range:");
		System.out.println(l.MIN_VALUE);
		System.out.println(l.MAX_VALUE);
		
		Short s = 0;
		System.out.println("Short range:");
		System.out.println(s.MIN_VALUE);
		System.out.println(s.MAX_VALUE);
		
		Byte b = 0;
		System.out.println("Byte range:");
		System.out.println(b.MIN_VALUE);
		System.out.println(b.MAX_VALUE);
		
		Float f = 0f;
		System.out.println("Float range:");
		System.out.println(f.MIN_VALUE);
		System.out.println(f.MAX_VALUE);
	
	}

}

/*i) Create the following class and implement the method 
to check whether the given string is a palindrome and return the result.

Class Name : Demo2
Method : palindromeCheck(String):boolean

(Hint: A String is palindrome,  If the reversed string is equal to the actual string. Ex: madam, mom, dad, malayalam )
ii) Create a Junit test class to test the above class.
*/

package practice;

public class Demo2 {
	
	static boolean palindromeCheck(String s){
		boolean b = true;
		int n = s.length();
		
		if(n == 0) {
			return false;
		}
		
		else {
			int i=0;
			while(n>0) {
				if(n == 1) {
					 return true;
				}
				else if(s.charAt(i) == s.charAt(n - 1)) {
					b = true;
				}
				else {
					return false;
				}
				i++;n--;
			}
			return b;
		}	
	}
}

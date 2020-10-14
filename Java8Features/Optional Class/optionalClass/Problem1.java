/*
 * Use Optional Class to avoid NullPointerException from code below:
 * String[] names = new String[5];
 * System.out.println(names[0].length());
 */

package optionalClass;

import java.util.Optional;

public class Problem1 {

	public static void main(String[] args) {
		
		String[] names = new String[5];
		///names[0] = "a";
		
		Optional<String> opt = Optional.ofNullable(names[0]);
		if(opt.isPresent()){
			System.out.println(names[0].length());
		}
		else {
			System.out.println("Null value");
		}
	}

}

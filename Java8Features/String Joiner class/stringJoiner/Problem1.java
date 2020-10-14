//Given and ArrayList of n names, use StringJoiner to construct a new sequence of names separated by "," and enclosed in {} braces.

package stringJoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Problem1 {

	public static void main(String[] args) {
		
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("Monday");
		arrList.add("Tuesday");
		arrList.add("Wednesday");
		arrList.add("Thursday");
		arrList.add("Friday");
		arrList.add("Saturday");
		arrList.add("Sunday");
		
		StringJoiner join = new StringJoiner(", ","{","}");
		
		arrList.forEach(s -> join.add(s));
		
		System.out.println("Strings joined using StringJoiner: \n"+join);

	}

}

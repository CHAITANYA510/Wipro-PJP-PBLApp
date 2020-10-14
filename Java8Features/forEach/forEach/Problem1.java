///Create ArrayList, add days of weeks, write code to iterate and print them using forEach()

package forEach;

import java.util.ArrayList;

public class Problem1 {

	public static void main(String[] args) {
		
		ArrayList<String> arrList = new ArrayList<String>();
		///Add days of weeks
		arrList.add("Monday");
		arrList.add("Tuesday");
		arrList.add("Wednesday");
		arrList.add("Thursday");
		arrList.add("Friday");
		arrList.add("Saturday");
		arrList.add("Sunday");
		
		//using foEach() of ArrayList
		arrList.forEach(System.out::println);
	}

}

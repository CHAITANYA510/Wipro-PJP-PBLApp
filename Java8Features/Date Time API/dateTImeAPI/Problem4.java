///WAP to check whether the current year is leap year or not.

package dateTImeAPI;

import java.time.LocalDate;

public class Problem4 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		//date = LocalDate.of(2021, 01, 02);
		
		System.out.println("Today's date is: "+date);
		
		if(date.isLeapYear()) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not Leap year.");
		}

	}

}

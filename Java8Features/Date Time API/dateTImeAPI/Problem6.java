//WAP to display current time and time before 5 hours and 30 minutes.

package dateTImeAPI;

import java.time.LocalTime;

public class Problem6 {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		System.out.println("Present time is: "+time);
		System.out.println("Time before 5 hours and 30 minutes is: "+time.minusHours(5).minusMinutes(30));

	}

}

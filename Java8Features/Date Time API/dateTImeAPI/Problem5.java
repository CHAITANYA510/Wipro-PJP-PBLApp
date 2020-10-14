//WAP to display current time and the time after 25 minutes.

package dateTImeAPI;

import java.time.LocalTime;

public class Problem5 {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		System.out.println("Present time is: "+time);
		System.out.println("Time after 25 minutes is: "+time.plusMinutes(25));

	}

}

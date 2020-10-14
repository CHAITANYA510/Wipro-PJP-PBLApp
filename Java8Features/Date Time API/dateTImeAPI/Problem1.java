/*
 * WAP to display today's date and the date after 10 days.
 */

package dateTImeAPI;

import java.time.LocalDate;

public class Problem1 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Today's date is: "+date);
		System.out.println("Date after 10 days is: "+date.plusDays(10));
	}
}

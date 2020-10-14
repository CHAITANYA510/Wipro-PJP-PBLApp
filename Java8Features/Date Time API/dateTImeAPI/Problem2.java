///WAP to find the date of next month second Sunday.

package dateTImeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Problem2 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Today's date is: "+date);
		
		LocalDate firstDateInNextMOnth = LocalDate.of(date.getYear(),date.minusMonths(1).getMonth(), 1);
		LocalDate nextSunday = firstDateInNextMOnth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println("Date of next month's second Sunday: "+nextSunday);
	
	}
}

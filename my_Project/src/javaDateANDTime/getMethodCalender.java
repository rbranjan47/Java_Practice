package javaDateANDTime;

import java.util.*;

/*
 * Ways to get Date and Time:
 *   >> Date class
 *   >> using get method of calender class and formatter class
 *  
 */
public class getMethodCalender {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		// date
		System.out.println("Date: " + cal.get(Calendar.DATE));
		// month
		System.out.println("Month: " + cal.get(Calendar.MONTH));
		// year
		System.out.println("Year: " + cal.get(Calendar.YEAR));
		// days of week
		System.out.println("day of week: " + cal.get(Calendar.DAY_OF_WEEK));
		// days of month
		System.out.println("day of month: " + cal.get(Calendar.DAY_OF_MONTH));
		// days of year
		System.out.println("day of year: " + cal.get(Calendar.DAY_OF_YEAR));
		// days of week in month
		System.out.println("day of week in month: " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		// hour of day
		System.out.println("hour of day: " + cal.get(Calendar.HOUR_OF_DAY));

	}
}

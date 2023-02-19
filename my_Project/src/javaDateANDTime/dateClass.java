package javaDateANDTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  >> date class    > java.util package, implements serializable, cloneable and comparable
 *                   > represents a specific instant in time(n millisecond)
 *                   
 *                   > constructors: 
 *                       - Date()
 *                       - Date(long milliseconds)
 *                       - Date(int year, int month, int date)
 *                       - Date(int year, int month, int date, int hrs, int min)
 *                       - Date(int year, int month, int date, int hrs, int min, int sec)
 *                       - Date(String s)
 *                      
 *                   NOTE: Last 4 constructors 	are deprecated    
 *                   
 *                   
 *  >> Important methods:
 *     - boolean after(Date date)   > tests, if current date is after given date
 *     - boolean before(Date date)  > tests, if current date is before given date
 *     - int compareTo(Date date)   > compare given date with current date, 
 *                                    (0 if argument date equal to current date)
 *                                    (less than 0, if argument date less than current date)
 *                                    (more than 0, if argument date more than current date)
 *     - long getTime()             > returns, number of milli seconds since January 1, 1970 00:00:00 GMT
 *     - long setTime(long time)    > changes current time to given time
 *     
 */
public class dateClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		// Date()
		Date d1 = new Date();
		System.out.println(d1);

		// Date(long milliseconds)
		Date d2 = new Date(1000L);
		System.out.println(d2);

		// Date(int year, int month, int date)
		Date d3 = new Date(97, 9, 31);
		System.out.println(d3);

		// Date(int year, int month, int date, int hrs, int min)
		Date d4 = new Date(97, 9, 31, 01, 65);
		System.out.println(d4);

		// Date(int year, int month, int date, int hrs, int min, int sec)
		Date d5 = new Date(97, 9, 31, 01, 65, 65);
		System.out.println(d5);

		// Date(String s)
		String dateFormat = "2024/02/19";
		Date d6 = new SimpleDateFormat("yyyy/MM/dd").parse(dateFormat);
		System.out.println(d6);

		Date datesMethods = new Date();
		System.out.println(datesMethods.after(d4)); // true, since Sun Feb 19 22:09:43 IST 2023 AFTER Fri Oct 31
													// 02:05:00 IST 1997

		System.out.println(datesMethods.before(d5)); // false, since Sun Feb 19 22:09:43 IST 2023 NOT BEFORE Fri Oct 31
														// 02:05:00 IST 1997

		System.out.println(datesMethods.compareTo(d4));
		System.out.println(datesMethods.compareTo(d6));

		System.out.println("Date:" + datesMethods.getDate());
		System.out.println("Day:" + datesMethods.getDay());
		System.out.println("Hours:" + datesMethods.getHours());
		System.out.println("Minutes:" + datesMethods.getMinutes());
		System.out.println("Month:" + datesMethods.getMonth());

		System.out.println("Time(after 1970 in milliseconds):" + datesMethods.getTime());

		System.out.println("TimeZone offset:" + datesMethods.getTimezoneOffset());
		System.out.println("Month:" + datesMethods.getYear());
	}
}

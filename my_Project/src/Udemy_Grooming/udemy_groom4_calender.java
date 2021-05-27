package Udemy_Grooming;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class udemy_groom4_calender 
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		
		//Month Date
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//AM or PM
		System.out.println(cal.get(Calendar.AM_PM));
		//day of week
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		//day of week in month
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//day of year
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		//zone_offset
		System.out.println(cal.get(Calendar.ZONE_OFFSET));
	}
}

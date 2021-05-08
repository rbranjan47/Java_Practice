package rough;

import org.testng.annotations.Test;

import Methods.reusable_methodsClass;
import resources.base_class;

public class rough_class extends base_class
{
	reusable_methodsClass reusable;
	public rough_class()
	{
		super();
	}
	@Test
	public void rough()
	{
		reusable =  new reusable_methodsClass(driver);
		String year = properties.getProperty("from_year");
		int year_int = Integer.parseInt(year);
		
		String month = properties.getProperty("from_month");
		int month_int = Integer.parseInt(month);
		
		String day = properties.getProperty("from_date");
		int date_int = Integer.parseInt(day);
		
		String date_in_format = reusable.date(year_int, month_int, date_int);
		String splitdate[] = date_in_format.split("-");
		String month_spliter = splitdate[1];
		String day_splitter = splitdate[0];
		System.out.println(month_spliter);
		System.out.println(day_splitter);
		System.out.println(date_in_format);
		
		String to_year = properties.getProperty("to_year");
		int to_year_int = Integer.parseInt(to_year);
		
		String to_month = properties.getProperty("to_month");
		int to_month_int = Integer.parseInt(to_month);
		
		String to_day = properties.getProperty("to_date");
		int to_date_int = Integer.parseInt(to_day);
		
		String date_to_format = reusable.date(to_year_int, to_month_int, to_date_int);
		String splitdate_to[] = date_to_format.split("-");
		String month_spliter_to = splitdate_to[1];
		String day_splitter_to = splitdate_to[0];
		System.out.println(month_spliter_to);
		System.out.println(day_splitter_to);
		System.out.println(date_to_format);
	}
}

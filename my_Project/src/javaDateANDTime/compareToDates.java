package javaDateANDTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class compareToDates {
	public static void main(String[] args) throws ParseException {
		try {
			// equal
			Date date1 = new SimpleDateFormat("YYYY-MM-DD").parse("2023-02-01");
			Date date2 = new SimpleDateFormat("YYYY-MM-DD").parse("2023-02-01");
			System.out.println(date1.compareTo(date2));

			// before
			@SuppressWarnings("deprecation")
			Date date3 = new Date(01, 05, 05, 13, 55, 50); // Wed Jun 05 13:55:50 IST 1901
			Date date4 = new Date();
			System.out.println(date3 + "\n" + date4);
			System.out.println(date4.compareTo(date3));
			System.out.println(date3.before(date4));

			// after
			@SuppressWarnings("deprecation")
			Date date5 = new Date(01, 05, 05, 13, 55, 50);// Wed Jun 05 13:55:50 IST 1901
			System.out.println(date5 + "\n" + date4);
			System.out.println(date5.compareTo(date4));
			System.out.println(date4.after(date5));
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}
}

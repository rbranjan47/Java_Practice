package javaRegex;

/* 
 *    //Validate Password
 *    >> ((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})
 *         (            > starts group
 *         (?=.*\\d)    > must contains 1 digit from 0-9
 *         (?=.*[a-z])  > must contains 1 lowercase characters
 *         (?=.*[A-Z])  > must contains 1 uppercase characters
 *         (?=.*[@#$%]) > must contains 1 symbols, @#$%
 *         .            > matches anything with previous conditions checking
 *         {6,15}       > length atleast 6 characters and maximum of 20
 *          )           > end of group
 * 
 *    //Validate Email
 *    >> ^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[_A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$
 *         
 *         ^                  -> find a match at beganing of string
 *         [_A-Za-z0-9-\\+]+  -> must start with chars in bracket, +(must contains 1 or more)
 *         
 *         (                  -> start of group1
 *         \\.[_A-Za-z0-9-]+  -> follow by dot, must contains chars in bracket, (+)1 or more
 *         )*                 -> end of group, *(0 or more time, refers as optional)
 *        
 *        @                   -> must contains @
 *         [A-Za-z0-9]+       -> must contains chars in bracket, (+)1 or more
 *         
 *         (                  -> start of group2
 *         \\.[_A-Za-z0-9-]+  -> follow by dot, must contains chars in bracket, (+)1 or more
 *         )*                 -> end of group, *(0 or more time, refers as optional)
 *         
 *         (                  -> start of group3
 *         \\.[A-Za-z]{2,}    -> follow by dot, must contains chars in bracket, (+)1 or more
 *         )$                 -> end of group, $(find a match at end of string)s
 *         
 *         
 *    //Validate Image
 *    >>([^\S]+(\\.(?)(jpg|gif|png|bmp))
 *       (                       -> start of group
 *       [^\\s]+                 -> check for any characters more than 1, except white space
 *       (\\.(?)(jpg|gif|png|bmp)-> followed by .(dot) checks for given format
 *       )                       -> end of group
 *    
 *    //validate IP address, we can check "0-255.0-255.0.255.0-255"
 *    >> ^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5]).([01]?\\d\\d?|2[0-4]\\d|25[0-5]).([01]?\\d\\d?|2[0-4]\\d|25[0-5])$
 *       ^                 -> match from starting of string
 *       (                 -> start of group
 *       [01]?\\d\\d?      -> 1st char 0 or 1, and 2nd & 3rd chars any
 *       |                  or
 *       2[0-4]\\d         -> 1st start with 2, 3 in between 0-4, & 3rd any
 *       |                  or
 *       25[0-5])\\.       -> start with 25 & 3rd char in between 0-5
 *    
 *    
 *    //validate 12-hour time format
 *    >> ^(0[0-9]|1[0-2]):[0-5][0-9](\\s)?(?)(am|pm)$
 *       ^                  -> match from starting of string
 *       (                  -> start of group
 *       [0-9]|1[0-2]       -> 1st & 2nd fall in between 0-12 hours
 *       )                  -> end of group
 *       :[0-5][0-9](\\s)?  -> minutes fall between 0-59
 *       (?)(am|pm)$        -> match with given
 *       
 *       
 *   //validate 24-hour time formats
 *   >> ^(0[0-9]|1[0-2]|2[0-3]):[0-5][0-9]
 *   
 *   //validate date format
 *   >> (0?[1-9]|[12][0-9]|3[01])
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class stringMatchers {
	// Validate password
	public boolean validatePassword(String s) {
		String patternRegex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";

		Pattern patterns = Pattern.compile(patternRegex);
		Matcher matchers = patterns.matcher(s);
		return matchers.matches();
	}

	// validate email
	public boolean validateEmail(String s) {
		String regexWord = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[_A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

		Pattern patterns = Pattern.compile(regexWord);
		Matcher matchers = patterns.matcher(s);
		return matchers.matches();
	}

	// validate imageName
	public boolean checkImageName(String s) {
		String regexImageName = "([^\\s]+(\\.(?)(jpg|gif|png|bmp)))";

		Pattern patterns = Pattern.compile(regexImageName, Pattern.CASE_INSENSITIVE);
		Matcher matchesImageName = patterns.matcher(s);
		return matchesImageName.matches();
	}

	// validate IP address
	public boolean checkIPAddress(String s) {
		String regexIPAddress = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5]).([01]?\\d\\d?|2[0-4]\\d|25[0-5]).([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

		Pattern patterns = Pattern.compile(regexIPAddress);
		Matcher matchesIPAddress = patterns.matcher(s);
		return matchesIPAddress.matches();
	}

	// validate 12-hour time format
	public boolean twelveHourTimeFormat(String s) {
		String regex12hour = "(0[0-9]|1[0-2]):[0-5][0-9](\\s)?(am|pm)$";

		Pattern patterns = Pattern.compile(regex12hour, Pattern.CASE_INSENSITIVE);
		Matcher matches12HourtimeFormat = patterns.matcher(s);
		return matches12HourtimeFormat.matches();
	}

	// validate 24-hour time format
	public boolean twentyfourHourTimeFormat(String s) {
		String regex24hour = "(0[0-9]|1[0-2]|2[0-3]):[0-5][0-9]";

		Pattern patterns = Pattern.compile(regex24hour);
		Matcher matches24hourTimeFormat = patterns.matcher(s);
		return matches24hourTimeFormat.matches();
	}

	// validate date format
	public boolean dateFormat(String s) {
		String regexDate = "(0?[1-9]|[12][0-9]|3[01])";

		Pattern patterns = Pattern.compile(regexDate);
		Matcher matchesDateFormat = patterns.matcher(s);
		return matchesDateFormat.matches();
	}
}

public class stringMatcherCreatedII {
	public static void main(String[] args) {

		stringMatchers stringsMatches = new stringMatchers();
		// validate password
		System.out.println(stringsMatches.validatePassword("Automation98@#"));// true
		System.out.println(stringsMatches.validatePassword("A98@#"));// false
		System.out.println(stringsMatches.validatePassword("Automation12@#%"));// true

		// validate email
		System.out.println(stringsMatches.validateEmail("automationtest@gmail.com")); // true
		System.out.println(stringsMatches.validateEmail("test47@yahoo.com"));// true

		// validate image name
		System.out.println(stringsMatches.checkImageName("abc.JPG"));
		System.out.println(stringsMatches.checkImageName("abc.png"));

		// check IP address
		System.out.println(stringsMatches.checkIPAddress("123.254.123.123")); // true

		// 12-hour time format
		System.out.println(stringsMatches.twelveHourTimeFormat("10:45AM"));// true
		System.out.println(stringsMatches.twelveHourTimeFormat("03:45 pm"));

		// 24-hour time format
		System.out.println(stringsMatches.twentyfourHourTimeFormat("23:59")); // true
		System.out.println(stringsMatches.twentyfourHourTimeFormat("05:05")); // true
		System.out.println(stringsMatches.twentyfourHourTimeFormat("00:00")); // true

		//validate date format
		System.out.println(stringsMatches.dateFormat("12"));//true
		System.out.println(stringsMatches.dateFormat("32"));//false
	}
}

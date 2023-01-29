package javaRegex;

/* 
 *    //Validate Password
 *    >> ((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})
 * (            > starts group
 * (?=.*\\d)    > must contains 1 digit from 0-9
 * (?=.*[a-z])  > must contains 1 lowercase characters
 * (?=.*[A-Z])  > must contains 1 uppercase characters
 * (?=.*[@#$%]) > must contains 1 symbols, @#$%
 * .            > matches anything with previous conditions checking
 * {6,15}       > length atleast 6 characters and maximum of 20
 * )            > end of group
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
 *    (                       -> start of group
 *    [^\\s]+                 -> check for any characters more than 1, except white space
 *    (\\.(?)(jpg|gif|png|bmp)-> followed by .(dot) checks for given format
 *    )                       -> end of group
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

		//validate image name
		System.out.println(stringsMatches.checkImageName("abc.JPG"));
		System.out.println(stringsMatches.checkImageName("abc.png"));
	} 
}

package javaRegex;

/* 
 *    >> ((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})
 * (            > starts group
 * (?=.*\\d)    > must contains 1 digit from 0-9
 * (?=.*[a-z])  > must contains 1 lowercase characters
 * (?=.*[A-Z])  > must contains 1 uppercase characters
 * (?=.*[@#$%]) > must contains 1 symbols, @#$%
 * .            > matches anything with previous conditions checking
 * {6,15}       > length atleast 6 characters and maximum of 20
 * )            > end of group
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
		String regexWord = "";
		
		Pattern patterns = Pattern.compile(regexWord);
		Matcher matchers = patterns.matcher(s);
		return matchers.matches();
	}
}

public class stringMatcherCreatedII {
	public static void main(String[] args) {

		stringMatchers stringsMatches = new stringMatchers();
		//validate password
		System.out.println(stringsMatches.validatePassword("Automation98@#"));// true
		System.out.println(stringsMatches.validatePassword("A98@#"));// false
		System.out.println(stringsMatches.validatePassword("Automation12@#%"));// true
		
		//validate email
		System.out.println(stringsMatches.validateEmail("automationtest@gmail.com"));
	}
}

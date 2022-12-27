package javaRegex;

/*
 * Methods in Pattern:
 *    - compile(String regex) > Used to compile the given regular expression into a pattern
 *    - Match a text against a regular expression pattern more than one time
 *    
 *    - Create a pattern using:
 *         Pattern.compile()
 *         
 *    - Accept single parameter regex(i.e. given expression compiled into a pattern)
 *    
 *    - Return compiled pattern of regex which passed as parameter in method.
 */
import java.util.regex.*;

public class patternComplie {
	public static void main(String[] args) {
		String regexWord = ".*Hello World.*";

		// original string
		String actualString = "Hello World, the first program of any code";

		// complie regex to create pattern
		Pattern pattern = Pattern.compile(regexWord);

		// get a matcher object from pattern
		Matcher matcher = pattern.matcher(actualString);

		// checking whether matched or not
		boolean macthes = matcher.matches();

		System.out.println(actualString + " contains regex " + regexWord + " " + macthes);
	}
}

package javaRegex;

import java.util.regex.*;

/*
 *  Methods in Pattern:
 *              - Flags() method of the pattern class > used to return pattern match flags.
 *              - Following types:
 *                > Pattern.Pattern.CASE_INSENSITIVE
 *                > Pattern.MULTILINE
 *                > Pattern.UNICODE_CASE
 *                > Pattern.UNIX_LINES
 *                > Pattern.DOTALL
 *                > Pattern.LITERAL
 *                > Pattern.UNICODE_CHARACTER_CLASS 
 *                > Pattern.COMMENTS
 * 
 * Parameters > Doesnot accept any parameter
 * Return > Returns Pattern's match flag
 * 
 */
public class patternFlagsCaseInsensitive {

	public static void main(String[] args) {
		String regex = "hello";

		String actualString = "HELLO world";

		Pattern patterns = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher macthes = patterns.matcher(actualString);

		int flag = 0;
		while (macthes.find()) {
			System.out.println(++flag);
		}

	}
}

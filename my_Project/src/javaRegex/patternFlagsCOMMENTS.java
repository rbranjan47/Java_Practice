package javaRegex;
/*
 *  Methods in Pattern:
 *              - Flags() method of the pattern class > used to return pattern match flags.
 *              - Following types:
 *                 > Pattern.COMMENTS
 */
import java.util.regex.*;
public class patternFlagsCOMMENTS {
	public static void main(String[] args) {
		String commentString = "hello world #this is an comment message";

		String actualString = "hello";

		Pattern patterns = Pattern.compile(actualString, Pattern.COMMENTS);
		Matcher matches = patterns.matcher(commentString);
		int flag = 0;
		while (matches.find()) {
			System.out.println(++flag);
		}
	}
}

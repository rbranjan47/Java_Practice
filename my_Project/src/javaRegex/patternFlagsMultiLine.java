package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  Methods in Pattern:
 *              - Flags() method of the pattern class > used to return pattern match flags.
 *              - Following types:
 *                > Pattern.MULTILINE (matcher check, in each line)
 *      
 */
public class patternFlagsMultiLine {
	public static void main(String[] args) {
		String firstString = "hello";
		String secondString = "World, first programming language";

		String finalString = firstString + System.getProperty("line.separator") + secondString;
		String actualString = "hello";

		Pattern patterns = Pattern.compile(actualString, Pattern.MULTILINE);
		Matcher matches = patterns.matcher(finalString);
		int flag = 0;
		while (matches.find()) {
			System.out.println(++flag);

			// second example
			String numericDate = "26th";
			String numericMonth = "december";
			String numericYear = "2022";

			String finalNumericDate = numericDate + System.getProperty("line.separator") + numericMonth
					+ System.getProperty("line.separator") + numericYear;

			String finalDate = "2022";
			Pattern patternss = Pattern.compile(finalDate, Pattern.MULTILINE);
			Matcher matchess = patternss.matcher(finalNumericDate);
			int flags = 10;
			while (matchess.find()) {
				System.out.println(++flags);
			}
		}
	}
}

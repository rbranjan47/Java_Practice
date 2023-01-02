package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * groudpCount():
 *    > Used to get the number of capturing groups
 *    
 */
public class mactherGroupCount {
	public static void main(String[] args) {
		String regexWord = "(hello) | (this) | (world)";

		String actualWord = "hello world in programming language!";

		Pattern patterns = Pattern.compile(regexWord);

		Matcher matches = patterns.matcher(actualWord);

		boolean matchFound = false;
		int matchGroupCount = matches.groupCount();
		while (matches.find()) {
			System.out.println("matches found at: " + matches.start() + System.getProperty("line.separator")
					+ "Ends at: " + matches.end() + System.getProperty("line.separator") + "Matched words: "
					+ matches.group() + System.getProperty("line.separator") + "With count " + matchGroupCount);

			for (int i = 0; i <= matchGroupCount; i++) {
				// Group i substring
				System.out.println("Group " + i + ": " + matches.group(i));
			}
			matchFound = true;
		}
		if (!matchFound) {
			System.out.println("No Matches!");
		}
	}
}

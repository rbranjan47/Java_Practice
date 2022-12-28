package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Spilt(char sequence, int limit):
 *    > Used to splits the input around the match pattern
 *    
 *    > Returned array contains each substring of input sequence, created by this method
 *    
 *    > Substring in array is in same order like input
 *    
 *    > If this pattern doesn't match, then resulting array has just 1 element
 *    
 *    > If limit, n > 0, then pattern will applied at most n-1 time.
 *    
 *    > If limit, n <= 0, thn pattern will applied as many as possible.
 *    
 */
public class splitRegexJavaIntLimit {
	public static void main(String[] args) {
		String regexWord = "_";

		String actualWord = "this_is_hello_world_first_programming_language";

		Pattern patterns = Pattern.compile(regexWord);

		// Split(char sequence, int limit)
		String[] splitLimitWord = patterns.split(actualWord, 5);

		Matcher matches = patterns.matcher(actualWord);
		
		for (int i=0; i<splitLimitWord.length;i++) {
			System.out.println("array["+i+"]: "+splitLimitWord[i]);
		}
		boolean matchFound = false;
		while (matches.find()) {
			System.out.println("matched word: " + matches.group() + " starting index: " + matches.start()
					+ " ending index: " + matches.end());
			matchFound = true;
		}

		if (!matchFound) {
			System.out.println("No Match!");
		}
	}
}

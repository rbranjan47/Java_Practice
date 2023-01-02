package javaRegex;

/*
 * Regex is an API to define a pattern for searching/manipulating a strings
 * 
 * >> Used to TEXT SEARCH & TEXT REPLACE
 * 
 * >> On passing NULL, it give NULLPOINTEREXCEPTION
 * 
 * >> Import from java.util.regex, includes classes:
 *                            > Pattern  - Used to define pattern
 *                            
 *                            > Matcher - Used for perform match on text using patterns
 *                            
 *                            > PatternSyntaxException - Indicating syntax error in a regular expression pattern
 *
 *                            > MatchResultInterface - Represents the result of a match operations
 *   
 * >> Flags in complie methods:
 * Pattern.CASE_INSENSITIVE > letter's case ignored while searching
 * Pattern.LITERAL > Special chars treated as ordinary characters while searching
 * Pattern.UNICODE_CASE > Use it together with CASE_INSENSITIVE , to ignore the letters outside of english alphabets
 *   
 */
import java.util.regex.*;

public class regrexIntro {
	public static void main(String[] args) {
		String name = "Rabi Ranjan Kumar";
		Pattern pattern = Pattern.compile(name, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("my name is rabi ranjan kumar");

		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match Found!");
		} else {
			System.out.println("Match Not Found!");
		}
	}
}

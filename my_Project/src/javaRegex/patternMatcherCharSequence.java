package javaRegex;
/*
 * Pattern matcher(charSequence)
 *         > Generate a matcher, which used to match given input
 *         
 *         >returns a new matcher for this pattern
 * 
 */
import java.util.regex.*;
public class patternMatcherCharSequence{
	public static void main(String[] args) {
		String regexString = "geeks";
		String actualString = " TheGeeksers";
		
		Pattern patterns = Pattern.compile(regexString, Pattern.CASE_INSENSITIVE);
		Matcher matches = patterns.matcher(actualString);
		
		boolean matcheFound = false;
		while(matches.find()) {
			System.out.println("Found regex: "+matches.group()+" Starting at: "+matches.start()+" ending at: "+matches.end());
			matcheFound = true;
		}
		if(!matcheFound) {
			System.out.println("No match");
		}
	}
}

package javaRegex;
/*
 * lookingAT()
 *     > Attempts to match input string from beganing not entire string
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lookingAtMatcher {
	public static void main(String[] args) {
		String regexWord = "bar";
		String actualWord1 = "barooooooo";

		Pattern patterns = Pattern.compile(regexWord);
		Matcher matches1 = patterns.matcher(actualWord1);
		
		System.out.println("Looking AT: "+matches1.lookingAt());//true
		
		String actualWord2 = "abaroooo";
		Matcher matches2 = patterns.matcher(actualWord2);
		System.out.println("Looking AT: "+matches2.lookingAt());//false
	}
}

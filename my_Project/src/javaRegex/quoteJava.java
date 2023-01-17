package javaRegex;
/*
 * quote():
 *    > returns literal patteren string for specified string
 *    
 *    > Metacharactersor escape sequences will no special meaning, i.e. Quote generate strings with meta-characters 
 *    
 *    > Parameter: Accepts string parameter, that literalized
 *    
 *    > Return a literal string replacement for string
 */

import java.util.regex.*;

public class quoteJava {
	public static void main(String[] args) {
		String regexStringWord = "hello world";
		String actualStringWord = "This is hello world";

		// Create a string literal for REGEX
		String quoteStringWord = Pattern.quote(regexStringWord);
		// System.out.println(quoteWord);

		Pattern patterns = Pattern.compile(quoteStringWord);

		Matcher matches = patterns.matcher(actualStringWord);

		boolean matchFound = false;
		while (matches.find()) {
			System.out.println("Found Regex [\"" + matches.group() + "\"] Start at:" + " End at:" + matches.end());
			matchFound = true;
		}
		if (!matchFound) {
			System.out.println("No match!");
		}

		// AnotherExample
		String regexSpecialChar = "&*()!@#$%^";
		String actualSpecialChar = "&*()";

		// Create a string literal for REGEX
		String quoteSpecialChar = Pattern.quote(regexSpecialChar);
		// System.out.println(quoteSpecialChar);

		Pattern patternsChar = Pattern.compile(quoteSpecialChar);

		Matcher matchesChar = patternsChar.matcher(actualSpecialChar);

		boolean matchFoundChar = false;
		while (matchesChar.find()) {
			System.out.println("Found Regex [\"" + matchesChar.group() + "\"] Start at:" + " End at:" + matches.end());
			matchFoundChar = true;
		}
		if (!matchFoundChar) {
			System.out.println("No match!");
		}
	}
}

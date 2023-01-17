package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
 *  PatternSyntacException Class:
 *    > Object of regex, Used to indicate Syntax Error
 *    > Unchecked exception, means not checked at compile time
 *    > Not forced by compiler to handle it
 *    
 *    > 4 Methods:
 *      - getDescription()  >> the description of error
 *      - getIndex()        >> the error index
 *      - getMessage()      >> mutli-line string, containing the error messages
 *      - getPattern()      >> the erroneous regex pattern
 */
public class patternSyntaxExceptionClass {
	public static void main(String[] args) {

		String regexWord = "[a-z";
		String actualWord = "hat rat bat";
		String replaceWord = "dog";
		try {
			Pattern patterns = Pattern.compile(regexWord);
			Matcher matches = patterns.matcher(actualWord);

			actualWord = matches.replaceAll(replaceWord);

			System.out.println("After replacement: " + actualWord);

		} catch (PatternSyntaxException e) {
			System.out.println("PatternSyntaxEception: ");
			System.out.println("Decription: " + e.getDescription());
			System.out.println("Index: " + e.getIndex());
			System.out.println("Message: " + e.getMessage());
			System.out.println("Pattern: " + e.getPattern());
		}

	}
}

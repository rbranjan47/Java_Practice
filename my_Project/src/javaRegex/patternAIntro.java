package javaRegex;

/*
 * Pattern()
 *  > Complied to create a pattern
 *  > Parameter : Does not accept any parameters
 *  > Return : returns pattern's source expression
 */
import java.util.regex.*;

public class patternAIntro {
	public static void main(String[] args) {
		String regexWord = "Hello world";
		
		Pattern patterns = Pattern.compile(regexWord);
		
		String compliedRegex = patterns.pattern();
		System.out.println(compliedRegex);//print, Hello world
	}
}

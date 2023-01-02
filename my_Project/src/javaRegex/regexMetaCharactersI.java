package javaRegex;

import java.util.regex.*;

/*
 *  >> MetaCharacters: 
 *  \d = Find a digit[0-9]
 *  \D = Any non-digit[^0-9]
 *  \s = Find a whitespace character
 *  \S = Any Non-white space
 *  \w = Any word character(a-z, A-Z, 0-9]
 *  \W = Any non-word character
 *  \b = Find word boundary
 *  \B = Find Non-Word Boundary
 * 
 */
public class regexMetaCharactersI {
	public static void main(String[] args) {
		System.out.println("Digit metacharacters d..." + Pattern.matches("\\d", "abc"));// flase
		System.out.println("Digit metacharacters d..." + Pattern.matches("\\d", "6"));// true
		System.out.println("Digit metacharacters D..." + Pattern.matches("\\d", "12345"));// flase, more than once

		System.out.println("Non-digit metacharacters D..." + Pattern.matches("\\D", "6"));// flase
		System.out.println("Non-digit metacharacters D..." + Pattern.matches("\\D", "abvvv"));// flase
		System.out.println("Non-digit metacharacters D..." + Pattern.matches("\\D", "a"));// true

		System.out.println("Space metacharacters s..." + Pattern.matches("\\s", " "));// true
		System.out.println("Space metacharacters s..." + Pattern.matches("\\s", "  "));// false
		System.out.println("Space metacharacters s..." + Pattern.matches("\\s", "Hello World"));// flase, more
																								// characters

		System.out.println("Non-space metacharacters S..." + Pattern.matches("\\S", " "));// false
		System.out.println("Non-space metacharacters S..." + Pattern.matches("\\S", "1"));// true, character but
																							// non-white space

		System.out.println("A word metacharacters w..." + Pattern.matches("\\w", "a"));// true
		System.out.println("A word metacharacters w..." + Pattern.matches("\\w", "aAa"));// false

		System.out.println("A non-word metacharacters W..." + Pattern.matches("\\W", "&"));// true
		System.out.println("A non-word metacharacters W..." + Pattern.matches("\\W", "a"));// false
		System.out.println("A non-word metacharacters W..." + Pattern.matches("\\W", "8"));// false

		System.out.println("Word-boundary metacharacters b..." + Pattern.matches("\\bhello", "hello"));// true
		System.out.println("Word-boundary metacharacters b..." + Pattern.matches("\\bhello", "helloWorld"));// false

		System.out.println("Non-word-boundary metacharacters B..." + Pattern.matches("\\Bhello", "this hello this"));//false
	
	}
}

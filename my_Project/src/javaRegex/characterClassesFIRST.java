package javaRegex;

/*
 * * 
 * >> Brackets are used to find range:
 * [abc]  > Find 1 character in between brackets
 * [^abc] > Find 1 character, not between the brackets characters
 * [0-9] > Find 1 from the range 0 to 9
 * 
 * [a-zA-Z] > From small a to z OR A to Z
 * 
 * [a-d[m-p]] > Any character lie between a to d OR m-p.
 */

import java.util.regex.*;

public class characterClassesFIRST {
	public static void main(String[] args) {
		System.out.println("[abc] matches: " + Pattern.matches("[abc]", "c")); // true
		System.out.println("[abc] matches: " + Pattern.matches("[abc]", "d")); // false

		System.out.println("[^abc] matches: " + Pattern.matches("[^abc]", "d")); // true
		System.out.println("[^abc] matches: " + Pattern.matches("[^abc]", "a")); // false

		System.out.println("[0-9] matches: " + Pattern.matches("[2-5]", "4")); // true
		System.out.println("[0-9] matches: " + Pattern.matches("[2-5]", "9")); // false
		System.out.println("[0-9] matches: " + Pattern.matches("[0-9]", "12")); // false

		System.out.println("[a-zA-Z] matches: " + Pattern.matches("[a-zA-Z]", "e")); // true
		System.out.println("[a-zA-Z] matches: " + Pattern.matches("[a-zA-Z]", "E")); // true
		// Only character not strings
		System.out.println("[a-zA-Z] matches: " + Pattern.matches("[a-zA-Z]", "eE")); // false

		System.out.println("[a-d[m-p]] matches: " + Pattern.matches("[a-d[m-p]]", "o")); // true
		System.out.println("[a-d[m-p]] matches: " + Pattern.matches("[a-d[m-p]]", "c")); // true
		System.out.println("[a-d[m-p]] matches: " + Pattern.matches("[a-d[m-p]]", "l")); // false
	}
}
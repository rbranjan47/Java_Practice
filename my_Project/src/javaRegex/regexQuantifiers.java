package javaRegex;

import java.util.regex.Pattern;

/*
 * >> Quantifiers: 
 *   n+ = Matches any strings that contains at least one n
 *   n* = Matches any strings that contains zero or more occurances of n
 *   n? = Matches any strings that contains zero or one occurance of n
 *   n{X} = Matches any string that contains X's occurance of n
 *   n{X,Y} = Matches any strings that contains a sequence of X's to Y's.
 *   n{X,} = Matches any strings that contains a sequence of atleast X's.
 */
public class regexQuantifiers {
	public static void main(String[] args) {
		String firstWord = "Hello World";

		// n? = MatchFes any strings that contains zero or one occurance of n
		System.out.println("n? matches: " + Pattern.matches("[" + firstWord + "]?", "H"));

		System.out.println("n? matches: " + Pattern.matches("[" + firstWord + "]?", "ooo"));

		// n* = Matches any strings that contains zero or more occurances of n
		System.out.println("n* matches: " + Pattern.matches("[" + firstWord + "]*", "htoooo"));

		// n{X} = Matches any string that contains X's occurance of n
		System.out.println("n{X} matches: " + Pattern.matches("[" + firstWord + "]{2}", "oo"));

		// n{X,Y} = Matches any strings that contains a sequence of X's to Y's.
		System.out.println("n{X, Y} matches: " + Pattern.matches("[" + firstWord + "]{1,2}", "oo"));

		// n{X,} = Matches any strings that contains a sequence of atleast X's.
		System.out.println("n{X, } matches: " + Pattern.matches("[" + firstWord + "]{1,}", "ooooooooo"));
	}
}

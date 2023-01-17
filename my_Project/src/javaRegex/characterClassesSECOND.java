package javaRegex;

/*
 * * 
 * >> Brackets are used to find range:
 * [a-z&&[def]] >> find d,e,f (intersection)
 * [a-z&&[^bc]] >> find a to z, except b & c(subtraction)
 * [a-z&&[^m-p]] >> find a to z, & but not m through p(substrcation)
 * 
 */

import java.util.regex.*;

public class characterClassesSECOND {
	public static void main(String[] args) {
		// [a-z&&[def]]
		System.out.println("[a-z&&[def]] matches: " + Pattern.matches("[a-z&&[def]]", "d")); // true
		System.out.println("[a-z&&[def]] matches: " + Pattern.matches("[a-z&&[def]]", "g")); // false

		// [a-z&&[^bc]]
		System.out.println("[a-z&&[^bc]]  matches: " + Pattern.matches("[a-z&&[^bc]]", "d")); // true
		System.out.println("[a-z&&[^bc]]  matches: " + Pattern.matches("[a-z&&[^bc]]", "b")); // false

		// [a-z&&[^m-p]]
		System.out.println("[a-z&&[^m-p]] matches: " + Pattern.matches("[a-z&&[^m-p]]", "d")); // true
		System.out.println("[a-z&&[^m-p]] matches: " + Pattern.matches("[a-z&&[^m-p]]", "o")); // false

		// check with N characters
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z]", "rabi"));//true
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z]", "ranjan"));//false, more than 4 characters
	}
}

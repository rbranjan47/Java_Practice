package javaRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*string matcher class
 */

class StringMatcher {
	public boolean isTrue1(String s) {
		return s.matches("true");
	}

	public boolean isTrue2(String s) {
		return s.matches("[tT]rue");
	}

	public boolean isTrue3(String s) {
		return s.matches("[tT]rue|[yY]es");
	}

	public boolean isTrue4(String s) {
		return s.matches(".*true.*");
	}

	public boolean isMatchesStringRange(String s) {
		return s.matches("[a-zA-Z0-9]{3}");
	}

	public boolean isNumberIsAtBeganining(String s) {
		return s.matches("^[^\\d].*");
	}

	public boolean isMobileNumberTrue(String s) {

		// return s.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
		return s.matches(
				"^(?:(?:\\+\\d{1,2}\\s*(?:[.-]\\s*)?)?(?:\\(\\s*\\d{3}\\s*\\)|\\d{3}[.-]?))?\\d{3}[.-]?\\d{4}$");
	}

	// To Count occurance of number of words
	public static int countNumberWord(String regexS, String actualS) {
		int matchCounts = 0;

		// Pattern patterns = Pattern.compile(".*" + regexS + ".*"); This will count
		// single time
		Pattern patterns = Pattern.compile("\\b" + regexS + "\\b"); // this will count with no word boundary
		Matcher matches = patterns.matcher(actualS);

		// predefined, group counts

		while (matches.find()) {
			matchCounts++;
		}
		return matchCounts;
	}

	// checks non-digits
	public boolean containsZeroORNonDigits(String s) {
		return s.matches("\\D+"); // + > check one or more occurance
	}

	// checks SSN numbers
	public boolean containsSSNNumber(String s) {
		return s.matches("(\\d{3}-\\d{2}-\\d{4})");
	}

	// extract matches words
	public static List<String> extractSpecificText(String regexWord, String inputText) {
		Pattern patterns = Pattern.compile(regexWord);
		Matcher matches = patterns.matcher(inputText);
		List<String> matchesList = new ArrayList<String>();
		while (matches.find()) {
			matchesList.add(matches.group());
		}
		return matchesList;
	}

	// validate username
	public boolean validateUsername(String s) {
		String regexUsername = ("^[a-z0-9_-]{1,}$");
		Pattern patterns = Pattern.compile(regexUsername);
		Matcher matches = patterns.matcher(s);

		return matches.find();
	}
}

public class stringMatcherCreatedI {
	public static void main(String[] args) {
		StringMatcher stringMatches = new StringMatcher();

		// return true if string extactly true
		System.out.println(stringMatches.isTrue1("true"));// true
		System.out.println(stringMatches.isTrue1("True"));// false

		// return true if string is true/True
		System.out.println(stringMatches.isTrue2("True"));// true
		System.out.println(stringMatches.isTrue1("true"));// true
		System.out.println(stringMatches.isTrue2("wrue"));// false

		// return true if string is true/True or yes/Yes
		System.out.println(stringMatches.isTrue3("true"));// true
		System.out.println(stringMatches.isTrue3("True"));// true
		System.out.println(stringMatches.isTrue3("Yes"));// true
		System.out.println(stringMatches.isTrue3("yes"));// true

		// return true if string is any word matches true in it
		System.out.println(stringMatches.isTrue4("Yes true this is!"));// true

		// check 3 characters
		String inputCharacters = "hi2";
		if (stringMatches.isMatchesStringRange(inputCharacters) == true) {
			System.out.println("matches!");
		} else {
			System.out.println("Not matches!");
		}

		// check no numbers in beganining
		String numberIP = "this76";
		System.out.println(stringMatches.isNumberIsAtBeganining(numberIP));

		// check any numbers i.e. 1234567890, +11234567890, 123-456-7890, 123.456.7890
		System.out.println(stringMatches.isMobileNumberTrue("+11234567890"));

		String actualsWord = "dog";
		String textWord = "this is a dog and dog can bark loudly!";
		// To Count number of words
		System.out.println(StringMatcher.countNumberWord(actualsWord, textWord));

		// check zero or non-digit
		System.out.println(stringMatches.containsZeroORNonDigits("786"));// false
		System.out.println(stringMatches.containsZeroORNonDigits("this 899"));// false
		System.out.println(stringMatches.containsZeroORNonDigits("hello world"));// true

		// check ssn nmbers
		System.out.println(stringMatches.containsSSNNumber("123-45-6789"));// true
		System.out.println(stringMatches.containsSSNNumber("abc-65-9832"));// false

		// extract matches words
		List<String> extractedText = StringMatcher.extractSpecificText("(\\brat\\b|\\bfish\\b|\\bcrabs\\b)",
				"extract which are not animals dog, cat, fish, crabs, and rat.");
		System.out.println("Are not animals: "+extractedText);

		// validate username
		System.out.println(stringMatches.validateUsername("sa47"));// true
		System.out.println(stringMatches.validateUsername("testuser-97"));// true
		System.out.println(stringMatches.validateUsername("testuser_97"));// true
		System.out.println(stringMatches.validateUsername("testuser"));// true
	}
}

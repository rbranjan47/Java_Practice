package javaRegex;
/*
 *  >> MetaCharacters: 
 *  | = Find any one of the pattern separated by | as, cat | dog | rat
 *  . = Find just one instance of character
 *  ^ =  Find a match as begining of string like.. ^Hello
 *  $ = Find a match at end of string like.. world$
 *   *  \_u_xxxx (ignore underscore between u)= Find the unicode characters
 */

import java.util.regex.*;

public class regexMetaCharactersII {
	public static void main(String[] args) {
		// |
		String separatedRegex = "(cat) | (dog) | (rat)";
		String separatedActual = "cat dog rat all are animal";
		Pattern separatedPatterns = Pattern.compile(separatedRegex);
		Matcher SeparatedMatches = separatedPatterns.matcher(separatedActual);
		System.out.println("Separated metacharacters |... " + SeparatedMatches.find() + " with groupCount "
				+ SeparatedMatches.groupCount()); // true

		// .
		String dotRegexI = ".a";
		String dotRegexII = "c.";
		// since this string in same sequence as regex
		String dotActual = "cat dog rat all are animal";

		Pattern dotPatternsI = Pattern.compile(dotRegexI);
		Pattern dotPatternsII = Pattern.compile(dotRegexII);
		Matcher dotMatchesI = dotPatternsI.matcher(dotActual);
		Matcher dotMatchesII = dotPatternsII.matcher(dotActual);
		System.out.println("dot metacharacters . ... " + dotMatchesI.find()); // true
		System.out.println("dot metacharacters . ... " + dotMatchesII.find());// true

		// $
		String dollarRegexWordI = "world$";
		String dollarActualWord = "hello world";

		Pattern dollarPatternsI = Pattern.compile(dollarRegexWordI);
		Matcher dollarMatchesI = dollarPatternsI.matcher(dollarActualWord);
		System.out.println("dollar metacharacters $... " + dollarMatchesI.find());// true

		String dollarRegexWordII = "into$";
		String dollarActualWordII = "hello into this world";

		Pattern dollarPatternsII = Pattern.compile(dollarRegexWordII);
		Matcher dollarMatchesII = dollarPatternsII.matcher(dollarActualWordII);
		System.out.println("dollar metacharacters $... " + dollarMatchesII.find());// false
	}
}

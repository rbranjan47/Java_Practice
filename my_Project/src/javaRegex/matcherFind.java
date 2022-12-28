package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  find():
 *    > This method present in matcher class
 *    > Find the next  subsequence of the input sequence
 *    > return boolean value
 *    
 *    > Parameter: doesn't accept any parameters
 */
public class matcherFind {
	public static void main(String[] args) {

		String regex = "Geeks";

		Pattern pattern = Pattern.compile(regex);

		String stringToBeMatched = "GeeksForGeeks";

		Matcher matcher = pattern.matcher(stringToBeMatched);
		System.out.println(matcher.find());
	}
}

package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * find(int start):
 *    > find the next subsequence after specified sequence number
 *    > return boolean
 *    
 *    > Parameter: takes subsequence start number
 */
public class matcherFindIntStart {
	public static void main(String[] args) {
		String regex = "For";

		Pattern pattern = Pattern.compile(regex);

		String stringToBeMatched = "GeeksForGeeks";

		Matcher matcher = pattern.matcher(stringToBeMatched);

		System.out.println(matcher.find(6));//false gets, orGeeks
		
		System.out.println(matcher.find(5));//true gets, ForGeeks
	}
}

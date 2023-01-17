package javaRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Inputted value regex finder
 */
public class regexFinder {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter regex pattern of 10 characters: ");
			String regexPattern = sc.nextLine();
			
			while (true) {
				Pattern patterns = Pattern.compile(regexPattern);
				Matcher matches = patterns.matcher("hello world, first programming language");
				boolean matchFound = false;
				if (matches.find()) {
					System.out.println("Regex matches, starts at: " + matches.start() + " ends at: " + matches.end()
							+ " matched word: " + matches.group());
					matchFound = true;
					break;
				} else if (Pattern.matches("[a-zA-Z0-9]{10}", regexPattern)) {
					System.out.println("Matches with range[a-zA-Z0-9]");
					break;
				} else if (!matchFound) {
					System.out.println("No Match, as input characters: "+regexPattern.length()+">10.");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("exception occured: " + e.getStackTrace());
		}
	}
}

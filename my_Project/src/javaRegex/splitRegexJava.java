package javaRegex;

/*
 * Spilt(char sequence):
 *    > Used to split the given char sequence, around matches of this pattern
 *    > split into Array String
 *    
 *    > Parameters: Accepts Single string(character sequence) to split
 *    
 *    > Return: Returns String Array, i.e, String[]
 */

import java.util.regex.*;

public class splitRegexJava {
	public static void main(String[] args) {
		String regexWord = "_";

		String actualWord = "hello_world_to_this_programming_language";

		Pattern patterns = Pattern.compile(regexWord);

		// split, return string
		String[] splitedWord = patterns.split(actualWord);

		Matcher matches = patterns.matcher(actualWord);

		boolean matchFound = false;

		while (matches.find()) {
			System.out.println("matched word: " + matches.group() + " starting index: " + matches.start()
					+ " ending index: " + matches.end());
			matchFound = true;
		}

		if (!matchFound) {
			System.out.println("No Match!");
		}

		// Remaning words
		for (int i = 0; i < splitedWord.length; i++) {
			System.out.println("array[" + i + "]: " + splitedWord[i]);
		}
	}
}

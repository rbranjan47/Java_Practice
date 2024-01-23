package stringsImpQuestions;

import java.util.Arrays;

public class anagramStringsORsameStringinBothArray {
	public static boolean anagramCheck(String[] str1, String[] str2) {
		int str1Length = str1.length;
		int str2Length = str2.length;

		if (str1Length != str2Length)
			return false;

		Arrays.sort(str1);
		System.out.println("sorting array1: "+str1);
		Arrays.sort(str2);
		System.out.println("sorting array1: "+str2);

		for (int i = 0; i < str1Length; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	public static void main(String[] args) {
		String[] args1 = { "a", "b", "c", "d" };
		String[] args2 = { "c", "d", "a", "b" };

		boolean anagramResult = anagramCheck(args1, args2);
		if (anagramResult == true) {
			System.out.println("String are anagram!");
		} else {
			System.out.println("String are NOT anagram!");
		}
	}
}

package stringsImpQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicateStrings {

	// METHOD 1: USING FOR LOOP
	public static String removesDuplicates(char strnsChar[], int n) {

		int index = 0;
		int j;
		for (int i = 0; i < n; i++) {
			for (j = 0; j < i; j++) {
				if (strnsChar[i] == strnsChar[j]) {
					break;
				}
			}
			if (j == i) {
				strnsChar[index++] = strnsChar[i];
			}
		}
		return String.valueOf(Arrays.copyOf(strnsChar, index));
	}

	// METHOD 2: USING COLLECTIONS >> HASHSET(since, hashset not accepting duplicates)
	public static void removeDuplicatesHashSet(String strgs) {
		Set<Character> hashSets = new LinkedHashSet<Character>();
		for(int i=0; i<strgs.length();i++) 
			hashSets.add(strgs.charAt(i));
		
		
		for(Character chs: hashSets) 
			System.out.print(chs);
		
	}

	//METHOD 3: REMOVE DUPLICATS FROM ARRAY STRING
	public static void remmoveDuplicateStrings(String[] strngss) {
	
	
	//converting array to list
	List<String> listsAstrings = Arrays.asList(strngss);
	//pasing lists into hashset
	Set<String> hasSetsStrings = new LinkedHashSet<String>();
	hasSetsStrings.addAll(listsAstrings);
	System.out.println("");
	System.out.println(hasSetsStrings);
	}
	
	
	public static void main(String[] args) {
		String name = "Rabi Ranjan Kumar";
		char strChars[] = name.toCharArray();
		int lengthL = strChars.length;
		System.out.println(removesDuplicates(strChars, lengthL));
		
		//Method 2
		removeDuplicatesHashSet(name);
		
		//Method 3
		String[] strngsArray = {"apple","banana", "orange", "apple", "grapes", "cucumber", "banana"};
		remmoveDuplicateStrings(strngsArray);
	}
}

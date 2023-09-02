package stringsImpQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseString {

	public static String reverseStringARRAYMethod(String str) {
		if (str == null || str.equals("")) {
			return str;
		}
		// METHOD 1: creating empty arrayLists
		List<Character> listsChars = new ArrayList<Character>();
		for (char c : str.toCharArray()) {
			listsChars.add(c);
		}

		// reveser the string using Collection
		Collections.reverse(listsChars);
		
		StringBuilder builders = new StringBuilder();
		for (Character c : listsChars) {
			builders.append(c);
		}

		return builders.toString();
	}

	// METHOD 2: Reverse Using Swap method
	public static String reverserStringSwapMethod(String strs) {
		if (strs == null || strs.equals(strs)) {
			return strs;
		}

		char[] characterss = strs.toCharArray();
		int i = 0;
		int j = characterss.length - 1;
	
		while (i < j) {
			swapingBetweenChars(characterss, i, j);
			i++;
			j--;
		}
		return new String(characterss);
	}

	// swap method
	public static void swapingBetweenChars(char[] chrStr, int i, int j) {
		char temp = chrStr[i];
		chrStr[i] = chrStr[j];
		chrStr[j] = temp;
	}

	//METHOD 3: Reverse using StringBuilder Reverse Method
	public static String reverseStringBuilder(String strss) {
	
		StringBuilder strBuilder = new StringBuilder(strss);
		strBuilder.reverse();
		return strBuilder.toString();
	}
	
	//METHOD 4: Reverse using ForLoop Methods
	public static String strnsLoopstrnsLoop(String strnss) {
		String strnsLoop="";
		char[] charStrnss = strnss.toCharArray();
		for(int i=charStrnss.length-1;i>0;i--){
			strnsLoop = strnsLoop + charStrnss[i];
		}
		return strnsLoop;
	}
	
	public static void main(String[] args) {
		String first = "first programming language is java";
		System.out.println(reverseStringARRAYMethod(first));

		String second = "reverse using swap method";
		System.out.println(reverserStringSwapMethod(second));
		
		String third = "Hello World, a first programming language!";
		System.out.println(reverseStringBuilder(third));
		
		String fourth = "first programming languages is c and then Java";
		System.out.println(strnsLoopstrnsLoop(fourth));
	}
}

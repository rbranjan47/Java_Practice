package InterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicateCharsFromStrings {
	public static void main(String[] args) {
		String names = "Rabi Ranjan Kumar";
		char newName[] = names.toCharArray();

		System.out.println("***************HashSet***************");// using hashsets
		Set<Character> setsChar = new HashSet<Character>();
		for (Character chr : newName) {
			if (setsChar.add(chr) == false && !chr.equals(' ')) {
				System.out.println("duplicates characters: " + chr);
			}
		}

		System.out.println("***************HashMap***************");// using hashmaps
		Map<Character, Integer> maps = new HashMap<Character, Integer>();
		for (Character ch : newName) {
			if (maps.containsKey(ch) && !ch.equals(' ')) {
				maps.put(ch, maps.get(ch) + 1);
			} else {
				maps.put(ch, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = maps.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
}

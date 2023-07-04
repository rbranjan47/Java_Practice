package InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class arrayDuplicatesImp {
	public static void main(String[] args) {
		String arrays[] = { "amazon", "amazon", "flipkart", "myntra", "myntra", "meesho", "zomato", "zomato" };
		System.out.println("*********For Loops***********");
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arrays[i].equalsIgnoreCase(arrays[j])) {
					System.out.println("duplicate are: " + arrays[i]);
				}
			}
		}

		System.out.println("*********HashSets***********");
		// using haspset
		HashSet<String> sets = new HashSet<String>();
		for (String es : arrays) {
			if (sets.add(es) == false) {
				System.out.println("duplicates are: " + es);
			}
		}

		System.out.println("*********Stream***********");
		Set<String> dataset = new HashSet<String>();
		List<String> arrayList = Arrays.asList(arrays);
		String duplicateSet = arrayList.stream().filter(e -> !dataset.add(e)).collect(Collectors.joining(" "));
		System.out.println(duplicateSet);

	}
}

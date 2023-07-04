package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodChainingConcepts {

	public static void main(String[] args) {
		String[] fruits = { "Apple", "Banana", "Papaya", "Grapes", "Orange", "Guava" };

		List<String> fruitsLists = Arrays.asList(fruits);

		List<String> fruitsName = new ArrayList<String>();

		for (String fruitss : fruitsLists) {
			String fruitsModified = "$" + fruitss;
			fruitsName.add(fruitsModified);
		}
		System.out.println("Before >> " + fruitsLists);
		System.out.println("After >> " + fruitsName);

		// Method Chaining > Using Stream API
		// Also, Known as Parameter Idiom
		//Calling different methods in single line instead of calling other methods of
		// same object references
		List<String> fruitsStreams = fruitsLists.stream().map(e -> "$$" + e).collect(Collectors.toList());
		System.out.println("Using Streams >> " + fruitsStreams);
	}
}

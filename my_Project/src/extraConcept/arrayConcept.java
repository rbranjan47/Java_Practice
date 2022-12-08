package extraConcept;

import java.util.Arrays;

public class arrayConcept {
	public static void main(String[] args) {
		String value = "Tax $25";
		String dollarStringAmount = value.substring(5, 7);
		int dollarIntAmount = Integer.parseInt(dollarStringAmount);

		System.out.println(dollarIntAmount);

		String newValue = value.strip();
		System.out.println(newValue);

		// Splitting an array
		String letters = "Rabi Ranjan";

		String[] lettersArray = letters.split("");

		System.out.println(Arrays.deepToString(lettersArray));

		// String Builder
		StringBuilder randomString = new StringBuilder("An random strings");
		System.out.println(randomString);
		// appending some strings
		System.out.println(randomString.append(" again"));
		// length
		System.out.println("Length: " + randomString.length());

		// capacity of array
		System.out.println("Old Capacity: " + randomString.capacity());

		// Increases the capacity to 60
		randomString.ensureCapacity(60);

		// new capacity
		System.out.println("New Capacity: " + randomString.capacity());

		// Trim to Size
		randomString.trimToSize();

		System.out.println("After Trim Capacity: " + randomString.capacity());

	}
}

package InterviewQuestions;

import java.util.Arrays;
import java.util.BitSet;
import java.util.stream.Collectors;

public class stringConcept {
	public static void main(String[] args) {
		String[] arr = { "t", "r", "3" };
		// String Join Method
		System.out.println(String.join(";", arr));

		// aslists arrays method
		String arrysJoin = Arrays.asList(arr).stream().collect(Collectors.joining(";"));
		System.out.println(arrysJoin);

		// String Builder
		StringBuilder sb = new StringBuilder();
		int end = 0;
		for (String str : arr) {
			if (str != null) {
				sb.append(str);
				end = sb.length();
				System.out.println(end);
				sb.append(";");
			}
		}
		System.out.println(sb.substring(0, end));

		// String buffer
		StringBuffer strB = new StringBuffer();

		String arrysJoinInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().map(e -> String.valueOf(e))
				.collect(Collectors.joining());
		System.out.println(arrysJoinInt);

		if ((System.out.printf("hello world\n") == null)) {

		}

		// print 1 to 100 without using any number
		int one = 'A' / 'A';
		String s1 = "..........";
		for (int i = one; i <= s1.length() * s1.length(); i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Bitset
		BitSet bitss = new BitSet();
		bitss.set(1, 101);
		System.out.println(bitss);

		// 1 to 100 without loop
		numberPrint(1);
		
		//print hello world without semi-colon
		

	}

	// print 1 to 100 without using any loop
	public static void numberPrint(int num) {
		if (num <= 100) {
			System.out.print(num + " ");
			num++;
			// recursive method
			numberPrint(num);
		}
	}
}

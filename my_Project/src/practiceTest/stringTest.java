package practiceTest;

import java.util.Arrays;
import java.util.Collections;

public class stringTest {
	public static void main(String[] args) {
		String strs = "           Hey Good Morning! How You All?";

		// length methods
		int strsLength = strs.length();
		System.out.println(strsLength);

		// charAt method
		System.out.println(strs.charAt(2));

		// substring method
		System.out.println(strs.substring(2));

		// substring method with end indes
		System.out.println(strs.substring(2, strs.length() - 4));

		// sub-sequence method, same as subString(startIndex, endIndex)
		System.out.println(strs.subSequence(2, strs.length() - 4));

		// trim method
		System.out.println(strs.trim());

		// strip method
		System.out.println(strs.strip());

		// Starts with
		System.out.println(strs.trim().startsWith("Hey"));
		
		System.out.println(strs.toCharArray());

		
		// >>>>>>>>>>>>>STRING BUFFER<<<<<<<<<<<<<<<<<<<<
		StringBuffer strsBuffer = new StringBuffer(strs);

		// capacity method
		System.out.println(strsBuffer.capacity());

		//append method, to add more 
		System.out.println(strsBuffer.append(" Hope You All Doing Good!"));

		// Insert method
		System.out.println(new StringBuffer(strs.trim()).insert(4, "Very "));
		
		//Delete method - delete from given startIndex to EndIndex
		System.out.println(strsBuffer.delete(0, 13));
		
		//replace
		System.out.println(new StringBuffer(strs.trim()).replace(4, 9, "Very Very "));
		
		//REVERSE method
		System.out.println(strsBuffer.reverse());
		
		
		//Reverse each sentence of string
		String str[] = strs.split(" ");
		for(int i=0; i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println("----------------------------");
		//or we can reverse
		String reversedStr = " ";
		for(int i=str.length-1; i>0;i--) {
			reversedStr = reversedStr + str[i];
		}
		System.out.println(reversedStr);
		
		System.out.println("----------------------------");
		Collections.reverse(Arrays.asList(str));
		System.out.println(String.join(" ", str));
	
	}
}

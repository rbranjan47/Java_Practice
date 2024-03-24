package practiceTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {
	public static void main(String[] args) {
		// Single Dimension Array
		String[] strsArray = new String[1];
		strsArray[0] = "Hey";
		//or
	   String[] newstrsArray ={"All", "!", "Good", "Morning", "How", "You", "All!"};
	  
	   ArrayList<String> arrayList = new ArrayList<String>();
	   Collections.addAll(arrayList, strsArray);
	   Collections.addAll(arrayList, newstrsArray);
	   
	   System.out.println("As ArrayList: "+arrayList);
	   
	   //into Array
	   String[] newConcatArray = arrayList.toArray(new String[0]);
	   System.out.println("As Array: "+ newConcatArray);
	  
	   
		for(int i=0; i<strsArray.length;i++) {
			System.out.println(strsArray[i]);
		}

		// lentgh method
		System.out.println(strsArray.length);

		String[] strsArrayCopied = strsArray.clone();
		System.out.println(strsArrayCopied);

		// toString method
		System.out.println(Arrays.toString(strsArray));
		
		System.out.println(newstrsArray.toString());
	}
}

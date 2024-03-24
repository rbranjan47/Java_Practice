package practiceTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class operatorsTest {
	public static void main(String[] args) {
		int a = 15;
		int b = 40;

		// Ternary Operator
		int res = (a * b > a + b) ? (a + b) : (a - b);

		System.out.println(res);

		List<String> al = new ArrayList<>();

		// Adding elements to object of List class
		al.add("Geeks");
		al.add("Geeks");
		al.add(1, "Geeks");

		// Display theinitial elements in List
		System.out.println("Initial ArrayList " + al);

		// Setting (updating) element at 1st index
		// using set() method
		al.set(1, "For");

		System.out.println(al.get(0));
		// Print and display the updated List
		System.out.println("Updated ArrayList " + al);

		
		List<Object> linkedL = new LinkedList<Object>();
		linkedL.add(Integer.valueOf(10));
		linkedL.add(String.valueOf("Hello World"));
		linkedL.add(Integer.valueOf(365));
		
		
		linkedL.set(2, Double.valueOf(365090));
		System.out.println(linkedL);
		System.out.println(linkedL.contains(Integer.valueOf(10)));
	}
}

package Java_Gromming;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//ARRAY  --> First IN First OUT
//ARRAY Deque --> Insert from both sides

//Array Deque, have no capacity restrictions, as they grows on necessary
//Array deque are not thread safe, 
//Array Deque does not support concurrent access of multiple threds
//NULL elements are not allowed
//Faster than stack & Linked-List

public class array_deque {
	public static void main(String[] args) {
		// Initializing an deque
		Deque<String> dq = new ArrayDeque<String>();

		// add() method to insert
		dq.add("rule 1");
		dq.addFirst("rule 2");
		dq.addLast("rule 3");
		dq.add("rule 4");
		dq.addFirst("rule 5");
		dq.addLast("rule 6");
		dq.add("rule 7");
		dq.add("rule 8");
		dq.add("rule 9");
		dq.add("rule 10");
		dq.add("rule 11");

		System.out.println("getting elements: " + dq);

		// Addine elements
		dq.add("rule 101");
		dq.addFirst("rule 101");
		dq.addLast("102");
		dq.offer("103");
		dq.offerFirst("104");
		dq.offerLast("105");

		System.out.println("");
		// iterating the elements of dq object
		for (Iterator<String> itr = dq.iterator(); itr.hasNext();) {
			System.out.println(itr.next() + " ");
		}

		System.out.println("");
		// iterating the elements in descending ways
		for (Iterator<String> itr = dq.descendingIterator(); itr.hasNext();) {
			System.out.println(itr.next() + " ");
		}

	}
}

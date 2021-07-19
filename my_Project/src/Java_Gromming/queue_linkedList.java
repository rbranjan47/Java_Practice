package Java_Gromming;

import java.util.LinkedList;
//import java.util.PriorityQueue;
import java.util.Queue;

public class queue_linkedList {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>(); // It can maintain Insertion order
		// Queue<Integer> queue = new PriorityQueue<Integer>(); It doesn't maintain
		// insertion order
		queue.add(5);
		queue.add(7);
		queue.add(15);
		queue.add(1);
		queue.add(3);
		queue.add(89);
		queue.add(100);
		// getting elements
		System.out.println(queue);

		// checking queue
		System.out.println(queue.isEmpty());
		
		// peek, retrives but do not remove, and not return NULL when there is no any element in the QUEUE
		queue.peek();
		System.out.println(queue);

		// element, retrives but do not remove
		queue.element();
		System.out.println(queue);

		// offer, insert the specified element
		queue.offer(33);
		System.out.println(queue);

		// poll, remove the element and NULL if queue is empty
		queue.poll();
		System.out.println(queue);

		// converting into Array
		Object[] ArrObj = queue.toArray();
		System.out.println("In Array: ");
		for (int i = 0; i < queue.size(); i++) {
			System.out.print(ArrObj[i]+" ");
		}
	}
}

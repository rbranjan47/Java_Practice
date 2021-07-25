package Java_Gromming;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class deque_demo 
{
	public static void main(String[] args) 
	{
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
		

		System.out.println(dq);
		//popping first element, default
		System.out.println(dq.pop());
		//popping first element
		System.out.println(dq.pollFirst());
		//popping last element
		System.out.println(dq.pollLast());
		
		//Retrieves and removes the head/top of the Queue and return NULL when QUEUE is empty
		System.out.println(dq.poll());
		
		//Retrieves and removes the head/top of the Queue and return NULL when QUEUE is empty
		System.out.println(dq.pollFirst());
		
		//Retrieves and removes the last/end of the Queue and return NULL when QUEUE is empty
		System.out.println(dq.pollLast());
		
		System.out.println(dq);
		//also usinf Iterator
		
		System.out.println("After normal Iteration: ");
		for (Iterator<String> itr = dq.iterator();
				itr.hasNext(); )
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("After descending Iteration: ");
		for (Iterator<String> itr = dq.descendingIterator();
	             itr.hasNext();) 
		{
	            System.out.print(itr.next() +" ");
	        }
	}
}

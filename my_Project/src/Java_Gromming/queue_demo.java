package Java_Gromming;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue_demo
{
	public static void main(String[] args) 
	{
		// implementing queue interface and prioityQueue class
		Queue<String> queue = new PriorityQueue<String>();
		// chekcing is empty
		System.out.println(queue.isEmpty()); // true
		// adding elements
		queue.add("java");
		queue.add("is a ");
		queue.add("Strong ");
		queue.add("programming ");
		queue.add("language.");

		System.out.println(queue);
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		//remove element
		queue.remove();
		System.out.println(queue);
		
		//peek, retrives but do not remove, and not return NULL when there is no any element in the QUEUE 
		queue.peek();
		System.out.println(queue);
		
		//element, retrives but do not remove 
		queue.element();
		System.out.println(queue);
		
		//offer, insert the specified element 
		queue.offer("C++");
		System.out.println(queue);
		
		//poll, remove the element and NULL if queue is empty
		queue.poll();
		System.out.println(queue);
		
		//converting into Array
		Object[] ArrObj = queue.toArray();
		System.out.println("In Array: ");
		for(int i=0; i<queue.size(); i++)
		{
			System.out.print(ArrObj[i]+" ");
		}
	}
}

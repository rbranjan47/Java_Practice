package raBi;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Priority 
{

	public static void main(String[] args)
	{
		Queue<String> q=new PriorityQueue<>();
		q.offer("Dhanbad");
		q.offer("Bokaro");
		q.offer("Dhanbad");
		q.offer("Ranchi");
		q.offer("Jamshedpur");
		System.out.println(q);
		
		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q.poll());
		System.out.println(q.removeAll(q));
		
		//System.out.println(q.remove()); if no element is there then it will give NOSUCH element exception

	}

}

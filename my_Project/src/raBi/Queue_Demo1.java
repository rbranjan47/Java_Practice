package raBi;
import java.util.Queue;
import java.util.PriorityQueue;

public class Queue_Demo1
{

	public static void main(String[] args) 
	{
		Queue<Integer>  q=new PriorityQueue<Integer>();
		q.offer(1);
		q.offer(7);
		q.offer(8);
		q.offer(10);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.offer(99);
		System.out.println(q);
		

	}

}

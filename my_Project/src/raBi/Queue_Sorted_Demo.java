package raBi;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Queue_Sorted_Demo 
{

	public static void main(String[] args) 
	{
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(5);
		s.add(30);
		s.add(20);
		s.add(22);
		s.add(50);
		s.add(15);
		s.add(51);
		System.out.println(s);
		
		//Queue will sort the element
		Queue<Integer> q=new PriorityQueue<Integer>(s);
		System.out.println(q);
		
		Set<Integer> t=new TreeSet<Integer>();
		t.add(10);
		t.add(2);
		t.add(5);
		t.add(3);
		t.add(2);
		t.add(8);
		t.add(7);
		t.add(9);
		t.add(1);
		System.out.println(t);
		
		Queue<Integer> q1=new PriorityQueue<Integer>(t);
		System.out.println(q1);
		
		
		
		Set<Integer> q2=new HashSet<Integer>();
		q2.add(10);
		q2.add(20);
		q2.add(57);
		q2.add(35);
		q2.add(22);
		q2.add(89);
		q2.add(71);
		q2.add(94);
		q2.add(12);
		System.out.println(q2);
		
		Queue<Integer> q3=new PriorityQueue<Integer>(q2);
		System.out.println(q3);
		System.out.println();
		Set<Integer> q4=new TreeSet<Integer>(q2);
		System.out.println(q4);

	}

}

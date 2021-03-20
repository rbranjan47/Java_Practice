package raBi;

import java.util.*;
public class LinkedList_Demo 
{

	public static void main(String[] args)
	{
		LinkedList<String> l=new LinkedList<String>();
		
		l.add(0, "BioData");
		l.add("Rabi Ranjan");
		l.add("10");
		l.set(1, "20");
		l.add("Rabi Ranjan");
		l.add("Rabindra Prasad");
		l.add("Rita Devi");
		l.addFirst("Hello world");
		l.addLast("Tata");
		
		System.out.println(l);
		
		//getting first element 
		System.out.println(l.getFirst());
		
		//getting last element
		System.out.println(l.getLast());
		
		//removing first element
		System.out.println(l.removeFirst());
		//removing last element
		System.out.println(l.removeLast());
		
		System.out.println(l);
		

	}

}

package raBi;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack_Demo1 {

	public static void main(String[] args) 
	{
		Stack<String> s=new Stack<String>();
		s.push("Hero");
		s.push("Honda");
		s.push("Yamaha");
		s.push("Harley Davidson");
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.search("Hero"));
		System.out.println(s.search("Harley Davidson"));
		System.out.println(s.empty());
		System.out.println(s);
		
		System.out.println("--------------------------------------------------------------------");
		
		Enumeration<String> enm=s.elements();
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
		
		System.out.println("--------------------------------------------------------------------");

		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}

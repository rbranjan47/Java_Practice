package raBi;

import java.util.*;
public class Iterator_Demo1 
{

	public static void main(String[] args)
	{
		List<String> l=new ArrayList<String>();
		l.add("Delhi");
		l.add("Mumbai");
		l.add("Kolkata");
		l.add("Bangalore");
		l.add("Chennai");
		
		System.out.println(l);
		
		Stack<String> s=new Stack<String>();
		s.add("Dhanbad");
		s.add("Jamshedpur");
		s.add("Bokaro");
		s.add("Chakradharpur");
		s.add("Ranchi");
		
		System.out.println(s);
		
		Enumeration<String> enm=s.elements();
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
				
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------------------------");
		
		ListIterator<String> ltr=l.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("------------------------------------------------");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}

}

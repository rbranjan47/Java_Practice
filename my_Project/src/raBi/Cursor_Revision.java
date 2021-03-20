package raBi;

import java.util.*;

public class Cursor_Revision
{
	public static void main(String[] args)
	{
		Vector<String> a=new Vector<String>();
		a.add("Delhi");
		a.add("Mumbai");
		a.add("Chennai");
		a.add("Kolkata");
		a.add("Bangalore");
		
		System.out.println(a);
		System.out.println("--------------------------------");
		Enumeration<String> enm=a.elements();
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
		System.out.println("--------------------------------");
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------");
		ListIterator<String> litr=a.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("--------------------------------");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}
}

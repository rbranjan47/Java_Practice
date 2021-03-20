package raBi;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Demo 
{

	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<String>();
		l.add("Durga Puja");
		l.add("Diwali");
		l.add("Chhat Puja");
		l.add("Christmas");
		l.add("Makarsakranti");
		l.add("Saraswati Puja");
		l.add("Holi");
		l.add("Again Diwali");
		System.out.println(l);
		System.out.println();
		
		ListIterator<String> itr=l.listIterator();
		while(itr.hasNext())
		{
		String s=itr.next();
		if(s=="Again Diwali")
		{
			itr.set("1st april");
		}	
		else
		{
			System.out.println(l);
		}	
		}
		System.out.println();
		System.out.println(l);
		
	}

}

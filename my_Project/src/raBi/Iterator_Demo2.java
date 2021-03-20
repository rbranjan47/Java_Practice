package raBi;
import java.util.*;
public class Iterator_Demo2 
{

	public static void main(String[] args) 
	{
		Vector<Integer> l=new Vector<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(1, 2);//to add items in the middle
		l.add(4);
		l.add(5);
		System.out.println("reading all objects: ");
		System.out.println(l);
		
		// by ENUMERATIONS
		Enumeration<Integer> enm=l.elements();
		while(enm.hasMoreElements())
		{
			Integer i=enm.nextElement();
			System.out.print(" "+i);
		}
		System.out.println();
		//by  ITERATOR
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext())
		{
			Integer it=itr.next();
			System.out.print(" "+it);
		}
		System.out.println();
		//by LIST ITERATOR
		ListIterator<Integer> litr=l.listIterator();
		while(litr.hasNext())
		{
			Integer itg=litr.next();
			System.out.print(" "+itg);
		}
		System.out.println();
		while(litr.hasPrevious())
		{
			Integer itgr=litr.previous();
			System.out.print(" "+itgr);
		}
	}

}

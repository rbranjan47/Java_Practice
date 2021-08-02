package Java_Gromming;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class comparator_compare implements Comparator<String>{

	@Override
	public  int compare(String str1, String str2) {
		String first_string;
		String second_string;
		first_string = str1;
		second_string = str2;
		
		return second_string.compareTo(first_string);
	}
}

public class treeset_demo2 {
	public static void main(String[] args)
	{
		Set<String> ts = new TreeSet<String>();
		//Set<String> ts = new LinkedHashSet<String>();
		ts.add("usa");
		ts.add("russia");
		ts.add("china");
		ts.add("india");
		ts.add("united kingdom");
		ts.add("france");
		ts.add("south korea");
		ts.add("germany");
		ts.add("japan");
		ts.add("turkey");
		System.out.println("Printing all values: ");
		System.out.println(ts);
		
		
		//ietrating
		Iterator<String> itr = ts.iterator();
		System.out.print("Iterator: ");
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		
		//declaring constructor
		Set<String> ls = new LinkedHashSet<String>();
		ls.add("washington");
		ls.add("moscow");
		ls.add("beijing");
		ls.add("delhi");
		ls.add("london");
		ls.add("paris");
		ls.add("berlin");
		ls.add("tokyo");
		ls.add("ankara");
		ls.add(null);
		System.out.println();
		System.out.println("printing all values: ");
		System.out.print(ls);
		System.out.println();
		Iterator<String> iter = ls.iterator();
		System.out.print("Iterator: ");
		while(iter.hasNext())
		{
			System.out.print(iter.next()+" ");
		}
		
		//adding into treeset
		Set<String> ts_new = new TreeSet<String>(ts);
		System.out.println();
		System.out.print("printing all values: ");
		System.out.println(ts_new);
		Iterator<String> iterr = ts_new.iterator();
		System.out.print("Iterator: ");
		while(iterr.hasNext())
		{
			System.out.print(iterr.next()+" ");
		}
		
		
		try {
			ts_new.addAll(ls);
			System.out.println();
			System.out.print("printing all values: ");
			System.out.println(ts_new);
			Iterator<String> itera = ts_new.iterator();
			System.out.print("Iterator: ");
			while(itera.hasNext())
			{
				System.out.print(itera.next()+" ");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		
		//sorting the default order
		TreeSet<String> ts_compar = new TreeSet<String>(new comparator_compare());
		//Comparator<Integer> compar = ts_compar.comparator();  we can use this for integer type values
		ts_compar.addAll(ts);
		System.out.println(ts);
		

		//methods
		System.out.println(ts_compar.ceiling("indi"));  //return the least element or greater than or equal to
		System.out.println(ts_compar.clone());  
		System.out.println(ts_compar.contains("india"));
		
		//descending iterator
		Iterator<String> desc_itr = ts_compar.descendingIterator();
		{
			while(desc_itr.hasNext()) {
				System.out.print(desc_itr.next()+" ");
			}
		}
		System.out.println(" ");
		for(Iterator<String> for_itr = ts_compar.iterator();
				for_itr.hasNext();)
		{
			System.out.print(for_itr.next()+" ");
		}
	}
}



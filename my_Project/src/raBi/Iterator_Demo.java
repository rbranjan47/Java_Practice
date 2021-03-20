package raBi;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Demo {

	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<String>();
		l.add("Honda Dazzler");
		l.add("2015");
		l.add("120km/hr");
		l.add("my personal bike");
		l.add("now missing my bike");
		l.add("i want same bike");
		System.out.println("just checking all elements"+l);
		System.out.println();
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			if (s=="i want same bike")
				itr.remove();
			else 
				System.out.println(l);
		}
		System.out.println();
		System.out.println("final list look like "+l);

	}

}

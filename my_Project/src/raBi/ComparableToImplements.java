package raBi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableToImplements implements Comparable<ComparableToImplements>
{

		int id;
		String name;
		double per;
		
		ComparableToImplements(int id,String name,double per)
		{
			this.id=id;
			this.name=name;
			this.per=per;
		}

		@Override
		public int compareTo(ComparableToImplements c) 
		{
		if (this.per==c.per)
		{
			return 0;
		}
		else if (this.per>c.per)
		{
			return 1;
		}
		else 
		{
			return -1;
		}
		}

			
		
	public static void main(String[] args) 
	{
		ComparableToImplements c1=new ComparableToImplements(2,"guldu",87.5);
		ComparableToImplements c2=new ComparableToImplements(3,"dinga",82.5);
		ComparableToImplements c3=new ComparableToImplements(4,"vivek",88.0);
		ComparableToImplements c4=new ComparableToImplements(5,"bablu",91.2);
		
		List<ComparableToImplements> lst=new ArrayList<ComparableToImplements>();
		lst.add(c1);
		lst.add(c2);
		lst.add(c3);
		lst.add(c4);
		
		//printing result before sorting
		for (ComparableToImplements clist : lst)
		{
			System.out.println(clist.per);
		}
		//after sorting
	System.out.println("------------------------");
		Collections.sort(lst);
		
		for (ComparableToImplements clist : lst)
		{
		System.out.println(clist.per);
		
		}
	}

}
package raBi;

import java.util.Set;
import java.util.TreeSet;

public class CmpareTo_DNS implements Comparable<CmpareTo_DNS>
{
	
	String name;
	int id;
	String loc;
	
	CmpareTo_DNS(String name,int id, String loc)
	{
		this.name=name;
		this.id=id;
		this.loc=loc;
	}
	
	public String toString()
	{
		return this.name +" "+id+" "+loc;
	}
	@Override
	public int compareTo(CmpareTo_DNS stu) 
	{
		//we can also write directly comparable
		//convert integer to wrapper object
		Integer ID1=this.id;
		     return ID1.compareTo(stu.id);   
		
		//we can also compare String
		//return name.compareToIgnoreCase(stu.name);
	}

	public static void main(String[] args) 
	{
		CmpareTo_DNS s1=new CmpareTo_DNS("Rabi",121,"dhanabd");
		CmpareTo_DNS s2=new CmpareTo_DNS("Vivek",122,"bokaro");
		CmpareTo_DNS s3=new CmpareTo_DNS("vishal",123,"bhabua");
		CmpareTo_DNS s4=new CmpareTo_DNS("prince",124,"ara");
		CmpareTo_DNS s5=new CmpareTo_DNS("Rahul",125,"bhubaneshwar");
		
		Set<CmpareTo_DNS> lst=new TreeSet<CmpareTo_DNS>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		lst.add(s5);
		
		for(CmpareTo_DNS stud :lst )
		{
			System.out.println(stud);
		}
	}
}

package raBi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTo_stud implements Comparable<CompareTo_stud>
{
	String name;
	String branch;
	int id;

  CompareTo_stud (String name, String branch,int id)
	{
		this.name=name;
		this.branch=branch;
		this.id=id;
	}
  
  //over-riding for not getting hexadecimal value 
	public String toString()
	{
		return this.name+" "+ this.branch+"  "+ this.id;
	}
	
	@Override  //for sorting
	public int compareTo(CompareTo_stud s) 
	{
		if (this.id==s.id)
		{
			return 0;
		}
		else if (this.id > s.id)
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
		CompareTo_stud s1=new CompareTo_stud("rabi","mech",103);
		CompareTo_stud s2=new CompareTo_stud("lopa","cse",102);
		CompareTo_stud s3=new CompareTo_stud("monika","ece",105);
		CompareTo_stud s4=new CompareTo_stud("ashish","eee",104);
		
		List<CompareTo_stud> lst=new ArrayList<CompareTo_stud>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		
		for (CompareTo_stud stu : lst)
		{
			System.out.println(stu);
		}
		
		System.out.println("-------------------");
		Collections.sort(lst);
		for (CompareTo_stud stu : lst)
		{
			System.out.println(stu);
		}
		
		
	}

}

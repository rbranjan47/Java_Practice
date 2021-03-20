package raBi;
import java.util.*;
public class HashSet_Demo 
{

	public static void main(String[] args) 
	{
	HashSet<String> h=new HashSet<String>(16,150f);
	h.add("delhi");
	h.add("old delhi");
	h.add("delhi");     //duplicate not allowed in hash-set
	h.add(null);     
	h.add(null);  //even only one null is possible
	h.add("mumbai");
	h.add("punjab");
	System.out.println(h);
	
	
	HashSet<String> h1=new HashSet<String>(h); //accepting collection as argument
	System.out.println(h1);
	
	HashSet<Integer> l2=new HashSet<Integer>();
	l2.add(1);
	l2.add(3);
	l2.add(2);
	l2.add(4);
	l2.add(5);
	l2.add(6);
	l2.add(7);
	
	System.out.println(l2);
	
	
	}

}

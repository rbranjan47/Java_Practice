package raBi;

import java.util.Hashtable;

public class HashTable_Demo
{

	public static void main(String[] args) 
	{
		Hashtable<Integer, String> h=new Hashtable<Integer, String>();
		h.put(1, "Jharkhand");
		h.put(2, "Bengal");
		h.put(3, "Mumbai");
		h.put(4, "Tamil Nadu");
		h.put(5, "Delhi");
		h.put(6, "Jammu kashmir");
		h.put(7, "Karnataka");
		h.put(8, "Bihar");
		h.put(9, "Punjab");
		h.put(10, "Madhya Pradesh");
		System.out.println(h.size());
		h.put(11, "Andhra Pradesh");
		h.put(12, "Karnataka");
		h.put(13, "Gujrat");
		
		System.out.println(h);
		System.out.println(h.size());
		
		

	}

}

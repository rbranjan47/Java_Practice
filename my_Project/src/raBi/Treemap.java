package raBi;

import java.util.Set;
import java.util.TreeMap;

public class Treemap
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> map= new TreeMap<Integer, String>();
		map.put(10, "Rabi");
		map.put(20, "vivek");
		map.put(30, "vishal");
		map.put(40, "prince");
		map.put(50, "Rahul");
		map.put(20, "vivek"); //duplicates not allowed while sort
		
		System.out.println(map);
		
	Set<Integer> keys=map.keySet(); //sorting
	System.out.println(keys);
	}
}

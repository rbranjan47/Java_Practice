package raBi;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;


public class SortedMap_Demo 
{

	public static void main(String[] args) 
	{
		SortedMap<Integer, String> s=new TreeMap<Integer, String>();
		s.put(1, "Manual Testing");
		s.put(2, "SQL");
		s.put(3, "Java");
		s.put(4, "Selenium");
		s.put(5, "Jmeter");
		s.put(6, "REST/SOAP API");
		s.put(7, "Pearl");
		
		System.out.println(s);
		System.out.println("---------------Inherting method--------------------------");
		System.out.println(s.containsKey(6));
		System.out.println(s.containsValue("Java"));
		System.out.println(s.get(3));
		System.out.println(s.remove(7));
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.containsValue("Jmeter"));
		
		System.out.println("---------------Based on collection-----------------");  
		System.out.println(s.keySet());
		System.out.println(s.values());
		System.out.println(s.entrySet());
		
		System.out.println("--------------------Based on TreeMap Method--------------------");
		System.out.println(s.firstKey());
		System.out.println(s.lastKey());
		System.out.println(s.headMap(4));
		System.out.println(s.tailMap(4));
		System.out.println(s.subMap(2, 5));
		System.out.println(s);
		
		
		NavigableMap<Integer, String> n=new TreeMap<Integer, String>();
		n.put(1, "Manual Testing");
		n.put(2, "SQL");
		n.put(3, "Java");
		n.put(4, "Selenium");
		n.put(5, "Jmeter");
		n.put(6, "REST/SOAP API");
		n.put(7, "Pearl");
		System.out.println("---------------------Based on Navigable Map----------------------------------");
		System.out.println(n);
		System.out.println(n.pollFirstEntry());
		System.out.println(n.pollLastEntry());
		System.out.println(n.floorEntry(4));
		System.out.println(n.lowerEntry(4));
		System.out.println(n.ceilingEntry(4));
		System.out.println(n.floorEntry(4));
		System.out.println(n.higherKey(4));
		System.out.println(n.lowerKey(4));
		System.out.println(n);
		
	}

}

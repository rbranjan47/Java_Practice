package Java_Gromming;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_demo 
{
	public static void main(String[] args) 
	{
		//declaring Sorted map interface
		SortedMap<Integer, String> map =  new TreeMap<Integer, String>();
		map.put(2, "two");
		map.put(7, "seven");
		map.put(5, "five");
		map.put(3, "three");
		map.put(6, "six");
		
		//map.put(7, "eight");  //can't accept duplicate
		
		map.put(8, "eight");
		map.put(4, "four");
		System.out.println(map);
		
		
		//default iterating
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//iterating, to iterate we have pass in Set
		Set<Entry<Integer, String>> set = map.entrySet();  //entrySet return the Set view of mapping
		
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> m_entry = itr.next();
			
			
			System.out.println(m_entry.getKey()+"+"+m_entry.getValue()+"="+(m_entry.getKey()+m_entry.getValue()));
		
		}
		
		//LAMDA EXPRESSION
		set.forEach((e) -> {
			System.out.println(e+ " ");
		});
		
		//methods
		System.out.println(map.comparator());  //return NULL if natural ordering is there
		
		
		//headmap
		System.out.println(map.headMap(5));
		
		// from key to to key
		System.out.println(map.subMap(2, 6));
		
		//tailMap
		System.out.println(map.tailMap(2));
		
		//values
		System.out.println(map.values());
	}
}

package Java_Gromming;

import java.util.HashMap;
import java.util.Map;

public class collection_map {
	public static void main(String[] args)
	{
		//Map interface----> extends Sorted Map
		//Map interface----> implements Linked Hashmap and Hashmap
		//Treemap class implments Sorted map interface
		//Map accepts key value pair
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		map.put("d", 40);
		map.put("e", 50);
		System.out.println(map.get("a"));
		
		//reading key value pair
		for (Map.Entry<String, Integer> map_loop : map.entrySet()) {
			System.out.println(map_loop.getKey()+":"+map_loop.getValue());
		}
		for (Map.Entry<String, Integer> map_looped : map.entrySet()) {
			System.out.println(map_looped.getKey()+"="+map_looped.getValue()+"="+map_looped.getClass());
		}
		
		//using for each
		map.forEach((k, v) -> {
			System.out.println("key:"+k+"value:"+v);
		});
		
	}
}

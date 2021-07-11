package Java_Gromming;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map_entrySet{
	public static void main(String[] args) {
		//we are adding some key value pairs
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(2, "vivek");
		map.put(7, "monika");
		map.put(4, "prince");
		map.put(3, "harshvardhan karn");
		map.put(5, "sita");
		map.put(6, "lopamudra");
		map.put(1, "rabi");
		
		
		System.out.println(map.keySet()); //return key's associted with that map
		
		System.out.println(map);
		System.out.println("cloned hashmap is looks like, "+ map.clone());
		//using map for each loop
		map.forEach((k, v) ->{   
			System.out.println(k+" "+v);
		});
		
		//using entry set
		for(Map.Entry<Integer, String> map_value : map.entrySet()) {
			System.out.println(map_value.getKey()+" "+map_value.getValue());
		}
		//tree map
		Map<Integer, String> tree_map = new TreeMap<Integer, String>();
		tree_map.putAll(map);
		System.out.println(tree_map);
		
		//--------------------------if keys are strings
		Map<String, String> maps = new HashMap<String, String>();
		maps.put("dhanbad", "bhuli");
		maps.put("bombay","mumbai");
		maps.put("chattisgarh", "raipur");
		maps.put("andhra", "Amrabati");
		System.out.println(maps);
		
		//for each loop
		maps.forEach((k, v)->{
			System.out.println(k+v);
		});
		
		//using entry set
		for(Map.Entry<String, String> maps_value : maps.entrySet()) {
			System.out.println(maps_value.getKey()+maps_value.getValue());
		}
		//tree map
		Map<String, String> tree_maps = new TreeMap<String, String>();
		tree_maps.putAll(maps);
		System.out.println(tree_maps);
		
		
		
		
	}
}
package raBi;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo 
{

	public static void main(String[] args) 
	{
		Map<Integer, String> m=new HashMap<Integer, String>();
		System.out.println(m.isEmpty());
		m.put(1, "Coal Capital of india");
		m.put(2, "pink city of india");
		m.put(3, "temple city of india");
		m.put(4, "silver city of india");
		m.put(5, "silicon valley of india");
		m.put(6, "hey dude");
		
		System.out.println(m);
		
		System.out.println(m.get(3));
		System.out.println(m.containsKey(6));
		System.out.println(m.remove(6));
		System.out.println(m.containsKey(3));
		System.out.println(m.containsKey(6));
		System.out.println(m.containsValue("Coal Capital of india"));
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		
		
		//METHOD BASED ON COLLECTION
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
	}

}

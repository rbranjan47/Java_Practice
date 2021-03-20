package raBi;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
public class SortedMap1 
{

	public static void main(String[] args) 
	{
		//default sorting
		//Map<String, String> m=new TreeMap<String, String>();
		
		//customized sorting by reversing it
		Map<String, String> m=new TreeMap<String, String>(Collections.reverseOrder());
		m.put("Dhoni", "CSK");
		m.put("Rohit", "MI");
		m.put("Kholi", "RCB");
		m.put("Rahane", "RR");
		
		System.out.println(m);
	}

}

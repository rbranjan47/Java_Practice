package raBi;
import java.util.*;
public class NavigableMap_Demo 
{

	public static void main(String[] args) 
	{
		TreeMap<String, String> t=new TreeMap<String, String>();
		t.put("a", "apple");
		t.put("b", "banana");
		t.put("c", "carrot");
		t.put("d", "dragon fruit");
		t.put("e", "egg fruit");
		t.put("f", "finger lime");
		System.out.println(t);

		System.out.println(t.ceilingKey("c"));
		
		System.out.println(t.higherKey("e"));
		
		System.out.println(t.floorKey("d"));
		
		System.out.println(t.lowerKey("b"));
		
		System.out.println(t.pollFirstEntry());
		
		System.out.println(t.pollLastEntry());
		
		System.out.println(t.descendingMap());
		
		System.out.println(t);
		
	}

}

package practiceTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class collectionTest {
	public static void main(String[] args) {
		Set<String> sets = new HashSet<String>();
		
		sets.add("Rabi");
		sets.add("Ranjan");
		System.out.println(sets);
		
		
		List<String> al = new ArrayList<>();

		// Adding elements to object of List class
		al.add("Geeks");
		al.add("Geeks");
		al.add(1, "Geeks");
		
		sets.addAll(al);
		System.out.println(sets);
		
		
	}
}

package Java_Gromming;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_Demo2 {
	public static void main(String[] args)
	{
		//defining set
		Set<Integer> set1 = new HashSet<Integer>(10, 0.75f);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(9);
		set1.add(10);
		set1.add(11);
		set1.add(12);
		System.out.println(set1);
		
		LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>(set1);
		System.out.println(lset);
	}
}

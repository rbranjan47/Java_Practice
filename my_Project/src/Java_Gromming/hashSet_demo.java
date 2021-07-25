package Java_Gromming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashSet_demo {
	public static void main(String[] args)
	{
		//first set
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9}));
		System.out.println(set1);
		System.out.println(set1.getClass().getTypeName());
		
		//second set
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {2,4,6,8,0}));
		
		//union by adding all elements, 
		Set<Integer> set_union = new HashSet<Integer>(set1);
		set_union.addAll(set2);
		System.out.println("union: "+ set_union);
		
		//intersectionb
		Set<Integer> set_intersection = new HashSet<Integer>(set1);
		set_intersection.retainAll(set2);
		System.out.println("Intersection: "+ set_intersection);
		
		//difference
		Set<Integer> set_difference = new HashSet<Integer>(set1);
		set_difference.removeAll(set2);
		System.out.println("Difference: "+set_difference);
		
		Set<String> set_string = new HashSet<String>();
		set_string.addAll(Arrays.asList(new String[] {"rabi", "ranjan", "kumar", "patel"}));
		System.out.println(set_string);
		}
	}


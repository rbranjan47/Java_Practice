package Java_Gromming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class array_list {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(5);
		list.add(9);
		list.add(4);
		System.out.println("Array List: "+list);
		
		//random access is possible 
		list.add(3, 17);
		//using iteration 
		ListIterator<Integer> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println("Iterates at index "+itr.nextIndex()+" "+itr.next());
		}
		
		//iterating using loop
		for (int i =0; i<list.size();i++)
		{
			System.out.println("index at "+list.indexOf((Object)list.get(i))+" "+list.get(i));
		}
		
		List<Integer> listt = new LinkedList<Integer>();
		listt.addAll(list);
		
		//random access is not possible in Linked List
		listt.add(2, 22);
		System.out.println(listt);
		listt.remove(0);
		System.out.println("Linked List: "+listt);
		
		
		}
}

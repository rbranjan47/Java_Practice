package Java_Gromming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator_example {
	public static void main(String[] args) {
		List<String> list =  new ArrayList<String>();
		list.add("welcome");
		list.add("to");
		list.add("our");
		list.add("programming");
		list.add("world");
		
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//to remove the elements
		itr.remove();  //it will remove the last elements
		itr.remove(); //it will remove again last elements of the remaining elements
		System.out.println(list);
	}
}

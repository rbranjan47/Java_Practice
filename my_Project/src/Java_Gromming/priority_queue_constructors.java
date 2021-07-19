package Java_Gromming;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//implementing comparator interface
class The_Comparator implements Comparator<String>
{
	/* For Integer comparsion we are not using comparator  */
	 
	public int compare(String f_str, String s_str)
    {
		@SuppressWarnings("unused")
		String first_string;
		@SuppressWarnings("unused")
		String second_string;
		first_string = f_str;
		second_string = s_str;
        return  s_str.compareTo(f_str);
        //int result_int = Integer.valueOf(result);
        //return result_int;
    }
}

public class priority_queue_constructors //implements Comparable<priority_queue_constructors>
{
	public static void main(String[] args) 
	{
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("dhanbad");
		queue.add("bhuli");
		queue.add("kusunda");
		queue.add("bank more");
		queue.add("purana bazar");
		queue.add("dhanbad station");
		queue.add("koyla nagar");
		queue.add("ism dhanbad");
		
		System.out.println(queue);
		
		PriorityQueue<String> pqueue = new PriorityQueue<String>(new The_Comparator());
		System.out.println("Comparator: ");
		pqueue.addAll(queue);
		System.out.println(pqueue);
	
		//printing with conditions
		if(pqueue.isEmpty() == false)
		{
			System.out.println(pqueue);
		}
	}
}

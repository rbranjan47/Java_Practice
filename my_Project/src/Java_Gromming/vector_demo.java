package Java_Gromming;

import java.util.ListIterator;
import java.util.Vector;

public class vector_demo 
{
	public static void main(String[] args) 
	{
		//initializing the vector
		Vector<Integer> vector = new Vector<Integer>();
		//appending element
		for(int i=1; i<=20 ; i++) {
			vector.add(i);
		}
		
		System.out.println(vector);
		//displaying elements
		for(int j=0; j<vector.size(); j++) 
		{
			System.out.print(vector.get(j)+" ");
		}
		System.out.println("Using list Iterator:");
		//using iterator
		ListIterator<Integer> itr = vector.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println("");
		//into array
		Object[] arrObj = vector.toArray();
		//Integer[] arrValue = Arrays.copyOf(arrObj, arrObj.length, Integer[].class);
		System.out.println("In Array: ");
		for(int j = 0; j < arrObj.length ; j++)
		{
			System.out.print(arrObj[j]+" ");
		}
	}
}

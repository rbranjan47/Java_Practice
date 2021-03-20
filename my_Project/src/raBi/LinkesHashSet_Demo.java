package raBi;
import java.util.LinkedHashSet;
public class LinkesHashSet_Demo 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
		l.add(1);
		l.add(3);
		l.add(2);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		
		System.out.println(l);  //linked hash-set gives the Output in PRESREVED as it's underlying data structure is LINKED-LIST and HASH-TABLE

	}

}

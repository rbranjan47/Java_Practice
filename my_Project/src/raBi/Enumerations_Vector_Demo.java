package raBi;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class Enumerations_Vector_Demo 
{

	public static void main(String[] args) 
	{
		Vector<String> vc=new Vector<String>();
		vc.addElement("Rabi Ranjan Kumar");
		vc.addElement("Rubi Kala Kumari");
		vc.add("Nishant Kumar");
		vc.addElement("Khushbu Kumari");
		vc.addElement("Perwin Prasad Singh");
		vc.addElement("Rita Devi");
		vc.addElement("Rabindra Prasad");
		
		String s1="by enumerations";
		s1=s1.toUpperCase();
		System.out.println(s1);
		System.out.println();
		//Enumerations------ONLY for VECTOR and STACK
		Enumeration<String> e=vc.elements();
		 //checking elements
		while(e.hasMoreElements())
		{
			String bio_data=e.nextElement();
			
			System.out.println(bio_data);
		}
		
		System.out.println("-----------------------------------------------------------------");
		String s2="by Iterator";
		s2=s2.toUpperCase();
		System.out.println(s2);
		System.out.println();
		Iterator<String> itr=vc.iterator();
		while(itr.hasNext())
		{
		String data=itr.next();
		
		System.out.println(data);
		}
	}

}

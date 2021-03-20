package raBi;

public class Stringbuffer 
{
	
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("rabi ranjan"); 
        int p = sb.length();
        int q = sb.capacity();
        System.out.println("Length of string=" + p);
        System.out.println("Capacity of string=" + q);  //by default initial capacity is 16
        
        sb.append("rabi");
		sb.append(1234);
		sb.append('a');
		sb.append(3.14);
		sb.append(12567);
		sb.append(true);
		sb.append("harami");
		
		System.out.println(sb+" ");
		System.out.println(sb.charAt(5));
	
	        
	}

}

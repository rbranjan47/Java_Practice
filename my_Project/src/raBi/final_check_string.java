package raBi;

public class final_check_string {

	public static void main(String[] args) 
	{
		final StringBuffer sb=new StringBuffer("durga");
		sb.append("software"); //final keyword not affect on String OBJECT
		//sb=new StringBuffer("solutions");  //but we can't reasign the final keyword
		
		System.out.println(sb);
	}

}

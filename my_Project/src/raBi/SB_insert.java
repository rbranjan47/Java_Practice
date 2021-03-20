package raBi;

public class SB_insert {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Rabi");
		
		sb.insert(1,"aa");
		sb.insert(1,'a');
		sb.insert(1,12);
		sb.insert(1, true);
		sb.insert(1, 3.14);
 sb.reverse();
 System.out.println(sb);

	}

}

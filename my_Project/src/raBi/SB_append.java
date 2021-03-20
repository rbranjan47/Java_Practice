package raBi;

public class SB_append {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		sb.append("rabi");
		sb.append(1234);
		sb.append('a');
		sb.append(3.14);
		sb.append(12567);
		sb.append(true);
		sb.append("harami");
		System.out.println(sb);
	}

}


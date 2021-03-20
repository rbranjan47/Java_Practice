package raBi;

public class Method_chaining {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		sb.append("Rabi").append("Ranjan_kumar").delete(11,14).append(1).append("Rabindra_Prasad").append("Rita_Devi").append('D');
		System.out.println(sb);
	}

}

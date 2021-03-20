package raBi;

public class lowerUppercase {

	public static void main(String[] args) {
		
		String s1=new String ("rabi");
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();
		String s4=s2.toLowerCase();  //new object created
	String s5=s4.toUpperCase();  //new object created 
	
		System.out.println(s2==s1);
		System.out.println(s3==s1);
		System.out.println(s4);
		
		System.out.println(s5);
	

	}

}

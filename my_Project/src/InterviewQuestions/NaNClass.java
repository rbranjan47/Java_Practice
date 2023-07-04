package InterviewQuestions;

public class NaNClass {
	public static void main(String[] args) {

		// System.out.println(12/0);

		System.out.println(1.0 / 0.0); // Infinity

		System.out.println(Math.sqrt(-1));// NaN(not a number)

		System.out.println(23.56 / 0);// Double > Infinity
		System.out.println(34.5f / 0);// float > Infinity

		System.out.println(10 / 0.0); // Infinity

		System.out.println(10 / 0.0);// Infinity

		long longMultiplicationWithoutL = 1000 * 60 * 60 * 24 * 365; // Treated as Ineger, not L in last

		long longMultiplicationWithL = 1000 * 60 * 60 * 24 * 365L;
		System.out.println(longMultiplicationWithoutL); // 1471228928

		System.out.println(longMultiplicationWithL);

		// Double MIN_VALUE & MAX_VALUE
		System.out.println(Double.MIN_VALUE); //a +ve Number
		System.out.println(Double.MAX_VALUE); //a +ve Number
		
		//Integer MAX_VALUE & MIN_VALUE
		System.out.println(Integer.MAX_VALUE);// +ve number
		System.out.println(Integer.MIN_VALUE);//-ve value Number

		System.out.println(Math.min(Double.MAX_VALUE, 0.0d));
		if (Double.MIN_VALUE > 0.0d) {
			System.out.println("greater");
		} else {
			System.out.println(" not greater");
		}
		
		System.out.println(Math.max(5, 10));
		
		String s1 = "tomorrow";
		StringBuffer sb1 = new StringBuffer(s1);
		char s3 = '$';
		for(int i=0; i<sb1.length();i++) {
			int count=0;
			if(sb1.charAt(i) == 'o' || sb1.charAt(i) == 'O') {
			sb1.setCharAt(i, s3);
			count++;
			}
		}
		System.out.println(sb1);
	}
}

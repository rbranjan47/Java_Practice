package InterviewQuestions;

public class string2Concept {
	public static void main(String[] args) {
		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.println(x);

		String names = "rabi ranjan kumar";

		String namesWord[] = names.split("\\s");
		String result = "";
		
		for(String w: namesWord) {
			String first = w.substring(0, 1).toUpperCase();
			String second = w.substring(1, w.length());
			result = result + first + second + " ";
		}
		System.out.print(result.trim());
		
		 
		
		System.out.println("hello");
		http: //java.com            > this is a label
			System.out.println("World");
	}
}

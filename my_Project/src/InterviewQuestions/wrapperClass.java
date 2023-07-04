package InterviewQuestions;

public class wrapperClass {
	public static void main(String[] args) {
		//Integer Caching, cause its range -127 to 127
		Long num1 = 128L;
		Long num2 = 128L;
		
		if(num1 == num2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		
		Integer myInteger = 10; // Boxing - converting int to Integer object
		System.out.println(myInteger.toString()); // Output: 10

		int myInt = myInteger; // Unboxing - converting Integer object to int
		System.out.println(myInt); // Output: 10

		Boolean myBoolean = true; // Boxing - converting boolean to Boolean object
		System.out.println(myBoolean.toString()); // Output: true

		char myChar = 'a';
		Character myCharacter = myChar; // Boxing - converting char to Character object
		System.out.println(myCharacter.toString()); // Output: a
		

	}
}

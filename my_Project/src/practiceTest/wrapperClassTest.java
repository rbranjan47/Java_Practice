package practiceTest;

public class wrapperClassTest {
	public static void main(String[] args) {
		String strValue = "100";
		
		Integer intValueObject = Integer.valueOf(strValue);
		//invalueObject is an Object
		System.out.println(intValueObject + intValueObject.getClass().getName());
		
		int intValue = Integer.parseInt(strValue);
		
		System.out.println(intValue);
		
		int a= 500;
		Integer a_Obj = a;  //wrapping into object, AutoBoxing
		System.out.println(a_Obj + a_Obj.getClass().getName());
		
		System.out.println(Character.valueOf('A'));
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isLetter('V'));
		System.out.println(Character.isLetterOrDigit('E'));
	}
}

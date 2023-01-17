package javaRegex;

/*
 * Create Regex which accepts alphanumeric characters
 */
import java.util.regex.*;

public class alphaNumericRegexFIRST {
	public static void main(String[] args) {
System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Hey8")); //true
System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "809")); //false
System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "This")); //true
System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "World")); //false

System.out.println(Pattern.matches("[a-zA-Z0-9]{20}","uf9o9ooo400oo9898987"));//true
	}
}

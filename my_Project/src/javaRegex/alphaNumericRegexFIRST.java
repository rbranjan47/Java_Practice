package javaRegex;

/*
 * Create Regex which accepts alphanumeric characters
 */
import java.util.regex.*;

public class alphaNumericRegexFIRST {
	public static void main(String[] args) {
System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "Hey8")); //true, as Hey8 is present under pattern a-zA-Z0-9, with given size
System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "809")); //false, as 809 is present under pattern a-zA-Z0-9, but mentioned size is 4 and given string is 3
System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "This")); //true, as This is present under pattern a-zA-Z0-9, with given size
System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "World")); //false, as World is present under pattern a-zA-Z0-9, but mentioned size is 4 and given string is 5

System.out.println(Pattern.matches("[a-zA-Z0-9]{20}","uf9o9ooo400oo9898987"));//true
	}
}

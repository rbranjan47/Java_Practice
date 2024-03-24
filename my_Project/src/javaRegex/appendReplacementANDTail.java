package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * appendReplacement() 
 *     >> Used to replace MATCHED TEXT WITH SPECIFED TEXT
 *     >> Append the result, store in `StringBuffer`(cause stringBuffer make it mutuable)
 *      
 *     >> Then, appendTail() > Add remaning text in lasr of append replaced text
 *      
 */

public class appendReplacementANDTail {
	public static void main(String[] args) {
		String actualWord = "cat and rat are animals!";
		String regexWord = "rat";
		String replacementWord = "dog";

		Pattern p = Pattern.compile(regexWord);
		Matcher m = p.matcher(actualWord);

		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, replacementWord);
		}

		m.appendTail(sb);

		// final texts are:
		System.out.println(sb.toString());
		
		//1 more Example
		String newWord = "Hey this , learning Java Programming and cSharp!";
		String replaceNewWord = "cSharp";
		String replacementNewWord = "Javascript";
		
		Pattern ps = Pattern.compile(replaceNewWord);
		Matcher mtch = ps.matcher(newWord);
		
		
		StringBuffer sbfr = new StringBuffer();
		while(mtch.find()) {
			mtch.appendReplacement(sbfr, replacementNewWord);
		}
		
		mtch.appendTail(sbfr);
		System.out.println(sbfr.toString());
	}
}

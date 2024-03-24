package practiceTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputStringsTest {
	
	public static String dataTypereturn(Object obj) {
		return obj.getClass().getName();
	}
	public static void main(String[] args) throws IOException {
	
		//Input from User, Using BufferReader & Scanner Class
		BufferedReader buferReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		//Scanner scnString = new Scanner(System.in);
		System.out.println("Enter a number");
		String enteredLine = buferReader.readLine();
		//String enteredLine = scnString.nextLine();
		
		
		int enterdNum = Integer.parseInt(enteredLine);
		
		System.out.println("Entered number is: "+enterdNum +" having type is: " + dataTypereturn(enterdNum));
		
		
	}
	
	public static String userInputs() throws IOException {
		BufferedReader bufferReaders = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any Text: ");
		//Input texts
		String inputtedText = bufferReaders.readLine();
		
		return inputtedText;
	}
}

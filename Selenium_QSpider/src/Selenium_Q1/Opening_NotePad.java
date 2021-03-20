package Selenium_Q1;

import java.io.IOException;

public class Opening_NotePad
{

	public static void main(String[] args) throws IOException 
	{
		
		//opening notepad, using runtime class which having methods getruntime and then we are passing method 'exec' to get the exe based file
		Runtime.getRuntime().exec("notepad");

	}

}

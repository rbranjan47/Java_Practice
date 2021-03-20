package Selenium_Q1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class Robot_Class 
{

	public static void main(String[] args) throws IOException, AWTException, InterruptedException 
	{
		
		//opening notepad
		Runtime.getRuntime().exec("notepad");
		
		//using ROBOT class, typing any letter in notepad
		
		Robot r=new Robot();
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_SHIFT);
		
		r.keyPress(KeyEvent.VK_R);
		
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_I);
		
		r.keyPress(KeyEvent.VK_SPACE);
      r.keyPress(KeyEvent.VK_SHIFT);
		
		r.keyPress(KeyEvent.VK_R);
		
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_J);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);

	}

}

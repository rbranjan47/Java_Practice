package Selenium_Q1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class Data_Driven_Demo 
{

	public static void main(String[] args) throws IOException 
	{
		//get java representative object of the physical file
		FileInputStream fin=new FileInputStream("./Data/Data_Driven.property");
		
		//create the object properties
		Properties p=new Properties();
		p.load(fin);  //non static method, load the file
		//get the data(or value) by passing the key
		String url=p.getProperty("url");
		String username=p.getProperty("username");
		String password=p.getProperty("password");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}

//Write a script to test the login feature of the actitime.com by taking the test data from property file


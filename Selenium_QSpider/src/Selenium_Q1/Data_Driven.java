package Selenium_Q1;

import java.util.ArrayList;
import java.util.HashMap;

public class Data_Driven 
{

	public static void main(String[] args)
	{
		ArrayList<String> lst=new ArrayList<String>();
		lst.add("https://demo.actitime.com/");
		lst.add("admin");
		lst.add("chrome");
		lst.add("manager");
		System.out.println(lst.get(2));
		
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("url", "https://demo.actitime.com/");
		map.put("username", "admin");
		map.put("browser", "chrome");
		map.put("password", "manager");
		System.out.println(map.get("password"));

	}

}

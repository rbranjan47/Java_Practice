package com.roofhub.qa.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Properties;


    public class Config {
    	
    	public static String word;
    	public static String value;
    	public static String TEST_BROWSER=readData("qaConfig", "Browser");
    	public static String APPLICATION_URL=readData("qaConfig","Application_url");
    	
    	public static String Username=readData("qaConfig", "Username");
    	public static String Password=readData("qaConfig", "Password");		
    	
    	/*
    	 *  [TestMethod]
    	 *  [Description("To read the configuration file")] 
    	 */

    	public static String readData(String file,String key)
    	{
    		try 
    		{			
    			FileInputStream in=new FileInputStream(""+file+".txt");	 
    			Properties properties=new Properties();			
    			properties.load(in);
    			in.close();
    			
    			FileReader reader=new FileReader(System.getProperty("user.dir")+"//qaConfig.txt");
    			properties.load(reader);
    			value=properties.getProperty(key);
    		}
    		catch(Exception e)
    		{
    			System.out.println("Configuration file not readable");
    		}
    		return value;
    	}
    	
    	/*
    	 * [Test Method]
    	 * [Description("To read Email")] 
    	 *
    	 */ 
    	/*
    	public static String readEmail(String key)
    	{
    		try
    		{
    			FileReader reader=new FileReader("C://Users//Thinksysuser//eclipse-workspace//RoofHubTest//RoofHubTest//Email.txt");
    			Properties properties=new Properties();
    			properties.load(reader);
    			word=properties.getProperty(key);
    		}
    		catch(Exception e)
    		{
    			System.out.println("Configuration file not readable");
    		}
    		return word;
    	}	
    	
    	/*
    	 *  [TestMethod]
    	 *  [Description("To update the Email")] 
    	 */
    	/*
    	public static void updateEmail(String newname) 
    	{	  
    	     try
    	     {
                FileInputStream in=new FileInputStream("C://Users//Thinksysuser//eclipse-workspace//RoofHubTest//RoofHubTest//Email.txt");  	             
    		    Properties props = new Properties();
        	    props.load(in);
    		    in.close();
    		    
    		    FileOutputStream out = new FileOutputStream("C://Users//Thinksysuser//eclipse-workspace//RoofHubTest//RoofHubTest//Email.txt");
    		    props.setProperty("currentEmail", newname);
    		    props.store(out, "properties");
    		    out.close();
    	        } 
    	        catch(Exception e)
    			{
    			System.out.println("Configuration file not readable");
    			}
    	}
    	
    	*/
    	

    }

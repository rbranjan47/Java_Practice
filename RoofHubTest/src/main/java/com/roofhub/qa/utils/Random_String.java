package com.roofhub.qa.utils;




import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;



public class Random_String {



	private static final String CHAR_LIST ="abcdefghijklmnopqrstuvwxyz";

	private static final int RANDOM_STRING_LENGTH = 2;

	private static final String email = "summi@testxp.com";

	private static final String username = "thegame";




	/*
	*  [TestMethod]
	*  [Description("To generate random email")] 
	*/
	public static String generateRandomString(){



		StringBuffer randStr = new StringBuffer();

		StringBuffer randStr2 = randStr.append(email);

		for(int i=0; i<RANDOM_STRING_LENGTH; i++){

			int number = getRandomNumber();

			char ch = CHAR_LIST.charAt(number);

			randStr2.insert(1, ch);

		}

		return randStr.toString();

	}

	/*
	*  [TestMethod]
	*  [Description("To generate random username")] 
	*/
	public static String generateRandomStrin(){



		StringBuffer randStr = new StringBuffer();

		StringBuffer randStr2 = randStr.append(username);

		for(int i=0; i<RANDOM_STRING_LENGTH; i++){

			int number = getRandomNumber();

			char ch = CHAR_LIST.charAt(number);

			randStr2.insert(1, ch);

		}

		return randStr.toString();


	}


	/*
	*  [TestMethod]
	*  [Description("To generate random number")] 
	*/
	private static int getRandomNumber() {

		int randomInt = 0;

		Random randomGenerator = new Random();

		randomInt = randomGenerator.nextInt(CHAR_LIST.length());

		if (randomInt - 1 == -1) {

			return randomInt;

		} else {

			return randomInt - 1;

		} 

	}

  
	    public static int getRandomAmout()
	    { 
	        // create instance of Random class 
	        Random rand = new Random(); 
	  
	        // Generate random integers in range 0 to 999 
	        int rand_int = rand.nextInt(900)+100; 
	      
	        
	        // Print random integers 
	        System.out.println("Random Integers: "+rand_int); 
	        
	       return rand_int ;       
	} 
	    
	    /*
    	*  [TestMethod]
    	*  [Description("To get date ")] 
    	*/
	    public static String GenerateEndDate() {

	    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    	 
	    	String date = LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	    	 
	    	System.out.println(date);
	    	 
	    	return date;
	    	 
	    	}

	    	/*
	    	*  [TestMethod]
	    	*  [Description("To get current date  ")] 
	    	*/
	    	public static String getCurrentDate(){
	    	Date myDate = new Date();
	    	String CurrentDate=new SimpleDateFormat("yyyy-MM-dd").format(myDate);
	    	System.out.println(CurrentDate);
	    	return CurrentDate;
	    	
	    	}

	    	



}
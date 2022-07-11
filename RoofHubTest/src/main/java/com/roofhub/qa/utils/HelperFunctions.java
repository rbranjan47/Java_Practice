package com.roofhub.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperFunctions 

{
	public static Properties config = null;
	WebDriver driver;

	public HelperFunctions(WebDriver driver) 
	{
		this.driver = driver;
	}

	/*
	 * Loads stream for parameters file
	 * @param fileName
	 * @throws IOException
	 */

	public static void LoadConfigProperty(String fileName) throws IOException
	{
		config = new Properties();
		FileInputStream ip = new FileInputStream("R://RESMAN//ResMan_AutomationSetup//qaConfig.txt");
		config.load(ip);
	}

	/*
	 * Implicit wait
	 * @param time
	 */
	public void implicitWait(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	/*
	 * Function to wait only till the point an element is invisible with a time limit
	 * @param element for which to wait 
	 */
	
	public void explicitWait(WebElement element) 
	{
		WebDriverWait wait  = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/*
	 * Function to perform JavaScript click on an element
	 * @param element
	 */

	public void jsClick(WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].click();", element);
	}
}

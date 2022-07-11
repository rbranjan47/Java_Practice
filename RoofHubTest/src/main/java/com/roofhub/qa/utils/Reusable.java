package com.roofhub.qa.utils;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.roofhub.qa.base.BaseClass;

public class Reusable extends BaseClass {
	WebDriver driver;

	public Reusable(WebDriver driver) {
		this.driver = driver;
	}

	public void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].click();", element);
	}

	public void webDriverwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/*
	 * Generated random template name
	 * 
	 */
	
	public String randomStrings() {
		String randomNames = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder randomBuilder = new StringBuilder();
        Random rnd = new Random();
        while (randomBuilder.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * randomNames.length());
            randomBuilder.append(randomNames.charAt(index));
        }
        String templateRandomNames = randomBuilder.toString();
        
        return templateRandomNames;
	}

}


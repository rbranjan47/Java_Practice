package com.roofhub.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.roofhub.qa.base.*;
import com.roofhub.qa.pages.HomePage;

public class LoginPage extends BaseClass{

@FindBy(xpath="//input[@data-vv-as='Email Address']")
public WebElement email_address;

@FindBy(xpath="//input[@data-vv-as='Password']")
public WebElement password;

@FindBy(xpath="//button[@tabindex='3']")
public WebElement LoginCTA;

@FindBy(xpath="//button[@tabindex='4']")
public WebElement RegisterCTA;

@FindBy(xpath="//div[@class='login']/form/div[6]/div[3]/span")
public WebElement incorrectdetails;


@FindBy(xpath="//div[@id='dashboard-side-panel']/div[1]/div[2]//div[@class='row']/div[1]/div/span[2]")
public WebElement welcomeText;


public LoginPage()
{
PageFactory.initElements(getDriver(), this);	
}


	
public HomePage login(String un, String pwd){
	email_address.sendKeys(un);
	password.sendKeys(pwd);
	LoginCTA.click();
	    	
	    	
	return new HomePage();
}

public void registerclick()
{
	RegisterCTA.click();
}

}
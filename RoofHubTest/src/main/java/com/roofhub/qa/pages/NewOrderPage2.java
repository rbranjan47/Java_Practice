package com.roofhub.qa.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.roofhub.qa.base.*;

public class NewOrderPage2 extends BaseClass {
	
	Actions action=new Actions(getDriver());
	
@FindBy(xpath="/html//button[@id='dropdownMenuButton']")
public WebElement Branch;

@FindBy(xpath="//div[@class='col-12']//div//select[@class='form-control select-no-margin']")
public WebElement JobAccount;

@FindBy(xpath="//input[@placeholder='Requested Pick Up Date']")
public WebElement PickupDate;

@FindBy(xpath="//div[@class='col-12 col-lg-6']//select[@class='form-control select-no-margin']")
public WebElement ArrivalTime;


@FindBy(xpath = "(//textarea[@class='form-control briefNoteInput'])[1]")
public WebElement instructions;

@FindBy(xpath ="//input[@id='additionalEmail0']")
public WebElement emailID;

@FindBy(xpath="//span[contains(text(),'MY ORDER TEMPLATES')]")
public WebElement MyOrderTemplate;

@FindBy(xpath="//a[contains(text(),'Select')]")
public WebElement SelectTemplate;

@FindBy(xpath="//span[contains(text(),'Review Order')]")
public WebElement ReviewOrderBtn;

//@FindBy(xpath="//div[@class='col-12 col-lg-4 mb-3 order-3 order-lg-1']/div/div/div[2]/div[7]/div/a[2]")
@FindBy(css=".col-12.text-center > a:nth-of-type(2)")
public WebElement Cancel;

@FindBy(xpath="//div[@id='order-wizard']/div/div[8]/div/div[@class='col-12 col-lg-4 mb-3 order-3 order-lg-1']/div/div[@class='row']//span[.='Save Draft']")
public WebElement DraftOrder;


@FindBy(xpath="//span[contains(text(),'Place Order')]")
public WebElement PlaceOrderBtn;

@FindBy(xpath="//h1[contains(text(),'Order Successful')]")
public WebElement OrderSuccess;

@FindBy(xpath="//h3[contains(text(),'Confirmation Number: RH220402154239')]")
public WebElement confirmationNumber;

@FindBy(xpath="//div[@id='contentArea']/div[2]/div[@class='row']/div[2]/div[1]/div[@class='col-12 right-container']/div//"
		+ "img[@src='https://media.srsdistribution.com/Uploads/BrandsByID/19.png']")
public WebElement Logo;



public NewOrderPage2()

	{
		PageFactory.initElements(getDriver(), this);	
		
	
	}

//actions

public void selectBranch()
{
	Select s2= new Select(Branch);
	s2.selectByIndex(1);
	
}

public void selectJobAccount()
{
	JobAccount.click();
    Select s1=new Select(JobAccount);
	s1.selectByIndex(2);
	
}

public void PickupDates() throws InterruptedException
{
	/*PickupDate.click();
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript ("arguments[0].removeAttribute('readonly')",PickupDate);
	PickupDate.sendKeys("03/31/2021");*/

		PickupDate.click();
		while (!getDriver()
				.findElement(By.xpath("//span[@class='day__month_btn up']"))
				.getText().equalsIgnoreCase("Apr 2022")) {
			getDriver().findElement(By.xpath("(//span[@class='next'])[1]")).click();

		}
		Thread.sleep(2500);

		getDriver().findElement(By.xpath(".//span[@class='cell day' and .='20']")).click();

		
	}


public void selectArrivaltime()
{
	ArrivalTime.click();
	Select s1=new Select(ArrivalTime);
	s1.selectByIndex(2);

}

public void instructionsInput() {
	instructions.click();
	instructions.sendKeys("Delivery at mentioned locations...");
}

public void emailAdd() {
	emailID.click();
    emailID.sendKeys("Singh.rishabh@thinksys.com");

}


public void clickOrderTemplate()
{
	MyOrderTemplate.click();
	
}

public void selectTemplate()
{
	SelectTemplate.click();
}

public void ReviewOrderClick()
{
	ReviewOrderBtn.click();
}

public void CancelOrder()
{
	//Cancel.click();
	action.moveToElement(Cancel).click().build().perform();	
}

public void DraftOrder()
{
	DraftOrder.click();
}

public void PlaceOrderClick()
{
	PlaceOrderBtn.click();
}


public WebElement Logo()
{
	return Logo;
}
}




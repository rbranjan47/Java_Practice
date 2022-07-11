package com.roofhub.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.roofhub.qa.base.BaseClass;


public class templatePage extends BaseClass {


    @FindBy(xpath = "//input[@placeholder='Enter template name']")
    public WebElement TempName;

    @FindBy(xpath = "//textarea[@placeholder='Enter a brief description']")
    public  WebElement desc;

    @FindBy(xpath = "(//label[@class='checkbox-in-line d-inline-block pt-2'])[2]")
    public WebElement QTYChk;

    @FindBy(xpath = "(//input[@placeholder='Enter Item Description'])[1]")
    public WebElement item1;

    @FindBy(xpath = "(//input[@placeholder='Enter Item Description'])[2]")
    public WebElement item2;

    @FindBy(xpath = "(//input[@placeholder='Enter Item Description'])[3]")
    public WebElement item3;

    @FindBy(xpath = "(//input[@placeholder='Enter Item Description'])[4]")
    public WebElement item4;

    @FindBy(xpath = "(//*[@data-vv-as='Quantity'])[1]")
    public WebElement Qty1;

    @FindBy(xpath = "(//*[@data-vv-as='Quantity'])[2]")
    public WebElement Qty2;

    @FindBy(xpath = "(//*[@data-vv-as='Quantity'])[3]")
    public WebElement Qty3;

    @FindBy(xpath = "(//*[@data-vv-as='Quantity'])[4]")
    public WebElement Qty4;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    public WebElement Email;

    @FindBy(xpath = "//span[contains(text(),'Save Template')]")
    public WebElement SaveTemp;
    
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement successMessage;
    
    public templatePage() {
            PageFactory.initElements(getDriver(), this);
    }

    public void TemplateName(String tempname) {
            TempName.sendKeys(tempname);
    }

    public void Templatedesc() {
    	desc.sendKeys("Template description is written by Automated test script....");
    }

    public void TemplateQTYCHL() {
            QTYChk.click();
    }

    public void tempitm1() throws InterruptedException {
            item1.sendKeys("OC SUPREME 25 AR 3 BD/SQ");
            Thread.sleep(2000);
            Qty1.sendKeys("12");
    }

    public void tempitm2() throws InterruptedException {
            item2.sendKeys("ATLAS H&R PRO-CUT 31 LF/BD");
            Thread.sleep(2000);
            Qty2.sendKeys("20");
    }

    public void tempitm3() throws InterruptedException {
            item3.sendKeys("CT PRESIDENTIAL STARTER 36 LF/BD");
            Thread.sleep(2000);
            Qty3.sendKeys("17");
    }

    public void tempitm4() throws InterruptedException {
            item4.sendKeys("ATLAS SUMMIT 60 10 SQ/RL");
            Thread.sleep(2000);
            Qty4.sendKeys("62");
    }

    public void TempEmail() {
            Email.sendKeys("Singh.rishabh@thinksys.com");

    }

    public void TempSave() {
            SaveTemp.click();
    }
    
    public String successTemplate() {
    	return successMessage.getText();
    }
}


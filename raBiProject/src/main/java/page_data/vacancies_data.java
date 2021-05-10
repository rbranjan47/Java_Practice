package page_data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vacancies_data 
{
	WebDriver driver;
	
	//Web-Elements
	public static By requirements = By.xpath("//b[contains(text(),'Recruitment')]");
	public static By candidates = By.xpath("//a[contains(text(),'Candidates')]");
	public static By add_btn = By.xpath("//input[@id='btnAdd']");
	public static By first_name = By.xpath("//input[@id='addCandidate_firstName']");
	public static By middle_name = By.xpath("//input[@id='addCandidate_middleName']");
	public static By last_name = By.xpath("//input[@id='addCandidate_lastName']");
	public static By email = By.xpath("//input[@id='addCandidate_email']");
	public static By contact_no = By.xpath("//input[@id='addCandidate_contactNo']");
	public static By job_vacancy = By.xpath("//select[@id='addCandidate_vacancy']");
	public static By resume_upload = By.xpath("//input[@id='addCandidate_resume']");
	public static By keywords = By.xpath("//input[@id='addCandidate_keyWords']");
	public static By comments = By.xpath("//textarea[@id='addCandidate_comment']");
	//clicking on the calender field
	public static By calender_feild = By.xpath("//input[@id='addCandidate_appliedDate']");
	public static By consent_keep_data = By.xpath("//input[@id='addCandidate_consentToKeepData']");
	public static By save_button = By.xpath("");
	//getting value from saved data
	public static By saved_details = By.xpath("//table[@id='resultTable']/tbody");
	public static By back_button = By.xpath("//input[@id='btnBack']");
	
	//initializing the driver
	public vacancies_data(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement requirements_element()
	{
		return driver.findElement(requirements);
		
	}

	public WebElement candidates_element()
	{
		return driver.findElement(candidates);
		
	}

	public WebElement add_btn_element()
	{
		return driver.findElement(add_btn);
		
	}

	public WebElement first_name_element()
	{
		return driver.findElement(first_name);
		
	}

	public WebElement middle_name_element()
	{
		return driver.findElement(middle_name);
		
	}

	public WebElement last_name_element()
	{
		return driver.findElement(last_name);
		
	}

	public WebElement email_element()
	{
		return driver.findElement(email);
		
	}

	public WebElement contact_no_element()
	{
		return driver.findElement(contact_no);
		
	}

	public WebElement job_vacancy_element()
	{
		return driver.findElement(job_vacancy);
		
	}

	public WebElement resume_upload_element()
	{
		return driver.findElement(resume_upload);
		
	}
	public WebElement keywords_element()
	{
		return driver.findElement(keywords);
		
	}
	
	public WebElement comments_element()
	{
		return driver.findElement(comments);
		
	}
	
	public WebElement enroll_date_element(String date)
	{
		return driver.findElement(By.xpath("//a[contains(text(),'"+date+"')]"));
		
	}
	
	public WebElement calender_feild_element()
	{
		return driver.findElement(calender_feild);
		
	}
	
	public WebElement consent_keep_data_element()
	{
		return driver.findElement(consent_keep_data);
		
	}
	
	public WebElement save_button_element()
	{
		return driver.findElement(save_button);
		
	}
	
	public WebElement saved_details_element()
	{
		return driver.findElement(saved_details);
		
	}
	
	public WebElement back_button_element()
	{
		return driver.findElement(back_button);
		
	}
}

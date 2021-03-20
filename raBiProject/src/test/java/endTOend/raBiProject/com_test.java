package endTOend.raBiProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class com_test extends base
{
	@Test
	public void pageNavigation() throws IOException, InterruptedException
	{
		driver=Initializer();
		driver.get("http://www.qaclickacademy.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='sumome-react-svg-image-container']/../../../div/div/div[2]")).click();
		
		
	}
}

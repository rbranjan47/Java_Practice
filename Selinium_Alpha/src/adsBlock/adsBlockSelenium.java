package adsBlock;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class adsBlockSelenium {

    @Test
    public void adsBlocksUsingExtensions() throws InterruptedException, AWTException {
        // Issue with chrome launch websocket
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.addExtensions(new File("./extensions/AdBlock_extension_5_8_0_0.crx"));
        //String chromePath = SeleniumManager.getInstance().getDriverPath("chromedriver");
        //System.setProperty("webdriver.chrome.driver", chromePath);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.javatpoint.com/java-tutorial");
        
        Robot robotObj = new Robot();
        robotObj.keyPress(KeyEvent.VK_CONTROL);
        robotObj.keyPress(KeyEvent.VK_SHIFT);
        robotObj.keyPress(KeyEvent.VK_SHIFT);
        robotObj.keyRelease(KeyEvent.VK_CONTROL);
        robotObj.keyRelease(KeyEvent.VK_SHIFT);
        robotObj.keyRelease(KeyEvent.VK_SHIFT);
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(20000));
        Alert alerts = waits.until(ExpectedConditions.alertIsPresent());

        Thread.sleep(5000);
        driver.quit();

    }
}

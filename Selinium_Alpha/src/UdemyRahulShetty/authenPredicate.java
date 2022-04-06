package UdemyRahulShetty;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.URI;
import java.util.function.Predicate;

public class authenPredicate {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Predicate<URI> uriContains = uri -> uri.getHost().contains("https://the-internet.herokuapp.com"); 
		Predicate<URI> uriPredicate = uri -> uri.getHost().contains("http://httpbin.org");
		
		//casting driver into HasAuthentication
		((HasAuthentication)driver).register(uriPredicate, UsernameAndPassword.of("foo", "bar"));
		driver.get("http://httpbin.org/basic-auth/foo/bar");
	
	}
}

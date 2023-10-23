package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
              
	public static void main(String[] args) {
		
		// launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/");
		
		// identify usernameTB
		driver.findElement(By.name("username")).sendKeys("admin");
		
		
	}
}

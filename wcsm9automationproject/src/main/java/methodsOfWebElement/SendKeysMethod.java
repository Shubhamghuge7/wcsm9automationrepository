package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/");
		// click on usernameTB
		WebElement useTB = driver.findElement(By.name("username"));
		useTB.sendKeys("admin");
		Thread.sleep(2000);
		WebElement passTB = driver.findElement(By.name("password"));
		passTB.sendKeys("admin123");
	}

}

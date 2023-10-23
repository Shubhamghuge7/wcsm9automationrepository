package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://www.instagram.com/accounts/login/");
		// click on usernameTB
	    // WebElement useTB = driver.findElement(By.name("username"));
	    // useTB.sendKeys("admin");
	    // Thread.sleep(2000);
		// WebElement passTB = driver.findElement(By.name("password"));
		// passTB.sendKeys("admin123");
		// Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement useTB = driver.findElement(By.name("username"));
		useTB.sendKeys("admin");
		Thread.sleep(2000);
		WebElement passTB = driver.findElement(By.name("password"));
		passTB.sendKeys("admin123");
		Thread.sleep(2000); 
		 // clear the usernameTB and passwordTB
		 useTB.clear();
		 passTB.clear();
	}

}

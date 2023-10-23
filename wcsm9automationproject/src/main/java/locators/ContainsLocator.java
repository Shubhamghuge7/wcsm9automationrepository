package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		// Identify usernameTB and pass input
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]")).sendKeys("automation_geeks7");
		
        // Identify passwordTB and pass input
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("Auto@7");
		
		// Identify login button and click
		driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
		Thread.sleep(2000);
        driver.quit();
	}

}

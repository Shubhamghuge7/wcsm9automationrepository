package synchroniazationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		// Identify usernameTB
		driver.findElement(By.name("username")).sendKeys("admin");
		
		// Identify passwordTB
		driver.findElement(By.name("password")).sendKeys("admin345");
		
		// Identify login button
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}

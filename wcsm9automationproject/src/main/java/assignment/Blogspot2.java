package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blogspot2 {
	
	// How to close only parent browser

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		driver.close();
	}
}

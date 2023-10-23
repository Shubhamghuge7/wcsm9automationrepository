package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blogspot3 {
	
	// How to close only child browser
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(2000);
		String parentHandle = driver.getWindowHandle();
		System.out.println("Address of parent browser: "+parentHandle);
		
		//click on pop up window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		//get the address of parent browser as well as child browser
		Set<String> allHandle = driver.getWindowHandles();
		System.out.println(allHandle);
		for (String wh:allHandle) {
			if(!parentHandle.equals(wh)) {
				System.out.println("Address of child window: "+ wh);
				// driver.switchTo().window(wh).close(); // switch control to child woindow and close
				Thread.sleep(2000);
				TargetLocator switchTo = driver.switchTo();
				switchTo.window(wh).manage().window().maximize(); // maximise the child window popup
				Thread.sleep(2000);
				switchTo.window(wh).close(); // close only the child window
			}
		}
		
		
		
		
	}

}

package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to launch chrome driver we need to create obj of chrome browser
		WebDriver driver=new ChromeDriver();
		//to maximise the size of the browser
		driver.manage().window().maximize();
		//to stop the execution of script for 2 sec
		Thread. sleep(2000);
		//close the browser
		driver.close();
		 
		 
		
	}

}

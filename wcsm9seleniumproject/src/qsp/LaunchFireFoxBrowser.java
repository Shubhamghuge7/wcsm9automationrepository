package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the Firefox Browser
		WebDriver driver=new FirefoxDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//stop the execution of script for 2 sec
		Thread.sleep(2000);
		//close the browser
		driver.close();
	}

}

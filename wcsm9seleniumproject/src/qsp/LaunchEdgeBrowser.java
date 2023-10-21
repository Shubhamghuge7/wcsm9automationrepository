package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the EdgeBrowser
		WebDriver driver = new EdgeDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//stop the execution of script for 2 sec
		Thread.sleep(2000);
		//close the browser
		driver.close();
				
	}

}

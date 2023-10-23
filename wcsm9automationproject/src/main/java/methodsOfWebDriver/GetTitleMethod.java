package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		// to get title of webpage from above taskbar
		String titlepage = driver.getTitle();
		System.out.println(titlepage);
		
		// to get current page url into string format
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}

}

package methodsOfWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("iphone");
		
		Thread.sleep(2000);
		
		// get the suggestion of iphone
		List<WebElement> allphone = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(WebElement phone:allphone)
		{
			System.out.println(phone.getText());
		}
		
		
	}

}

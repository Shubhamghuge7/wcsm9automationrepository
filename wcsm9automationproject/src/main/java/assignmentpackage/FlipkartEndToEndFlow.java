package assignmentpackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndToEndFlow {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[contains(@title,'Search ')]")).click();
		//get the address of parent window
		String parentwh = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String wh:allhandles) {
			if ()
		}
		
	}

}

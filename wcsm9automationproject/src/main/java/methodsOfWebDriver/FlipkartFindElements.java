package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		// handle the popup
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		//search for laptop in  searchbox
		driver.findElement(By.name("q")).sendKeys("laptops");
		//click on search icon
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		// click on brand and select hp
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV'and (text()='HP')]")).click();
		// click on core 7 from processor
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='13 MORE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV'and (text()='Core i7')]")).click();
		// Click on os and select the windows 11
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();

		// select the 4 and above customer rating
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		
		
		
		
	}
}

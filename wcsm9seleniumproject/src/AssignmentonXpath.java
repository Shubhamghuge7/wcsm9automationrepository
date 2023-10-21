import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentonXpath {
	
	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		// handle hidden division pop up
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		// identify search box
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
		
		
		
	
	}

}

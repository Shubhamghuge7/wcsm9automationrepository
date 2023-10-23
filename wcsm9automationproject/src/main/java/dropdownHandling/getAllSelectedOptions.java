package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Administrator/Desktop/wcsm9WebElement/Multi%20select%20dropdown.html");
		
		
		
		//multi select Dropdown
		WebElement menuDropdown = driver.findElement(By.id("iddd"));
		Select sel = new Select(menuDropdown);
		
		// select the multiple options from menu dropdown
		for(int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
			
			}
		// read the list by using for loop
		for (int i=0;i<allOpts.size();i++)
		{
			
		}
		
		
		
		
	}

}

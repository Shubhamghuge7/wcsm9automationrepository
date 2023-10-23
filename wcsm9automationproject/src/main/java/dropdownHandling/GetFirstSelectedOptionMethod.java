package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Administrator/Desktop/wcsm9WebElement/Multi%20select%20dropdown.html");
		
		//single select dropdown
		WebElement dropdown1 = driver.findElement(By.id("iddd"));
		
		// handle the dropdown
		Select sel = new Select(dropdown1);
		//select the option from dropdown
		sel.selectByValue("v7");
		Thread.sleep(2000);
		
		//get the option which is selected first
		WebElement firstOpt = sel.getFirstSelectedOption();
		// get the text of firstOpt
		System.out.println(firstOpt.getText());
		
		// multi select dropdown
		//driver.navigate().to("file:///C:/Users/Administrator/Desktop/wcsm9WebElement/Multi%20select%20dropdown.html");
		 driver.get("file:///C:/Users/Administrator/Desktop/wcsm9WebElement/Multi%20select%20dropdown.html");
		// identify dropdown
		WebElement dropdown2 = driver.findElement(By.id("iddd"));
		
		// handle the multi select dropdown
		Select sel2 = new Select(dropdown2);
		
		// select multiple option from multi select dropdown
		for(int i=5;i<8;i++)
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
		}
		System.out.println(sel2.getFirstSelectedOption().getText());
	}

}

package dropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EleminateDuplicates {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Administrator/Desktop/wcsm9WebElement/Single%20select%20dropdown.html");
		 
		// identifyb the dropdown and store it in ref variable
		WebElement menuDropdown = driver.findElement(By.id("iddd"));
		
		// get all the options of menudropdown
		Select sel = new Select(menuDropdown);
		List<WebElement> allOps = sel.getOptions();
		
		// to eliminate duplicates we use Hashset
		HashSet<String> hs = new HashSet<String>();
		 
		// read the list by using for loop and eliminate duplicates
		for(int i=0;i<allOps.size();i++)
		{
			WebElement op = allOps.get(i);
			
			// get the text of web element
			String dropDownOption = op.getText();
			System.out.println(dropDownOption);
			Thread.sleep(2000);
			
			//add the dropdown into Hashset and remove duplicate from dropdown
			hs.add(dropDownOption);
			
		}
		Thread.sleep(2000);
		for(String opt:hs) 
		{
			Thread.sleep(2000);
			System.out.println(opt);
		}
		6+
	}

}

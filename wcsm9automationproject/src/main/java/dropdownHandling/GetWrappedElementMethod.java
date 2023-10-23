
package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Administrator/Desktop/wcsm9WebElement/Multi%20select%20dropdown.html");
		
		//single select dropdown
		WebElement dropdown1 = driver.findElement(By.id("iddd"));
		
		// handle dropdown
		Select sel = new Select(dropdown1);
		
		// get all the options by using get wrapped element
		WebElement allOpts = sel.getWrappedElement();
		System.out.println(allOpts.getText());
		
		//  get all the options by using get options
	    List<WebElement> options = sel.getOptions();
	    
	    // get the all the options without selection
	   for (WebElement opt:options)
	   {
		   Thread.sleep(2000);
		   if(opt.getText().equals("vadapav"))
		   {
			   opt.click();
			   break;
		   }
	   }
	}
               
}

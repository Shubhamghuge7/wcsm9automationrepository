package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_GetCssValue_GetTagNameMethod {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// get the attribute value of usernameTB i.e name attribute
		WebElement useTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String attributevalue = useTB.getAttribute("class");
		System.out.println(attributevalue);
		
		// get the css property of usernameTB i.e colour,height,widtch,font,fontsize etc
		String cssValue = useTB.getCssValue("height");
		System.out.println(cssValue);
		
		// get the Tagname of usernameTb
		String tag = useTB.getTagName();
		System.out.println(tag);
	}

}
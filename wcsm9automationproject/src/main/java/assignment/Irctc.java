package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	
    Thread.sleep(2000);
    driver.switchTo().activeElement().sendKeys("pune");
    driver.findElement(By.xpath("//a[contains(@class,'fa fa-window-close pull-right loginCloseBtn ng-tns-c19-17')]")).click();
    
	}
	
	
}
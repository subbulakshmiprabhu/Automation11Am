package script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for( int i = 0; i<checkboxes.size();i++) {
//			
//			checkboxes.get(i).click();
//			
//		}
//		
		
		
//	List<	WebElement> link = driver.findElements(By.tagName("a"));
//	System.out.println(link.size());
	
//	WebElement input = driver.findElement(By.className("gLFyf"));
//		
//	input.sendKeys("selenium");
//	
//	input.sendKeys(Keys.ENTER);
//	Thread.sleep(5000);    //5s	
		
	//	WebElement input = driver.findElement(By.xpath("//input[@ id = 'email']"));
		//input.sendKeys("selenium");

//driver.close();
		
	}

}

package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import script.Browser;

public class SendKeysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		//driver.findElement(By.linkText("Register")).click();
		driver.manage().window().maximize();
		
		WebElement register = driver.findElement(By.linkText("Register"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].click();", register);
		
		WebElement fname = driver.findElement(By.id("FirstName"));
		
		WebElement male = driver.findElement(By.id("gender-male"));
		
		

		
		jse.executeScript("arguments[0].click();arguments[1].value='Selenium';", male, fname);
		
		
	}

}

package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import script.Browser;

public class ScrollDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://en.wikipedia.org/wiki/India");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,3000);");
		
		WebElement govt = driver.findElement(By.xpath("//span[@id = 'Government']"));
		
		jse.executeScript("arguments[0].scrollIntoView(true);", govt);
		

	}

}

package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import script.Browser;

public class DoubleClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement field1 = driver.findElement(By.id("field1"));
		field1.clear();
		field1.sendKeys("selenium");
		WebElement copyBtn = driver.findElement(By.xpath("//button[text() = 'Copy Text']"));
		
		Actions act  = new Actions(driver);
		act.doubleClick(copyBtn).perform();
	}

}

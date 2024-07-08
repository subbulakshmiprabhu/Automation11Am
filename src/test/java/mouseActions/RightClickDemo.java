package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import script.Browser;

public class RightClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://www.google.com/");
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		Actions act = new Actions(driver);
		act.contextClick(gmail).perform();


	}

}

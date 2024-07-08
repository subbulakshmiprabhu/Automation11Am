package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import script.Browser;

public class KeyBoadrActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		act.sendKeys(email, "Selenium.gamil.com").perform();
		
		//ctrl+a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		
		//ctrl+c
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//tab
		
		act.sendKeys(Keys.TAB).perform();
		
		//ctrl+v
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//double tab
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		
	}

}

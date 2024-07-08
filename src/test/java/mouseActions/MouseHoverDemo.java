package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import script.Browser;

public class MouseHoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://www.amazon.com/");
		WebElement accnt = driver.findElement(By.xpath("//span[@class = 'nav-line-2 ']"));
		WebElement order = driver.findElement(By.xpath("//span[text() = 'Orders']"));
		
		//Mouse hover
	
		Actions act = new Actions(driver);
		act.moveToElement(accnt).perform();
		act.moveToElement(order).click().perform();

	}

}

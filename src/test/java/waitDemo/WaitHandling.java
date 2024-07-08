package waitDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import script.Browser;

public class WaitHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://www.google.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement input = driver.findElement(By.name("q"));
		//input.sendKeys("selenium");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement inputbox = wait.until(ExpectedConditions.elementToBeClickable(input));
		inputbox.sendKeys("selenium");
		
Alert alrt = wait.until(ExpectedConditions.alertIsPresent());
alrt.accept();
	}

}

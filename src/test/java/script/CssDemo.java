package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		//id used in cssselector
		//WebElement inputUser = driver.findElement(By.cssSelector("input#email"));
		
		//css selector using class name and child attrivute
		//WebElement inputUser = driver.findElement(By.cssSelector("div._6lux>*"));
		
		//Multiple classname used in css selector
		//WebElement inputUser = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy"));
		//Using attrName and Value
		WebElement inputUser = driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
		inputUser.sendKeys("Selenium");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}

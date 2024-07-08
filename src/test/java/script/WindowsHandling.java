package script;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowsHandling {
	
	public static void main(String[] args) {
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement inputBox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		inputBox.sendKeys("selenium");
		inputBox.sendKeys(Keys.ENTER);
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id = 'wikipedia-search-result-link']/a"));
		for(WebElement link :allLinks) {
			link.click();
		}
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		Set<String> allHandles = driver.getWindowHandles();
//		for(String curHandle :allHandles) {
//			driver.switchTo().window(curHandle);
//			String title = driver.getTitle();
//			if(title.equals("Selenium - Wikipedia")) {
//			System.out.println(title);
//			driver.close();
//			}
//		}
		
		//We can convert set to list
		
		List<String> l = new ArrayList<>(allHandles);
		
//		for(String s: l) {
//			driver.switchTo().window(s);
//			driver.close();
//			
//		}
		
		
		driver.switchTo().window(l.get(3));  //Switch to window using index
		System.out.println(driver.getTitle());
		
	}

}

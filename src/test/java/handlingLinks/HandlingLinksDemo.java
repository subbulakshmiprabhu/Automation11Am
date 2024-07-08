package handlingLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import script.Browser;

public class HandlingLinksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://www.softwaretestingmaterial.com/");
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		int sum = 0;
		
		for(WebElement atag:allLinks) {
			String urlStr = atag.getAttribute("href");
			int count = HelperBrokenLinkCheck.brokenLinkChecker(urlStr);
			sum = sum+count;
		}System.out.println("Total broken links: "+sum);

	}

}

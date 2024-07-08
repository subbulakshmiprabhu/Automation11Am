package script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = Browser.browserSetUp("chrome");
     driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
     WebElement dropdownBtn = driver.findElement(By.id("dropdownMenuButton"));
     
     dropdownBtn.click();
     List<WebElement> menuItems = driver.findElements(By.xpath("//div[@class = 'dropdown-menu show']/child::*"));
     //Thread.sleep(2000);
    // menuItems.get(0).click();
     for(WebElement opt :menuItems) {
    	 System.out.println(opt.getText());
    	 
     }
	}

}

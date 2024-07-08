package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import script.Browser;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement minslider = driver.findElement(By.xpath("(//span[@class ='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		WebElement maxslider = driver.findElement(By.xpath("(//span[@class ='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		Point location = minslider.getLocation();
		System.out.println(location);
		Point location2 = maxslider.getLocation();
		System.out.println(location2);
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(minslider, 100, 250).perform();
		act.dragAndDropBy(maxslider, -50, 250).perform();
		
	}

}

package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import script.Browser;

public class DragAndDropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement italy = driver.findElement(By.id("box106"));
		WebElement rome = driver.findElement(By.id("box6"));
		
		WebElement us = driver.findElement(By.id("box103"));
		WebElement washinton = driver.findElement(By.id("box3"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(washinton, us).dragAndDrop(rome, italy).build().perform();
		//act.dragAndDrop(rome, italy).perform();

	}

}

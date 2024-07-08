package mouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import script.Browser;

public class KeyboardRobotDemo {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://www.google.com/");
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
        Actions act = new Actions(driver);
        act.moveToElement(gmail).contextClick().build().perform();
        
        Robot r = new Robot();
        
        for(int i =1 ; i<=3;i++) {
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        }
        
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

	}

}

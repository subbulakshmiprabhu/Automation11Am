package script;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlartHandling {
	
	
	public void alert() {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://letcode.in/alert");
		WebElement altBtn  = driver.findElement(By.id("accept"));
		altBtn.click();		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		WebElement confirmBtn = driver.findElement(By.id("confirm"));
		confirmBtn.click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		
		
		WebElement promptBtn = driver.findElement(By.id("prompt"));
		
		promptBtn.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("selenium");
		System.out.println(alert3.getText());
		alert3.accept();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlartHandling aHandle = new AlartHandling();		
		aHandle.alert();
	}

}

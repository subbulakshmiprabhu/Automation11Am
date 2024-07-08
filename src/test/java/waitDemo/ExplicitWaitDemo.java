package waitDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/waits");
		
		driver.findElement(By.id("accept")).click();
		System.out.println("bttn");
		//Alert alrt = driver.switchTo().alert();
		//alrt.accept();
		
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		
		Alert alrt = wait.until(ExpectedConditions.alertIsPresent());
		alrt.accept();

	}

}

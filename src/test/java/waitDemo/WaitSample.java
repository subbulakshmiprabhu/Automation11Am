package waitDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitSample {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Using Implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("Admin");
//		
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("admin123");
//		
//		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		
		
//		Using Explicit wait
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement user = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
//		user.sendKeys("Admin");
//		
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("admin123");
//		
//		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		
		//using fluent wait
		
		  Wait<WebDriver> wait = new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(30)) // Set maximum wait time
	                .pollingEvery(Duration.ofSeconds(5)) // Check every 5 seconds
	                .ignoring(NoSuchElementException.class) // Ignore NoSuchElementException
	                .ignoring(TimeoutException.class); // Ignore TimeoutException

	        		WebElement inputUser = wait.until(new Function <WebDriver,WebElement>(){

						@Override
						public WebElement apply(WebDriver driver) {
							// TODO Auto-generated method stub
							
							return driver.findElement(By.name("username"));
						}
	        			
	        			
	        		});
	        		
	        		inputUser.sendKeys("selenium");
		
		
		
	}

}

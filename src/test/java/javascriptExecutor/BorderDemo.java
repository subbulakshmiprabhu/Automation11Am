package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import script.Browser;

public class BorderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//Draw border over element
		
		jse.executeScript("arguments[0].style.border='3px solid red';", email);
		
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		
		String loginColor = loginBtn.getCssValue("color");
		System.out.println(loginColor);
		
		String loginBgColor = loginBtn.getCssValue("background-color");
		System.out.println(loginBgColor);
		
		
		String newColor = "rgb(86, 252, 3)";
		for(int i =1; i<=100;i++) {
			jse.executeScript("arguments[0].style.backgroundColor='"+loginBgColor+"';", loginBtn);
			
		jse.executeScript("arguments[0].style.backgroundColor='"+newColor+"';", loginBtn);
		}
		
	}

}

package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com/");
        WebElement inputBox = driver.findElement(By.name("q"));
        inputBox.sendKeys("selenium");
        String typedText = inputBox.getAttribute("value");
        System.out.println(inputBox.getAttribute("id")); // return id value
        System.out.println(inputBox.getAttribute("class"));
        System.out.println(typedText);
        
        WebElement link = driver.findElement(By.linkText("Gmail"));
       System.out.println( link.getText());
       System.out.println(link.getAttribute("innerHTML"));// Returns visible text
	}

}

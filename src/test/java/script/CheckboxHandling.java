package script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://testautomationpractice.blogspot.com/");  
	     
	     WebElement checkBox = driver.findElement(By.id("sunday"));
	   //  checkBox.click();
	     boolean test = checkBox.isSelected();	     
	     System.out.println(test);  //returns true
	     
	     WebElement checkBox1 = driver.findElement(By.id("monday"));
	     System.out.println(checkBox1.isSelected());//returns false
	     
	     
	     List<WebElement> listOfCheck = driver.findElements(By.xpath("//input[contains(@id, 'day')]"));
//	     for(int i=0; i<listOfCheck.size();i++) {
//	    	 listOfCheck.get(i).click();
//	    	 
//	     }
//	     
	     for(WebElement element:listOfCheck) {
	    	 element.click();
	     }

	}

}

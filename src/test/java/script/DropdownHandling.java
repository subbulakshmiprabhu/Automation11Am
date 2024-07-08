package script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://letcode.in/dropdowns");
		WebElement dropdown = driver.findElement(By.id("fruits"));
		Select s =new Select(dropdown);
		//s.selectByIndex(1);
		//s.selectByValue("3");
		s.selectByVisibleText("Orange");
		List<WebElement> options = s.getOptions();
//		for(WebElement opt :options) {
//			System.out.println(opt.getText());
//		}
		
		WebElement dropdown1 = driver.findElement(By.id("superheros"));
		Select  s1 = new Select(dropdown1);
		s1.selectByIndex(1);
		s1.selectByValue("bt");
		s1.selectByVisibleText("Daredevil");
		
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
//		for(WebElement opt:allSelectedOptions) {
//			System.out.println(opt.getText());
//		}
		
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		s1.deselectByIndex(1);
		s1.deselectByValue("bt");
		s1.deselectByVisibleText("Daredevil");

	}

}

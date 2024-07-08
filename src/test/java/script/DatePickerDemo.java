package script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement inputDate = driver.findElement(By.id("datepicker"));
		//inputDate.sendKeys("04/07/2024");
		inputDate.click();
		//mm//dd/yyyy
		String mon = "June";
		String date = "30";
		String year = "2024";
		
		while(true){
			
			String month = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();
			
			
			String yr = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && year.equals(yr)) {
				break;
				
			}
			
			
			WebElement nextBtn = driver.findElement(By.xpath("//span[text() = 'Next']"));
			
			nextBtn.click();
			
			
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tr/td[a]"));
		
		for(WebElement dateElement: allDates) {
			
			String dateStr = dateElement.getText();
			
			if(dateStr.equals(date)) {
				
				dateElement.click();
				
			}
			
			
		}
		
		
		
		

	}

}

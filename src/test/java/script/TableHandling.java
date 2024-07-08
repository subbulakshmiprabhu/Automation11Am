package script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = Browser.browserSetUp("chrome");
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		
//		WebElement tableData = driver.findElement(By.xpath("//table[@id = 'customers']//tr[2]/td[2]"));
//		
//        System.out.println(tableData.getText());
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> datas = driver.findElements(By.xpath("//table[@name= 'BookTable']//tr/td[4]"));
		int sum = 0;
		for(WebElement data : datas) {
			String text = data.getText();
			int num = Integer.parseInt(text);
			sum =sum+num;
		}System.out.println(sum);
	}

}

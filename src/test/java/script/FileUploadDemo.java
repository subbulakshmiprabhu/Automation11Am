package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement chooseFile = driver.findElement(By.name("upfile"));
		chooseFile.sendKeys("D:\\Demo\\selenium notes\\testFile.txt");
		WebElement pressBtn = driver.findElement(By.xpath("//input[@value = 'Press']"));
		pressBtn.click();

	}

}
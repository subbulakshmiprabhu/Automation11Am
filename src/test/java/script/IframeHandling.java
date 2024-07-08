package script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframeHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("singleframe");
		driver.switchTo().frame(0);
		WebElement inputBox = driver.findElement(By.xpath("//input[@type ='text']"));
		inputBox.sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		WebElement linkBtn = driver.findElement(By.xpath("//a[text() ='Iframe with in an Iframe']"));
		linkBtn.click();
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
		
		driver.switchTo().frame(outerFrame);
		
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));
		
		driver.switchTo().frame(innerFrame);
		
		WebElement inputBox1 = driver.findElement(By.xpath("//input[@type ='text']"));
		inputBox1.sendKeys("Selenium");
		
		driver.switchTo().parentFrame();
		
		WebElement textElemnt = driver.findElement(By.xpath("//h5[text() ='Nested iFrames']"));
		System.out.println(textElemnt.getText());
		
		driver.switchTo().defaultContent();
		
		List<WebElement> iframesList = driver.findElements(By.tagName("iframe"));
		System.out.println(iframesList.size());
		
	}

}

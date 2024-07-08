package script;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotDemo {
	
	
	public static void completeScreenshot() throws AWTException, IOException {
		Robot r = new Robot();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(screenSize);
		BufferedImage image = r.createScreenCapture(rect);
		
		File dest = new File("./screenshot/robot"+System.currentTimeMillis()+".png");
		
		ImageIO.write(image, "png", dest);
		
	}
	
	public static void CaptureScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot tks = (TakesScreenshot) driver;  //cating to TakesScreenshot
		File temp = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/facebook"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(temp, dest);
		
	} 

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = Browser.browserSetUp("chrome");
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Oranium");
		//CaptureScreenshot(driver);
		completeScreenshot();
		driver.findElement(By.id("pass")).sendKeys("1234");
		//CaptureScreenshot(driver);
		completeScreenshot();
		driver.findElement(By.xpath("//button[text() ='Log in']")).click();
		
		

	}

}

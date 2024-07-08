package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		//options.setHeadless(true);
		options.addArguments("incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(currentUrl);

	}

}

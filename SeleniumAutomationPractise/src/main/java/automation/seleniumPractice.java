package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("opened successfully");
		
		
		
		
		
		
	}

}

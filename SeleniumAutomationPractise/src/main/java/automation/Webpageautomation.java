package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Link;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Webpageautomation{
	
	public  void spicejet() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@value='Hyderabad (HYD)']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
		
		
		
		//driver.findElement(By.xpath("//div[text()='Cities']"));
		
		WebElement eleee = driver.findElement(By.xpath("//div[text()='Cities']"));
	
	
		
	}

}

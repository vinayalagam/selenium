package automation;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Hyrtutorials {
	@Test
	public static void handlingwindows() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Window Handles')]"));
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Selenium Practice')]"))).click(ele)
	.build().perform();
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		
//windows handling
		/*String parentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		Iterator< String> itr = allwindows.iterator();
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if(!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				//driver.close();
				 * }
				 * }
				driver.switchTo().window(parentwindow);
				*/
				
		
	String parentwindow = driver.getWindowHandle();

	driver.findElement(By.xpath("(//button[contains(text(),'Window')])[1]")).click();
	Set<String>allwindows =driver.getWindowHandles();
	Iterator<String>itr=allwindows.iterator();
	while(itr.hasNext()) {
	String childwindow=itr.next();
	if(!parentwindow.equalsIgnoreCase(childwindow)) {
		driver.switchTo().window(childwindow);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
			}
		}
	
	
	
	
	
	
}
	}


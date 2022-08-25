package automation;



import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicyjet {
	@Test
	public static void flight() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[text()='From']")).click();
		List<WebElement> li = driver.findElements(By.xpath("//div[text()='Cities']/ancestor::div[2]/div[2]/div/div/div/div"));
		for(WebElement abc:li) {
			if(abc.getText().equals("Agra")) {
				abc.click();
				break;
			}
		}
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(text(),'Cities')]/ancestor::div[2]/div[2]/div/div/div/div")));
		List<WebElement> ui = driver.findElements(By.xpath("//div[contains(text(),'Cities')]/ancestor::div[2]/div[2]/div/div/div/div"));	
				for (WebElement aa:ui) {
					if(aa.getText().equals("Goa")) {
						aa.click();
					System.out.println("b");	
						break;
		   }
	    }
				WebElement ele =driver.findElement(By.xpath("//div[text()='Departure Date']/ancestor::div[1]"));
				JavascriptExecutor jav = (JavascriptExecutor)driver;
				jav.executeScript("arguments[0].click();",ele);
		 // driver.findElement(By.xpath("//div[text()='Departure Date']/ancestor::div[1]")).click();
		  //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@data-testid='undefined-calendar-picker']/div[@data-focusable='true'])[1]")));
		  System.out.println("n"); 
		  try { 
			  if(driver.findElement(By.xpath("//div[@data-testid='undefined-month-December-2022']/div[1]/div[1]")).isDisplayed()) {
				 driver.findElement(By.xpath("//div[@data-testid='undefined-month-December-2022']/div[3]/div//div[text()='10']")).click();
				 } 
		  } catch(Exception e) { 
			  for(int i=0;i<=10;i++){
		  driver.findElement(By.xpath("(//div[@data-testid='undefined-calendar-picker']/div[@data-focusable='true'])[1]")).click();
		  if(driver.findElement(By.xpath("//div[@data-testid='undefined-month-December-2022']/div[1]/div[1]")).isDisplayed()) { 
		  driver.findElement(By.xpath("//div[@data-testid='undefined-month-December-2022']/div[3]/div//div[text()='10']")).click();
		  
		  break;
		  }
			  }		
			  WebElement ela = driver .findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']"));
			jav.executeScript("arguments[0].click();",ela); 
			  try {
				if(driver.findElement(By.xpath("//div[text()='January ']")).isDisplayed()) {
			       driver.findElement(By.xpath("//div[@undefined-calendar-day-1='undefined-calendar-day-1']")).click();
			       System.out.println("xyz");
				 }
			  }
			  catch(Exception b) {
				  for(int j=0; j<=10; j++) {
					  driver.findElement(By.xpath("(//div[@data-testid='undefined-calendar-picker']/div[@data-focusable='true'])[1]")).click();
					if(driver.findElement(By.xpath("//div[text()='January ']")).isDisplayed()) { 
					  driver.findElement(By.xpath("//div[@undefined-calendar-day-1='undefined-calendar-day-1']")).clear();
					  break;
					}
				  }
			  }
		  }
	}
	
}

					  
	








				
	



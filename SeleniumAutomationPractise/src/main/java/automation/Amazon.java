package automation;

import static org.testng.AssertJUnit.assertArrayEquals;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	@Test
	public static void loginpage() throws IOException, InterruptedException {
		Properties pro = new Properties();
		FileInputStream file = new FileInputStream("/home/vinay/eclipse-workspace/SeleniumAutomationPractise/propreties.file");
		pro.load(file);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor jsa = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(pro.getProperty("mobilenumber"));
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pro.getProperty("password"));
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("abcd");
		
		boolean value = driver.findElement(By.xpath("//a[text()='Amazon Pay']")).isDisplayed();
		Assert.assertEquals(value, true);
		
		
		/*
		 * if (driver.findElement(By.xpath("//a[text()='Amazon Pay']")).isDisplayed()){
		 * System.out.println("true"); } else { System.out.println("false");
		 * 
		 * 
		 * }
		 */
		 
		
		
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();
		  System.out.println("open");
		  
		  WebElement elea = driver.findElement(By.xpath("//span[text()='Trains']"));
		  jsa.executeScript("arguments[0].click();",elea);
		  
		 driver.findElement(By.xpath("//span[text()='Delhi- All Stations']")).click();
		 driver.findElement(By.xpath("//input[@id='input-searchText']")).sendKeys("RDM");
		 
		 driver.findElement(By.xpath("//p[contains(text(),'RDM')]")).click();
		 
			
	}	
}


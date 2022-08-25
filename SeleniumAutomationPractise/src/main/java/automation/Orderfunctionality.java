package automation;

import java.awt.Window;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.filefilter.TrueFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orderfunctionality {

	//public static void main(String[] args) throws IOException, InterruptedException {
@Test
	public void methodOne() throws IOException, InterruptedException{
	
	 
 //properties fill
				Properties per = new Properties();
				FileInputStream file = new FileInputStream("/home/vinay/eclipse-workspace/SeleniumAutomationPractise/practice.practice");
				per.load(file);

				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("http://automationpractice.com/index.php");
//Maximize window
				driver.manage().window().maximize();
			    driver.manage().deleteAllCookies();
			    
			    JavascriptExecutor js = (JavascriptExecutor)driver;  
			    
				driver.findElement(By.xpath("//a[@class='login']")).click();
			
				  driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]")).
				  sendKeys(per.getProperty("emailid"));
				  
				WebElement password =  driver.findElement(By.xpath("//input[@id='passwd']"));
				
				 // driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(per.
				  //getProperty("password"));
				  
				  js.executeScript("arguments[0].value='vinnu@1313';",password);         //sendkeys
				  
			
				  driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
				  
//assertEquals	  	  
				  
	//Hard assert	
				  boolean valid = driver.findElement(By.xpath("//a[@title='Women']")).isDisplayed();
				  Assert.assertEquals(valid, true);
				  
    //soft assert		  
				  /*
		  if(driver.findElement(By.xpath("//a[@title='Women']")).isDisplayed()) {
		  
		  System.out.println("pass"); 
		  }
		  else { 
			  System.out.println("fail");
		 }
		 
			*/	   
//mouseover 
		    Actions act= new Actions(driver);
		  
		  act.moveToElement(driver.findElement(By.xpath("//a[@title='Women']"))).
		  perform();
		  
//Link text
		  //driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]")).click();
		  driver.findElement(By.linkText("Casual Dresses")).click();
		  Thread.sleep(2000);
		  
 //back and forward biuttons
		  
		  //driver.navigate().back(); //Thread.sleep(2000);
		 //driver.navigate().forward();
		  
		  driver.findElement(By.linkText("Best sellers")).click();
		  
		  
		
//implicite wait		  
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//img[@class='replace-2x img-responsive' and @title='Printed Chiffon Dress']")).click();
		  driver.findElement(By.xpath("//a[@name='Yellow']")).click();
//dropdown by value		  
		  
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='group_1']")));
				sel.selectByValue("2");
				 
				
				
	WebElement button=driver.findElement(By.xpath("//i[@class='icon-plus']"));
		   js.executeScript("arguments[0].click();",button);               //click
		   
		   
		   
		 //JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 //js.executeScript("window.scrollBy(0,600);");                       scrolldown
		   
		   
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");      //scrollhight
		 
		 // js.executeScript("arguments[0].scrollintoView(true)",driver.findElement(By.xpath("//a[@title='Manage my customer account']")));
			
		 
			}
	}

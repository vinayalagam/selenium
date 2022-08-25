	package automation;


import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass {
@Test
	public static void methodone() throws IOException {
	javascriptexecutor();	
	TextboxRadiobuttonCheckbox();
	dropdown();
	asserts() ;
	
	System.out.println();
	
	
	//mouseover
	//mouseover agin mouserover and click
	//doubleclick
	//contextclick
	//drag and drop
	//click an hold
	
	//keybordactions
	//keyup
	//keydown
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath(""))).perform();//movetoelement (or)mouseover
//mouser agin mouser and click    
		WebElement ele = driver.findElement(By.xpath(""));
		action.moveToElement(driver.findElement(By.xpath(""))).click(ele).build().perform();
		
	    action.doubleClick(driver.findElement(By.xpath(""))).perform();//doubleclick
	    action.contextClick(driver.findElement(By.xpath(""))).perform();//contextclick
	    action.dragAndDrop(driver.findElement(By.xpath("")),(driver.findElement(By.xpath("")))).build().perform();//draganddrop
	    action.clickAndHold(driver.findElement(By.xpath(""))).build().perform();//clickandhold	
	    
	}
public static void javascriptexecutor() {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	Javascriptexecutor js = (Javascriptexecutor)driver;
	WebElement button=driver.findElement(By.xpath(""));
	
	js.executescript("arguments[0].click();",button);                                        //click
	js.executescript("arguments[0].value='abcd';",button);                                   //sendkeys
	js.executescript("window.scrollby(0,600);");                                              //scrolldown
	js.executescript("window.scrollby(600,0);");                                              //scrollUP
	js.executescript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath(""))); // scrollTOElement
	//js.Executescript("document.getElementById("+"'"+locator+"'"+").focus()");                 //focusonElement
	
	
	//js.executescript("arguments[0].scrollIntoView(true);",                                    //scrollToelement until element
	//		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(locator)));
	
	
	js.executescript("window.scrollby()0.document.body.scrollheight);");          //scrollhieght==> like buttom scroll	
}
public static void TextboxRadiobuttonCheckbox() {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
//Textbox	
	driver.findElement(By.xpath("locator")).click();
	driver.findElement(By.xpath("locator")).clear();
	driver.findElement(By.xpath("locator")).sendKeys("vinayalagam");
//Radiobutton
	driver.findElement(By.xpath("locator")).click();
	driver.findElement(By.xpath("locator")).clear();
//Checkbox
	driver.findElement(By.xpath("locator")).click();
	driver.findElement(By.xpath("locator")).clear();
}
public static void dropdown() {
	//selectByVisibleText()
	//selectByindex()
	//selectByvalue()
	//list<WebElement>
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	Select sel = new Select(driver.findElement(By.xpath("")));
	sel.selectByValue("xyz");                                      //value
	sel.selectByIndex(10);                                         //index
	sel.selectByVisibleText("");
		/*
		 * List<WebElement> li = driver.findElements(By.xpath(
		 * "//div[text()='Cities']/ancestor::div[2]/div[2]/div/div/div/div"));
		 * for(WebElement abc:li) { 
		 * if(abc.getText().equals("Agra")) { 
		 * abc.click();
		 * break; }
		 */
		
}
public static void synchronization() {
//  Implicit Wait
//	Explicit Wait
//  fluent Wait
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);              //implicit Wait
	   
	   WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(25));       //Emplicit Wait
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	   
	 //fluent wait--> pool time(5), timeout (30) condition
}
public static void asserts() throws IOException {
//Hard Assertions
	    //==> assert equal
	    //==> assert notequal
	   //==> assert true
	   //==> assert false
	  //==> assert null
	  //==> assert not null
	
	
//Soft Assertions ==>(Verify Method)
	 WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   
	   boolean valid = driver.findElement(By.xpath("")).isDisplayed();        //Hard assert==>boolean
		  Assert.assertEquals(valid, true);

		  
		  if(driver.findElement(By.xpath("")).isDisplayed()) {           // soft assert==>If&else condation
			  
			  System.out.println("pass"); 
			  }
			  else { 
				  System.out.println("fail");
			 }

 // PROPRETIES FILE
       Properties pro = new Properties();
       FileInputStream file = new FileInputStream("location");
       pro.load(file);
       driver.findElement(By.xpath("")).sendKeys(pro.getProperty("emailId"));


}
}


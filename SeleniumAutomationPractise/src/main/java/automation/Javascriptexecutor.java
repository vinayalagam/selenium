package automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecutor {

		
		
	@Test

	public void javascriptaexecutor() throws IOException {

		/*
		 * Properties pro = new Properties(); FileInputStream file = new
		 * FileInputStream(""); pro.load(file);
		 */
		
		//click
		//scrolldown
		//scrollup
		//scrollhight
		//send text

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement button = driver.findElement(By.xpath("(//a[contains(text(),'Contact')])[2]"));
		js.executeScript("arguments[0].click();",button);
		driver.navigate().back();
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Selenium Practice')]"))).
		moveToElement(driver.findElement(By.xpath("(//li[@class='parent'])[7]"))).build().perform();
		
		js.executeScript("window.scrollBy(0,800);");
		
		
		
		
		
		
		
		
		
	}
		

		
		
		
		
		
		
	private void executeScript(String string, WebElement button) {
		// TODO Auto-generated method stub
		
	}








	public void executescript(String string) {
		// TODO Auto-generated method stub
		
	}








	public void executescript(String string, WebElement button) {
		// TODO Auto-generated method stub
		
	}








	public void executeScript(String string) {
		// TODO Auto-generated method stub
		
	}








	}











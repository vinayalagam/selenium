package NEWJAVA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchcase {

	public static void main(String[] args) {
		
		String browsers = "chrome";
		switch(browsers) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			System.out.println(driver.getTitle());
			System.out.println("no2");
			break;
		
		 case"firefox": 
			 System.setProperty("webdriver.gecko.driver","/home/vinay/Downloads/geckodriver-v0.31.0-linux64");
			 WebDriver driverr = new FirefoxDriver();
			 driverr.get("https://www.google.com/");
			 System.out.println(driverr.getTitle());
		  System.out.println("alagam"); 
		  System.out.println("vinay"); 
		  break;
		 case"InternetExplorer":
			 System.setProperty("webdriver.ie.driver","");
			 WebDriver dv =new InternetExplorerDriver();
			 dv.get("https://www.google.com/");
			 System.out.println(dv.getTitle());
			 System.out.println("aaa");
			 break;
			 		
		}
		
		}
		}


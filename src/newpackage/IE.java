package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	  public static void main(String[] args) {

	        System.setProperty("webdriver.ie.driver", "D://Selenium drivers/IE driver/IEDriverServer.exe");
	        
	        WebDriver driver = new InternetExplorerDriver(); 
	        
	        driver.get("http://www.google.com"); 
	    }
	}

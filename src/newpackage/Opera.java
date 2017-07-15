package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {

	  public static void main(String[] args) {

	       System.setProperty("webdriver.opera.driver", "D://Selenium drivers/Opera driver/operadriver.exe");
	        
	        //WebDriver driver = new OperaDriver();
	        
	        //driver.get("http://selenium2.ru/");
	        
	        //driver.quit();
		  OperaDriver driver = new OperaDriver();
		  driver.get("http://selenium2.ru/");
		  driver.quit();
	        
	    }
	}

package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	  public static void main(String[] args) {

	        System.setProperty("webdriver.gecko.driver", "D://Selenium drivers/Firefox driver/geckodriver.exe");
	        // if above property is not working or not opening the application in browser then try below property

	        //System.setProperty("webdriver.firefox.marionette","D://Selenium drivers/Firefox driver/geckodriver.exe");
	        
	        WebDriver driver = new FirefoxDriver(); //we create a object of Webdriver  
	        
	        driver.get("http://www.facebook.com"); // with the help of object we open the browser and URL in the browser

            System.out.println("Application title is :"+driver.getTitle());

            driver.quit();
	    }
	}


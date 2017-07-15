package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditions {

	  public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "D://Selenium drivers/Chrome driver/chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("http://facebook.com");
	        
	        WebElement txtbox_firstname = driver.findElement(By.name("firstname"));
	        if(txtbox_firstname.isEnabled()) {
	        	txtbox_firstname.sendKeys("Roxy");
	        }
	        
	        do{
	        	txtbox_firstname.sendKeys("Foxy");
	        }while (driver.findElement(By.name("lastname")).isDisplayed()); //∞
	        
	        driver.close();
	    }
	}

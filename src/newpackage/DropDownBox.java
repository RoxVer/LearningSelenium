package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {

	  public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "D://Selenium drivers/Chrome driver/chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("http://newtours.demoaut.com/mercuryregister.php");
	        Select drpCountry = new Select(driver.findElement(By.name("country")));
	        drpCountry.selectByVisibleText("ANTARCTICA");
	        
	        driver.get("http://jsbin.com/osebed/2");
	        Select fruits = new Select(driver.findElement(By.id("fruits")));
	        fruits.selectByVisibleText("Banana");
	        fruits.selectByIndex(1);
	        
	        //driver.close();
	        //System.exit(0);
	    }
	}

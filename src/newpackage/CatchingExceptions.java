package newpackage;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CatchingExceptions {

	  public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "D://Selenium drivers/Chrome driver/chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("http://output.jsbin.com/enifaf/1");

	        WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
	        
	        try {
	            myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button")));
	            driver.findElement(By.tagName("button")).click();
	            
	        } catch (NoSuchElementException toe) {
	        	System.out.println(toe.toString());
	        }
	        
	        if (myWaitVar.until(ExpectedConditions.alertIsPresent()) != null) {
	        	System.out.print("alert is present!");
	        }
	        
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	        
	        //driver.close();
	    }
	}

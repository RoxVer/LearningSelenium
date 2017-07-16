package newpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExConditions {

	  public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "D://Selenium drivers/Chrome driver/chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();
	        WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
	        
	        driver.get("http://output.jsbin.com/enifaf/1");
	        
	        WebElement launch_box = driver.findElement(By.tagName("button"));
	        launch_box.click();
	        
	        if (myWaitVar.until(ExpectedConditions.alertIsPresent()) != null) {
	        	System.out.print("alert is present!");
	        }
	        
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	        
	        //driver.close();
	    }
	}

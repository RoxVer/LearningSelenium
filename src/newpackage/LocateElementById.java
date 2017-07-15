package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateElementById {

	public static void main(String[] args) throws InterruptedException {
		    	System.setProperty("webdriver.gecko.driver", "D://Selenium drivers/Firefox driver/geckodriver.exe");
		    	WebDriver driver = new FirefoxDriver();
		        String baseUrl = "http://www.facebook.com";
		        String tagName = "";
		        
		        driver.get(baseUrl);
		        tagName = driver.findElement(By.id("email")).getTagName();
		        //We used the getTagName() method to extract the tag name of that particular element whose id is "email"
		        
		        //Instead of using the long "driver.findElement(By.locator())" syntax every time you will access a particular element,
		        //we can instantiate a WebElement object for it.
		        WebElement myElement = driver.findElement(By.name("firstname"));
		        myElement.sendKeys("Roxy");
		        
		        WebElement myElement2 = driver.findElement(By.name("lastname"));
		        myElement2.sendKeys("Foxy");
		        
		        WebElement myElement3 = driver.findElement(By.name("websubmit"));
		        myElement3.click();
		        //OR driver.findElement(By.name("login")).click();
		       
		        Thread.sleep(5000); //Let the tester actually see something
		        System.out.println(tagName);
		        //driver.close();
		        driver.quit();
		        System.exit(0);
	}

}

package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://Selenium drivers/Firefox driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
        Thread.sleep(5000);
        driver.close();
	}

}

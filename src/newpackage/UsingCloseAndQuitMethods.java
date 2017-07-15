package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingCloseAndQuitMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://Selenium drivers/Firefox driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("http://www.popuptest.com/popuptest2.html");
        driver.close(); //only parent browser window was closed, not two pop-up windows
        driver.quit(); //using QUIT all windows will close
	}

}

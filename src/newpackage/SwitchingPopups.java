package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver", "D://Selenium drivers/Firefox driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String alertMessage = "";
        
        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.xpath("html/body/input")).click();
        alertMessage = driver.switchTo().alert().getText(); //getText of the alert box
        Thread.sleep(3000); //bad practice - better use Waits
        driver.switchTo().alert().accept(); //press OK on the alert box

        System.out.println(alertMessage);
        Thread.sleep(3000);
        driver.quit();
	}

}

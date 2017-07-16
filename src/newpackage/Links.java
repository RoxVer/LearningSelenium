package newpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Links {

	  public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "D://Selenium drivers/Chrome driver/chromedriver.exe");
	        String baseUrl = "http://newtours.demoaut.com/";
	        WebDriver driver = new ChromeDriver();
	        String underConsTitle = "Under Construction: Mercury Tours";
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        driver.get(baseUrl);
	        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
	        
	        String[] linkTexts = new String[linkElements.size()];
	        int i = 0;

	        //extract the link texts of each link element
	        for (WebElement e : linkElements) {
	            linkTexts[i] = e.getText();
	            System.out.println(linkTexts[i]);
	            i++;
	        }

	        //test each link
	        for (String t : linkTexts) {
	            driver.findElement(By.linkText(t)).click();
	            if (driver.getTitle().equals(underConsTitle)) {
	                System.out.println("\"" + t + "\""
	                        + " is under construction.");
	            } else {
	                System.out.println("\"" + t + "\""
	                        + " is working.");
	            }
	            driver.navigate().back();
	        }
	        driver.quit();

	        
	        //driver.close();
	        //System.exit(0);
	    }
	}

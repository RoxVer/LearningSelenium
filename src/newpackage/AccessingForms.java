package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingForms {

	  public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "D://Selenium drivers/Chrome driver/chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();
	        String baseURL = "http://newtours.demoaut.com/";
	        
	        driver.get(baseURL);

	        WebElement username = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
	        username.sendKeys("invalidUN");
	        
	        WebElement password = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
	        password.sendKeys("invalidPW");
	        password.submit();
	        
	        //WebElement signIn = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
	        //signIn.click(); 
	        
	        driver.findElement(By.cssSelector("input[value='Business']")).click();
	        
	        WebElement chkBoxPersist1 = driver.findElement(By.cssSelector("input[value='First']"));
	        for(int i=0; i<2; i++){
	        	chkBoxPersist1.click();
	        	System.out.println(chkBoxPersist1.isSelected());
	        }
	        
	        driver.get("http://www.facebook.com");
	        WebElement chkBoxPersist = driver.findElement(By.cssSelector("input[value='1']"));
	        for(int i=0; i<2; i++){
	        	chkBoxPersist.click();
	        	System.out.println(chkBoxPersist.isSelected());
	        }
	        //driver.quit();
	    }
	}

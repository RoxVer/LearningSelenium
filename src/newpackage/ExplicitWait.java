package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://Selenium drivers/Firefox driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        WebDriverWait wait=new WebDriverWait(driver, 20);
        
        String expectedTitle = "Demo Guru99 Page";
        String actualTitle = "";
        driver.get("http://demo.guru99.com/selenium/guru99home/");
        //Maximizes the browser window
    	//driver.manage().window().maximize();
    	
    	//get the actual value of the title
    	actualTitle = driver.getTitle();
    	
    	//compare the actual title with the expected title
    	if (actualTitle.equals(expectedTitle))
    	{
    	System.out.println("Test Passed") ;
    	}
    	else {
    	System.out.println("Test Failed" );
    	}
    	
    	//WebElement guru99seleniumlink = driver.findElement(By.xpath("html/body/div[1]/section/div[2]/div/div[3]/div/div/div[1]/div/div/div/article/div[2]/div[1]/div/p/a/img"));
    	WebElement guru99seleniumlink;
    	guru99seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div[2]/div/div[3]/div/div/div[1]/div/div/div/article/div[2]/div[1]/div/p/a/img")));
    	guru99seleniumlink.click();
    	
    	driver.close();
        
        
	}

}

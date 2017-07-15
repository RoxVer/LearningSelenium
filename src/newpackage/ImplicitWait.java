package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://Selenium drivers/Firefox driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        //used to set the default waiting time throughout the program
        //The implicit wait will tell to the web driver to wait for 
        //certain amount of time before it throws a "No Such Element Exception".
        //The default setting is 0. Once we set the time, web driver will wait 
        //for that time before throwing an exception.
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
    	System.out.println( "Test Passed") ;
    	}
    	else {
    	System.out.println( "Test Failed" );
    	}
    	//close browser
    	driver.close();
        
        
	}

}

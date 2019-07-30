package xClubsys;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


@Listeners({TestFailListener.class})
public class config {
    public static WebDriver driver;

    public static WebDriver getDriver(){
    	ChromeOptions options = new ChromeOptions();
 	      options.addArguments("--start-maximized");
 	      driver = new ChromeDriver(options);
        return driver;
    }
	public static String GetBaseUrl()
	    {
	      
	        String configBaseUrl = "https://lab.azaas.com:10000";
			return configBaseUrl;
	    } 

    
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}

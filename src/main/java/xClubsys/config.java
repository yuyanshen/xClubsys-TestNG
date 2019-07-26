package xClubsys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class config {
	 public static WebDriver driver;
	 public static WebDriver getdriver(){
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
}

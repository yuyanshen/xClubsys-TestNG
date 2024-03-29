package xClubsys;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


@Listeners({TestFailListener.class})
public class config {
	  protected boolean acceptNextAlert = true;
	  public static void sleep(double d){
	      try {
	          d *= 1000;
	          Thread.sleep((int)d);
	      } catch (Exception e) {
	          // TODO: handle exception
	      }
	  }
    public WebDriver driver;
    public WebDriver getDriver(){
        return driver;
        }
	public  String GetBaseUrl()
	    {
	      
	        String configBaseUrl = "https://lab.azaas.com:10000";
			return configBaseUrl;
	    } 
    private StringBuffer verificationErrors = new StringBuffer();
    static final int MAX_TIMEOUT_IN_SECONDS = 5;
    
    @BeforeClass
    public void setUp(){
    	ChromeOptions options = new ChromeOptions();
	   options.addArguments("--start-maximized");
	   driver = new ChromeDriver(options);
   	   driver.get(GetBaseUrl());
       driver.manage().timeouts().implicitlyWait(MAX_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);
       verificationErrors = new StringBuffer();
       driver.findElement(By.id("username")).click();
       driver.findElement(By.id("username")).clear();
       driver.findElement(By.id("username")).sendKeys("xin@azaas.com");
       driver.findElement(By.id("password")).click();
       driver.findElement(By.id("password")).clear();
       driver.findElement(By.id("password")).sendKeys("K2pass!");
       driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='lock'])[1]/following::span[1]")).click();
       sleep(10);
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
      driver.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
      }
    }

    private boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

	/*
	 * protected String closeAlertAndGetItsText() { try { Alert alert =
	 * driver.switchTo().alert(); String alertText = alert.getText(); if
	 * (acceptNextAlert) { alert.accept(); } else { alert.dismiss(); } return
	 * alertText; } finally { acceptNextAlert = true; } }
	 */
}

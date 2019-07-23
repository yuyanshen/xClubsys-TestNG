package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class PostingGL {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  public static void sleep(double d){
	      try {
	          d *= 1000;
	          Thread.sleep((int)d);
	      } catch (Exception e) {
	          // TODO: handle exception
	      }
	  }
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--start-maximized");
      driver = new ChromeDriver(options);
      driver.get(config.GetBaseUrl());
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
  public void highlightingElement(WebDriver driver,WebElement elem) {
	  ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
  }
  
  @Test
  public void PostingGL() throws InterruptedException
  {
      driver.findElement(By.cssSelector("[ng-if='sub\\.subMenus\\.length']:nth-child(2) ._md:nth-of-type(10) .ng-binding")).click();
      Thread.sleep(3000);
      try
      {
          assertEquals("Posting GL History", driver.findElement(By.xpath("//div[@id='top']//h2[@class='ng-binding']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("DRAFT", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Draft'])[2]/preceding::md-tab-item[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("TRANSFERRED", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transferred'])[2]/preceding::md-tab-item[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Financial Month", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Description", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Financial Month'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Debit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Credit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("NEW POSTING", driver.findElement(By.xpath("//a[contains(text(),'New Posting')]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//md-tab-item[2]")).click();
      Thread.sleep(3000);
      try
      {
          assertEquals("Financial Month", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Description", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Financial Month'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Debit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Credit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
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

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

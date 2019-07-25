package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.qameta.allure.*;

import static org.testng.Assert.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

@Feature("Membership")
public class BankPayment {
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

  
  @Test
  public void BankPayment() throws InterruptedException
  {
	  driver.findElement(By.xpath("//div[3]/a/div")).click();
	  sleep(4);
	  driver.findElement(By.xpath("//div[@id='mCSB_2_container']/md-list/md-list/md-list-item[12]/a/p")).click();
	  sleep(4);
      try
      {
          assertEquals("Bank Payment", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Bank", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Bank Account", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bank'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Payment Type", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bank Account'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Payment No", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment Type'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Credit Card No", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Credit Card Name", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit Card No'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
    	  assertEquals(driver.findElement(By.linkText("UBO Payment")).getText(), "UBO Payment");
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

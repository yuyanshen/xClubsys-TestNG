package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class PaymentHistory {
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
      driver.get(config.GetBaseUrl()+"/MembershipAR/AR/PaymentHistory/List");
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
  public void PaymentHistory() throws InterruptedException
  {
          assertEquals("Payment History List", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
          assertEquals("NEW PAYMENT", driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText());
          assertEquals("PAY FOR REMINDER", driver.findElement(By.xpath("//div[2]/div/a[2]")).getText());
          assertEquals("ALL", driver.findElement(By.xpath("//md-tab-item")).getText());
          assertEquals("Payment No", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]")).getText());
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]")).getText());
          assertEquals("Payment Code", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]")).getText());
          assertEquals("Batch Id", driver.findElement(By.xpath("//th[5]/span")).getText());
          assertEquals("Cheque Number", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]")).getText());
          assertEquals("Create Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]")).getText());
          assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]")).getText());
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]")).getText());
          assertEquals("Balance", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
          assertEquals("Status", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]")).getText());
      driver.findElement(By.xpath("//md-tab-item[2]")).click();
      Thread.sleep(5000);
          assertEquals("Payment No", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Transform'])[1]/following::span[2]")).getText());
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]")).getText());
          assertEquals("APPROVAL", driver.findElement(By.xpath("//md-tab-item[3]")).getText());
          assertEquals("REJECTED", driver.findElement(By.xpath("//md-tab-item[4]")).getText());
          assertEquals("VOID", driver.findElement(By.xpath("//md-tab-item[5]")).getText());
          assertEquals("DRAFT", driver.findElement(By.xpath("//md-tab-item[2]")).getText());
          assertEquals("Payment Code", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
          assertEquals("Batch Id", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment Code'])[2]/following::span[1]")).getText());
          assertEquals("Cheque Number", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]")).getText());
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[1]/following::span[1]")).getText());
          assertEquals("Balance", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
          assertEquals("Create Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]")).getText());
          assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]")).getText());
      driver.findElement(By.xpath("//md-tab-item[3]")).click();
      Thread.sleep(5000);
          assertEquals("Payment No", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]")).getText());
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]")).getText());
          assertEquals("Payment Code", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]")).getText());
          assertEquals("Batch Id", driver.findElement(By.xpath("//th[5]/span")).getText());
          assertEquals("Cheque Number", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]")).getText());
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]")).getText());
          assertEquals("Balance", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
          assertEquals("Create Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]")).getText());
          assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]")).getText());
      driver.findElement(By.xpath("//md-tab-item[4]")).click();
      Thread.sleep(5000);
          assertEquals("Payment No", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]")).getText());
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]")).getText());
          assertEquals("Payment Code", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]")).getText());
          assertEquals("Batch Id", driver.findElement(By.xpath("//th[5]/span")).getText());
          assertEquals("Cheque Number", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]")).getText());
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]")).getText());
          assertEquals("Balance", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
          assertEquals("Create Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]")).getText());
          assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]")).getText());
      driver.findElement(By.xpath("//md-tab-item[5]")).click();
      Thread.sleep(5000);
          assertEquals("Payment No", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]")).getText());
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]")).getText());
          assertEquals("Payment Code", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]")).getText());
          assertEquals("Batch Id", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment Code'])[2]/following::span[1]")).getText());
          assertEquals("Cheque Number", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]")).getText());
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]")).getText());
          assertEquals("Balance", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
          assertEquals("Void Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]")).getText());
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

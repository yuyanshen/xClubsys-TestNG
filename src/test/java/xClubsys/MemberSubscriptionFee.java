package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class MemberSubscriptionFee {
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
      driver.get(config.GetBaseUrl()+"/MembershipAR/AR/SubFeeMonth/List");
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
  public void MemberSubscriptionFee() throws InterruptedException
  {
      assertEquals("Member Subscription Fee List", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
          assertEquals("ALL", driver.findElement(By.xpath("//md-tab-item")).getText());
          assertEquals("DRAFT", driver.findElement(By.xpath("//md-tab-item[2]")).getText());
          assertEquals("POSTED", driver.findElement(By.xpath("//md-tab-item[3]")).getText());
          assertEquals("Operator", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Posted'])[2]/following::span[2]")).getText());
          assertEquals("Month", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Operator'])[1]/following::span[1]")).getText());
          assertEquals("Operator Time", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Month'])[1]/following::span[1]")).getText());
          assertEquals("Status", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Operator Time'])[1]/following::span[1]")).getText());
          assertEquals("POST SUBSCRIPTION FEE", driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText());
      driver.findElement(By.xpath("//md-tab-item[2]")).click();
      Thread.sleep(5000);
          assertEquals("Operator", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Posted'])[2]/following::span[2]")).getText());
          assertEquals("Month", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Operator'])[1]/following::span[1]")).getText());
          assertEquals("Operator Time", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Month'])[1]/following::span[1]")).getText());
      driver.findElement(By.xpath("//md-tab-item[3]")).click();
      Thread.sleep(5000);
          assertEquals("Operator", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Posted'])[2]/following::span[2]")).getText());
          assertEquals("Month", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Operator'])[1]/following::span[1]")).getText());
          assertEquals("Operator Time", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Month'])[1]/following::span[1]")).getText());
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

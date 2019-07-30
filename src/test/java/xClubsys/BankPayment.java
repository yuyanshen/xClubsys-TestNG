package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.qameta.allure.*;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
@Listeners({TestFailListener.class})
@Epic("UI Test")
@Feature("Membership AR")
@Stories(value= {@Story(value="BankPayment")})
@Owner("Pisy")

public class BankPayment {
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
	  WebDriver driver = config.getdriver();
	  static final int MAX_TIMEOUT_IN_SECONDS = 5;
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	   
      driver.get(config.GetBaseUrl()+"/MembershipAR/AR/GeneratePaymentFile/List");
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
  @Test
  @Description("BankPayment界面的测试用例")
  public void BankPayment() throws Exception
  {
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[1]")).getText());
          assertEquals("Bank", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]")).getText());    
          assertEquals("Bank Account", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bank'])[1]/following::span[1]")).getText());      
          assertEquals("Payment Type", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bank Account'])[1]/following::span[1]")).getText()); 
          assertEquals("Payment No", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment Type'])[1]/following::span[1]")).getText());      
          assertEquals("Credit Card No", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]")).getText());      
          assertEquals("Credit Card Name", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit Card No'])[1]/following::span[1]")).getText());      
          assertEquals(driver.findElement(By.xpath("//a[contains(@href, 'MembershipAR/AR/UBOPayment/Create')]")).getText(), "UOB PAYMENT");
          assertEquals(driver.findElement(By.xpath("//a[contains(@href, 'MembershipAR/AR/GiroPayment/Create')]")).getText(), "OCBC PAYMENT");
          assertEquals(driver.findElement(By.xpath("//a[contains(@href, 'MembershipAR/AR/CreditPayment/Create')]")).getText(), "CREDIT PAYMENT");
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

package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class RefundTransactions {
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
  public void RefundTransactions() throws InterruptedException
  {
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='设置'])[1]/following::p[10]")).click();
      Thread.sleep(5000);
      try
      {
          assertEquals("Refund Transactions", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Refund Transaction'])[2]/following::h2[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Refund Type", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Batch ID", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Refund Type'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Reference", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch ID'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Offset Outstanding Balance", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Auto Bill To AP", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Offset Outstanding Balance'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Refund Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Auto Bill To AP'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("NEW REFUND TRANSACTION", driver.findElement(By.xpath("//div[2]/div/a")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//div[2]/div/a")).click();
      Thread.sleep(3000);
      try
      {
          assertEquals("Create Refund Transaction", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership AR'])[2]/following::h2[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("1.Find & select matching members", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DRAFT'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("2.View your selected members", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Deposit'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("3.Set refund details", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Deposit'])[1]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("4.Review members refund results", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Auto Bill to AP'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("DRAFT", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create Refund Transaction'])[1]/following::h4[1]")).getText());
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
          assertEquals("Status", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Status'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Auto Bill to AP'])[1]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Status", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[3]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Deposit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Status'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Credit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Deposit'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Deposit + Credit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit'])[1]/following::th[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Outstanding", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Deposit + Credit'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Unposted", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Outstanding'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Refund Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Unposted'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("CANCEL", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save & submit for Approval'])[1]/following::button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("SEARCH", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date To'])[1]/following::button[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("CLEAR", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("//*[@id=\"section_0\"]/div/div[1]/md-input-container[2]/label")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[3]/md-datepicker[@name='EffectiveDate']//input[@class='md-datepicker-input md-input']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[4]/md-datepicker[@name='EffectiveDateTo']//input[@class='md-datepicker-input md-input']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date To'])[1]/following::button[2]")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Deposit'])[1]/following::div[5]")).click();
      Thread.sleep(5000);
      try
      {
          assertEquals("Refund Types", driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[1]/md-input-container[1]/label[.='Refund Types']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Refund Date", driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[1]/md-input-container[2]/label[.='Refund Date']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Batch Id", driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[1]/md-input-container[3]/label[@class='ng-scope']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Payment Code", driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[2]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Payment Code']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Reference", driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[2]/md-input-container[2]/label[@class='ng-scope']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Charge Code", driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[3]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Charge Code']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Rows per page:'])[1]/following::span[3]")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//md-card-content[3]/h4/span")).click();
      Thread.sleep(1000);
      try
      {
          assertEquals("SAVE arrow_drop_down", driver.findElement(By.xpath("//md-menu/button")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//md-menu/button")).click();
      Thread.sleep(1000);
      try
      {
          assertEquals("Save as Draft", driver.findElement(By.cssSelector("[role] md-menu-item:nth-of-type(1) [type]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Save & submit for Approval", driver.findElement(By.cssSelector("[role] md-menu-item:nth-of-type(2) [type]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit Image'])[1]/preceding::md-backdrop[1]")).click();
      Thread.sleep(1000);
      try
      {
          assertEquals("CANCEL", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='arrow_drop_down'])[1]/following::button[1]")).getText());
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

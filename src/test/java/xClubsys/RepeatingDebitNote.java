package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class RepeatingDebitNote {
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
  public void RepeatingDebitNote() throws InterruptedException
  {
      //WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='设置'])[1]/following::p[3]")).click();
      Thread.sleep(5000);
      try
      {
          assertEquals("Repeating Debit Note List", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Repeating Debit Note List'])[1]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Reference", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Start Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("End Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Next Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='End Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Transaction Every", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Interval Option", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transaction Every'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Description", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Interval Option'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Remark", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Status", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remark'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("NEW REPEATING DEBIT NOTE", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Repeating Debit Note List'])[1]/following::a[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
  }
  @Test
  public void RepeatingDebitNote_NewRepeatingDebitNote() throws InterruptedException
  {
      try
      {
          assertEquals("New Repeating Debit Note", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("SAVE arrow_drop_down", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Total'])[1]/following::button[1]")).getText());
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
          assertEquals("Description", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tax Code'])[2]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Qty", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Base Price", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Qty'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Disc %", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Base Price'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Tax Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Disc %'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tax Amount'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[1]/label[.='Member']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Debit Note Frequency", driver.findElement(By.cssSelector("[class='ng-pristine ng-untouched ng-valid ng-scope flex-md-30 flex-gt-md-25 ng-empty'] .ng-invalid-required")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      Thread.sleep(2000);
      try
      {
          assertEquals("Transaction Every", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[3]/label[.='Transaction Every']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Reference", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[1]/label[.='Reference']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Start Date", driver.findElement(By.cssSelector("[class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-md-30 flex-gt-md-25 ng-not-empty md-input-has-value'] .md-required")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("End Date", driver.findElement(By.cssSelector("[class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-md-30 flex-gt-md-25 ng-empty'] label")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Description", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container/label[@class='ng-scope']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Module ID", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//md-card-content[@class='collapse']/div/div[1]/md-input-container[1]/label[.='Module ID']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Charge Code", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//div[@class='collapse-target']/div[1]/md-input-container[2]/md-select[@role='listbox']/md-select-value/span[.='Charge Code']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Tax Code", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//md-card-content[@class='collapse']/div/div[1]/md-input-container[3]/label[@class='ng-scope']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
  }@AfterClass(alwaysRun = true)
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

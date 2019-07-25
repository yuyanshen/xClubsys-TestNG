package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Reminder {
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
      driver.get(config.GetBaseUrl()+"/MembershipAR/AR/Reminder/List");
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
  public void Reminder() throws InterruptedException
  {
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='设置'])[1]/following::p[9]")).click();
      Thread.sleep(5000);
      try
      {
          assertEquals("Reminders", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Reminder Type", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Reminder No", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reminder Type'])[2]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("SOAs Till Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reminder No'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Reminder Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SOAs Till Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Overdue Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reminder Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Previous Reminder Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Overdue Amount'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Previous Overdue Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Previous Reminder Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Sent Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Previous Overdue Amount'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("GENERATE", driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("PRINT", driver.findElement(By.xpath("//div[2]/div/a[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("ADJUSTMENT", driver.findElement(By.xpath("//div[2]/div/a[3]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("HISTORY", driver.findElement(By.xpath("//a[4]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("SETUP", driver.findElement(By.xpath("//a[5]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//div[2]/div/a")).click();
      Thread.sleep(5000);
      try
      {
          assertEquals("Generate Reminder", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("1.Generate Settings", driver.findElement(By.cssSelector("h4.collapse-toggle > span")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("2.Reminder Check List", driver.findElement(By.cssSelector("#section_1 > h4.collapse-toggle > span")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("CONFIRM & GENERATE", driver.findElement(By.xpath("//*[@id=\"section_2\"]/div/button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("CANCEL", driver.findElement(By.xpath("//*[@id=\"section_2\"]/div/button[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//span/md-icon")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("//div[2]/div/a[2]")).click();
      Thread.sleep(4000);
      try
      {
          assertEquals("SEARCH", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Included Sent Reminder'])[1]/following::button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Print Reminder", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
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
          assertEquals("1.Find Reminder", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Print Reminder'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("2.Reminders", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("CANCEL", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sent Date'])[1]/following::button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Date From", driver.findElement(By.cssSelector("[az-title] [class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-md-25 flex-gt-md-25 ng-empty']:nth-of-type(1) label")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          //assertEquals("Reminder Date Type", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[1]/md-select[@role='listbox']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Date To", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[2]/label[@class='ng-scope']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Reminder Type", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[2]/md-input-container[1]/md-select[@role='listbox']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Included Sent Reminder", driver.findElement(By.cssSelector("[flex-md='20'] label")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//md-card-content[3]/div/button")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//div[2]/div/a[3]")).click();
      Thread.sleep(5000);
      try
      {
          assertEquals("Reminder Number Adjustment", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership AR'])[2]/following::h2[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("SAVE", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DDeactivate Card Transaction'])[1]/following::button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("CANCEL", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/div/div[2]/form/md-card/md-card-content[1]/div[1]/md-input-container/label")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Reminder Type", driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/div/div[2]/form/md-card/md-card-content[1]/div[2]/md-input-container[1]/label")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("New Reminder No", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[1]/md-select[@role='listbox']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Deactivate Card Transaction", driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/div/div[2]/form/md-card/md-card-content[1]/div[3]/md-input-container[2]/label")).getText());
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

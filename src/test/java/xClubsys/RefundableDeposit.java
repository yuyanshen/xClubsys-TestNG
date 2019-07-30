package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class RefundableDeposit {
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
      driver.get(config.GetBaseUrl()+"/MembershipAR/AR/RefundableDeposit/List");
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
  public void RefundableDeposit() throws InterruptedException
  {
          assertEquals("Refundable Deposit History List", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Adjustment Refundable Deposit'])[1]/following::span[2]")).getText());
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
          assertEquals("ADJUSTMENT REFUNDABLE DEPOSIT", driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText());
  }
  @Test
  public void RefundableDeposit_AdjustmentRefundableDeposit()
  {
          assertEquals("Adjustment Refundable Deposit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
          assertEquals("SAVE", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remarks'])[1]/following::button[1]")).getText());
          assertEquals("CANCEL", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::button[1]")).getText());
          assertEquals("Member", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[1]/md-input-container[1]/label[.='Member']")).getText());
          assertEquals("Purpose", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[1]/md-input-container[3]/label[.='Purpose']")).getText());
          assertEquals("Charge Code", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//div[@class='collapse-target']/div[2]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Charge Code']")).getText());
          assertEquals("Tax Type", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[2]/md-input-container[2]/label[@class='ng-scope']")).getText());
          assertEquals("Requested Date", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[2]/md-input-container[3]/label[.='Requested Date']")).getText());
          assertEquals("Amount To Deposit/Withdraw", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[3]/md-input-container[1]/label[.='Amount To Deposit/Withdraw']")).getText());
          assertEquals("New Refundable Deposit", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[3]/md-input-container[2]/label[.='New Refundable Deposit']")).getText());
          assertEquals("Transaction Date", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[3]/md-input-container[3]/label[.='Transaction Date']")).getText());
          assertEquals("Remarks", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[4]/md-input-container/label[@class='ng-scope']")).getText());
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

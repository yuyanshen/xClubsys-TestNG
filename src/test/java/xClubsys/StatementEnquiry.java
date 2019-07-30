package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class StatementEnquiry {
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
      driver.get(config.GetBaseUrl()+"/MembershipAR/AR/SOA/List");
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
  public void StatementEnquiry() throws InterruptedException
  {
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='设置'])[1]/following::p[8]")).click();
      Thread.sleep(3000);
          assertEquals("Statement", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
          assertEquals("STATEMENTS SETTING", driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText());
          assertEquals("SEARCH", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Is Principal Member'])[1]/following::button[1]")).getText());
          assertEquals("Statements", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::span[1]")).getText());
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Print'])[1]/following::span[1]")).getText());
          assertEquals("Email", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]")).getText());
          assertEquals("Membership Type", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::span[1]")).getText());
          assertEquals("Payment Mode", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership Type'])[2]/following::span[1]")).getText());
          assertEquals("Debit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment Mode'])[3]/following::span[1]")).getText());
          assertEquals("Credit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit'])[1]/following::span[1]")).getText());
          assertEquals("Outstanding Balance", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit'])[1]/following::span[1]")).getText());
          assertEquals("Due Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Outstanding Balance'])[1]/following::span[1]")).getText());
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Is Principal Member'])[1]/following::button[1]")).click();
      Thread.sleep(20000);
          assertEquals("MONTH END CLOSING", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Statements'])[1]/following::button[1]")).getText());
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

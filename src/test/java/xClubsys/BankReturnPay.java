package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
@Listeners({TestFailListener.class})
public class BankReturnPay {
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
	
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  
      driver.get(config.GetBaseUrl()+ "/MembershipAR/AR/CreditCardReturn/List");
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
  public void BankReturnPay() throws InterruptedException
  {
      try
      {
          assertEquals("Giro Payment Return", driver.findElement(By.xpath("//md-tab-item")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("GIRO", driver.findElement(By.xpath("//md-tab-item[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Credit Card Return", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
/*      try
      {
          assertEquals("UPLOAD CREDIT", driver.findElement(By.xpath("//div[2]/div/a")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }*/
      try
      {
          assertEquals(driver.findElement(By.linkText("UPLOAD UBO")).getText(),"UPLOAD UBO");
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Payee No", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Giro'])[2]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("org ID", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payee No'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("File Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='org ID'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Currency Code", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='File Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Total Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Currency Code'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Actual Total Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Total Amount'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//md-tab-item[2]")).click();
      Thread.sleep(5000);
      try
      {
          assertEquals("Type Code", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Giro'])[2]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Clearing", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Type Code'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Report Generation Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clearing'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Record Type", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Report Generation Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Total Number", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Record Type'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("TotalAmount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Total Number'])[1]/following::span[1]")).getText());
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
}

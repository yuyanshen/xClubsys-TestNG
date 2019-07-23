package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class CreditNote {
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
  public void CreditNote() throws InterruptedException
  {
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='设置'])[1]/following::p[4]")).click();
      Thread.sleep(5000);
      try
      {
          assertEquals("Credit Note List", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("ALL", driver.findElement(By.xpath("//md-tab-item")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("DRAFT", driver.findElement(By.xpath("//md-tab-item[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("AWAITING PAYMENT", driver.findElement(By.xpath("//md-tab-item[3]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("PARTIALLY PAID", driver.findElement(By.xpath("//md-tab-item[4]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("PAID", driver.findElement(By.xpath("//md-tab-item[5]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("VOID", driver.findElement(By.xpath("//md-tab-item[6]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("BATCH IMPORT", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit Note List'])[1]/following::button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("NEW CREDIT NOTE", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Import'])[1]/following::button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("SN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Created Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Status", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//md-tab-item[2]")).click();
      Thread.sleep(3000);
      try
      {
          assertEquals("SN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Transform'])[1]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Created Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//md-tab-item[3]")).click();
      Thread.sleep(3000);
      try
      {
          assertEquals("SN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Created Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//md-tab-item[4]")).click();
      Thread.sleep(3000);
      try
      {
          assertEquals("SN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Created Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//md-tab-item[5]")).click();
      Thread.sleep(3000);
      try
      {
          assertEquals("SN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Created Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      driver.findElement(By.xpath("//md-tab-item[6]")).click();
      Thread.sleep(3000);
      try
      {
          assertEquals("SN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Void Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Void Date'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
  }
  @Test
  public void CreditNote_BatchImport_Page()
  {
      try
      {
          assertEquals("Step 1.Download our credit notes template file", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Import your credit notes'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Start by downloading our credit notes excel template file.This file has the corect column headings System needs to import your credit note data.", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Step 1.Download our credit notes template file'])[1]/following::h4[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Step 2.Copy your credit notes into the template", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Download template file'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("DOWNLOAD TEMPLATE FILE", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Step 1.Download our credit notes template file'])[1]/following::button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Export your invoices from your old system as a comma separated list.Using Excel or another spreadsheet editor,copy and paste your invoices from the exported file into the system template. Make sure the invoice data you copy matches the column headings provided in the template", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your credit notes into the template'])[1]/following::h4[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("IMPORTANT: Do not change the column headings provided in the system template, which need to remain the same. Member Id,member Name,charge code,base price,quantity,discount,effective Date These headings are listed as required and the date is assumed to be in English (Canada) format. For example, in 25-12-2018, the import can work in the next step.", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your credit notes into the template'])[1]/following::h4[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Step 3.Import the updated template file", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your credit notes into the template'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Select the file to import", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Step 3.Import the updated template file'])[1]/following::h4[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("The file you import must be a excel file The name of your file should end with xlsx", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No file selected'])[1]/following::h4[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("UPLOAD", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("CANCEL", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Import'])[1]/following::button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
  }
  @Test
  public void CreditNote_NewCreaditNote()
  {
      try
      {
          assertEquals("New Credit Note", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("DRAFT", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='New Credit Note'])[1]/following::h4[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Description", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remark'])[1]/following::span[2]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Qty", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[1]")).getText());
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
          assertEquals("Upload Supporting Attachment", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Total'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("SAVE arrow_drop_down", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::button[1]")).getText());
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
          assertEquals("UPLOAD SUPPORTING ATTACHMENT", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("SAVE arrow_drop_down", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::button[1]")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Member", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Member']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("SN", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[2]/label[@class='ng-scope']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Reference", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[3]/label[@class='ng-scope']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Charge Code", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div[2]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Charge Code']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Tax Code", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[2]/label[@class='ng-scope']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Module ID", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Module ID']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Effective Date", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Effective Date']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Due Date", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[3]/label[@class='ng-scope']")).getText());
      }
      catch (AssertionError e)
      {
          verificationErrors.append(e.toString());
      }
      try
      {
          assertEquals("Remark", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[4]/md-input-container/label[@class='ng-scope']")).getText());
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

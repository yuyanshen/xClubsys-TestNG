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
public class DebitNoteModule {
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
  @Test
  public void DebitNoteModule() throws InterruptedException
  {
	  sleep(5);
      //WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
	  driver.get(config.GetBaseUrl()+"/MembershipAR/AR/Invoice/List");
	  sleep(8);
      assertEquals("Debit Note List", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit Note'])[2]/following::h2[1]")).getText());
      assertEquals("Membership AR", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='设置'])[1]/following::p[1]")).getText());
      assertEquals("Debit Note", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='设置'])[1]/following::p[2]")).getText());
      assertEquals("ALL", driver.findElement(By.xpath("//md-tab-item")).getText());
      driver.findElement(By.xpath("//md-tab-item[2]")).click();
      Thread.sleep(3000);
      assertEquals("DRAFT", driver.findElement(By.xpath("//md-tab-item[2]")).getText());
      driver.findElement(By.xpath("//md-tab-item[3]")).click();
      Thread.sleep(2000);
      assertEquals("AWAITING PAYMENT", driver.findElement(By.xpath("//md-tab-item[3]")).getText());
      driver.findElement(By.xpath("//md-tab-item[4]")).click();
      Thread.sleep(2000);
      assertEquals("PARTIALLY PAID", driver.findElement(By.xpath("//md-tab-item[4]")).getText());
      driver.findElement(By.xpath("//md-tab-item[5]")).click();
      Thread.sleep(2000);
      assertEquals("PAID", driver.findElement(By.xpath("//md-tab-item[5]")).getText());
      driver.findElement(By.xpath("//md-tab-item[6]")).click();
      Thread.sleep(10000);
      assertEquals("VOID", driver.findElement(By.xpath("//md-tab-item[6]")).getText());
      assertEquals("BATCH IMPORT", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit Note List'])[1]/following::button[1]")).getText());
      assertEquals("NEW DEBIT NOTE", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Import'])[1]/following::button[1]")).getText());
      assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      assertEquals("Void Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      assertEquals("Reference", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Void Date'])[1]/following::span[1]")).getText());
      assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]")).getText());
      assertEquals("Due", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
      assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]")).getText());
      driver.findElement(By.xpath("//md-tab-item[5]")).click();
      Thread.sleep(2000);
      assertEquals("SN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Void'])[2]/following::span[2]")).getText());
      assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      assertEquals("Created Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]")).getText());
      assertEquals("Reference", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]")).getText());
      assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]")).getText());
      assertEquals("Due", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
      assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]")).getText());
      driver.findElement(By.xpath("//md-tab-item[4]")).click();
      Thread.sleep(2000);
      assertEquals("SN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Void'])[2]/following::span[2]")).getText());
      assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      assertEquals("Created Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]")).getText());
      assertEquals("Reference", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]")).getText());
      assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]")).getText());
      assertEquals("Due", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
      assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]")).getText());
      driver.findElement(By.xpath("//md-tab-item[3]")).click();
      Thread.sleep(2000);
      assertEquals("SN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Void'])[2]/following::span[2]")).getText());
      assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      assertEquals("Created Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]")).getText());
      assertEquals("Reference", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]")).getText());
      assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]")).getText());
      assertEquals("Due", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
      assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]")).getText());
      driver.findElement(By.xpath("//md-tab-item[2]")).click();
      Thread.sleep(2000);
      assertEquals("SN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Transform'])[1]/following::span[2]")).getText());
      assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      assertEquals("Created Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]")).getText());
      assertEquals("Reference", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]")).getText());
      assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]")).getText());
      assertEquals("Due", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
      assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]")).getText());
      driver.findElement(By.xpath("//md-tab-item")).click();
      Thread.sleep(2000);
      assertEquals("SN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Void'])[2]/following::span[2]")).getText());
      assertEquals("Member", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]")).getText());
      assertEquals("Created Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]")).getText());
      assertEquals("Effective Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]")).getText());
      assertEquals("Reference", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]")).getText());
      assertEquals("Amount", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]")).getText());
      assertEquals("Due", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]")).getText());
      assertEquals("Paid", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]")).getText());
      assertEquals("Status", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]")).getText());
      sleep(5);
  }
  @Test
  public void DebitNote_NewDebitNote()throws InterruptedException
  {
	  sleep(5);
	  driver.get(config.GetBaseUrl()+"/MembershipAR/AR/Invoice/Create?invoiceType=0");
	  sleep(5);    
          assertEquals("New Debit Note", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership AR'])[2]/following::h2[1]")).getText());
          assertEquals("Member", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Member']")).getText());
          assertEquals("SN", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[2]/label[@class='ng-scope']")).getText());
          assertEquals("Charge Code", driver.findElement(By.cssSelector(".md-select-placeholder span:nth-of-type(1)")).getText());
          assertEquals("Tax Code", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[2]/label[@class='ng-scope']")).getText());
          assertEquals("Module ID", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Module ID']")).getText());
          assertEquals("Reference", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[1]/label[@class='ng-scope']")).getText());
          assertEquals("Effective Date", driver.findElement(By.cssSelector("[class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-md-30 flex-gt-md-25 ng-not-empty md-input-has-value'] .md-required")).getText());
          assertEquals("Due Date", driver.findElement(By.cssSelector("[class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-md-30 flex-gt-md-25 ng-empty'] label")).getText());
          assertEquals("Remark", driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[4]/md-input-container/label[@class='ng-scope']")).getText());
          assertEquals("Description", driver.findElement(By.cssSelector("[az-name] md-card-content:nth-child(3) .ng-isolate-scope:nth-of-type(2) span")).getText());
          assertEquals("Qty", driver.findElement(By.cssSelector("[az-name] .md-numeric:nth-of-type(3) span")).getText());
          assertEquals("Base Price", driver.findElement(By.cssSelector("[az-name] .md-numeric:nth-of-type(4) span")).getText());
          assertEquals("Disc %", driver.findElement(By.cssSelector("[az-name] .md-numeric:nth-of-type(5) span")).getText());
          assertEquals("Tax Amount", driver.findElement(By.cssSelector("[az-name] .md-numeric:nth-of-type(6) span")).getText());
          assertEquals("Amount", driver.findElement(By.cssSelector("[az-name] .md-numeric:nth-of-type(7) span")).getText());
          assertEquals("UPLOAD SUPPORTING ATTACHMENT", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]")).getText());
          assertEquals("UPLOAD SUPPORTING ATTACHMENT", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]")).getText());
          assertEquals("File Name", driver.findElement(By.cssSelector("[az-options='UploaderOptions'] .ng-isolate-scope:nth-of-type(2) span")).getText());
          assertEquals("Date", driver.findElement(By.cssSelector("[az-options='UploaderOptions'] .ng-isolate-scope:nth-of-type(3) span")).getText());
          assertEquals("CANCEL", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save & submit for Approval'])[1]/following::button[1]")).getText());
          assertEquals("SAVE arrow_drop_down", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::button[1]")).getText());
  } 
  @Test
  public void DebitNote_BatchImport_Page()throws InterruptedException
  {
	  sleep(8);
	  driver.get(config.GetBaseUrl()+"/MembershipAR/AR/DebitNoteStep");
	  sleep(8);
          assertEquals("Import your debit notes", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Collapse'])[1]/following::h2[1]")).getText());
          assertEquals("Step 1.Download our debit notes template file", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Import your debit notes'])[1]/following::span[1]")).getText());
          assertEquals("Start by downloading our debit notes excel template file.This file has the corect column headings System needs to import your debit note data.", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Step 1.Download our debit notes template file'])[1]/following::h4[1]")).getText());
          assertEquals("Step 2.Copy your debit notes into the template", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Download template file'])[1]/following::span[1]")).getText());
          assertEquals("Export your invoices from your old system as a comma separated list.Using Excel or another spreadsheet editor,copy and paste your invoices from the exported file into the system template. Make sure the invoice data you copy matches the column headings provided in the template", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your debit notes into the template'])[1]/following::h4[1]")).getText());
          assertEquals("IMPORTANT: Do not change the column headings provided in the system template, which need to remain the same. Member Id,member Name,charge code,base price,quantity,discount,effective Date These headings are listed as required and the date is assumed to be in English (Canada) format. For example, in 25-12-2018, the import can work in the next step.", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your debit notes into the template'])[1]/following::h4[2]")).getText());
          assertEquals("Step 3.Import the updated template file", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your debit notes into the template'])[1]/following::span[1]")).getText());
          assertEquals("Select the file to import", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Step 3.Import the updated template file'])[1]/following::h4[1]")).getText());
          assertEquals("The file you import must be a excel file The name of your file should end with xlsx", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No file selected'])[1]/following::h4[1]")).getText());
          assertEquals("UPLOAD", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]")).getText());
          assertEquals("CANCEL", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Import'])[1]/following::button[1]")).getText());
      sleep(8);
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

package xClubsys;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
@Feature("Membership AR")
@Owner("Pisy")
@Stories(value = { @Story(value = "DebitNoteModule") })
public class DebitNoteModule extends config {
	@Test
	public void DebitNoteModule() throws InterruptedException {
		sleep(5);
		// WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
		driver.get(GetBaseUrl() + "/MembershipAR/AR/Invoice/List");
		sleep(8);
		AssertJUnit.assertEquals("Debit Note List",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Debit Note'])[2]/following::h2[1]"))
						.getText());
		AssertJUnit.assertEquals("Membership AR",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='设置'])[1]/following::p[1]"))
						.getText());
		AssertJUnit.assertEquals("Debit Note",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='设置'])[1]/following::p[2]"))
						.getText());
		AssertJUnit.assertEquals("ALL", driver.findElement(By.xpath("//md-tab-item")).getText());
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		Thread.sleep(3000);
		AssertJUnit.assertEquals("DRAFT", driver.findElement(By.xpath("//md-tab-item[2]")).getText());
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		Thread.sleep(2000);
		AssertJUnit.assertEquals("AWAITING PAYMENT", driver.findElement(By.xpath("//md-tab-item[3]")).getText());
		driver.findElement(By.xpath("//md-tab-item[4]")).click();
		Thread.sleep(2000);
		AssertJUnit.assertEquals("PARTIALLY PAID", driver.findElement(By.xpath("//md-tab-item[4]")).getText());
		driver.findElement(By.xpath("//md-tab-item[5]")).click();
		Thread.sleep(2000);
		AssertJUnit.assertEquals("PAID", driver.findElement(By.xpath("//md-tab-item[5]")).getText());
		driver.findElement(By.xpath("//md-tab-item[6]")).click();
		Thread.sleep(10000);
		AssertJUnit.assertEquals("VOID", driver.findElement(By.xpath("//md-tab-item[6]")).getText());
		AssertJUnit.assertEquals("BATCH IMPORT", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Debit Note List'])[1]/following::button[1]"))
				.getText());
		AssertJUnit.assertEquals("NEW DEBIT NOTE", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Import'])[1]/following::button[1]"))
				.getText());
		AssertJUnit.assertEquals("Member",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Void Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Reference",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Void Date'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Due",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Paid",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[5]")).click();
		Thread.sleep(2000);
		AssertJUnit.assertEquals("SN",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Void'])[2]/following::span[2]"))
						.getText());
		AssertJUnit.assertEquals("Member",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Created Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Reference", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Due",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Paid",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[4]")).click();
		Thread.sleep(2000);
		AssertJUnit.assertEquals("SN",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Void'])[2]/following::span[2]"))
						.getText());
		AssertJUnit.assertEquals("Member",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Created Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Reference", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Due",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Paid",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		Thread.sleep(2000);
		AssertJUnit.assertEquals("SN",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Void'])[2]/following::span[2]"))
						.getText());
		AssertJUnit.assertEquals("Member",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Created Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Reference", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Due",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Paid",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		Thread.sleep(2000);
		AssertJUnit.assertEquals("SN", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Batch Transform'])[1]/following::span[2]"))
				.getText());
		AssertJUnit.assertEquals("Member",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Created Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Reference", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Due",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Paid",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item")).click();
		Thread.sleep(2000);
		AssertJUnit.assertEquals("SN",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Void'])[2]/following::span[2]"))
						.getText());
		AssertJUnit.assertEquals("Member",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Created Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Reference", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Due",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Paid",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Status",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
						.getText());
		sleep(5);
	}

	@Test
	public void DebitNote_NewDebitNote() throws InterruptedException {
		sleep(5);
		driver.get(GetBaseUrl() + "/MembershipAR/AR/Invoice/Create?invoiceType=0");
		sleep(5);
		AssertJUnit.assertEquals("New Debit Note",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership AR'])[2]/following::h2[1]"))
						.getText());
		AssertJUnit.assertEquals("Member", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Member']"))
				.getText());
		AssertJUnit.assertEquals("SN", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[2]/label[@class='ng-scope']"))
				.getText());
		AssertJUnit.assertEquals("Charge Code",
				driver.findElement(By.cssSelector(".md-select-placeholder span:nth-of-type(1)")).getText());
		AssertJUnit.assertEquals("Tax Code", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[2]/label[@class='ng-scope']"))
				.getText());
		AssertJUnit.assertEquals("Module ID", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Module ID']"))
				.getText());
		AssertJUnit.assertEquals("Reference", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[1]/label[@class='ng-scope']"))
				.getText());
		AssertJUnit.assertEquals("Effective Date", driver.findElement(By.cssSelector(
				"[class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-md-30 flex-gt-md-25 ng-not-empty md-input-has-value'] .md-required"))
				.getText());
		AssertJUnit.assertEquals("Due Date", driver.findElement(By.cssSelector(
				"[class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-md-30 flex-gt-md-25 ng-empty'] label"))
				.getText());
		AssertJUnit.assertEquals("Remark", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[4]/md-input-container/label[@class='ng-scope']"))
				.getText());
		AssertJUnit.assertEquals("Description",
				driver.findElement(
						By.cssSelector("[az-name] md-card-content:nth-child(3) .ng-isolate-scope:nth-of-type(2) span"))
						.getText());
		AssertJUnit.assertEquals("Qty", driver.findElement(By.cssSelector("[az-name] .md-numeric:nth-of-type(3) span")).getText());
		AssertJUnit.assertEquals("Base Price",
				driver.findElement(By.cssSelector("[az-name] .md-numeric:nth-of-type(4) span")).getText());
		AssertJUnit.assertEquals("Disc %",
				driver.findElement(By.cssSelector("[az-name] .md-numeric:nth-of-type(5) span")).getText());
		AssertJUnit.assertEquals("Tax Amount",
				driver.findElement(By.cssSelector("[az-name] .md-numeric:nth-of-type(6) span")).getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(By.cssSelector("[az-name] .md-numeric:nth-of-type(7) span")).getText());
		AssertJUnit.assertEquals("UPLOAD SUPPORTING ATTACHMENT",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("UPLOAD SUPPORTING ATTACHMENT",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("File Name",
				driver.findElement(
						By.cssSelector("[az-options='UploaderOptions'] .ng-isolate-scope:nth-of-type(2) span"))
						.getText());
		AssertJUnit.assertEquals("Date",
				driver.findElement(
						By.cssSelector("[az-options='UploaderOptions'] .ng-isolate-scope:nth-of-type(3) span"))
						.getText());
		AssertJUnit.assertEquals("CANCEL", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Save & submit for Approval'])[1]/following::button[1]"))
				.getText());
		AssertJUnit.assertEquals("SAVE arrow_drop_down",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::button[1]"))
						.getText());
	}

	@Test
	public void DebitNote_BatchImport_Page() throws InterruptedException {
		sleep(8);
		driver.get(GetBaseUrl() + "/MembershipAR/AR/DebitNoteStep");
		sleep(8);
		AssertJUnit.assertEquals("Import your debit notes",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Collapse'])[1]/following::h2[1]"))
						.getText());
		AssertJUnit.assertEquals("Step 1.Download our debit notes template file", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Import your debit notes'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals(
				"Start by downloading our debit notes excel template file.This file has the corect column headings System needs to import your debit note data.",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Step 1.Download our debit notes template file'])[1]/following::h4[1]"))
						.getText());
		AssertJUnit.assertEquals("Step 2.Copy your debit notes into the template", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Download template file'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals(
				"Export your invoices from your old system as a comma separated list.Using Excel or another spreadsheet editor,copy and paste your invoices from the exported file into the system template. Make sure the invoice data you copy matches the column headings provided in the template",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your debit notes into the template'])[1]/following::h4[1]"))
						.getText());
		AssertJUnit.assertEquals(
				"IMPORTANT: Do not change the column headings provided in the system template, which need to remain the same. Member Id,member Name,charge code,base price,quantity,discount,effective Date These headings are listed as required and the date is assumed to be in English (Canada) format. For example, in 25-12-2018, the import can work in the next step.",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your debit notes into the template'])[1]/following::h4[2]"))
						.getText());
		AssertJUnit.assertEquals("Step 3.Import the updated template file", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your debit notes into the template'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals("Select the file to import", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Step 3.Import the updated template file'])[1]/following::h4[1]"))
				.getText());
		AssertJUnit.assertEquals("The file you import must be a excel file The name of your file should end with xlsx",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='No file selected'])[1]/following::h4[1]"))
						.getText());
		AssertJUnit.assertEquals("UPLOAD",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("CANCEL",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Import'])[1]/following::button[1]"))
						.getText());
		sleep(8);
	}
}

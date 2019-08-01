package xClubsys;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
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
@Stories(value = { @Story(value = "CreditNote") })
public class CreditNote extends config {
	@Test
	public void CreditNote() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/CreditNote/List");
		sleep(8);
		AssertJUnit.assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Credit Note List");
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//md-tab-item")).getText(), "ALL");
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//md-tab-item[2]")).getText(), "DRAFT");
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//md-tab-item[3]")).getText(), "AWAITING PAYMENT");
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//md-tab-item[4]")).getText(), "PARTIALLY PAID");
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//md-tab-item[5]")).getText(), "PAID");
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//md-tab-item[6]")).getText(), "VOID");
		AssertJUnit.assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Credit Note List'])[1]/following::button[1]"))
				.getText(), "BATCH IMPORT");
		AssertJUnit.assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Import'])[1]/following::button[1]"))
				.getText(), "NEW CREDIT NOTE");
		AssertJUnit.assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]"))
				.getText(), "SN");
		AssertJUnit.assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
				.getText(), "Member");
		AssertJUnit.assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
				.getText(), "Created Date");
		AssertJUnit.assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
				.getText(), "Effective Date");
		AssertJUnit.assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText(), "Paid");
		AssertJUnit.assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
				.getText(), "Amount");
		AssertJUnit.assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
				.getText(), "Status");
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		Thread.sleep(3000);
		AssertJUnit.assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Batch Transform'])[1]/following::span[2]"))
				.getText(), "SN");
		AssertJUnit.assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
				.getText(), "Member");
		AssertJUnit.assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
				.getText(), "Created Date");
		AssertJUnit.assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
				.getText(), "Effective Date");
		AssertJUnit.assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText(), "Paid");
		AssertJUnit.assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
				.getText(), "Amount");
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		Thread.sleep(3000);
		AssertJUnit.assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
				.getText(), "Member");
		AssertJUnit.assertEquals("Created Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Paid", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[4]")).click();
		Thread.sleep(3000);
		AssertJUnit.assertEquals("SN",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]"))
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
		AssertJUnit.assertEquals("Paid", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[5]")).click();
		Thread.sleep(3000);
		AssertJUnit.assertEquals("SN",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]"))
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
		AssertJUnit.assertEquals("Paid", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[6]")).click();
		Thread.sleep(3000);
		AssertJUnit.assertEquals("SN",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]"))
						.getText());
		AssertJUnit.assertEquals("Member",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Void Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Paid",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Void Date'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
						.getText());
	}

	@Test
	public void CreditNote_BatchImport_Page() {
		driver.findElement(By.cssSelector("button.md-warn.md-button.md-ink-ripple")).click();
		sleep(5);
		AssertJUnit.assertEquals("Step 1.Download our credit notes template file", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Import your credit notes'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals(
				"Start by downloading our credit notes excel template file.This file has the corect column headings System needs to import your credit note data.",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Step 1.Download our credit notes template file'])[1]/following::h4[1]"))
						.getText());
		AssertJUnit.assertEquals("Step 2.Copy your credit notes into the template", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Download template file'])[1]/following::span[1]"))
				.getText());
		AssertJUnit.assertEquals("DOWNLOAD TEMPLATE FILE", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Step 1.Download our credit notes template file'])[1]/following::button[1]"))
				.getText());
		AssertJUnit.assertEquals(
				"Export your invoices from your old system as a comma separated list.Using Excel or another spreadsheet editor,copy and paste your invoices from the exported file into the system template. Make sure the invoice data you copy matches the column headings provided in the template",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your credit notes into the template'])[1]/following::h4[1]"))
						.getText());
		AssertJUnit.assertEquals(
				"IMPORTANT: Do not change the column headings provided in the system template, which need to remain the same. Member Id,member Name,charge code,base price,quantity,discount,effective Date These headings are listed as required and the date is assumed to be in English (Canada) format. For example, in 25-12-2018, the import can work in the next step.",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your credit notes into the template'])[1]/following::h4[2]"))
						.getText());
		AssertJUnit.assertEquals("Step 3.Import the updated template file", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your credit notes into the template'])[1]/following::span[1]"))
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
	}
	@Test
	public void CreditNote_NewCreaditNote() {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/CreditNote/Create?invoiceType=1&edit=1");
		sleep(10);
		AssertJUnit.assertEquals(driver
				.findElement(By.cssSelector("h2.ng-binding"))
				.getText(), "New Credit Note");
		AssertJUnit.assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remark'])[1]/following::span[2]"))
				.getText(), "Description");
		AssertJUnit.assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[1]"))
				.getText(), "Qty");
		AssertJUnit.assertEquals("Base Price",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Qty'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Disc %",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Base Price'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Tax Amount",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Disc %'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Tax Amount'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals("Upload Supporting Attachment",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Total'])[1]/following::span[1]"))
						.getText());
		AssertJUnit.assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::button[1]"))
				.getText(), "SAVE arrow_drop_down");
		AssertJUnit.assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Save & submit for Approval'])[1]/following::button[1]"))
				.getText(), "CANCEL");
		AssertJUnit.assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]"))
				.getText(), "UPLOAD SUPPORTING ATTACHMENT");
		AssertJUnit.assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::button[1]"))
				.getText(), "SAVE arrow_drop_down");
		AssertJUnit.assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Member']"))
				.getText(), "Member");
		AssertJUnit.assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[2]/label[@class='ng-scope']"))
				.getText(), "SN");
		AssertJUnit.assertEquals(
				driver.findElement(By.xpath("//*[@id=\'section_0\']/div[1]/md-input-container[3]/label")).getText(),
				"Reference");
		AssertJUnit.assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div[2]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Charge Code']"))
				.getText(), "Charge Code");
		AssertJUnit.assertEquals("Tax Code", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[2]/label[@class='ng-scope']"))
				.getText());
		AssertJUnit.assertEquals("Module ID", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Module ID']"))
				.getText());
		AssertJUnit.assertEquals("Effective Date", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Effective Date']"))
				.getText());
		AssertJUnit.assertEquals("Due Date", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[3]/label[@class='ng-scope']"))
				.getText());
		AssertJUnit.assertEquals("Remark", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[4]/md-input-container/label[@class='ng-scope']"))
				.getText());
	}
}

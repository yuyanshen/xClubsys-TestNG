package xClubsys;

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
		assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Credit Note List");
		assertEquals(driver.findElement(By.xpath("//md-tab-item")).getText(), "ALL");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[2]")).getText(), "DRAFT");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[3]")).getText(), "AWAITING PAYMENT");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[4]")).getText(), "PARTIALLY PAID");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[5]")).getText(), "PAID");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[6]")).getText(), "VOID");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Credit Note List'])[1]/following::button[1]"))
				.getText(), "BATCH IMPORT");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Batch Import'])[1]/following::button[1]"))
				.getText(), "NEW CREDIT NOTE");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]"))
				.getText(), "SN");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
				.getText(), "Member");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
				.getText(), "Created Date");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
				.getText(), "Effective Date");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText(), "Paid");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
				.getText(), "Amount");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
				.getText(), "Status");
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		Thread.sleep(3000);
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Batch Transform'])[1]/following::span[2]"))
				.getText(), "SN");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
				.getText(), "Member");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
				.getText(), "Created Date");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
				.getText(), "Effective Date");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText(), "Paid");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
				.getText(), "Amount");
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		Thread.sleep(3000);
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
				.getText(), "Member");
		assertEquals("Created Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Paid", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		assertEquals("Amount",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[4]")).click();
		Thread.sleep(3000);
		assertEquals("SN",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]"))
						.getText());
		assertEquals("Member",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
						.getText());
		assertEquals("Created Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Paid", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		assertEquals("Amount",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[5]")).click();
		Thread.sleep(3000);
		assertEquals("SN",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]"))
						.getText());
		assertEquals("Member",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
						.getText());
		assertEquals("Created Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Created Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Paid", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		assertEquals("Amount",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[6]")).click();
		Thread.sleep(3000);
		assertEquals("SN",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VOID'])[2]/following::span[2]"))
						.getText());
		assertEquals("Member",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SN'])[1]/following::span[1]"))
						.getText());
		assertEquals("Void Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		assertEquals("Paid",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Void Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paid'])[3]/following::span[1]"))
						.getText());
	}

	@Test
	public void CreditNote_BatchImport_Page() {
		driver.findElement(By.cssSelector("button.md-warn.md-button.md-ink-ripple")).click();
		sleep(5);
		assertEquals("Step 1.Download our credit notes template file", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Import your credit notes'])[1]/following::span[1]"))
				.getText());
		assertEquals(
				"Start by downloading our credit notes excel template file.This file has the corect column headings System needs to import your credit note data.",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Step 1.Download our credit notes template file'])[1]/following::h4[1]"))
						.getText());
		assertEquals("Step 2.Copy your credit notes into the template", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Download template file'])[1]/following::span[1]"))
				.getText());
		assertEquals("DOWNLOAD TEMPLATE FILE", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Step 1.Download our credit notes template file'])[1]/following::button[1]"))
				.getText());
		assertEquals(
				"Export your invoices from your old system as a comma separated list.Using Excel or another spreadsheet editor,copy and paste your invoices from the exported file into the system template. Make sure the invoice data you copy matches the column headings provided in the template",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your credit notes into the template'])[1]/following::h4[1]"))
						.getText());
		assertEquals(
				"IMPORTANT: Do not change the column headings provided in the system template, which need to remain the same. Member Id,member Name,charge code,base price,quantity,discount,effective Date These headings are listed as required and the date is assumed to be in English (Canada) format. For example, in 25-12-2018, the import can work in the next step.",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your credit notes into the template'])[1]/following::h4[2]"))
						.getText());
		assertEquals("Step 3.Import the updated template file", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Step 2.Copy your credit notes into the template'])[1]/following::span[1]"))
				.getText());
		assertEquals("Select the file to import", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Step 3.Import the updated template file'])[1]/following::h4[1]"))
				.getText());
		assertEquals("The file you import must be a excel file The name of your file should end with xlsx",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='No file selected'])[1]/following::h4[1]"))
						.getText());
		assertEquals("UPLOAD",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]"))
						.getText());
		assertEquals("CANCEL",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Import'])[1]/following::button[1]"))
						.getText());
	}
	@Test
	public void CreditNote_NewCreaditNote() {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/CreditNote/Create?invoiceType=1&edit=1");
		sleep(10);
		assertEquals(driver
				.findElement(By.cssSelector("h2.ng-binding"))
				.getText(), "New Credit Note");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remark'])[1]/following::span[2]"))
				.getText(), "Description");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[1]"))
				.getText(), "Qty");
		assertEquals("Base Price",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Qty'])[1]/following::span[1]"))
						.getText());
		assertEquals("Disc %",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Base Price'])[1]/following::span[1]"))
						.getText());
		assertEquals("Tax Amount",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Disc %'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Tax Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("Upload Supporting Attachment",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Total'])[1]/following::span[1]"))
						.getText());
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::button[1]"))
				.getText(), "SAVE arrow_drop_down");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Save & submit for Approval'])[1]/following::button[1]"))
				.getText(), "CANCEL");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]"))
				.getText(), "UPLOAD SUPPORTING ATTACHMENT");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::button[1]"))
				.getText(), "SAVE arrow_drop_down");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Member']"))
				.getText(), "Member");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[2]/label[@class='ng-scope']"))
				.getText(), "SN");
		assertEquals(
				driver.findElement(By.xpath("//*[@id=\'section_0\']/div[1]/md-input-container[3]/label")).getText(),
				"Reference");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div[2]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Charge Code']"))
				.getText(), "Charge Code");
		assertEquals("Tax Code", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[2]/label[@class='ng-scope']"))
				.getText());
		assertEquals("Module ID", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Module ID']"))
				.getText());
		assertEquals("Effective Date", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]//label[.='Effective Date']"))
				.getText());
		assertEquals("Due Date", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[3]/label[@class='ng-scope']"))
				.getText());
		assertEquals("Remark", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[4]/md-input-container/label[@class='ng-scope']"))
				.getText());
	}
}

package xClubsys;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;

@Feature("Membership")
@Owner("Pisy")
@Stories(value = { @Story(value = "Transfer") })
public class Transfer extends config {
	@Test
	public void MembershipTransferHistory() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Membership/Members/MTransfer/List");
		sleep(5);
		assertEquals(driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText(),
				"NEW MEMBERSHIP TRANSFER");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transfer'])[2]/following::h2[1]"))
				.getText(), "Membership Transfer History");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Done'])[1]/following::span[2]"))
				.getText(), "From Member (Name/ID)");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='From Member (Name/ID)'])[1]/following::span[1]"))
				.getText(), "To Member (Name/ID)");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='To Member (Name/ID)'])[1]/following::span[1]"))
				.getText(), "Transaction Date");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Transaction Date'])[1]/following::span[1]"))
				.getText(), "Effective Date");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText(), "Transfer Fee");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Transfer Fee'])[1]/following::span[1]"))
				.getText(), "Admin Fee");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Admin Fee'])[1]/following::span[1]"))
				.getText(), "Status");
	}
	@Test
	public void CreateMembershipTransfer() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Membership/Members/MTransfer/Create");
		sleep(5);
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transfer'])[2]/following::h2[1]")).getText(), "Create Membership Transfer");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create Membership Transfer'])[1]/following::h4[1]")).getText(), "From Member");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/md-card-content//label[.='Member ID']")).getText(), "Member ID");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/md-card-content/div[1]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Name");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/md-card-content/div[1]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Membership Type");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/md-card-content//label[.='Outstanding Balance']")).getText(), "Outstanding Balance");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/md-card-content//label[.='Refundable Deposit']")).getText(), "Refundable Deposit");
		/*
		 * assertEquals(driver.findElement(By.
		 * cssSelector("[az-name] md-card-content:nth-of-type(2) h4")).getText(),
		 * "To Member\r\n" + "add");
		 */
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]//label[.='Member ID']")).getText(), "Member ID");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/md-input-container[2]/label[@class='ng-scope']")).getText(), "Name");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/md-input-container[3]/label[@class='ng-scope']")).getText(), "Membership Type");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//md-card[@class='_md']/md-card-content[3]/h4[.='Transaction']")).getText(), "Transaction");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//md-card[@class='_md']/md-card-content[3]/div[1]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Transfer Reason / Remarks']")).getText(), "Transfer Reason / Remarks");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//md-card[@class='_md']/md-card-content[3]/div[1]/md-input-container[3]/md-select[@role='listbox']/md-select-value/span[.='Transfer Fee Invoice Account']")).getText(), "Transfer Fee Invoice Account");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[3]/div[2]/md-input-container[1]/label[@class='ng-scope']")).getText(), "Transfer Fee");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[3]/div[2]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Generate Transfer Fee invoice");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[3]/div[2]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Transferee Credit Deposit Fee");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[3]//label[.='Transaction Date']")).getText(), "Transaction Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remarks'])[1]/following::h4[1]")).getText(), "Attachment List");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]")).getText(), "UPLOAD");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Upload'])[1]/following::span[2]")).getText(), "File Name");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='File Name'])[1]/following::span[1]")).getText(), "Document Description");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document Description'])[1]/following::span[1]")).getText(), "Date Uploaded");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[3]//md-datepicker[@name='EffectiveDate']//input[@class='md-datepicker-input md-input']")).getText(), "Effective Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date Uploaded'])[1]/following::button[1]")).getText(), "SAVE AS DRAFT");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save as Draft'])[1]/following::button[1]")).getText(), "SUBMIT");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Submit'])[1]/following::button[1]")).getText(), "CANCEL");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[3]/div[1]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Transfer Price");
		}
}
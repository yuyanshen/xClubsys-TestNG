package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class RepeatingDebitNote extends config {
	@Test
	public void RepeatingDebitNote() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/RepeatingInvoice/List");
		sleep(8);
		// WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='设置'])[1]/following::p[3]"))
				.click();
		Thread.sleep(5000);
		assertEquals("Repeating Debit Note List",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]"))
						.getText());
		assertEquals("Member", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Repeating Debit Note List'])[1]/following::span[2]"))
				.getText());
		assertEquals("Reference",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		assertEquals("Start Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
						.getText());
		assertEquals("End Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Start Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Next Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='End Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Transaction Every",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Next Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Interval Option", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Transaction Every'])[1]/following::span[1]"))
				.getText());
		assertEquals("Description", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Interval Option'])[1]/following::span[1]"))
				.getText());
		assertEquals("Remark",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[1]"))
						.getText());
		assertEquals("Status",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remark'])[1]/following::span[1]"))
						.getText());
		assertEquals("NEW REPEATING DEBIT NOTE", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Repeating Debit Note List'])[1]/following::a[1]"))
				.getText());
	}

	@Test
	public void RepeatingDebitNote_NewRepeatingDebitNote() throws InterruptedException {
		assertEquals("New Repeating Debit Note",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]"))
						.getText());
		assertEquals("SAVE arrow_drop_down",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Total'])[1]/following::button[1]"))
						.getText());
		assertEquals("CANCEL", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Save & submit for Approval'])[1]/following::button[1]"))
				.getText());
		assertEquals("Description",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Tax Code'])[2]/following::span[2]"))
						.getText());
		assertEquals("Qty",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Description'])[2]/following::span[1]"))
						.getText());
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
		assertEquals("Member", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[1]/label[.='Member']"))
				.getText());
		assertEquals("Debit Note Frequency", driver.findElement(By.cssSelector(
				"[class='ng-pristine ng-untouched ng-valid ng-scope flex-md-30 flex-gt-md-25 ng-empty'] .ng-invalid-required"))
				.getText());
		Thread.sleep(2000);
		assertEquals("Transaction Every", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[3]/label[.='Transaction Every']"))
				.getText());
		assertEquals("Reference", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[1]/label[.='Reference']"))
				.getText());
		assertEquals("Start Date", driver.findElement(By.cssSelector(
				"[class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-md-30 flex-gt-md-25 ng-not-empty md-input-has-value'] .md-required"))
				.getText());
		assertEquals("End Date", driver.findElement(By.cssSelector(
				"[class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-md-30 flex-gt-md-25 ng-empty'] label"))
				.getText());
		assertEquals("Description", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container/label[@class='ng-scope']"))
				.getText());
		assertEquals("Module ID", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-card-content[@class='collapse']/div/div[1]/md-input-container[1]/label[.='Module ID']"))
				.getText());
		assertEquals("Charge Code", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//div[@class='collapse-target']/div[1]/md-input-container[2]/md-select[@role='listbox']/md-select-value/span[.='Charge Code']"))
				.getText());
		assertEquals("Tax Code", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-card-content[@class='collapse']/div/div[1]/md-input-container[3]/label[@class='ng-scope']"))
				.getText());
	}
}

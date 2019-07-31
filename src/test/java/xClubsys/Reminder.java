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
@Stories(value = { @Story(value = "Reminder") })
public class Reminder extends config {
	@Test
	public void Reminder() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/Reminder/List");
		sleep(8);
		assertEquals("Reminders",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]"))
						.getText());
		assertEquals("Member",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]"))
						.getText());
		assertEquals("Reminder Type",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"))
						.getText());
		assertEquals("Reminder No",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reminder Type'])[2]/following::span[1]"))
						.getText());
		assertEquals("SOAs Till Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reminder No'])[1]/following::span[1]"))
						.getText());
		assertEquals("Reminder Date", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SOAs Till Date'])[1]/following::span[1]"))
				.getText());
		assertEquals("Overdue Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reminder Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Previous Reminder Date", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Overdue Amount'])[1]/following::span[1]"))
				.getText());
		assertEquals("Previous Overdue Amount", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Previous Reminder Date'])[1]/following::span[1]"))
				.getText());
		assertEquals("Sent Date", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Previous Overdue Amount'])[1]/following::span[1]"))
				.getText());
		assertEquals("GENERATE", driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText());
		assertEquals("PRINT", driver.findElement(By.xpath("//div[2]/div/a[2]")).getText());
		assertEquals("ADJUSTMENT", driver.findElement(By.xpath("//div[2]/div/a[3]")).getText());
		assertEquals("HISTORY", driver.findElement(By.xpath("//a[4]")).getText());
		assertEquals("SETUP", driver.findElement(By.xpath("//a[5]")).getText());
		driver.findElement(By.xpath("//div[2]/div/a")).click();
		Thread.sleep(5000);
		assertEquals("Generate Reminder",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]"))
						.getText());
		assertEquals("1.Generate Settings", driver.findElement(By.cssSelector("h4.collapse-toggle > span")).getText());
		assertEquals("2.Reminder Check List",
				driver.findElement(By.cssSelector("#section_1 > h4.collapse-toggle > span")).getText());
		assertEquals("CONFIRM & GENERATE",
				driver.findElement(By.xpath("//*[@id=\"section_2\"]/div/button[1]")).getText());
		assertEquals("CANCEL", driver.findElement(By.xpath("//*[@id=\"section_2\"]/div/button[2]")).getText());
		driver.findElement(By.xpath("//span/md-icon")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[2]/div/a[2]")).click();
		Thread.sleep(4000);
		assertEquals("SEARCH", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Included Sent Reminder'])[1]/following::button[1]"))
				.getText());
		assertEquals("Print Reminder",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]"))
						.getText());
		assertEquals("CLEAR",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::button[1]"))
						.getText());
		assertEquals("1.Find Reminder", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Print Reminder'])[1]/following::span[1]"))
				.getText());
		assertEquals("2.Reminders",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[1]"))
						.getText());
		assertEquals("CANCEL",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Sent Date'])[1]/following::button[1]"))
						.getText());
		assertEquals("Date From", driver.findElement(By.cssSelector(
				"[az-title] [class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-md-25 flex-gt-md-25 ng-empty']:nth-of-type(1) label"))
				.getText());
		// assertEquals("Reminder Date Type",
		// driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[1]/md-select[@role='listbox']")).getText());
		assertEquals("Date To", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[2]/label[@class='ng-scope']"))
				.getText());
		assertEquals("Reminder Type", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[2]/md-input-container[1]/md-select[@role='listbox']"))
				.getText());
		assertEquals("Included Sent Reminder", driver.findElement(By.cssSelector("[flex-md='20'] label")).getText());
		driver.findElement(By.xpath("//md-card-content[3]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[2]/div/a[3]")).click();
		Thread.sleep(5000);
		assertEquals("Reminder Number Adjustment",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership AR'])[2]/following::h2[1]"))
						.getText());
		assertEquals("SAVE", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='DDeactivate Card Transaction'])[1]/following::button[1]"))
				.getText());
		assertEquals("CANCEL",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::button[1]"))
						.getText());
		assertEquals("Member", driver.findElement(By.xpath(
				"//*[@id=\"mCSB_1_container\"]/div/div[2]/form/md-card/md-card-content[1]/div[1]/md-input-container/label"))
				.getText());
		assertEquals("Reminder Type", driver.findElement(By.xpath(
				"//*[@id=\"mCSB_1_container\"]/div/div[2]/form/md-card/md-card-content[1]/div[2]/md-input-container[1]/label"))
				.getText());
		assertEquals("New Reminder No", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[1]/md-select[@role='listbox']"))
				.getText());
		assertEquals("Deactivate Card Transaction", driver.findElement(By.xpath(
				"//*[@id=\"mCSB_1_container\"]/div/div[2]/form/md-card/md-card-content[1]/div[3]/md-input-container[2]/label"))
				.getText());
	}
}

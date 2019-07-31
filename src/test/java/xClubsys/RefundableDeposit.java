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
@Stories(value = { @Story(value = "RefundableDeposit") })

public class RefundableDeposit extends config {
	@Test
	public void RefundableDeposit() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/RefundableDeposit/List");
		sleep(5);
		assertEquals("Refundable Deposit History List",
				driver.findElement(By.xpath(
						"//div[@id='top']//h2[@class='ng-binding']"))
						.getText());
		assertEquals("Member", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Adjustment Refundable Deposit'])[1]/following::span[2]"))
				.getText());
		assertEquals("Amount",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		assertEquals("ADJUSTMENT REFUNDABLE DEPOSIT",
				driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText());
	}

	@Test
	public void RefundableDeposit_AdjustmentRefundableDeposit() {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/UpdateRefundableDeposit/Create");
		sleep(5);
		assertEquals("Adjustment Refundable Deposit",
				driver.findElement(By.xpath(
						"//div[@id='top']//h2[@class='ng-binding']"))
						.getText());
		assertEquals("SAVE",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Remarks'])[1]/following::button[1]"))
						.getText());
		assertEquals("CANCEL",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::button[1]"))
						.getText());
		assertEquals("Member", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[1]/md-input-container[1]/label[.='Member']"))
				.getText());
		assertEquals("Purpose", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[1]/md-input-container[3]/label[.='Purpose']"))
				.getText());
		assertEquals("Charge Code", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//div[@class='collapse-target']/div[2]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Charge Code']"))
				.getText());
		assertEquals("Tax Type", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[2]/md-input-container[2]/label[@class='ng-scope']"))
				.getText());
		assertEquals("Requested Date", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[2]/md-input-container[3]/label[.='Requested Date']"))
				.getText());
		assertEquals("Amount To Deposit/Withdraw", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[3]/md-input-container[1]/label[.='Amount To Deposit/Withdraw']"))
				.getText());
		assertEquals("New Refundable Deposit", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[3]/md-input-container[2]/label[.='New Refundable Deposit']"))
				.getText());
		assertEquals("Transaction Date", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[3]/md-input-container[3]/label[.='Transaction Date']"))
				.getText());
		assertEquals("Remarks", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']//div[@class='collapse-target']/div[4]/md-input-container/label[@class='ng-scope']"))
				.getText());
	}
}

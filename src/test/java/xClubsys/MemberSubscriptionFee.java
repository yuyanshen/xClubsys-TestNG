package xClubsys;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

import static org.testng.Assert.*;

import org.openqa.selenium.*;

@Feature("Membership AR")
@Owner("Pisy")
@Stories(value = { @Story(value = "MemberSubscriptionFee") })
public class MemberSubscriptionFee extends config {
	@Test
	public void MemberSubscriptionFee() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/SubFeeMonth/List");
		sleep(8);
		assertEquals("Member Subscription Fee List",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]"))
						.getText());
		assertEquals("ALL", driver.findElement(By.xpath("//md-tab-item")).getText());
		assertEquals("DRAFT", driver.findElement(By.xpath("//md-tab-item[2]")).getText());
		assertEquals("POSTED", driver.findElement(By.xpath("//md-tab-item[3]")).getText());
		assertEquals("Operator",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Posted'])[2]/following::span[2]"))
						.getText());
		assertEquals("Month",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Operator'])[1]/following::span[1]"))
						.getText());
		assertEquals("Operator Time",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Month'])[1]/following::span[1]"))
						.getText());
		assertEquals("Status",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Operator Time'])[1]/following::span[1]"))
						.getText());
		assertEquals("POST SUBSCRIPTION FEE",
				driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText());
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		Thread.sleep(5000);
		assertEquals("Operator",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Posted'])[2]/following::span[2]"))
						.getText());
		assertEquals("Month",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Operator'])[1]/following::span[1]"))
						.getText());
		assertEquals("Operator Time",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Month'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		Thread.sleep(5000);
		assertEquals("Operator",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Posted'])[2]/following::span[2]"))
						.getText());
		assertEquals("Month",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Operator'])[1]/following::span[1]"))
						.getText());
		assertEquals("Operator Time",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Month'])[1]/following::span[1]"))
						.getText());
	}

	@Test
	public void MemberSubscriptionFee_PostSubscriptionFee() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/SubscriptionFeeMember/Create");
		sleep(5);
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Finacial Month is required.'])[1]/following::button[1]"))
				.getText(), "SEARCH");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::span[1]"))
				.getText(), "Member");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
				.getText(), "Effective Date");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText(), "Create Date");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]"))
				.getText(), "Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Type'])[1]/following::span[1]"))
				.getText(), "Subscription Fee Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Subscription Fee Type'])[1]/following::span[1]"))
				.getText(), "Subscription Fee");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]"))
				.getText(), "Post Subscription Fee");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Save as Draft'])[1]/following::button[1]"))
				.getText(), "CANCEL");
	}
}

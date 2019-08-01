package xClubsys;

import org.testng.annotations.*;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
@Feature("Membership AR")
@Owner("Pisy")
@Stories(value = { @Story(value = "PaymentHistory") })
public class PaymentHistory extends config {
	@Test
	public void PaymentHistory() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/PaymentHistory/List");
		sleep(10);
		assertEquals("Payment History List",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]"))
						.getText());
		assertEquals("NEW PAYMENT", driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText());
		assertEquals("PAY FOR REMINDER", driver.findElement(By.xpath("//div[2]/div/a[2]")).getText());
		assertEquals("ALL", driver.findElement(By.xpath("//md-tab-item")).getText());
		assertEquals("Payment No",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]"))
						.getText());
		assertEquals("Member",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]"))
						.getText());
		assertEquals("Payment Code",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"))
						.getText());
		assertEquals("Batch Id", driver.findElement(By.xpath("//th[5]/span")).getText());
		assertEquals("Cheque Number",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]"))
						.getText());
		assertEquals("Create Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		assertEquals("Balance",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("Status",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		Thread.sleep(5000);
		assertEquals("Payment No", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Batch Transform'])[1]/following::span[2]"))
				.getText());
		assertEquals("Member",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]"))
						.getText());
		assertEquals("APPROVAL", driver.findElement(By.xpath("//md-tab-item[3]")).getText());
		assertEquals("REJECTED", driver.findElement(By.xpath("//md-tab-item[4]")).getText());
		assertEquals("VOID", driver.findElement(By.xpath("//md-tab-item[5]")).getText());
		assertEquals("DRAFT", driver.findElement(By.xpath("//md-tab-item[2]")).getText());
		assertEquals("Payment Code",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		assertEquals("Batch Id",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment Code'])[2]/following::span[1]"))
						.getText());
		assertEquals("Cheque Number",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[1]/following::span[1]"))
						.getText());
		assertEquals("Balance",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("Create Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		Thread.sleep(5000);
		assertEquals("Payment No",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]"))
						.getText());
		assertEquals("Member",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]"))
						.getText());
		assertEquals("Payment Code",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"))
						.getText());
		assertEquals("Batch Id", driver.findElement(By.xpath("//th[5]/span")).getText());
		assertEquals("Cheque Number",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]"))
						.getText());
		assertEquals("Balance",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("Create Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[4]")).click();
		Thread.sleep(5000);
		assertEquals("Payment No",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]"))
						.getText());
		assertEquals("Member",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]"))
						.getText());
		assertEquals("Payment Code",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"))
						.getText());
		assertEquals("Batch Id", driver.findElement(By.xpath("//th[5]/span")).getText());
		assertEquals("Cheque Number",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]"))
						.getText());
		assertEquals("Balance",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("Create Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[5]")).click();
		Thread.sleep(5000);
		assertEquals("Payment No",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]"))
						.getText());
		assertEquals("Member",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]"))
						.getText());
		assertEquals("Payment Code",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"))
						.getText());
		assertEquals("Batch Id",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment Code'])[2]/following::span[1]"))
						.getText());
		assertEquals("Cheque Number",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]"))
						.getText());
		assertEquals("Balance",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("Void Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]"))
						.getText());
	}
}

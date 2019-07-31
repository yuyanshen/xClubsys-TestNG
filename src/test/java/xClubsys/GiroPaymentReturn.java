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
@Stories(value = { @Story(value = "BankReturnPay") })
public class BankReturnPay extends config {
	@Test
	public void BankReturnPay() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/CreditCardReturn/List");
		sleep(8);
		assertEquals("Giro Payment Return", driver.findElement(By.xpath("//md-tab-item")).getText());
		assertEquals("GIRO", driver.findElement(By.xpath("//md-tab-item[2]")).getText());
		assertEquals("Credit Card Return",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]"))
						.getText());
		assertEquals(driver.findElement(By.linkText("UPLOAD UBO")).getText(), "UPLOAD UBO");
		assertEquals("Payee No",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Giro'])[2]/following::span[2]"))
						.getText());
		assertEquals("org ID",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payee No'])[1]/following::span[1]"))
						.getText());
		assertEquals("File Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='org ID'])[1]/following::span[1]"))
						.getText());
		assertEquals("Currency Code",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='File Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Total Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Currency Code'])[1]/following::span[1]"))
						.getText());
		assertEquals("Actual Total Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Total Amount'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		Thread.sleep(5000);
		assertEquals("Type Code",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Giro'])[2]/following::span[2]"))
						.getText());
		assertEquals("Clearing",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Type Code'])[1]/following::span[1]"))
						.getText());
		assertEquals("Report Generation Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Clearing'])[1]/following::span[1]"))
						.getText());
		assertEquals("Record Type", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Report Generation Date'])[1]/following::span[1]"))
				.getText());
		assertEquals("Total Number",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Record Type'])[1]/following::span[1]"))
						.getText());
		assertEquals("TotalAmount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Total Number'])[1]/following::span[1]"))
						.getText());
	}
}

package xClubsys;

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
@Stories(value = { @Story(value = "GiroPayment") })
public class GiroPayment extends config {

@Test
	public void GiroPayment() throws Exception {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/GeneratePaymentFile/List");
		sleep(10);
		assertEquals("Member",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[1]"))
						.getText());
		assertEquals("Bank",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"))
						.getText());
		assertEquals("Bank Account",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bank'])[1]/following::span[1]"))
						.getText());
		assertEquals("Payment Type",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Bank Account'])[1]/following::span[1]"))
						.getText());
		assertEquals("Payment No",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment Type'])[1]/following::span[1]"))
						.getText());
		assertEquals("Credit Card No",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]"))
						.getText());
		assertEquals("Credit Card Name", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit Card No'])[1]/following::span[1]"))
				.getText());
		assertEquals(
				driver.findElement(By.xpath("//a[contains(@href, 'MembershipAR/AR/UBOPayment/Create')]")).getText(),
				"UOB PAYMENT");
		assertEquals(
				driver.findElement(By.xpath("//a[contains(@href, 'MembershipAR/AR/GiroPayment/Create')]")).getText(),
				"OCBC PAYMENT");
		assertEquals(
				driver.findElement(By.xpath("//a[contains(@href, 'MembershipAR/AR/CreditPayment/Create')]")).getText(),
				"CREDIT PAYMENT");
	}

}

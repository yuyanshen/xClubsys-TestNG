package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

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
}

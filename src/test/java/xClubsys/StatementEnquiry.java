package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class StatementEnquiry extends config {
	@Test
	public void StatementEnquiry() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/SOA/List");
		sleep(10);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='设置'])[1]/following::p[8]"))
				.click();
		Thread.sleep(3000);
		assertEquals("Statement",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[1]/following::h2[1]"))
						.getText());
		assertEquals("STATEMENTS SETTING",
				driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText());
		assertEquals("SEARCH", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Is Principal Member'])[1]/following::button[1]"))
				.getText());
		assertEquals("Statements",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::span[1]"))
						.getText());
		assertEquals("Member",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Print'])[1]/following::span[1]"))
						.getText());
		assertEquals("Email",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"))
						.getText());
		assertEquals("Membership Type",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::span[1]"))
						.getText());
		assertEquals("Payment Mode", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Type'])[2]/following::span[1]"))
				.getText());
		assertEquals("Debit",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment Mode'])[3]/following::span[1]"))
						.getText());
		assertEquals("Credit",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit'])[1]/following::span[1]"))
						.getText());
		assertEquals("Outstanding Balance",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit'])[1]/following::span[1]"))
						.getText());
		assertEquals("Due Date", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Outstanding Balance'])[1]/following::span[1]"))
				.getText());
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Is Principal Member'])[1]/following::button[1]"))
				.click();
		Thread.sleep(20000);
		assertEquals("MONTH END CLOSING",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Statements'])[1]/following::button[1]"))
						.getText());
	}
}

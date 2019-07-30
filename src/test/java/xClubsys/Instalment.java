package xClubsys;

import java.util.regex.Pattern;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Instalment extends config {
	@Test
	public void Instalment() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/Instalment/List");
		sleep(8);
		assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Instalment List");
		assertEquals("Member", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Instalment List'])[1]/following::span[2]"))
				.getText());
		assertEquals("Description",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		assertEquals("Start Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[1]"))
						.getText());
		assertEquals("Next Bill Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Start Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("End Date", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next Bill Date'])[1]/following::span[1]"))
				.getText());
		assertEquals("Transaction Every",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='End Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Interval Option", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Transaction Every'])[1]/following::span[1]"))
				.getText());
		assertEquals("Amount", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Interval Option'])[1]/following::span[1]"))
				.getText());
		assertEquals("Status",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("NEW INSTALMENT",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Instalment List'])[1]/following::a[1]"))
						.getText());
	}
}

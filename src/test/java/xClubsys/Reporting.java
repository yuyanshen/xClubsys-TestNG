package xClubsys;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

import static org.testng.Assert.*;

import org.openqa.selenium.*;

@Feature("GL")
@Owner("Pisy")
@Stories(value = { @Story(value = "Reporting") })
public class Reporting extends config {
	@Test
	public void TrialBalance() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Accounting/Reporting/TrialBalance");
		sleep(5);
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Trial Balance'])[2]/following::h2[1]"))
				.getText(), "Trial Balance");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Only Post'])[1]/following::span[1]"))
				.getText(), "Code");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Code'])[1]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Debit");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit'])[1]/following::span[1]"))
				.getText(), "Credit");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit'])[1]/following::span[1]"))
				.getText(), "Balance");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]"))
				.getText(), "Type");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//div[@class='content-body ng-scope']/div[3]/div/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Fiscal Year']"))
				.getText(), "Fiscal Year");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//div[@class='content-body ng-scope']/div[3]/div/md-input-container[2]/md-select[@role='listbox']/md-select-value/span[.='Start Period']"))
				.getText(), "Start Period");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//div[@class='content-body ng-scope']/div[3]/div/md-input-container[3]/md-select[@role='listbox']/md-select-value/span[.='End Period']"))
				.getText(), "End Period");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//div[@class='content-body ng-scope']/div[3]/div/md-input-container[4]/md-select[@role='listbox']/md-select-value/span[.='Include Draft Entry']"))
				.getText(), "Include Draft Entry");
	}

	@Test
	public void FinancialReports() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Accounting/Reporting/FinancialReports");
		sleep(5);
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Financial Reports'])[2]/following::h2[1]"))
				.getText(), "Financial Reports");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Financial Reports'])[3]/following::span[1]"))
				.getText(), "Report Settings");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='To Period'])[1]/following::button[1]"))
				.getText(), "SEARCH");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::span[1]"))
				.getText(), "Financial Report");
		assertEquals(driver.findElement(By.xpath(
				"//md-card-content[@id='queryForm']/div/div[1]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Report']"))
				.getText(), "Report");
		/*
		 * assertEquals(driver.findElement(By.xpath(
		 * "//md-card-content[@id='queryForm']/div/div[1]/md-input-container[3]/input[@name='vmTitle']"
		 * )).getText(), "Report Title");
		 */
		assertEquals(driver
				.findElement(By.xpath(
						"//md-card-content[@id='queryForm']/div/div[1]/md-input-container[4]/label[@class='ng-scope']"))
				.getText(), "Unit");
		assertEquals(driver
				.findElement(By.xpath(
						"//md-card-content[@id='queryForm']/div/div[1]/md-input-container[2]/label[@class='ng-scope']"))
				.getText(), "Include Draft Entry");
	}
	@Test
	public void GeneralLedgerReport() throws InterruptedException {
	    driver.get(GetBaseUrl()+"/Accounting/Reporting/GeneralLedgerReport");
	    sleep(5);
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General Ledger Report'])[2]/following::h2[1]")).getText(), "General Ledger Report");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::span[1]")).getText(), "General Ledger Report");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General Ledger Report'])[3]/following::span[1]")).getText(), "Report Settings");
	    assertEquals(driver.findElement(By.xpath("//md-card-content[@id='queryForm']/div/div[1]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Fiscal Year']")).getText(), "Fiscal Year");
	    assertEquals(driver.findElement(By.xpath("//md-card-content[@id='queryForm']/div/div[1]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Include Draft Entry");
	    assertEquals(driver.findElement(By.xpath("//md-card-content[@id='queryForm']/div/div[1]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Display Accounts");
	    assertEquals(driver.findElement(By.xpath("//md-card-content[@id='queryForm']/div/div[1]/md-input-container[4]/label[@class='ng-scope']")).getText(), "Report Sort By");
	    assertEquals(driver.findElement(By.xpath("//md-card-content[@id='queryForm']/div/div[2]//button[@type='button']")).getText(), "SEARCH");
	}
}
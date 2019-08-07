package xClubsys;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;

@Feature("Membership")
@Owner("Pisy")
@Stories(value = { @Story(value = "Conversion") })
public class Conversion extends config {
	@Test
	public void MembershipConversionHistory() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Membership/Members/MembershipConversion/List");
		sleep(5);
		assertEquals(driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText(),
				"NEW MEMBERSHIP CONVERSION");
		assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Membership Conversion History");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//div[@class='content-body ng-scope']/md-card/md-card/md-table-container//span[.='Member ID']"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[1]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Old Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Old Membership Type'])[3]/following::span[1]"))
				.getText(), "New Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='New Membership Type'])[3]/following::span[1]"))
				.getText(), "Conversion Fee");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Conversion Fee'])[1]/following::span[1]"))
				.getText(), "Effective Date");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText(), "Transaction Date");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Transaction Date'])[1]/following::span[1]"))
				.getText(), "Status");
	}

	@Test
	public void NewMembershipConversion() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Membership/Members/MembershipConversion/create");
		sleep(5);
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Members'])[2]/following::h2[1]"))
				.getText(), "Membership Conversion");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Conversion'])[1]/following::span[1]"))
				.getText(), "Original Member");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Date'])[1]/following::span[1]"))
				.getText(), "Conversion To");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Effective Date is required.'])[1]/following::span[1]"))
				.getText(), "Transaction");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div/md-input-container[1]/label[.='Member Id']"))
				.getText(), "Member Id");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div/md-input-container[2]/label[@class='ng-scope']"))
				.getText(), "Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div/md-input-container[3]/label[@class='ng-scope']"))
				.getText(), "Membership Date");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-card-content[@class='collapse ng-scope']//md-select[@role='listbox']/md-select-value/span[.='New Membership Type']"))
				.getText(), "New Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-card-content[@class='collapse ng-scope']/div/div/md-input-container[2]/label[@class='ng-scope']"))
				.getText(), "New Member ID");
		assertEquals(driver.findElement(By.cssSelector(".hint span")).getText(),
				"Auto population by system if not entry");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-card-content[@class='collapse ng-scope']/div/div/md-input-container[3]/label[.='Effective  Date']"))
				.getText(), "Effective Date");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[3]//md-select[@role='listbox']/md-select-value/span[.='Conversion Fee Type']"))
				.getText(), "Conversion Fee Type");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[3]/div/div[1]/md-input-container[2]/label[@class='ng-scope']"))
				.getText(), "Conversion Fee Amount");
		assertEquals(driver
				.findElement(
						By.cssSelector("[az-title] .layout-row:nth-of-type(2) [flex-md='25']:nth-of-type(1) label"))
				.getText(), "Generate Conversion Fee Invoice");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[3]/div/div[2]/md-input-container[2]/label[.='Transaction Date']"))
				.getText(), "Transaction Date");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[3]/div/div[3]/md-input-container/label[@class='ng-scope']"))
				.getText(), "Remarks");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Remarks'])[1]/following::button[1]"))
				.getText(), "SAVE AS DRAFT");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Save as Draft'])[1]/following::button[1]"))
				.getText(), "SUBMIT");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Submit'])[1]/following::button[1]"))
				.getText(), "CANCEL");
	}
}
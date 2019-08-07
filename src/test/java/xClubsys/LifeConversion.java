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
@Stories(value = { @Story(value = "LifeConversion") })
public class LifeConversion extends config {
	@Test
	public void ConvertToLifMembership() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Membership/Members/ConvertMembership");
		sleep(5);
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Life Conversion'])[2]/following::h2[1]"))
				.getText(), "Convert To Life Membership");
		assertEquals(driver.findElement(By.xpath("//md-tab-item")).getText(), "CONVERSION");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member Name'])[1]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[1]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "From Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='From Membership Type'])[1]/following::span[1]"))
				.getText(), "To Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='To Membership Type'])[1]/following::span[1]"))
				.getText(), "Conversion Fee");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Conversion Fee'])[1]/following::span[1]"))
				.getText(), "Transaction Date");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Transaction Date'])[1]/following::span[1]"))
				.getText(), "Effective Date");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText(), "Status");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[2]")).getText(), "ELIGIBLE MEMBER");
		assertEquals(driver.findElement(By.xpath("//div[2]/div/a")).getText(), "NEW LIFE MEMBERSHIP");
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		sleep(2);
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member Name'])[2]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::th[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[2]/following::span[1]"))
				.getText(), "DOB");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DOB'])[1]/following::span[1]"))
				.getText(), "Duration (Months)");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Duration (Months)'])[1]/following::span[1]"))
				.getText(), "Outstanding Balance");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Outstanding Balance'])[1]/following::span[1]"))
				.getText(), "Effective Date");
	}

	@Test
	public void ConvertToLifeMembership() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Membership/Members/ConvertMembership/Create");
		sleep(5);

		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Type is required.'])[1]/following::span[1]"))
				.getText(), "Transaction");
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
		assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Convert To Life Membership");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[1]/label[@class='ng-scope']"))
				.getText(), "Member ID");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[2]/label[@class='ng-scope']"))
				.getText(), "Member Name");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[3]/label[@class='ng-scope']"))
				.getText(), "Original Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[2]/md-input-container/md-select[@role='listbox']"))
				.getText(), "Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[1]/md-input-container[1]/md-select[@role='listbox']"))
				.getText(), "Subscription Fee Type");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[1]/md-input-container[2]/label[@class='ng-scope']"))
				.getText(), "Reduced Subscription Fee");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[1]/md-input-container[3]/label[.='Life Membership Conversion Fee']"))
				.getText(), "Life Membership Conversion Fee");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[2]/md-input-container[1]/label[@class='ng-scope']"))
				.getText(), "Generate Conversion Debit Note");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[2]/md-input-container[2]/label[.='Transaction Date']"))
				.getText(), "Transaction Date");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[2]/md-input-container[3]/label[.='Effective Date']"))
				.getText(), "Effective Date");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[3]/md-input-container/label[@class='ng-scope']"))
				.getText(), "Remarks");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Convert To Life Membership'])[1]/following::span[1]"))
				.getText(), "Member");
	}
}

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
@Stories(value = { @Story(value = "AbsentMember") })
public class AbsentMember extends config {
	@Test
	public void AbsentMemberHistory() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Membership/Members/AbsentMember/List");
		sleep(5);
		assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Absent Member History");
		assertEquals(driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText(), "NEW MEMBER");
		assertEquals(driver.findElement(By.xpath("//md-tab-item")).getText(), "DRAFT");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[2]")).getText(), "PENDING");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[3]")).getText(), "FINAL");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='To Date'])[1]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Absent From");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Absent From'])[1]/following::span[1]"))
				.getText(), "Absent To");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Absent To'])[1]/following::span[1]"))
				.getText(), "Privilege Days");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Privilege Days'])[1]/following::span[1]"))
				.getText(), "Remarks");
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		sleep(2);
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='To Date'])[1]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Absent From");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Absent From'])[1]/following::span[1]"))
				.getText(), "Absent To");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Absent To'])[1]/following::span[1]"))
				.getText(), "Privilege Days");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Privilege Days'])[1]/following::span[1]"))
				.getText(), "Remarks");
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		sleep(2);
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='To Date'])[1]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Absent From");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Absent From'])[1]/following::span[1]"))
				.getText(), "Absent To");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Absent To'])[1]/following::span[1]"))
				.getText(), "Privilege Days");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Privilege Days'])[1]/following::span[1]"))
				.getText(), "Remarks");
	}

	@Test
	public void CreateAbsentMember() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Membership/Members/AbsentMember/Create");
		sleep(5);
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Absent Member'])[2]/following::h2[1]"))
				.getText(), "Create Absent Member");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Status is required.'])[1]/following::span[1]"))
				.getText(), "Absent Detail");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Absent Member'])[2]/following::span[2]"))
				.getText(), "Member");
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
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[1]/label[.='Member ID']"))
				.getText(), "Member ID");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[2]/label[.='Name']"))
				.getText(), "Name");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[3]/label[.='Current Membership Status']"))
				.getText(), "Current Membership Status");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[1]/md-input-container[1]/label[.='Absent Type']"))
				.getText(), "Absent Type");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[1]/md-input-container[2]/label[.='Absent From']"))
				.getText(), "Absent From");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[1]/md-input-container[3]/label[.='Absent Months']"))
				.getText(), "Absent Months");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[2]/md-input-container[1]/label[.='Absent To']"))
				.getText(), "Absent To");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[2]/md-input-container[2]/label[@class='ng-scope']"))
				.getText(), "Charge to Account");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[2]/md-input-container[3]/label[@class='ng-scope']"))
				.getText(), "Privilege Days");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[2]/div/div[3]/md-input-container/label[@class='ng-scope']"))
				.getText(), "Remarks");
	}
}
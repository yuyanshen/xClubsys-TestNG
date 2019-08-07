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
@Stories(value = { @Story(value = "IDChange") })
public class IDChange extends config {
	@Test
	public void ChangeMemberID() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Membership/Members/ChangeMemberId");
		sleep(4);
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Done'])[1]/following::span[2]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Old Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Old Member ID'])[2]/following::span[1]"))
				.getText(), "New Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='New Member ID'])[2]/following::span[1]"))
				.getText(), "Transaction Date");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Transaction Date'])[1]/following::span[1]"))
				.getText(), "Status");
		assertEquals(driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText(),
				"CHANGE MEMBER ID");
		assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Change Member ID");
	}
		@Test
		public void MemberIdChange() throws InterruptedException {
			driver.get(GetBaseUrl() + "/Membership/Members/ChangeMemberId/Create");
			sleep(5);
			assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ID Change'])[2]/following::h2[1]")).getText(), "Member Id Change");
		    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[1]/label[.='Member ID']")).getText(), "Member ID");
		    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[2]/label[.='Name']")).getText(), "Name");
		    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[3]/label[.='Membership Type']")).getText(), "Membership Type");
		    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[1]/label[.='New Member ID']")).getText(), "New Member ID");
		    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[2]/label[.='ID Change Fee']")).getText(), "ID Change Fee");
		    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Generate ID Change invoice");
		    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[1]/label[@class='ng-scope']")).getText(), "Transaction Date");
		    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[2]/label[.='Effective Date']")).getText(), "Effective Date");
		    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[4]/md-input-container/label[@class='ng-scope']")).getText(), "SOA Description");
		    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remarks'])[1]/following::button[1]")).getText(), "SAVE AS DRAFT");
		    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save as Draft'])[1]/following::button[1]")).getText(), "SUBMIT");
		    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Submit'])[1]/following::button[1]")).getText(), "CANCEL");
		    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[5]/md-input-container/label[@class='ng-scope']")).getText(), "Remarks");
		}
}
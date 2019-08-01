package xClubsys;

import org.testng.annotations.*;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
@Feature("Membership AR")
@Owner("Pisy")
@Stories(value = { @Story(value = "StatementEnquiry") })
public class StatementEnquiry extends config {
	@Test
	public void StatementEnquiry() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/SOA/List");
		sleep(5);
		assertEquals("Statement",
				driver.findElement(By.xpath(
						"//div[@id='top']//h2[@class='ng-binding']"))
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
		assertEquals("MONTH END CLOSING",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Statements'])[1]/following::button[1]"))
						.getText());
	}
	@Test
	public void StatementEnquiry_StatementsSetting() throws InterruptedException {
		
		driver.get(GetBaseUrl()+"/MembershipAR/AR/Invoice/StatementsSetting");
		sleep(5);
		assertEquals(driver.findElement(By.xpath("//div[@id='top']//h2[@class='ng-binding']")).getText(), "Statements Setting");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Statements Setting'])[1]/following::span[1]")).getText(), "Club Information");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]")).getText(), " UPLOAD IMAGE ");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[1]/div/div/md-input-container[2]/label[@class='md-state ng-scope']")).getText(), "Name");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Other Info'])[1]/following::span[1]")).getText(), "Statement Information");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[1]/div/div/md-input-container[3]/label[@class='md-state ng-scope']")).getText(), "Other Info");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[2]/div/div/md-input-container[1]/label[@class='md-state ng-scope']")).getText(), "Announcement");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[2]/following::button[1]")).getText(), "SAVE");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[2]/following::span[1]")).getText(), " UPLOAD IMAGE ");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[2]/div/div/md-input-container[2]/label[@class='md-state ng-scope']")).getText(), "Promotion");
	}
}

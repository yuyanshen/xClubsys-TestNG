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
@Stories(value = { @Story(value = "Renewal") })
public class Renewal extends config {
	@Test
	public void RenewTermMembership() throws InterruptedException {
		driver.get(GetBaseUrl()+"/Membership/Members/RenewMembership");
		sleep(5);
	    assertEquals(driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText(), "NEW TERM MEMBERSHIP");
	    assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Renew Term Membership");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[1]/following::span[1]")).getText(), "Name");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]")).getText(), "Membership Type");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Membership Type'])[4]/following::span[1]")).getText(), "Renew Fee Type");
	    assertEquals(driver.findElement(By.cssSelector("th.md-column.ng-isolate-scope.md-sort > span")).getText(), "Member ID");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Renew Fee Type'])[1]/following::span[1]")).getText(), "Renew Fee");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Renew Fee'])[1]/following::span[1]")).getText(), "Transaction Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transaction Date'])[1]/following::span[1]")).getText(), "Old Expiry Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Old Expiry Date'])[1]/following::span[1]")).getText(), "New Expiry Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='New Expiry Date'])[1]/following::span[1]")).getText(), "Status");
	}
	@Test
	public void NewTermMembership() throws InterruptedException {
		driver.get(GetBaseUrl()+"/Membership/Members/RenewMembership/Create");
		sleep(5);
		assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Renewal'])[2]/following::h2[1]")).getText(), "Renew Term Membership");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remarks'])[1]/following::button[1]")).getText(), "SAVE AS DRAFT");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save as Draft'])[1]/following::button[1]")).getText(), "SUBMIT");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Submit'])[1]/following::button[1]")).getText(), "CANCEL");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[1]/md-input-container[1]/label[.='Member Id']")).getText(), "Member Id");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[1]/md-input-container[2]/label[.='Member Name']")).getText(), "Member Name");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[1]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Membership Type");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div[1]/md-input-container[1]/label[@class='ng-scope']")).getText(), "Old Expiry Date");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div[1]/md-input-container[2]/label[.='No. of Years']")).getText(), "No. of Years");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div[1]/md-input-container[3]/label[.='New Expiry  Date']")).getText(), "New Expiry Date");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div[3]/md-input-container/label[.='Transaction Date']")).getText(), "Transaction Date");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[3]/md-input-container/label[@class='ng-scope']")).getText(), "SOA Description");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[4]/md-input-container/label[@class='ng-scope']")).getText(), "Remarks");	
	}
	
}
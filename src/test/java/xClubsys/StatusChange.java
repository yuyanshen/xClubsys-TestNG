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
@Stories(value = { @Story(value = "StatusChange") })
public class StatusChange extends config {
	@Test
	public void MembershipStatusChangeList() throws InterruptedException {
	driver.get(GetBaseUrl()+"/Membership/Members/ChangeMemberShipStatus/list");
	assertEquals(driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText(), "MEMBERSHIP STATUS CHANGE");
	assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Membership Status Change");
	assertEquals(driver.findElement(By.cssSelector("th.md-column.ng-isolate-scope.md-sort > span")).getText(), "Member ID");
	assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]")).getText(), "Name");
	assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]")).getText(), "Old Membership Status");
	assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Old Membership Status'])[2]/following::span[1]")).getText(), "New Membership Status");
	assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='New Membership Status'])[2]/following::span[1]")).getText(), "Changed Date");
	assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Changed Date'])[1]/following::span[1]")).getText(), "Status");	
	}
	@Test
	public void MembershipStatusChange() throws InterruptedException {
	driver.get(GetBaseUrl()+"/Membership/Members/ChangeMemberShipStatus/create");
	sleep(5);
	assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Membership Status Change");
    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[1]/md-input-container[1]/label[.='Member Id']")).getText(), "Member Id");
    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[1]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Member Name");
    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[1]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Current Membership Status");
    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[2]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='New Membership Status']")).getText(), "New Membership Status");
    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/md-input-container[2]/label[.='Effective Date']")).getText(), "Effective Date");
    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Charge To Account");
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remarks'])[1]/following::button[1]")).getText(), "SAVE AS DRAFT");
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save as Draft'])[1]/following::button[1]")).getText(), "SUBMIT");
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Submit'])[1]/following::button[1]")).getText(), "CANCEL");
    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[3]/md-input-container/label[@class='ng-scope']")).getText(), "Remarks");
	}
}

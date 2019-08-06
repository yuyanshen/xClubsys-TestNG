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
@Stories(value = { @Story(value = "Committee") })
public class Committee extends config {
	@Test
	public void Committee() throws InterruptedException {
		driver.get(GetBaseUrl()+"/Membership/Members/Committee/list");
		sleep(5);
		assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member Name'])[2]/preceding::span[1]")).getText(), "Member ID");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]")).getText(), "Member Name");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member Name'])[2]/following::span[1]")).getText(), "Committee Role");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Committee Role'])[3]/following::span[1]")).getText(), "Effective Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[2]/following::span[1]")).getText(), "Expiry Date");
	    assertEquals(driver.findElement(By.cssSelector("[href='\\/Membership\\/Members\\/Committee\\/Create']")).getText(), "NEW COMMITTEE MEMBER");
	}
	@Test
	public void  CreateCommitteeMember() throws InterruptedException {
		driver.get(GetBaseUrl()+"/Membership/Members/Committee/Create");
		sleep(10);
		assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Create Committee Member");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[1]/md-input-container[1]/label[.='Member ID']")).getText(), "Member ID");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[1]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Member Name");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[1]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Old Membership Type");
		/*
		 * assertEquals(driver.findElement(By.xpath(
		 * "//*[@id=\"mCSB_1_container\"]/div/div[2]/form/md-card/md-card-content[1]/div/div[2]/md-input-container[1]/label/text()"
		 * )).getText(), "Effective Date");
		 */
	    assertEquals(driver.findElement(By.cssSelector("[class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-offset-gt-sm-5 flex-md-20 flex-gt-md-20 ng-empty'] .md-required")).getText(), "Expiry Date");
	    assertEquals(driver.findElement(By.cssSelector(".md-select-placeholder span:nth-of-type(1)")).getText(), "Committee Role");
	    assertEquals(driver.findElement(By.cssSelector(".ng-scope.ng-valid-pattern")).getText(), "Member Account (Must be e-mail)");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[4]/md-input-container/label[@class='ng-scope']")).getText(), "Remarks");
	    assertEquals(driver.findElement(By.cssSelector("[az-name] div [type='submit']:nth-of-type(1)")).getText(), "SAVE AS DRAFT");
	    assertEquals(driver.findElement(By.cssSelector("[az-name] div [type='submit']:nth-of-type(2)")).getText(), "SUBMIT");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[2]/div/button[@type='button']")).getText(), "CANCEL");
		}
	}
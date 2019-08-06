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
@Stories(value = { @Story(value = "CardPrintingFilePackage") })
public class CardPrintingFilePackage extends config {
	@Test
	public void CardPrintingFilePackage() throws InterruptedException {
	    driver.get(GetBaseUrl()+"/Membership/Members/CardPrintFilePackage");
	    sleep(5);
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Card Printing File Package'])[2]/following::h2[1]")).getText(), "Card Printing File Package");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[1]/following::button[1]")).getText(), "SEARCH");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::button[1]")).getText(), "GENERATE FILE");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Generate File'])[1]/following::button[1]")).getText(), "CLEAR");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='azForm']/md-card/md-card-content[1]/div[1]/md-input-container[1]/label[@class='ng-scope']")).getText(), "Card Printing From Date");
	    assertEquals(driver.findElement(By.cssSelector("[class='ng-pristine ng-untouched ng-valid _md-datepicker-floating-label flex-offset-gt-sm-5 flex-md-20 flex-gt-md-20 ng-empty'] label")).getText(), "Card Printing To Date");
	    assertEquals(driver.findElement(By.cssSelector(".md-select-placeholder span:nth-of-type(1)")).getText(), "Card Type");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='azForm']/md-card/md-card-content[1]/div[1]/md-input-container[4]/label[@class='ng-scope']")).getText(), "Member ID");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[1]")).getText(), "Relationship Type");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Relationship Type'])[1]/following::span[1]")).getText(), "Member ID");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]")).getText(), "Name");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]")).getText(), "Expiry Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Expiry Date'])[1]/following::span[1]")).getText(), "Member Status");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member Status'])[1]/following::span[1]")).getText(), "Card No");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Card No'])[1]/following::span[1]")).getText(), "Smart Card CSN");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Card Printing From Date'])[1]/following::div[2]")).click();
	    sleep(1);
	    driver.findElement(By.cssSelector(".md-scroll-mask")).click();
	    sleep(1);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Card Printing To Date'])[1]/following::div[2]")).click();
	    sleep(1);
	    driver.findElement(By.cssSelector(".md-scroll-mask")).click();
	    sleep(1);
	    driver.findElement(By.xpath("//md-select")).click();
	    sleep(1);
	    driver.findElement(By.xpath("//md-backdrop")).click();
	}
}
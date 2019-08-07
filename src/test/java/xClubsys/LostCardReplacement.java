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
@Stories(value = { @Story(value = "LostCardReplacement") })
public class LostCardReplacement extends config {
	@Test
	public void CardReplacementHistory() throws InterruptedException {
		driver.get(GetBaseUrl()+"/Membership/Members/CardReplacement/List");
	    assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Card Replacement History");
	    assertEquals(driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText(), "CARD REPLACEMENT");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Done'])[1]/following::span[2]")).getText(), "Member ID");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]")).getText(), "Name");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Replacement Date'])[1]/following::span[1]")).getText(), "Old Card No.");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Old Card No.'])[2]/following::span[1]")).getText(), "New Card No.");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='New Card No.'])[2]/following::span[1]")).getText(), "Transaction Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transaction Date'])[1]/following::span[1]")).getText(), "Remarks");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]")).getText(), "Replacement Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remarks'])[1]/following::span[1]")).getText(), "Status");
	}
	@Test
	public void CardReplacement() throws InterruptedException {
		driver.get(GetBaseUrl()+"/Membership/Members/CardReplacement/Create");
		sleep(5);
		assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Card Replacement");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[1]/label[.='Member ID']")).getText(), "Member ID");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Existing Card No.");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Existing RFID / NFC No.");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[1]/label[@class='ng-scope']")).getText(), "New Card No.");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[2]/label[@class='ng-scope']")).getText(), "New RFID / NFC No.");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[3]/label[.='Replacement Date']")).getText(), "Replacement Date");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[1]/label[.='Replacement Fee']")).getText(), "Replacement Fee");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Generate Replacement Fee Invoice");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[3]/label[.='Transaction Date']")).getText(), "Transaction Date");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//md-select[@role='listbox']/md-select-value/span[.='Reason For Replacement']")).getText(), "Reason For Replacement");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[4]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Charge");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[5]/md-input-container/label[@class='ng-scope']")).getText(), "SOA Description");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[6]/md-input-container/label[@class='ng-scope']")).getText(), "Remarks");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remarks'])[1]/following::button[1]")).getText(), "SAVE AS DRAFT");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save as Draft'])[1]/following::button[1]")).getText(), "SUBMIT");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Submit'])[1]/following::button[1]")).getText(), "CANCEL");
		}
}

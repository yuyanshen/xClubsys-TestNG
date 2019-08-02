package xClubsys;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

import static org.testng.Assert.*;

import org.openqa.selenium.*;

@Feature("GL")
@Owner("Pisy")
@Stories(value = { @Story(value = "JournalEntries") })
public class JournalEntries extends config {
	@Test
	public void JournalEntries() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Accounting/Journal/Entries");
		sleep(5);
		driver.findElement(
				By.xpath("//div[@id='main']/div[1]/div//md-pagination-wrapper[@role='tablist']/md-tab-item[1]"))
				.click();
		sleep(5);
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Journal Entries'])[4]/following::h2[1]"))
				.getText(), "Journal Entries");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Journal Entries'])[5]/following::button[1]"))
				.getText(), "+ NEW JOURNAL ENTRY");
		assertEquals(driver.findElement(By.xpath("//md-tab-item")).getText(), "ALL");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[2]")).getText(), "DRAFT");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[3]")).getText(), "POSTED");
		assertEquals(driver.findElement(By.cssSelector("th.md-column.ng-isolate-scope.md-sort > span")).getText(),
				"Date");
		assertEquals(driver.findElement(By.cssSelector(".md-sort:nth-of-type(5) span")).getText(), "Period");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
				.getText(), "Period");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::span[1]"))
				.getText(), "Number");
		assertEquals(driver.findElement(By.cssSelector(".md-sort:nth-of-type(7) span")).getText(), "Amount");
		assertEquals(driver.findElement(By.xpath("//th[7]/span")).getText(), "Amount");
		assertEquals(driver.findElement(By.xpath("//th[8]/span")).getText(), "Status");
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		sleep(5);
		assertEquals(driver.findElement(By.xpath("//th[9]/span")).getText(), "Credit");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Journal'])[3]/following::span[1]"))
				.getText(), "Debit");
		assertEquals(driver.findElement(By.cssSelector("th.md-column.ng-isolate-scope.md-sort > span")).getText(),
				"Date");
		assertEquals(driver.findElement(By.xpath("//th[5]/span")).getText(), "Reference");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
				.getText(), "Period");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::span[1]"))
				.getText(), "Number");
		assertEquals(driver.findElement(By.xpath("//th[7]/span")).getText(), "Journal");
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		sleep(5);
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
				.getText(), "Period");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Journal'])[3]/following::span[1]"))
				.getText(), "Amount");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::span[1]"))
				.getText(), "Number");
		assertEquals(driver.findElement(By.cssSelector("th.md-column.ng-isolate-scope.md-sort > span")).getText(),
				"Date");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Period'])[2]/following::span[1]"))
				.getText(), "Journal");
		assertEquals(driver.findElement(By.xpath("//th[8]/span")).getText(), "Module");
		assertEquals(driver.findElement(By.xpath("//th[4]/span")).getText(), "Reference");
	}

	@Test
	public void NewJournalEntries() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Accounting/Journal/Entries/Create");
		sleep(5);
		assertEquals(driver.findElement(By.xpath("//div[@id='top']//h2[@class='ng-binding']")).getText(),
				"New Journal Entries");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='azForm']//ng-include[@src='vm.operationsTemplateUrl()']/md-menu[1]/button[@type='button']"))
				.getText(), "SAVE AS DRAFTarrow_drop_down");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Save & add another'])[1]/following::button[1]"))
				.getText(), "POSTmore_vert");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Post & and another'])[1]/following::button[1]"))
				.getText(), "CANCEL");
		assertEquals(driver.findElement(By.xpath("//md-tab-item")).getText(), "JOURNAL ITEMS");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[2]")).getText(), "OTHER INFO");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Account'])[1]/following::span[1]"))
				.getText(), "Description");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Description'])[2]/following::span[1]"))
				.getText(), "Tax Rate");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Tax Rate'])[1]/following::span[1]"))
				.getText(), "Debit");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit'])[1]/following::span[1]"))
				.getText(), "Credit");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Other Info'])[2]/following::span[2]"))
				.getText(), "Account");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='azForm']/md-card/md-card-content[1]/div[2]/md-input-container/label[@class='ng-scope']"))
				.getText(), "Description");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='azForm']//md-select[@role='listbox']/md-select-value/span[.='Journal']"))
				.getText(), "Journal");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='azForm']/md-card/md-card-content[1]/div[1]/md-input-container[3]/label[@class='ng-scope']"))
				.getText(), "Reference");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='azForm']/md-card/md-card-content[1]/div[1]/md-input-container[2]/label[.='Date']"))
				.getText(), "Date");
	}

	@Test
	public void JournalItems() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Accounting/Journal/Items");
		sleep(5);
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Journal Items'])[2]/following::h2[1]"))
				.getText(), "Journal Items");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Posted'])[2]/following::span[1]"))
				.getText(), "Date");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::span[1]"))
				.getText(), "Entry #");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Entry #'])[1]/following::span[1]"))
				.getText(), "Journal");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Journal'])[3]/following::span[1]"))
				.getText(), "Description");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[1]"))
				.getText(), "Reference");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
				.getText(), "Account");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Account'])[2]/following::span[1]"))
				.getText(), "Debit");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit'])[1]/following::span[1]"))
				.getText(), "Credit");
		assertEquals(driver.findElement(By.xpath("//md-tab-item")).getText(), "ALL");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[2]")).getText(), "DRAFT");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[3]")).getText(), "POSTED");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//div[@class='content-body ng-scope']/div[2]/div/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Journal']"))
				.getText(), "Journal");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//div[@class='content-body ng-scope']/div[2]/div/md-input-container[2]/md-select[@role='listbox']/md-select-value/span[.='Period']"))
				.getText(), "Period");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//div[@class='content-body ng-scope']/div[2]/div/md-input-container[3]/label[@class='ng-scope']"))
				.getText(), "Account");
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		sleep(5);
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Posted'])[2]/following::span[1]"))
				.getText(), "Date");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::span[1]"))
				.getText(), "Entry #");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Entry #'])[1]/following::span[1]"))
				.getText(), "Journal");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Journal'])[3]/following::span[1]"))
				.getText(), "Description");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[1]"))
				.getText(), "Reference");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
				.getText(), "Account");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Account'])[2]/following::span[1]"))
				.getText(), "Debit");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit'])[1]/following::span[1]"))
				.getText(), "Credit");
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		sleep(5);
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Posted'])[2]/following::span[1]"))
				.getText(), "Date");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::span[1]"))
				.getText(), "Entry #");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Entry #'])[1]/following::span[1]"))
				.getText(), "Journal");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Journal'])[3]/following::span[1]"))
				.getText(), "Description");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[1]"))
				.getText(), "Reference");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[1]/following::span[1]"))
				.getText(), "Account");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Account'])[2]/following::span[1]"))
				.getText(), "Debit");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit'])[1]/following::span[1]"))
				.getText(), "Credit");
	}
}
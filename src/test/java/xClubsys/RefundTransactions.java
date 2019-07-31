package xClubsys;

import org.testng.annotations.*;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
@Feature("Membership AR")
@Owner("Pisy")
@Stories(value = { @Story(value = "RefundTransactions") })
public class RefundTransactions extends config {
	@Test
	public void RefundTransactions() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/RefundTransaction/List");
		sleep(10);
		assertEquals("Refund Transactions", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Refund Transaction'])[2]/following::h2[1]"))
				.getText());
		assertEquals("Refund Type",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]"))
						.getText());
		assertEquals("Batch ID",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Refund Type'])[2]/following::span[1]"))
						.getText());
		assertEquals("Reference",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Batch ID'])[2]/following::span[1]"))
						.getText());
		assertEquals("Offset Outstanding Balance",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Reference'])[2]/following::span[1]"))
						.getText());
		assertEquals("Auto Bill To AP", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Offset Outstanding Balance'])[1]/following::span[1]"))
				.getText());
		assertEquals("Refund Date", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Auto Bill To AP'])[1]/following::span[1]"))
				.getText());
		assertEquals("NEW REFUND TRANSACTION", driver.findElement(By.xpath("//div[2]/div/a")).getText());
		driver.findElement(By.xpath("//div[2]/div/a")).click();
		Thread.sleep(3000);
		assertEquals("Create Refund Transaction",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Membership AR'])[2]/following::h2[1]"))
						.getText());
		assertEquals("1.Find & select matching members",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DRAFT'])[1]/following::span[1]"))
						.getText());
		assertEquals("2.View your selected members",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Deposit'])[1]/following::span[1]"))
						.getText());
		assertEquals("3.Set refund details",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Deposit'])[1]/following::span[2]"))
						.getText());
		assertEquals("4.Review members refund results", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Auto Bill to AP'])[1]/following::span[1]"))
				.getText());
		assertEquals("DRAFT", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Create Refund Transaction'])[1]/following::h4[1]"))
				.getText());
		assertEquals("Member",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[1]"))
						.getText());
		assertEquals("Status",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Status'])[1]/following::span[1]"))
						.getText());
		assertEquals("Member", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Auto Bill to AP'])[1]/following::span[2]"))
				.getText());
		assertEquals("Status",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[3]/following::span[1]"))
						.getText());
		assertEquals("Deposit",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Status'])[2]/following::span[1]"))
						.getText());
		assertEquals("Credit",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Deposit'])[2]/following::span[1]"))
						.getText());
		assertEquals("Deposit + Credit",
				driver.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit'])[1]/following::th[1]"))
						.getText());
		assertEquals("Outstanding", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Deposit + Credit'])[1]/following::span[1]"))
				.getText());
		assertEquals("Unposted",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Outstanding'])[1]/following::span[1]"))
						.getText());
		assertEquals("Refund Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Unposted'])[1]/following::span[1]"))
						.getText());
		assertEquals("CANCEL", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Save & submit for Approval'])[1]/following::button[1]"))
				.getText());
		assertEquals("SEARCH", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Effective Date To'])[1]/following::button[2]"))
				.getText());
		assertEquals("CLEAR",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::button[1]"))
						.getText());
		assertEquals("Member", driver
				.findElement(By.xpath("//*[@id=\"section_0\"]/div/div[1]/md-input-container[2]/label")).getText());
		assertEquals("", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[3]/md-datepicker[@name='EffectiveDate']//input[@class='md-datepicker-input md-input']"))
				.getText());
		assertEquals("", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div/div[1]/md-input-container[4]/md-datepicker[@name='EffectiveDateTo']//input[@class='md-datepicker-input md-input']"))
				.getText());
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Effective Date To'])[1]/following::button[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Deposit'])[1]/following::div[5]"))
				.click();
		Thread.sleep(5000);
		assertEquals("Refund Types", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[1]/md-input-container[1]/label[.='Refund Types']"))
				.getText());
		assertEquals("Refund Date", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[1]/md-input-container[2]/label[.='Refund Date']"))
				.getText());
		assertEquals("Batch Id", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[1]/md-input-container[3]/label[@class='ng-scope']"))
				.getText());
		assertEquals("Payment Code", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[2]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Payment Code']"))
				.getText());
		assertEquals("Reference", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[2]/md-input-container[2]/label[@class='ng-scope']"))
				.getText());
		assertEquals("Charge Code", driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card/md-card-content[3]/div/div[3]/md-input-container[1]/md-select[@role='listbox']/md-select-value/span[.='Charge Code']"))
				.getText());
		driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Rows per page:'])[1]/following::span[3]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-card-content[3]/h4/span")).click();
		Thread.sleep(1000);
		assertEquals("SAVE arrow_drop_down", driver.findElement(By.xpath("//md-menu/button")).getText());
		driver.findElement(By.xpath("//md-menu/button")).click();
		Thread.sleep(1000);
		assertEquals("Save as Draft",
				driver.findElement(By.cssSelector("[role] md-menu-item:nth-of-type(1) [type]")).getText());
		assertEquals("Save & submit for Approval",
				driver.findElement(By.cssSelector("[role] md-menu-item:nth-of-type(2) [type]")).getText());
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Edit Image'])[1]/preceding::md-backdrop[1]"))
				.click();
		Thread.sleep(1000);
		assertEquals("CANCEL", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='arrow_drop_down'])[1]/following::button[1]"))
				.getText());
	}
}

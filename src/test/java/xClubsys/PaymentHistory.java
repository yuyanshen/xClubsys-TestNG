package xClubsys;

import org.testng.annotations.*;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
@Feature("Membership AR")
@Owner("Pisy")
@Stories(value = { @Story(value = "PaymentHistory") })
public class PaymentHistory extends config {
	@Test
	public void PaymentHistory() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/PaymentHistory/List");
		sleep(10);
		assertEquals("Payment History List",
				driver.findElement(By.xpath(
						"//div[@id='top']//h2[@class='ng-binding']"))
						.getText());
		assertEquals("NEW PAYMENT", driver.findElement(By.cssSelector("a.md-warn.md-button.md-ink-ripple")).getText());
		assertEquals("PAY FOR REMINDER", driver.findElement(By.xpath("//div[2]/div/a[2]")).getText());
		assertEquals("ALL", driver.findElement(By.xpath("//md-tab-item")).getText());
		assertEquals("Payment No",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]"))
						.getText());
		assertEquals("Member",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]"))
						.getText());		
		  assertEquals("Payment Code", driver.findElement(By
		  .xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"
		  )) .getText());
		assertEquals("Batch Id", driver.findElement(By.xpath("//th[5]/span")).getText());
		assertEquals("Cheque Number",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]"))
						.getText());
		assertEquals("Create Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount", driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Effective Date'])[1]/following::span[1]"))
				.getText());
		assertEquals("Balance",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("Status",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		Thread.sleep(5000);
		assertEquals("Payment No", driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Batch Transform'])[1]/following::span[2]"))
				.getText());
		assertEquals("Member",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]"))
						.getText());
		assertEquals("APPROVAL", driver.findElement(By.xpath("//md-tab-item[3]")).getText());
		assertEquals("REJECTED", driver.findElement(By.xpath("//md-tab-item[4]")).getText());
		assertEquals("VOID", driver.findElement(By.xpath("//md-tab-item[5]")).getText());
		assertEquals("DRAFT", driver.findElement(By.xpath("//md-tab-item[2]")).getText());
		assertEquals("Payment Code",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[1]/following::span[1]"))
						.getText());
		assertEquals("Batch Id",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment Code'])[2]/following::span[1]"))
						.getText());
		assertEquals("Cheque Number",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[1]/following::span[1]"))
						.getText());
		assertEquals("Balance",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("Create Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		Thread.sleep(5000);
		assertEquals("Payment No",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]"))
						.getText());
		assertEquals("Member",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]"))
						.getText());
		assertEquals("Payment Code",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"))
						.getText());
		assertEquals("Batch Id", driver.findElement(By.xpath("//th[5]/span")).getText());
		assertEquals("Cheque Number",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]"))
						.getText());
		assertEquals("Balance",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("Create Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[4]")).click();
		Thread.sleep(5000);
		assertEquals("Payment No",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]"))
						.getText());
		assertEquals("Member",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]"))
						.getText());
		assertEquals("Payment Code",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"))
						.getText());
		assertEquals("Batch Id", driver.findElement(By.xpath("//th[5]/span")).getText());
		assertEquals("Cheque Number",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]"))
						.getText());
		assertEquals("Balance",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("Create Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]"))
						.getText());
		assertEquals("Effective Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Create Date'])[1]/following::span[1]"))
						.getText());
		driver.findElement(By.xpath("//md-tab-item[5]")).click();
		Thread.sleep(5000);
		assertEquals("Payment No",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]"))
						.getText());
		assertEquals("Member",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment No'])[1]/following::span[1]"))
						.getText());
		assertEquals("Payment Code",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Member'])[2]/following::span[1]"))
						.getText());
		assertEquals("Batch Id",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Payment Code'])[2]/following::span[1]"))
						.getText());
		assertEquals("Cheque Number",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Batch Id'])[1]/following::span[1]"))
						.getText());
		assertEquals("Amount",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Cheque Number'])[2]/following::span[1]"))
						.getText());
		assertEquals("Balance",
				driver.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Amount'])[1]/following::span[1]"))
						.getText());
		assertEquals("Void Date",
				driver.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Balance'])[1]/following::span[1]"))
						.getText());
	}
	@Test
	public void PaymentHistory_NewPayment() throws InterruptedException{
		driver.get(GetBaseUrl() + "/MembershipAR/AR/PaymentHistory/Create");
		sleep(5);
		assertEquals(driver.findElement(By.xpath("//div[@id='top']//h2[@class='ng-binding']")).getText(), "New Payment");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remark'])[1]/following::button[1]")).getText(), "SAVE arrow_drop_down");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save & submit for Approval'])[1]/following::button[1]")).getText(), "CANCEL");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[1]/label[.='Member']")).getText(), "Member");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Payment No");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[1]/md-input-container[3]/label[.='Payment Purpose']")).getText(), "Payment Purpose");
		/*
		 * assertEquals(driver.findElement(By.
		 * xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[1]/label[.='Payment Code']"
		 * )).getText(), "Payment Code");
		 */
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[2]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Description");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[1]/label[@class='ng-scope']")).getText(), "Batch Id");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[2]/label[.='Amount']")).getText(), "Amount");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[3]/md-input-container[3]/label[.='Effective Date']")).getText(), "Effective Date");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card/md-card-content[1]/div[4]/md-input-container/label[@class='ng-scope']")).getText(), "Remark");
	}
	public void PaymentHistory_PaymentforReminder() throws InterruptedException{
		
	}
}

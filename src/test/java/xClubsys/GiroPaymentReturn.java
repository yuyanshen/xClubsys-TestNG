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
@Stories(value = { @Story(value = "GiroPaymentReturn") })

public class GiroPaymentReturn extends config {
	@Test
	public void BankReturnPay() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/CreditCardReturn/List");
		sleep(8);
		assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Giro Payment Return");
		assertEquals(driver.findElement(By.xpath("//md-tab-item")).getText(), "UOB");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[2]")).getText(), "OCBC");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[3]")).getText(), "CREDIT CARD");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[4]")).getText(), "NEW CREDIT CARD");
		assertEquals(driver.findElement(By.xpath("//th[2]/span")).getText(), "BIC Code");
		assertEquals(driver.findElement(By.xpath("//th[3]/span")).getText(), "Account No");
		assertEquals(driver.findElement(By.xpath("//th[4]/span")).getText(), "Account Name");
		assertEquals(driver.findElement(By.xpath("//th[5]/span")).getText(), "Total Number");
		assertEquals(driver.findElement(By.xpath("//th[6]/span")).getText(), "Total Amount");
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		sleep(4);
		assertEquals(driver.findElement(By.xpath("//th[2]/span")).getText(), "Type Code");
		assertEquals(driver.findElement(By.xpath("//th[3]/span")).getText(), "Clearing");
		assertEquals(driver.findElement(By.xpath("//th[4]/span")).getText(), "Report Generation Date");
		assertEquals(driver.findElement(By.xpath("//th[5]/span")).getText(), "Record Type");
		assertEquals(driver.findElement(By.xpath("//th[6]/span")).getText(), "Total Number");
		assertEquals(driver.findElement(By.xpath("//th[7]/span")).getText(), "Total Amount");
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		sleep(4);
		assertEquals(driver.findElement(By.xpath("//th[2]/span")).getText(), "Payee No");
		assertEquals(driver.findElement(By.xpath("//th[3]/span")).getText(), "org ID");
		assertEquals(driver.findElement(By.xpath("//th[4]/span")).getText(), "File Date");
		assertEquals(driver.findElement(By.xpath("//th[5]/span")).getText(), "Currency Code");
		assertEquals(driver.findElement(By.xpath("//th[6]/span")).getText(), "Total Amount");
		assertEquals(driver.findElement(By.xpath("//th[7]/span")).getText(), "Actual Total Amount");
		driver.findElement(By.xpath("//md-tab-item[4]")).click();
		sleep(4);
		assertEquals(driver.findElement(By.xpath("//th/span")).getText(), "Member ID");
		assertEquals(driver.findElement(By.xpath("//th[2]/span")).getText(), "Card No");
		assertEquals(driver.findElement(By.xpath("//th[3]/span")).getText(), "CVV2");
		assertEquals(driver.findElement(By.xpath("//th[4]/span")).getText(), "Transaction Date");
		assertEquals(driver.findElement(By.xpath("//th[5]/span")).getText(), "Last CreditCard Issue Date");
		assertEquals(driver.findElement(By.xpath("//th[6]/span")).getText(), "Expiry Date");
		assertEquals(driver.findElement(By.xpath("//th[7]/span")).getText(), "Status");
		assertEquals(
				driver.findElement(By.xpath("//a[contains(@href, 'MembershipAR/AR/GiroUpload/Create')]")).getText(),
				"UPLOAD OCBC");
		assertEquals(driver.findElement(By.xpath("//a[contains(@href, 'MembershipAR/AR/UBOUpload/Create')]")).getText(),
				"UPLOAD UOB");
		assertEquals(
				driver.findElement(By.xpath("//a[contains(@href, '/MembershipAR/AR/CreditUpload/Create')]")).getText(),
				"UPLOAD CREDIT");
		assertEquals(
				driver.findElement(By.xpath("//a[contains(@href, 'MembershipAR/AR/NewCreditCard/Create')]")).getText(),
				"UPLOAD NEW CREDIT CARD");
	}

	@Test
	public void UPLOADUOB() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/UBOUpload/Create");
		sleep(5);
		assertEquals(driver
				.findElement(By.xpath(
						"//div[@id='top']//h2[@class='ng-binding']"))
				.getText(), "UOB Upload");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]"))
				.getText(), "UPLOAD UOB FILE");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='only .txt can be uploaded'])[1]/following::span[2]"))
				.getText(), "File Name");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='File Name'])[1]/following::span[1]"))
				.getText(), "Date");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::button[1]"))
				.getText(), "CANCEL");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[2]//div[@class='flex']/button[1]"))
				.getText(), "SAVE");
	}

	@Test
	public void UPLOADOCBC() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/GiroUpload/Create");
		sleep(5);
		assertEquals(driver
				.findElement(By.xpath(
						"//div[@id='top']//h2[@class='ng-binding']"))
				.getText(), "OCBC Upload");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]"))
				.getText(), "UPLOAD OCBC FILE");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='only .txt can be uploaded'])[1]/following::span[2]"))
				.getText(), "File Name");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='File Name'])[1]/following::span[1]"))
				.getText(), "Date");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::button[1]"))
				.getText(), "CANCEL");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[2]//div[@class='flex']/button[1]"))
				.getText(), "SAVE");
	}

	@Test
	public void UPLOADCREDIT() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/CreditUpload/Create");
		sleep(5);
	    assertEquals(driver.findElement(By.xpath("//div[@id='top']//h2[@class='ng-binding']")).getText(), "Credit Card Upload");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]")).getText(), "UPLOAD CREDIT CARD FILE");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='only .txt can be uploaded'])[1]/following::span[2]")).getText(), "File Name");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='File Name'])[1]/following::span[1]")).getText(), "Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::button[1]")).getText(), "CANCEL");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[2]//div[@class='flex']/button[1]")).getText(), "SAVE");
	}

	@Test
	public void UPLOADNEWCREDITCARD() throws InterruptedException {
		driver.get(GetBaseUrl() + "/MembershipAR/AR/NewCreditCard/Create");
		sleep(5);
	    assertEquals(driver.findElement(By.xpath("//div[@id='top']//h2[@class='ng-binding']")).getText(), "Credit Card Upload");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='file_upload'])[1]/following::span[1]")).getText(), "UPLOAD CREDIT CARD FILE");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Upload Credit Card File'])[1]/following::button[1]")).getText(), "SHOW EXAMPLE");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='only .txt can be uploaded'])[1]/following::span[2]")).getText(), "File Name");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='File Name'])[1]/following::span[1]")).getText(), "Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::button[1]")).getText(), "CANCEL");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[3]//div[@class='flex']/button[1]")).getText(), "SAVE");
	}
}

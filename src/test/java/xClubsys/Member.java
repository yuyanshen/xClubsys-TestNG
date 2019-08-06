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
@Stories(value = { @Story(value = "Members") })
public class Member extends config {
	@Test
	public void Menber() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Membership/Members/list");
		sleep(5);
		assertEquals(driver.findElement(By.xpath("//md-tab-item")).getText(), "ALL");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[2]")).getText(), "ACTIVE");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[3]")).getText(), "DRAFT");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[4]")).getText(), "PENDING");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[5]")).getText(), "ABSENT");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[7]")).getText(), "TERMINATED");
		assertEquals(driver.findElement(By.cssSelector("h2.ng-binding")).getText(), "Members");
		assertEquals(driver
				.findElement(By.xpath(
						"//div[@id='main']/div[1]/div//a[@href='/Membership/Members/Create?MembershipStatus=Draft']"))
				.getText(), "NEW MEMBER");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Card Vehicle No'])[1]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Member Type");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member Type'])[2]/following::span[1]"))
				.getText(), "Reg ID");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reg ID'])[1]/following::span[1]"))
				.getText(), "Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Type'])[2]/following::span[1]"))
				.getText(), "Card No");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Card No'])[1]/following::span[1]"))
				.getText(), "Mobile");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mobile'])[2]/following::span[1]"))
				.getText(), "Homephone");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Homephone'])[2]/following::span[1]"))
				.getText(), "Email");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[2]/following::span[1]"))
				.getText(), "Address");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Address'])[2]/following::span[1]"))
				.getText(), "Membership Status");
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		sleep(5);
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Card Vehicle No'])[1]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Member Type");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member Type'])[2]/following::span[1]"))
				.getText(), "Reg ID");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reg ID'])[1]/following::span[1]"))
				.getText(), "Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Type'])[2]/following::span[1]"))
				.getText(), "Card No");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Card No'])[1]/following::span[1]"))
				.getText(), "Mobile");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mobile'])[2]/following::span[1]"))
				.getText(), "Homephone");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Homephone'])[2]/following::span[1]"))
				.getText(), "Email");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[2]/following::span[1]"))
				.getText(), "Address");
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		sleep(5);
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Card Vehicle No'])[1]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Member Type");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member Type'])[2]/following::span[1]"))
				.getText(), "Reg ID");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reg ID'])[1]/following::span[1]"))
				.getText(), "Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Type'])[2]/following::span[1]"))
				.getText(), "Card No");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Card No'])[1]/following::span[1]"))
				.getText(), "Mobile");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mobile'])[2]/following::span[1]"))
				.getText(), "Homephone");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Homephone'])[2]/following::span[1]"))
				.getText(), "Email");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[2]/following::span[1]"))
				.getText(), "Address");
		driver.findElement(By.xpath("//md-tab-item[4]")).click();
		sleep(5);
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Card Vehicle No'])[1]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Member Type");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member Type'])[2]/following::span[1]"))
				.getText(), "Reg ID");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reg ID'])[1]/following::span[1]"))
				.getText(), "Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Type'])[2]/following::span[1]"))
				.getText(), "Card No");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Card No'])[1]/following::span[1]"))
				.getText(), "Mobile");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mobile'])[2]/following::span[1]"))
				.getText(), "Homephone");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Homephone'])[2]/following::span[1]"))
				.getText(), "Email");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[2]/following::span[1]"))
				.getText(), "Address");
		driver.findElement(By.xpath("//md-tab-item[5]")).click();
		sleep(5);
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Card Vehicle No'])[1]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Member Type");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member Type'])[2]/following::span[1]"))
				.getText(), "Reg ID");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reg ID'])[1]/following::span[1]"))
				.getText(), "Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Type'])[2]/following::span[1]"))
				.getText(), "Card No");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Card No'])[1]/following::span[1]"))
				.getText(), "Mobile");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mobile'])[2]/following::span[1]"))
				.getText(), "Homephone");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Homephone'])[2]/following::span[1]"))
				.getText(), "Email");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[2]/following::span[1]"))
				.getText(), "Address");
		driver.findElement(By.xpath("//md-tab-item[6]")).click();
		sleep(5);
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Card Vehicle No'])[1]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Member Type");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member Type'])[2]/following::span[1]"))
				.getText(), "Reg ID");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reg ID'])[1]/following::span[1]"))
				.getText(), "Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Type'])[2]/following::span[1]"))
				.getText(), "Card No");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Card No'])[1]/following::span[1]"))
				.getText(), "Mobile");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mobile'])[2]/following::span[1]"))
				.getText(), "Homephone");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Homephone'])[2]/following::span[1]"))
				.getText(), "Email");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[2]/following::span[1]"))
				.getText(), "Address");
		driver.findElement(By.xpath("//md-tab-item[7]")).click();
		sleep(5);
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Card Vehicle No'])[1]/following::span[2]"))
				.getText(), "Member ID");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member ID'])[2]/following::span[1]"))
				.getText(), "Name");
		assertEquals(driver
				.findElement(
						By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name'])[1]/following::span[1]"))
				.getText(), "Member Type");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Member Type'])[2]/following::span[1]"))
				.getText(), "Reg ID");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reg ID'])[1]/following::span[1]"))
				.getText(), "Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership Type'])[2]/following::span[1]"))
				.getText(), "Card No");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Card No'])[1]/following::span[1]"))
				.getText(), "Mobile");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mobile'])[2]/following::span[1]"))
				.getText(), "Homephone");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Homephone'])[2]/following::span[1]"))
				.getText(), "Email");
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[2]/following::span[1]"))
				.getText(), "Address");
	}

	@Test
	public void Newmember() throws InterruptedException {
		driver.get(GetBaseUrl() + "/Membership/Members/Create?MembershipStatus=Draft");
		sleep(10);
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Members'])[2]/following::h2[1]"))
				.getText(), "New Member");
		/*
		 * assertEquals(driver.findElement(By.xpath(
		 * "//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[1]/md-input-container[1]"
		 * )) .getText(), "Member Type");
		 */
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[1]/md-input-container[2]/md-select[@role='listbox']/md-select-value/span[.='Membership Type']"))
				.getText(), "Membership Type");
		/*
		 * assertEquals(driver.findElement(By.xpath(
		 * "//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[1]/md-input-container[3]/label[.='Member ID']"
		 * )) .getText(), "Member ID");
		 */
		assertEquals(driver.findElement(By.xpath(
				"//*[@id=\"mCSB_1_container\"]/div/div[2]/form/md-card/md-card-content[1]/div/div[2]/div/div[2]/md-input-container[1]/label"))
				.getText(), "Member Name");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[2]/md-input-container[2]/label[.='Registration Type']"))
				.getText(), "Registration Type");
		assertEquals(driver.findElement(By.xpath(
				"//*[@id=\"mCSB_1_container\"]/div/div[2]/form/md-card/md-card-content[1]/div/div[2]/div/div[2]/div/div/md-input-container/label"))
				.getText(), "NRIC");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[3]/md-input-container[1]/label[@class='ng-scope']"))
				.getText(), "Card No.");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[3]/md-input-container[2]/label[@class='ng-scope']"))
				.getText(), "Smart Card CSN");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[3]/md-input-container[3]/label[@class='ng-scope']"))
				.getText(), "Name On Membership Card");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[4]/md-input-container[1]/label[@class='ng-scope']"))
				.getText(), "Opt Out For Hong Bao Distribution");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[4]/md-input-container[2]/label[@class='ng-scope']"))
				.getText(), "Opt For Physical SOA");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[4]/md-input-container[3]/label[@class='ng-scope']"))
				.getText(), "Deactivate Card Transaction");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='mCSB_1_container']/div/div[2]/form/md-card/md-card-content[2]/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item"))
				.getText(), "PROFILE");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Profile'])[1]/following::md-tab-item[1]"))
				.getText(), "COMPANY");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Company'])[1]/following::md-tab-item[1]"))
				.getText(), "EDUCATION LEVEL");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Education Level'])[1]/following::md-tab-item[1]"))
				.getText(), "CONTACT");
		assertEquals(driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact'])[1]/following::md-tab-item[1]"))
				.getText(), "SUBSCRIPTION FEE");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Subscription Fee'])[1]/following::md-tab-item[1]"))
				.getText(), "MEMBERSHIP");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Membership'])[2]/following::md-tab-item[1]"))
				.getText(), "PAYMENT MODE");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Payment Mode'])[1]/following::md-tab-item[1]"))
				.getText(), "MSL");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='MSL'])[1]/following::md-tab-item[1]"))
				.getText(), "FAMILY");
		assertEquals(driver
				.findElement(By.xpath(
						"(.//*[normalize-space(text()) and normalize-space(.)='Family'])[1]/following::md-tab-item[1]"))
				.getText(), "CAR PARK");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[12]")).getText(), "REMARKS");
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Car park'])[1]/following::md-tab-item[1]"))
				.getText(), "MISCELLANEOUS");
		assertEquals(driver.findElement(By.xpath("//md-tab-item[13]")).getText(), "ATTACHMENTS");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[1]//div[@class='ng-scope']/div[1]/md-input-container[1]/label[.='Full Name']"))
				.getText(), "Full Name");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[1]//div[@class='ng-scope']/div[1]/md-input-container[2]/label[.='Surname']"))
				.getText(), "Surname");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[1]//div[@class='ng-scope']/div[1]/md-input-container[3]/label[.='Gender']"))
				.getText(), "Gender");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper/md-tab-content[1]//div[@class='ng-scope']/div[1]/md-input-container[3]/md-radio-group[@role='radiogroup']/div[@value='1']/md-radio-button[@role='radio']/div[@class='md-label']"))
				.getText(), "Male");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper/md-tab-content[1]//div[@class='ng-scope']/div[1]/md-input-container[3]/md-radio-group[@role='radiogroup']/div[@value='2']/md-radio-button[@role='radio']/div[@class='md-label']"))
				.getText(), "Female");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper/md-tab-content[1]//div[@class='ng-scope']/div[2]/md-input-container[1]/md-select[@role='listbox']/md-select-value"))
				.getText(), "Title");
		/*
		 * assertEquals(driver.findElement(By.cssSelector(
		 * "md-tabs-content-wrapper .layout-row:nth-of-type(2) .ng-valid-md-maxlength"))
		 * .getText(), "Salutation");
		 */
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[1]//div[@class='ng-scope']/div[2]/md-input-container[3]/label[.='Nationality']"))
				.getText(), "Nationality");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[1]//div[@class='ng-scope']/div[3]/md-input-container[1]/md-select[@role='listbox']"))
				.getText(), "Race");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[1]//div[@class='ng-scope']/div[3]/md-input-container[2]/label[.='Birthday']"))
				.getText(), "Birthday");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[1]//div[@class='ng-scope']/div[3]/md-input-container[3]/label[@class='ng-scope']"))
				.getText(), "Age");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper/md-tab-content[1]//div[@class='ng-scope']/div[4]/md-input-container/md-select[@role='listbox']/md-select-value"))
				.getText(), "Marital Status");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper/md-tab-content[1]//div[@class='ng-scope']/div[5]/md-input-container/md-select[@role='listbox']/md-select-value/span[.='Interest Groups']"))
				.getText(), "Interest Groups");
		assertEquals(
				driver.findElement(By.cssSelector("md-tabs-content-wrapper [role='tabpanel']:nth-of-type(1) .md-title"))
						.getText(),
				"Sport");
		assertEquals(driver.findElement(By.cssSelector(
				"md-tabs-content-wrapper [role='tabpanel']:nth-of-type(1) .ng-isolate-scope:nth-of-type(2) span"))
				.getText(), "Sport Type");
		assertEquals(driver.findElement(By.cssSelector(
				"md-tabs-content-wrapper [role='tabpanel']:nth-of-type(1) .ng-isolate-scope:nth-of-type(3) span"))
				.getText(), "Activate Date");
		assertEquals(driver.findElement(By.cssSelector(
				"md-tabs-content-wrapper [role='tabpanel']:nth-of-type(1) .ng-isolate-scope:nth-of-type(4) span"))
				.getText(), "Expiry Date");
		assertEquals(driver.findElement(By.cssSelector("[az-name] div [type='submit']:nth-of-type(1)")).getText(),
				"SAVE AS DRAFT");
		assertEquals(driver.findElement(By.cssSelector("[az-name] div [type='submit']:nth-of-type(2)")).getText(),
				"SUBMIT");
		assertEquals(driver.findElement(By.cssSelector("[az-name] md-card-content:nth-of-type(3) [type='button']"))
				.getText(), "CANCEL");
		driver.findElement(By.xpath("//md-tab-item[2]")).click();
		sleep(3);
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[2]//div[@class='ng-scope']/div[1]/md-input-container[1]/label[@class='ng-scope']"))
				.getText(), "Name");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper/md-tab-content[2]//div[@class='ng-scope']/div[1]/md-input-container[2]/md-select[@role='listbox']/md-select-value/span[.='Designation']"))
				.getText(), "Designation");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper/md-tab-content[2]//div[@class='ng-scope']/div[1]/md-input-container[3]/md-select[@role='listbox']/md-select-value/span[.='Industry']"))
				.getText(), "Industry");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[2]//div[@class='ng-scope']/div[2]/md-input-container/label[@class='ng-scope']"))
				.getText(), "Address");
		sleep(3);
		driver.findElement(By.xpath("//md-tab-item[3]")).click();
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[3]//div[@class='ng-scope']/div/md-input-container[1]/label[@class='ng-scope']"))
				.getText(), "Graduation Year");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper/md-tab-content[3]//div[@class='ng-scope']/div/md-input-container[2]/md-select[@role='listbox']/md-select-value/span[.='Field Of Study']"))
				.getText(), "Field Of Study");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper/md-tab-content[3]//div[@class='ng-scope']/div/md-input-container[3]/md-select[@role='listbox']/md-select-value/span[.='Institution']"))
				.getText(), "Institution");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper/md-tab-content[3]//div[@class='ng-scope']/div/md-input-container[4]/md-select[@role='listbox']/md-select-value/span[.='Qualification']"))
				.getText(), "Qualification");
		driver.findElement(By.xpath("//md-tab-item[4]")).click();
		sleep(3);
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']//md-tabs/md-tabs-content-wrapper/md-tab-content[4]//div[@class='ng-scope']/div/md-input-container/md-select[@role='listbox']/md-select-value/span[.='Preferred Mode']")).getText(), "Preferred Mode");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Email'] .md-title")).getText(), "Email");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Email'] .ng-isolate-scope:nth-of-type(2) span")).getText(), "Email Type");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Email'] .ng-isolate-scope:nth-of-type(3) span")).getText(), "Email Address");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Email'] .ng-isolate-scope:nth-of-type(4) span")).getText(), "Alternate Email Address 1");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Email'] .ng-isolate-scope:nth-of-type(5) span")).getText(), "Alternate Email Address 2");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Email'] .ng-isolate-scope:nth-of-type(6) span")).getText(), "Opt For eSOA");
	    assertEquals(driver.findElement(By.cssSelector("md-card-title")).getText(), "Phone");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[4]//md-card-contend[@class='ng-scope']/div[1]/md-input-container[1]/label[@class='ng-scope']")).getText(), "Mobile 1");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[4]//md-card-contend[@class='ng-scope']/div[1]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Mobile 2");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[4]//md-card-contend[@class='ng-scope']/div[1]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Home 1");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[4]//md-card-contend[@class='ng-scope']/div[1]/md-input-container[4]/label[@class='ng-scope']")).getText(), "Home 2");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[4]//md-card-contend[@class='ng-scope']/div[2]/md-input-container[1]/label[@class='ng-scope']")).getText(), "Work 1");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[4]//md-card-contend[@class='ng-scope']/div[2]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Work 2");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[4]//md-card-contend[@class='ng-scope']/div[2]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Others 1");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div[@class='mCSB_container']//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[4]//md-card-contend[@class='ng-scope']/div[2]/md-input-container[4]/label[@class='ng-scope']")).getText(), "Others 2");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Address'] .md-title")).getText(), "Address");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Address'] .ng-isolate-scope:nth-of-type(2) span")).getText(), "Address Type");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Address'] .ng-isolate-scope:nth-of-type(3) span")).getText(), "Postal Code");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Address'] .ng-isolate-scope:nth-of-type(4) span")).getText(), "Country");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Address'] .ng-isolate-scope:nth-of-type(5) span")).getText(), "Address line 1");
	    assertEquals(driver.findElement(By.cssSelector("[az-title='Address'] .ng-isolate-scope:nth-of-type(6) span")).getText(), "Address line 2");
	    assertEquals(driver.findElement(By.cssSelector("[az-title] .ng-isolate-scope:nth-of-type(7) span")).getText(), "Address line 3");
	    assertEquals(driver.findElement(By.cssSelector("[az-title] .ng-isolate-scope:nth-of-type(8) span")).getText(), "Address line 4");
	    assertEquals(driver.findElement(By.cssSelector("[az-title] .ng-isolate-scope:nth-of-type(9) span")).getText(), "Address Usage");
	    driver.findElement(By.xpath("//md-tab-item[5]")).click();
	    sleep(3);
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next Subscription Fee Due Date'])[1]/following::span[2]")).getText(), "Sub Fee Effective Date");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sub Fee Effective Date'])[1]/following::span[1]")).getText(), "Sub Fee Type");
	    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sub Fee Type'])[1]/following::span[1]")).getText(), "Sub Amount");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[5]//md-input-container/label[@class='ng-scope']")).getText(), "Next Subscription Fee Due Date");
	    driver.findElement(By.xpath("//md-tab-item[6]")).click();
	    sleep(3);
	    assertEquals(driver.findElement(By.cssSelector("md-tabs-content-wrapper [role='tabpanel']:nth-of-type(6) .layout-row:nth-of-type(1) .ng-invalid-required")).getText(), "Refundable Deposit Type");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[6]//div[@class='ng-scope']/div[1]/md-input-container[2]/label[.='Refundable Deposit Invoice Amount']")).getText(), "Refundable Deposit Invoice Amount");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[6]//div[@class='ng-scope']/div[1]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Generate Refundable Deposit Invoice");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[6]//div[@class='ng-scope']/div[2]/md-input-container[1]/label[@class='ng-scope']")).getText(), "Total Refundable Deposit Paid");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[6]//div[@class='ng-scope']/div[2]/md-input-container[2]/label[@class='ng-scope']")).getText(), "Refundable Deposit To Be Returned");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[6]//div[@class='ng-scope']/div[2]/md-input-container[3]/label[@class='ng-scope']")).getText(), "Refundable Deposit To Be Returned Date");
	    assertEquals(driver.findElement(By.xpath("//div[@id='main']/div[1]/div//form[@name='form1']//md-tabs/md-tabs-content-wrapper[@class='_md']/md-tab-content[6]//div[@class='ng-scope']/div[3]/md-input-container[1]/label[@class='ng-scope']")).getText(), "Effective Date");
	}
	
}

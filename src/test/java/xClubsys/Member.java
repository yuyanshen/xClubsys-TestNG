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
		sleep(5);
		assertEquals(driver
				.findElement(By
						.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Members'])[2]/following::h2[1]"))
				.getText(), "New Member");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[1]/md-input-container[1]"))
				.getText(), "Member Type\r\n" + 
						"Person\r\n" + 
						"{{$item.key}}\r\n" + 
						"{{$item.key}}");
		assertEquals(driver.findElement(By.cssSelector(
				".ng-touched"))
				.getText(), "Membership Type");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[1]/md-input-container[3]/input[@name='MemberMemberId']"))
				.getText(), "Member ID");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[2]/md-input-container[1]/input[@name='MemberName']"))
				.getText(), "Member Name");
		assertEquals(driver.findElement(By.xpath(
				"//div[@id='main']/div[1]/div//form[@name='form1']/md-card[@class='_md']/md-card-content[1]/div/div[2]/div/div[2]/md-input-container[2]/label[.='Registration Type']"))
				.getText(), "Registration Type");
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
				.getText(), "SUBSCRIPTION MODE");
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
		assertEquals(driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Car park'])[1]/following::md-tab-item[1]"))
				.getText(), "MISCELLANEOUS");
	}
}

package xClubsys;

import org.testng.annotations.*;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
@Feature("Membership AR")
@Owner("Pisy")
@Stories(value = { @Story(value = "MemberPenaltyFee") })
public class MemberPenaltyFee extends config{
  @Test
  public void Menbei() throws InterruptedException {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--start-maximized");
      driver = new ChromeDriver(options);
      driver.get(GetBaseUrl()+"/MembershipAR/AR/MemberPenaltyFee/List");
      driver.findElement(By.id("username")).click();
      driver.findElement(By.id("username")).clear();
      driver.findElement(By.id("username")).sendKeys("xin@azaas.com");
      driver.findElement(By.id("password")).click();
      driver.findElement(By.id("password")).clear();
      driver.findElement(By.id("password")).sendKeys("K2pass!");
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='lock'])[1]/following::span[1]")).click();
      sleep(10);
  }
}

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
@Stories(value = { @Story(value = "PostingGL") })
public class PostingGL extends config{
  @Test
  public void PostingGL() throws InterruptedException
  {
      driver.findElement(By.cssSelector("[ng-if='sub\\.subMenus\\.length']:nth-child(2) ._md:nth-of-type(10) .ng-binding")).click();
      sleep(3);
          assertEquals("Posting GL History", driver.findElement(By.xpath("//div[@id='top']//h2[@class='ng-binding']")).getText());
          assertEquals("DRAFT", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Draft'])[2]/preceding::md-tab-item[2]")).getText());
          assertEquals("TRANSFERRED", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transferred'])[2]/preceding::md-tab-item[1]")).getText());
          assertEquals("Financial Month", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]")).getText());
          assertEquals("Description", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Financial Month'])[1]/following::span[1]")).getText());
          assertEquals("Debit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[2]/following::span[1]")).getText());
          assertEquals("Credit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit'])[1]/following::span[1]")).getText());
          assertEquals("Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit'])[1]/following::span[1]")).getText());
          assertEquals("NEW POSTING", driver.findElement(By.xpath("//a[contains(text(),'New Posting')]")).getText());
      driver.findElement(By.xpath("//md-tab-item[2]")).click();
      Thread.sleep(3000);
          assertEquals("Financial Month", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::span[2]")).getText());
          assertEquals("Description", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Financial Month'])[1]/following::span[1]")).getText());
          assertEquals("Debit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[2]/following::span[1]")).getText());
          assertEquals("Credit", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Debit'])[1]/following::span[1]")).getText());
          assertEquals("Date", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit'])[1]/following::span[1]")).getText());
  }  
}

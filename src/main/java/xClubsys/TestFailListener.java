package xClubsys;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.openqa.selenium.*;

public class TestFailListener extends TestListenerAdapter  {
	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		config bt = (config) tr.getInstance();
		WebDriver driver = bt.getDriver();
		takePhoto(driver);
		System.out.println("into failure test");
        Throwable throwable = tr.getThrowable();
        if(throwable instanceof UnhandledAlertException) {
            System.out.println("get UnhandledAlertException la"+throwable.toString());
            Alert alert = null;
            boolean flag = false;
            try {
                
                new WebDriverWait(driver,10).until(ExpectedConditions.alertIsPresent());
                alert = driver.switchTo().alert();
                flag = true;
                //alert.accept();
            } catch (NoAlertPresentException NofindAlert) {
                // TODO: handle exception
                System.out.println("进入onfail 异常catch");
                NofindAlert.printStackTrace();
                //throw NofindAlert;
            }
            
            if(flag) {
                alert.accept();
            }
        }
	}
	
	
	@Attachment(value = "失败截图如下：",type = "image/png")
	public byte[]  takePhoto(WebDriver driver){
		byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}
}

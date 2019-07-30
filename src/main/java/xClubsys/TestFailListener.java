package xClubsys;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.openqa.selenium.*;

public class TestFailListener extends TestListenerAdapter  {
	
	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		config bt = (config) tr.getInstance();
		WebDriver driver = bt.getDriver();
		takePhoto(driver);
	}
	

	@Attachment(value = "失败截图如下：",type = "image/png")
	public byte[]  takePhoto(WebDriver driver){
		byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}
}

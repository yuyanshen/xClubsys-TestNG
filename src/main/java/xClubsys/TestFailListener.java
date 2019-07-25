package xClubsys;
import org.openqa.selenium.*;
import io.qameta.allure.Attachment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestFailListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        screenshot();
    }
    static WebDriver driver;
    @Attachment(value = "screen shot",type = "image/png")
    public byte[]  screenshot(){
        byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        return screenshotAs;
    }
}
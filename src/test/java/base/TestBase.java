package base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import steps.Steps;

import java.io.IOException;
import java.net.URL;

@Slf4j
public class TestBase
{
    public AndroidDriver<MobileElement> driver;
    private final ThreadLocalDriver threadLocalDriver = new ThreadLocalDriver();
    private final DesiredCapabilitiesUtil desiredCapabilitiesUtil = new DesiredCapabilitiesUtil();
    protected Steps steps;

    @BeforeMethod
    @Parameters({ "udid", "platformVersion" })
    public void setup(String udid, String platformVersion) throws IOException
    {
        DesiredCapabilities caps = desiredCapabilitiesUtil.getDesiredCapabilities(udid, platformVersion);
        threadLocalDriver.setTLDriver(new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps));
        driver = threadLocalDriver.getTLDriver();
        steps = new Steps(driver);
        log.info("Driver initialization completed..");
    }

    @AfterMethod
    public synchronized void teardown() {
        driver.quit();
        log.info("Driver quit..");
    }

}

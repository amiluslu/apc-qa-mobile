package base;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.DesiredCapabilities;

@Slf4j
public class DesiredCapabilitiesUtil
{
    public DesiredCapabilities getDesiredCapabilities(String udid, String platformVersion) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", udid);
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.airbnb.android");
        desiredCapabilities.setCapability("appActivity", ".feat.homescreen.HomeActivity");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noSign", true);
        desiredCapabilities.setCapability("noReset", true);
        log.info("Desired Capabilities setup is done..");
        return desiredCapabilities;
    }
}

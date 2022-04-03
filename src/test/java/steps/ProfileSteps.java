package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class ProfileSteps extends BaseSteps
{
    public ProfileSteps(AndroidDriver<MobileElement> driver)
    {
        super(driver);
    }

    public String getTitleText(){
        return profileScreen.getTitleText();
    }

    public void logout(){
        profileScreen.clickLogoutButton();
    }

    public void logoutConfirmation(){
        profileScreen.clickLogoutConfirmationButton();
    }

    public void clickLoginWihDifferentAccount(){
        profileScreen.clickLoginWithDifferentAccount();
    }
}

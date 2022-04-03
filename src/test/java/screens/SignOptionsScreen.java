package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

@Slf4j
public class SignOptionsScreen extends BaseScreen
{
    public SignOptionsScreen(AndroidDriver<MobileElement> driver)
    {
        super(driver);
    }

    By continueWithEmailOption = By.id("com.airbnb.android:id/2131428909");
    By emailInput = By.id("com.airbnb.android:id/2131428895");
    By passwordInput = By.xpath("//*[@text='Password']");
    By continueButton = By.id("com.airbnb.android:id/2131429449");
    By exploreButton = By.id("com.airbnb.android:id/2131430108");
    By profileButton = By.id("com.airbnb.android:id/2131430961");

    public void clickContinueWithEmail(){
        waitUntilElementVisible(continueWithEmailOption);
        waitAndClick(continueWithEmailOption);
        log.info("Clicked Continue with Email button");
    }

    public boolean isContinueWithEmailOptionDisplayed(){
        return isElementDisplayed(continueWithEmailOption);
    }

    public boolean isEmailInputVisible(){
        return isElementDisplayed(emailInput);
    }

    @SneakyThrows
    public boolean isPasswordInputVisible(){
        Thread.sleep(2000);
        return isElementDisplayed(passwordInput);
    }

    public void setEmail(String email){
        sendKey(emailInput,email);
        log.info("Email: "+email);
    }

    public void setPassword(String password){
        sendKey(passwordInput,password);
    }

    public boolean isContinueButtonEnable(){
        return isElementEnabled(continueButton);
    }

    public void clickContinueButton(){
        waitUntilElementVisible(continueButton);
        waitAndClick(continueButton);
        log.info("Clicked continue buttton");
    }

    public boolean isExploreButtonSelected(){
        waitUntilElementVisible(exploreButton);
        log.info("Clicked Explore button");
        return isElementSelected(exploreButton);
    }

    public void clickProfileButton(){
        waitUntilElementVisible(profileButton);
        waitAndClick(profileButton);
        log.info("Clicked profile button");
    }
}

package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;

public class SignOptionsSteps extends BaseSteps
{

    public SignOptionsSteps(AndroidDriver<MobileElement> driver)
    {
        super(driver);
    }

    public SignOptionsSteps selectEmailOption(){
        signOptionsScreen.clickContinueWithEmail();
        return this;
    }

    @SneakyThrows
    public boolean isContinueEmailOptionDisplayed(){
        Thread.sleep(2000);
        return signOptionsScreen.isContinueWithEmailOptionDisplayed();
    }

    @SneakyThrows
    public boolean verifyEmailInputVisible(){
        Thread.sleep(2000);
        return signOptionsScreen.isEmailInputVisible();
    }

    public SignOptionsSteps setEmail(String email){
        signOptionsScreen.setEmail(email);
        return this;
    }

    public SignOptionsSteps setPassword(String password){
        signOptionsScreen.setPassword(password);
        return this;
    }

    @SneakyThrows
    public boolean verifyContinueButtonEnabled(){
        Thread.sleep(2000);
        return signOptionsScreen.isContinueButtonEnable();
    }

    @SneakyThrows
    public SignOptionsSteps clickContinueButton(){
        Thread.sleep(2000);
        signOptionsScreen.clickContinueButton();
        return this;
    }

    @SneakyThrows
    public boolean verifyExploreButtonSelected(){
        Thread.sleep(5000);
        return signOptionsScreen.isExploreButtonSelected();
    }

    public SignOptionsSteps clickProfileButton(){
        signOptionsScreen.clickProfileButton();
        return this;
    }

    public boolean verifyPasswordInputIsDisplayed(){
        return signOptionsScreen.isPasswordInputVisible();
    }
}

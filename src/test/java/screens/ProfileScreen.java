package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

@Slf4j
public class ProfileScreen extends BaseScreen
{
    public ProfileScreen(AndroidDriver<MobileElement> driver)
    {
        super(driver);
    }

    By title = By.id("com.airbnb.android:id/title");
    By logoutConfirmationButton = By.id("com.airbnb.android:id/2131430769");
    By loginWithDifferentAccountButton = By.xpath("//*[@text='Log in with a different account']");

    public String getTitleText(){
        return getText(title);
    }

    @SneakyThrows
    public void clickLogoutButton(){
        Thread.sleep(2000);
        scrollToElementAndClick("Log out");
        log.info("Clicked log out button");
    }

    @SneakyThrows
    public void clickLogoutConfirmationButton(){
        Thread.sleep(2000);
        waitUntilElementVisible(logoutConfirmationButton);
        waitAndClick(logoutConfirmationButton);
        log.info("Accepted confirmation for logout");
    }

    public void clickLoginWithDifferentAccount(){
        if(isElementDisplayed(loginWithDifferentAccountButton)){
            waitUntilElementVisible(loginWithDifferentAccountButton);
            waitAndClick(loginWithDifferentAccountButton);
        }
    }
}

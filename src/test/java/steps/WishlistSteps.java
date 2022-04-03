package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class WishlistSteps extends BaseSteps
{

    public WishlistSteps(AndroidDriver<MobileElement> driver)
    {
        super(driver);
    }

    public void openWishlist(){
        wishlistScreen.clickWishlistMenu();
    }

    public boolean verifyAmsterdamWishlistDisplayed(){
        return wishlistScreen.isAmsterdamWishlistDisplayed();
    }

    public void clickAmsterdamWishlistRecord(){
        wishlistScreen.clickAmsterdamWishlist();
    }

    public void clickWishlistSettingsMenu(){
        wishlistScreen.clickWishlistSettings();
    }

    public void clickWishlistDeleteButton(){
        wishlistScreen.clickWishlistDeleteButton();
    }

    public void clickWishlistConfirmationDeleteButton(){
        wishlistScreen.clickWishlistDeleteConfirmationButton();
    }

    public void checkTooltipAndClick(){
        wishlistScreen.clickDismissTooltipButton();
    }
}

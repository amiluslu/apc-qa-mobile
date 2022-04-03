package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.ExploreScreen;
import screens.ProfileScreen;
import screens.SignOptionsScreen;
import screens.WishlistScreen;

/**
 * Contains every screen objects with their locators.
 * */
public class BaseSteps
{
    protected SignOptionsScreen signOptionsScreen;
    protected ProfileScreen profileScreen;
    protected ExploreScreen exploreScreen;
    protected WishlistScreen wishlistScreen;

    public BaseSteps(AndroidDriver<MobileElement> driver){
        signOptionsScreen = new SignOptionsScreen(driver);
        profileScreen = new ProfileScreen(driver);
        exploreScreen = new ExploreScreen(driver);
        wishlistScreen = new WishlistScreen(driver);
    }
}

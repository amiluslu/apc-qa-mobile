package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Steps
{
    public SignOptionsSteps signOptionsSteps;
    public ProfileSteps profileSteps;
    public ExploreSteps exploreSteps;
    public WishlistSteps wishlistSteps;

    public Steps(AndroidDriver<MobileElement> driver){
        this.signOptionsSteps = new SignOptionsSteps(driver);
        this.profileSteps = new ProfileSteps(driver);
        this.exploreSteps = new ExploreSteps(driver);
        this.wishlistSteps = new WishlistSteps(driver);
    }
}

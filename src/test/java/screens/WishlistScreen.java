package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

@Slf4j
public class WishlistScreen extends BaseScreen
{
    public WishlistScreen(AndroidDriver<MobileElement> driver)
    {
        super(driver);
    }

    By wishlistMenuButton = By.id("com.airbnb.android:id/2131430979");
    By amsterdamWishlistRecord = By.xpath("//*[@text='Amsterdam']");
    By wishlistSettingsButton = By.xpath("//android.widget.TextView[@content-desc=\"Wishlist Settings\"]");
    By wishlistDeleteButton = By.xpath("//*[@text='Delete']");
    By wishlistDeleteConfirmationButton = By.id("android:id/button1");
    By buttonForDismissingTooltip = By.xpath("//android.widget.ImageView[@content-desc=\"Button for dismissing tooltip\"]");

    @SneakyThrows
    public void clickWishlistMenu(){
        Thread.sleep(2000);
        waitUntilElementVisible(wishlistMenuButton);
        waitAndClick(wishlistMenuButton);
        log.info("Clicked Wishlist button");
    }

    @SneakyThrows
    public boolean isAmsterdamWishlistDisplayed(){
        Thread.sleep(2000);
        return isElementDisplayed(amsterdamWishlistRecord);
    }

    @SneakyThrows
    public void clickAmsterdamWishlist(){
        Thread.sleep(2000);
        waitUntilElementVisible(wishlistMenuButton);
        waitAndClick(amsterdamWishlistRecord);
        log.info("Clicked Amsterdam wishlist");
    }

    @SneakyThrows
    public void clickWishlistSettings(){
        Thread.sleep(2000);
        waitUntilElementVisible(wishlistSettingsButton);
        waitAndClick(wishlistSettingsButton);
        log.info("Clicked Wishlist settings button");
    }

    public void clickWishlistDeleteButton(){
        waitUntilElementVisible(wishlistDeleteButton);
        waitAndClick(wishlistDeleteButton);
        log.info("Clicked wishlist delete button");
    }

    public void clickWishlistDeleteConfirmationButton(){
        waitUntilElementVisible(wishlistDeleteConfirmationButton);
        waitAndClick(wishlistDeleteConfirmationButton);
        log.info("Clicked confirmation");
    }

    @SneakyThrows
    public void clickDismissTooltipButton(){
        Thread.sleep(2000);
        if(isElementDisplayed(buttonForDismissingTooltip)){
            waitAndClick(buttonForDismissingTooltip);
        }
    }
}

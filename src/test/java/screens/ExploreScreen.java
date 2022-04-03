package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

@Slf4j
public class ExploreScreen extends BaseScreen
{
    public ExploreScreen(AndroidDriver<MobileElement> driver)
    {
        super(driver);
    }

    By searchBox = By.id("com.airbnb.android:id/2131429190");
    By searchInput = By.id("com.airbnb.android:id/2131430927");
    By amsterdamNetherlandsOption = By.xpath("//*[@text='Amsterdam, Netherlands']");
    By findPlaceToStayOption = By.id("com.airbnb.android:id/2131430754");
    By skipOptionForDates = By.xpath("//*[@text='Skip']");
    By incrementAdultButton = By.xpath("(//android.widget.ImageView[@content-desc=\"Increment\"])[1]");
    By incrementInfantButton = By.xpath("(//android.widget.ImageView[@content-desc=\"Increment\"])[3]");
    By searchButton = By.xpath("//*[@text='Search']");
    By firstPlaceResult= By.xpath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Explore Airbnb\"]/android.widget.FrameLayout[3]");
    By favouriteButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Save to wishlist\"]");
    By createButton = By.id("com.airbnb.android:id/2131431492");
    By removeFromWishListButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Remove from wishlist\"]");
    By navigateUpButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate Up\"]");

    public void setSearch(String search){
        sendKey(searchInput,search);
        log.info("Search: "+search);
    }

    public void clickAmsterdamNetherlandOption(){
        waitAndClick(amsterdamNetherlandsOption);
        log.info("Clicked Amsterdam option..");
    }

    public void clickSearchBox(){
        waitUntilElementVisible(searchBox);
        waitAndClick(searchBox);
        log.info("Clicked search box..");
    }

    public void clickFindPlaceToStayOption(){
        waitUntilElementVisible(findPlaceToStayOption);
        waitAndClick(findPlaceToStayOption);
        log.info("Selected Find Place to stay option");
    }

    public void clickSkipOptionForDates(){
        waitUntilElementVisible(skipOptionForDates);
        waitAndClick(skipOptionForDates);
        log.info("Skip button clicked");
    }

    public void clickAdultIncrement(int adultCount){
        for (int i = 0; i < adultCount; i++)
        {
            waitAndClick(incrementAdultButton);
        }
    }

    public void clickInfantIncrement(int infantCount){
        for (int i = 0; i < infantCount; i++)
        {
            waitAndClick(incrementInfantButton);
        }
    }

    public void clickSearchButton(){
        waitUntilElementVisible(searchButton);
        waitAndClick(searchButton);
        log.info("Clicked search button");
    }

    @SneakyThrows
    public void clickFirstSearchResult(){
        Thread.sleep(2000);
        waitUntilElementVisible(firstPlaceResult);
        waitAndClick(firstPlaceResult);
        log.info("Clicked first result");
    }

    @SneakyThrows
    public void clickFavouriteButton(){
        Thread.sleep(2000);
        waitUntilElementVisible(favouriteButton);
        waitAndClick(favouriteButton);
        log.info("Clicked favourite button");
    }

    public void clickCreateButton(){
        waitUntilElementVisible(createButton);
        waitAndClick(createButton);
        log.info("Clicked create button");
    }

    @SneakyThrows
    public boolean isRemoveWishlistDisplayed(){
        Thread.sleep(2000);
        return isElementDisplayed(removeFromWishListButton);
    }

    public void clickNavigateUp(){
        waitUntilElementVisible(navigateUpButton);
        waitAndClick(navigateUpButton);
        log.info("Clicked back button");
    }
}

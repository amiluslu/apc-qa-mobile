package steps;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ExploreSteps extends BaseSteps
{
    public ExploreSteps(AndroidDriver<MobileElement> driver)
    {
        super(driver);
    }

    public ExploreSteps makeSearch(String searchText){
        exploreScreen.setSearch(searchText);
        return this;
    }

    public ExploreSteps clickAmsterdamOption(){
        exploreScreen.clickAmsterdamNetherlandOption();
        return this;
    }

    public ExploreSteps clickSearchBox(){

        exploreScreen.clickSearchBox();
        return this;
    }

    public ExploreSteps selectFindPlaceToStayOption(){
        exploreScreen.clickFindPlaceToStayOption();
        return this;
    }

    public ExploreSteps clickSkipDates(){
        exploreScreen.clickSkipOptionForDates();
        return this;
    }

    public ExploreSteps setAdult(int adultCount){
        exploreScreen.clickAdultIncrement(adultCount);
        return this;
    }

    public ExploreSteps setInfant(int infantCount){
        exploreScreen.clickInfantIncrement(infantCount);
        return this;
    }

    public ExploreSteps clickSearch(){
        exploreScreen.clickSearchButton();
        return this;
    }

    public ExploreSteps clickFirstPlaceResult(){
        exploreScreen.clickFirstSearchResult();
        return this;
    }

    public ExploreSteps clickFavouriteButton(){
        exploreScreen.clickFavouriteButton();
        return this;
    }

    public ExploreSteps clickCreateWishlist(){
        exploreScreen.clickCreateButton();
        return this;
    }

    public boolean verifyRemoveWishlistDisplayed(){
        return exploreScreen.isRemoveWishlistDisplayed();
    }

    public void clickBackButton(){
        exploreScreen.clickNavigateUp();
    }
}

package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirbnbFavouriteTest extends TestBase
{
    @Test(priority = 1)
    public void loginTest(){
        steps.profileSteps.clickLoginWihDifferentAccount();
        steps.signOptionsSteps.selectEmailOption();
        Assert.assertTrue(steps.signOptionsSteps.verifyEmailInputVisible());
        steps.signOptionsSteps.setEmail("stvzdhefkww@sinaite.net");
        Assert.assertTrue(steps.signOptionsSteps.verifyContinueButtonEnabled());
        steps.signOptionsSteps.clickContinueButton();
        steps.signOptionsSteps.setPassword("Battle321*.");
        Assert.assertTrue(steps.signOptionsSteps.verifyContinueButtonEnabled());
        steps.signOptionsSteps.clickContinueButton();
        Assert.assertTrue(steps.signOptionsSteps.verifyExploreButtonSelected());
        steps.signOptionsSteps.clickProfileButton();
        Assert.assertNotNull(steps.profileSteps.getTitleText());
    }

    @Test(priority = 2,dependsOnMethods = {"loginTest"})
    public void addFavouritePlace()
    {
        steps.exploreSteps.clickSearchBox();
        steps.exploreSteps.makeSearch("Amsterdam");
        steps.exploreSteps.clickAmsterdamOption();
        steps.exploreSteps.selectFindPlaceToStayOption();
        steps.exploreSteps.clickSkipDates();
        steps.exploreSteps.setAdult(2);
        steps.exploreSteps.setInfant(1);
        steps.exploreSteps.clickSearch();
        steps.exploreSteps.clickFirstPlaceResult();
        steps.exploreSteps.clickFavouriteButton();
        steps.exploreSteps.clickCreateWishlist();
        Assert.assertTrue(steps.exploreSteps.verifyRemoveWishlistDisplayed());
        steps.exploreSteps.clickBackButton();
        steps.exploreSteps.clickBackButton();
        steps.wishlistSteps.openWishlist();
        Assert.assertTrue(steps.wishlistSteps.verifyAmsterdamWishlistDisplayed());
    }

    @Test(priority = 3,dependsOnMethods = {"addFavouritePlace"})
    public void deleteFavouritePlace(){
        steps.wishlistSteps.openWishlist();
        steps.wishlistSteps.clickAmsterdamWishlistRecord();
        steps.wishlistSteps.checkTooltipAndClick();
        steps.wishlistSteps.clickWishlistSettingsMenu();
        steps.wishlistSteps.clickWishlistDeleteButton();
        steps.wishlistSteps.clickWishlistConfirmationDeleteButton();
        Assert.assertFalse(steps.wishlistSteps.verifyAmsterdamWishlistDisplayed());
    }

    @Test(priority = 4,dependsOnMethods = {"loginTest"})
    public void logoutTest(){
        steps.signOptionsSteps.clickProfileButton();
        steps.profileSteps.logout();
        steps.profileSteps.logoutConfirmation();
        Assert.assertTrue(steps.signOptionsSteps.verifyPasswordInputIsDisplayed());
        steps.profileSteps.clickLoginWihDifferentAccount();
        Assert.assertTrue(steps.signOptionsSteps.isContinueEmailOptionDisplayed());
    }
}

package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Like Page Object Model, screens contains related methods.*/

public class BaseScreen
{
    protected AndroidDriver<MobileElement> driver;
    protected WebDriverWait wait;

    public BaseScreen(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    protected void waitAndClick(By by) { wait.until(ExpectedConditions.elementToBeClickable(by)).click(); }

    protected void click(By by) {
        driver.findElement(by).click();
    }

    protected void hideKeyboard() { driver.navigate().back(); }

    protected List<WebElement> waitAndFindElements(By by) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    protected WebElement waitAndFindElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected String getText(By by) {
        return waitAndFindElement(by).getText();
    }

    protected void sendKey(By by, String text) {
        waitAndFindElement(by).sendKeys(text);
    }

    protected boolean isElementDisplayed(By by){
        try {
            return driver.findElement(by).isDisplayed();
        }
        catch (Throwable t){
            return false;
        }
    }

    protected boolean isElementEnabled(By by){
        try {
            return driver.findElement(by).isEnabled();
        }
        catch (Throwable t){
            return false;
        }
    }

    protected boolean isElementSelected(By by){
        try {
            return driver.findElement(by).isSelected();
        }
        catch (Throwable t){
            return false;
        }
    }

    public void waitUntilElementVisible(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void scrollToElementAndClick(String elementText){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+elementText+"\").instance(0))").click();
    }
}

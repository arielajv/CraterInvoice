package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BrowserUtilityClass {
    Actions act;
    WebDriverWait wait;

    public void sendkeysWithActionClass(WebElement element, String input) {
        act = new Actions(Driver.getDriver());
        act.sendKeys(element, input).build().perform();
}
    public void waitUntilElementVisibleWithLocator(By locator) {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

}
    public void waitForAllElementsToBeVisible(List<WebElement> element) {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }
    public void waitForElementToBeVisible(WebElement element) {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}

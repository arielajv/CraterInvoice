package tests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CraterLoginPage;
import pages.DashboardPage;
import utils.BrowserUtilityClass;
import utils.TestDataReader;

import static org.junit.Assert.assertTrue;

public class LoginFunctionality {

    BrowserUtilityClass utils = new BrowserUtilityClass();
    CraterLoginPage login = new CraterLoginPage();

    DashboardPage dashboard = new DashboardPage();

    @When("I enter valid usermail and valid password")
    public void i_enter_valid_usermail_and_valid_password() {
        utils.sendkeysWithActionClass(login.login_page_email_box, TestDataReader.getProperty("email"));
        utils.sendkeysWithActionClass(login.login_page_password_box, TestDataReader.getProperty("password"));
    }
    @When("Click on login button")
    public void click_on_login_button() {
        login.login_page_login_btn.click();
    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        utils.waitUntilElementVisibleWithLocator(By.xpath("//span[text()='Amount Due']"));
        assertTrue(dashboard.dashboard_tab.isDisplayed());
    }

}

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

    //valid login test start
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

    //valid login test end

    //invalid login test start
    @When("I enter invalid useremail {string} and password {string}")
    public void i_enter_invalid_useremail_and_password(String email, String pass) {
        utils.sendkeysWithActionClass(login.login_page_email_box, email);
        utils.sendkeysWithActionClass(login.login_page_password_box, pass);
    }
    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        utils.waitForAllElementsToBeVisible(login.login_page_all_Error_messages);
        Assert.assertFalse(login.login_page_all_Error_messages.isEmpty());
    }
    @Then("I should not be logged in")
    public void i_should_not_be_logged_in() {
        assertTrue(login.login_page_footerText.isDisplayed());
    }
//invalid login test end
}

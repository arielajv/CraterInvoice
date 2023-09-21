package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterLoginPage;
import utils.BrowserUtilityClass;
import utils.Driver;
import utils.TestDataReader;

import java.time.Duration;

import static org.junit.Assert.*;
import static utils.Driver.driver;

public class UIComponentsTest {
    BrowserUtilityClass utils = new BrowserUtilityClass();
    CraterLoginPage login = new CraterLoginPage();

    @Given("As a user, I am on the login page")
    public void as_a_user_i_am_on_the_login_page() {
        Driver.getDriver().get(TestDataReader.getProperty("craterurl"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().manage().window().maximize();
    }
    @When("I view the page title")
    public void i_view_the_page_title() {
        driver.getTitle();
    }
    @Then("I confirm the page title contains {string}")
    public void i_confirm_the_page_title_contains(String string) {
        String pageTitle = driver.getTitle();
        assertTrue(pageTitle.contains("Crater"));
    }
    @Then("I view the email text box placed underneath the title")
    public void i_view_the_email_text_box_placed_underneath_the_title() {
        assertTrue(login.login_page_email_box.isDisplayed());
    }
    @Then("I verify it has a text box with the label {string}")
    public void i_verify_it_has_a_text_box_with_the_label(String string) {
        assertTrue(login.login_page_email_label.isDisplayed());
    }
    @Then("I view the password Text box placed underneath the Email text box")
    public void i_view_the_password_text_box_placed_underneath_the_email_text_box() {
        assertTrue(login.login_page_password_box.isDisplayed());
    }
    @Then("I view the forgot password link placed underneath the password text box")
    public void i_view_the_forgot_password_link_placed_underneath_the_password_text_box() {
        assertTrue(login.login_page_forgotPassword_link.isDisplayed());
    }
    @Then("I verify a link titled {string}")
    public void i_verify_a_link_titled(String string) {
        assertEquals("Forgot Password", login.login_page_forgotPassword_link.getText());
    }
    @Then("I view the Login button placed underneath the forgot password")
    public void i_view_the_login_button_placed_underneath_the_forgot_password() {
        assertTrue(login.login_page_login_btn.isDisplayed());
    }
    @Then("I verify a button labeled login")
    public void i_verify_a_button_labeled_login() {
        assertEquals("Login", login.login_page_login_btn.getText());
    }

    @Then("I verify the footer has a text {string}.")
    public void i_verify_the_footer_has_a_text(String string) {
        assertTrue(login.login_page_footerText.getText().contains("Copyright @ Crater Invoice, Inc. 2023"));
    }
    @Then("I view Heading {int} to the right of the page")
    public void i_view_heading_to_the_right_of_the_page(Integer int1) {
        assertTrue(login.login_page_simple_invoicing_text.isDisplayed());
    }
    @Then("I see a heading located to the right with the following text {string}")
    public void i_see_a_heading_located_to_the_right_with_the_following_text(String string) {
        assertEquals("Simple Invoicing for Individuals Small Businesses", login.login_page_simple_invoicing_text.getText());
    }
    @Then("I view Heading {int}")
    public void i_view_heading(Integer int1) {
        assertTrue(login.login_page_craterHelpsYou_text.isDisplayed());
    }
    @Then("I see Heading {int} with the following text {string}")
    public void i_see_heading_with_the_following_text(Integer int1, String string) {
        assertEquals("Crater helps you track expenses, record payments & generate beautiful invoices & estimates.", login.login_page_craterHelpsYou_text.getText());
    }

}

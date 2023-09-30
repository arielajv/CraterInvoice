package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CraterLoginPage;
import pages.DashboardPage;
import pages.ItemsPage;
import utils.BrowserUtilityClass;
import utils.Driver;
import utils.TestDataReader;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ItemFunctionality {
    BrowserUtilityClass utils = new BrowserUtilityClass();
    CraterLoginPage login = new CraterLoginPage();

    DashboardPage dashboard = new DashboardPage();

    ItemsPage items = new ItemsPage();

    @Given("As an entity user, I am logged in")
    public void as_an_entity_user_i_am_logged_in() {
        Driver.getDriver().get(TestDataReader.getProperty("craterurl"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().manage().window().maximize();
        utils.waitForElementToBeVisible(login.login_page_email_box);

        utils.sendkeysWithActionClass(login.login_page_email_box, TestDataReader.getProperty("email"));
        utils.sendkeysWithActionClass(login.login_page_password_box, TestDataReader.getProperty("password"));
        login.login_page_login_btn.click();

        utils.waitForElementToBeVisible(dashboard.dashboard_tab);
        assertTrue(dashboard.dashboard_tab.isDisplayed());
    }
    @When("I navigate to Items tab")
    public void i_navigate_to_items_tab() {
      items.items_tab1.click();
        utils.waitForElementToBeVisible(items.items_page_item_headerText);
        assertTrue(items.items_page_item_headerText.isDisplayed());
    }
    @Then("I click on the {string} Menu Link")
    public void i_click_on_the_menu_link(String string) {
        items.items_tab2.click();

    }
    @Then("I verify the menu navigation path as {string} places under {string}")
    public void i_verify_the_menu_navigation_path_as_places_under(String string, String string2) {
      assertTrue(items.items_home_items_tab.isDisplayed());
    }
    @Then("I should see a secondary button titled {string} with a filter icon")
    public void i_should_see_a_secondary_button_titled_with_a_filter_icon(String string) {
        utils.waitForElementToBeVisible(items.items_page_filter_btn);
      Assert.assertTrue(items.items_page_filter_btn.isDisplayed());
    }
    @Then("I should see a primary button titled {string}")
    public void i_should_see_a_primary_button_titled(String string) {
        assertTrue(items.items_page_addItem_btn.isDisplayed());
    }
    @Then("I should see the table with the following columns NAME, UNIT, PRICE, ADDED ON")
    public void i_should_see_the_table_with_the_following_columns_name_unit_price_added_on() {
        assertTrue(items.items_table.isDisplayed());
    }
    @Then("I should see a link icon showing three dots with the following options Option {int} Edit with an edit icon and Option {int} Delete with a delete icon")
    public void i_should_see_a_link_icon_showing_three_dots_with_the_following_options_option_edit_with_an_edit_icon_and_option_delete_with_a_delete_icon(Integer int1, Integer int2) {
        assertTrue(items.items_page_3dot_menu.isDisplayed());
        items.items_page_3dot_menu.click();
        utils.waitForElementToBeVisible(items.items_page_3dot_edit_option);
        assertTrue(items.items_page_3dot_edit_option.isDisplayed());
        assertTrue(items.items_page_3dot_delete_option.isDisplayed());
    }
    @Then("I review pagination text as follows: ‘Showing {int} to {int} of <Total items> ‘results’.")
    public void i_review_pagination_text_as_follows_showing_to_of_total_items_results(Integer int1, Integer int2) {
        assertTrue(items.items_page_showing_pagination.isDisplayed());
    }
    @Then("I confirm the pagination has the following control: Left arrow allowing the user navigate to previous pages")
    public void i_confirm_the_pagination_has_the_following_control_left_arrow_allowing_the_user_navigate_to_previous_pages() {
       assertTrue(items.items_pagination.isDisplayed());
    }
    @Then("I confirm right arrow allowing the user to navigate to the next pages")
    public void i_confirm_right_arrow_allowing_the_user_to_navigate_to_the_next_pages() {
        utils.waitForElementToBeVisible(items.items_pagination_right_arrow);
        assertTrue(items.items_pagination_right_arrow.isDisplayed());

    }
    @Then("I confirm number indicating the page the user is currently on and the next upcoming page")
    public void i_confirm_number_indicating_the_page_the_user_is_currently_on_and_the_next_upcoming_page() {
        int currentPageNumber = Integer.parseInt(items.items_page_number_1.getText());
        System.out.println("current page: " + currentPageNumber);
       if (items.items_page_number1_pagination.isDisplayed()) {
           System.out.println("User is currenly on the page number 1");
       }
    }
    @Then("I click on I click on the Add Item button")
    public void i_click_on_i_click_on_the_add_item_button() {
            items.items_page_addItem_btn.click();
        }

    // add item test case starts here

    @Then("I can an directed to the page with Name, Price and Unit dropdown")
    public void i_can_an_directed_to_the_page_with_name_price_and_unit_dropdown() {
        utils.waitForElementToBeVisible(items.items_Input_page_newItem_text);
        Assert.assertTrue(items.items_Input_page_newItem_text.isDisplayed());
        assertTrue(items.items_nameField.isDisplayed());
        assertTrue(items.items_priceField.isDisplayed());
        assertTrue(items.items_unitField.isDisplayed());
    }

    @Then("I confirm that the unit dropdown has {int} options")
    public void i_confirm_that_the_unit_dropdown_has_options(Integer int1) {

    }

    @Then("I confirm that Description is displayed")
    public void i_confirm_that_description_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


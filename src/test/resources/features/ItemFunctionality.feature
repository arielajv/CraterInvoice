Feature: Dashboard home page

    Background:
        Given As an entity user, I am logged in

    @ItemComponents
    Scenario: As a user, I am to verify Items tab functionality
        When I navigate to Items tab
        Then I click on the 'Items' Menu Link
        And I verify the menu navigation path as "Home/Items" places under "Items"
        Then I should see a secondary button titled "Filter" with a filter icon
        And I should see a primary button titled "+ Add Item"
        Then I should see the table with the following columns NAME, UNIT, PRICE, ADDED ON
        And I should see a link icon showing three dots with the following options Option 1 Edit with an edit icon and Option 2 Delete with a delete icon
        Then I review pagination text as follows: ‘Showing 1 to 10 of <Total items> ‘results’.
        And I confirm the pagination has the following control: Left arrow allowing the user navigate to previous pages
        Then I confirm right arrow allowing the user to navigate to the next pages
        And I confirm number indicating the page the user is currently on and the next upcoming page
        Then I click on the Add Item button

        @AddItemComponents
        Scenario: As a user, I am able to add a new item
            When I navigate to Items tab
            Then I click on the 'Items' Menu Link
            Then I click on the Add Item button
            Then I can an directed to the page with Name, Price and Unit dropdown
            And I confirm that the unit dropdown has 20 options
            Then I confirm that Description is displayed




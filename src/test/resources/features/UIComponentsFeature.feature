# new feature
# Tags: optional
  @Regression
Feature: UI Components

  Scenario: User should be able to locate UI components
    Given As a user, I am on the login page
      When I view the page title
      Then I confirm the page title contains "crater"
      And I view the email text box placed underneath the title
      Then I verify it has a text box with the label "Email"
      And I view the password Text box placed underneath the Email text box
      Then I verify it has a text box with the label "Password"
      And I view the forgot password link placed underneath the password text box
      Then I verify a link titled "Forgot Password"
      And I view the Login button placed underneath the forgot password
      Then I verify a button labeled login
      Then I verify the footer has a text "Copyright @ Crater Invoice, Inc. 2023".
      And I view Heading 1 to the right of the page
      Then I see a heading located to the right with the following text "Simple Invoicing for Individuals Small Businesses"
      And I view Heading 2
      Then I see Heading 2 with the following text "Crater helps you track expenses, record payments & generate beautiful invoices & estimates."
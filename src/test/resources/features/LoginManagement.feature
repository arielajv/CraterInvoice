# new feature
# Tags: optional

Feature: Access management
@validLogin
  Scenario: User should be able to login with valid credentials
    Given As a user, I am on the login page
    When I enter valid usermail and valid password
    And Click on login button
    Then I should be logged in
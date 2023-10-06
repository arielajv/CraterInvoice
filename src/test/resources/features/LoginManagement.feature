# new feature
# Tags: optional
  @Regression
Feature: Access management
@validLogin
  Scenario: User should be able to login with valid credentials
    Given As a user, I am on the login page
    When I enter valid usermail and valid password
    And Click on login button
    Then I should be logged in

  @InvalidLoginAttempt:
  Scenario Outline: As a user, I should see an error message putting invalid credentials
    Given As a user, I am on the login page
    When I enter invalid useremail "<email>" and password "<pass>"
    And Click on login button
    Then I should see an error message
    And I should not be logged in

    Examples:
      | email                       |  pass           |
      |                             |                 |
      |                             |primetech@school |
      | nothing@primetechschool.com |                 |
      |                             |  prime@school   |
      |                             |primetech@school |
      | my@primetechschool.com      |primetech@school |
      | dummy@primetechschool.com   | prime@school    |
      |  my@primetechschool.com     | prime@school    |
      | dummy@primetechschool.com   |                 |
Feature: Login

  @login-valid
  Scenario: Login with valid email and valid password
    Given I am on the login page
    When I input "elfrida@gmail.com" on email field
    And I input "Akucantik88@" on password field
    And I click login button
    Then I am on the home page

  @login-invalid
  Scenario Outline: Login with invalid data
    Given I am on the login page
    When I input "<email>" on email field
    And I input "<password>" on password field
    And I click login button
    Then I am get error message
    Examples:
      | email             | password     |
      | elfrida@gmail.com | Aku          |
      | elfrida@.com      | Akucantik88@ |
      | 123456            | Akucantik88@ |
      | frida$gmail.com   | Akucantik88@ |


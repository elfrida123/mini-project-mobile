Feature: Register

  @valid-register
  Scenario: Register with valid data
    Given I am on the login page for register
    When I fill the field "Elfrida Risda Tampubolon" in full name field with valid format
    And I fill the field "risda123@gmail.com" in email field with valid format
    And I fill the field "Akucantik" in password field with valid password
    And click the Register button
    Then I am on the login page

  @invalid-register
  Scenario Outline: Register with invalid data
    Given I am on the login page for register
    When I fill the field "<NamaLengkap>" in full name field with valid format
    And I fill the field "<Email>" in email field with valid format
    And I fill the field "<Password>" in password field with valid password
    And click the Register button
#    Then I am get error message for invalid register
    Examples:
      | NamaLengkap                           | Email                 | Password    |
      | 097361==i                             | elfrida@gmail.com     | Akucantik   |
      | Elfrida Tampubolon                    | %gmail.com            | Akucantik   |
      | Elfrida Tampubolon                    | elfrida123@gmail.com  | Akucantik   |
      | elfrida@gmail.comelfrida121@gmail.com | elfrida@gmail.com     | Akucantik   |
      | q                                     | @                     | r           |
      | elfrida!!88                           | elfrida@gmail.com     | elfrida$$12 |
      | ELfRidA                               | elfrida@gmail.com     |HgaklsOPH    |

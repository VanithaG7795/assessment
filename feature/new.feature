Feature: Open New Account
  Scenario: Creating an account
    Given user is entering "https://parabank.parasoft.com/parabank/index.htm"
    When user click on Register button
    And enter the User name, Address, Password, Phone Number
    Then then user able to open new account
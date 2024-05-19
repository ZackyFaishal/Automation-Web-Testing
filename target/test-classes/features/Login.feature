Feature: Login

  Scenario: Login Successfull
    Given I am on the login page
    When I entered my username "standard_user" and password "secret_sauce"
    And I clicked on the login button
    Then I should be logged in successfully and redirected to the home page and should be able to view catalog of products

  Scenario: Unsuccessful login with invalid password
    Given I am on the login page
    When I entered my username "standard_user" and password "secret_nich"
    And I clicked on the login button
    Then I should see the error message "Username and password do not match any user in this service"

  Scenario: Unsuccessful login with invalid credentials. The username not registered.
    Given I am on the login page
    When I entered my username "standard_nich" and password "secret_sauce"
    And I clicked on the login button
    Then I should see the error message "Username and password do not match any user in this service"

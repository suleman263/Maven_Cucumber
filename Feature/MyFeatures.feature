Feature: Login Test

  Scenario: Verify the login
    Given Open the url
    When I Login
    And user enter valid id and pwd
    Then user should successfully login

  Scenario: create the new customer
    Given After login with valid crendetials
    When I click on new customer
    And I will fill the form and submit
    Then new customer should be created

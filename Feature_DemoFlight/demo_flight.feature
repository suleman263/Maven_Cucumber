Feature: Open the demo_url

  Scenario: Verify the user registration
    Given Open the url
    When I will click on  signon
    And fill the form and submit
    Then new user is created

  Scenario: Verify the Login
    Given Open the login page
    When I enter the valid userid and password
    And submit
    Then user able to start the flight booking

  Scenario: Book the Flight
    Given Login into the application with valid credentials
    When I fill the form with valid details-From,To,Payment
    And Submit
    Then I book the ticket

Feature: Login Test

  Scenario Outline: Verify the login
    Given Open the url
    When I Login
    And user enter "<valid_id>" and "<pwd>"
    Then user should successfully login

Examples: 
    | valid_id | pwd |
    | admin | admin |
    | admin1 | admin2 |
    
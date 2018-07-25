Feature: Login Test

  Scenario: Verify the login
    Given Open the url
    When I Login  
    And user enter valid id and pwd
     Then user should successfully login
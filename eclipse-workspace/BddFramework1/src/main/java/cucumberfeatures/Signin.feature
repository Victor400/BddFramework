Feature: Gmail Sign in


Scenario: Test that user can sign in with correct login details
     Given I navigate to login page
     When I enter my correct user name
     And I enter my correct password
     Then I should be allowed to sign in successfully
Feature: user should be able to login

  As a user I should be able to login by providing correct credentials

  Scenario: Login as a librarian
    When user logged in as a "librarian"
    Then "dashboard" should be displayed
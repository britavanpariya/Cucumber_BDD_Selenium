@BK
Feature: Login functionality
  As a end user
  I want to login to the website
  So that I can check my account

  Scenario: Validate login page
    Given I am on home page
    When I click on login button
    Then I should see "Welcome, Please Sign In!" text on login page
    And the URL should contain with "/login"

    Scenario: Login with valid details
      Given I am on home page
      When I click on login button
      And I enter valid email "britagajera@gmail.com" and password "Nilu@2685"
      And I click on login button on login page
      Then I should see "Logout Button" text on login page
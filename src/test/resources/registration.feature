@Reg
Feature: registration
  Registration functionality
  As a End user
  I want to register on the website
  so that I can login and view my account

  @SingleRegistration
  Scenario: Valid Registration without datatable
    Given I am on home page
    When I click on "Register"
    And I Select gender "Female"
    And I enter my firstname "Brita" and lastname "Vanpariya"
    And I enter my email id "britagajera@gmail.com"
    And I enter my password "Nilu@2685"
    When I click on "Register" on registration page
    Then I should see "Your registration completed" text on registration page
    And the URL should contain with "/registerresult"


  @Datatable
  Scenario: Valid Registration using datatable
    Given I am on home page
    When I click on "Register"
    And I Select gender "Female"
    And I enter following data for registration
      | firstname | lastname  | email                 | password  | confirmpassword |
      | Brita     | Vanpariya | britagajera@gmail.com | Nilu@2685 | Nilu@2685       |
    When I click on "Register" on registration page
    Then I should see "Your registration completed" text on registration page
    And the URL should contain with "/registerresult"


  @DatatableWithScenarioOutline
  Scenario: Valid multiple Registration using datatable with scenario outline
    Given I am on home page
    When I click on "Register"
    And I Select gender "Female"
    And I enter my firstname "Brita" and lastname "Vanpariya"
    And I enter my email id "britagajera@gmail.com"
    And I enter my password "Nilu@2685"
    When I click on "Register" on registration page
    Then I should see "Your registration completed" text on registration page
    And the URL should contain with "/registerresult"



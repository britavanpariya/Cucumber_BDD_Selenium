@reg
Feature:Registration
  As an end user
  I want to register to the website
  So that i can login my account

  @SingleRegistration
  Scenario:Valid registration without datatable
    Given I am on home page
    When I click on "Register"
    And I select "Female"
    And  I entre my first name "Brita" and last name "Vanpariya"
    And I entre my email "britagajera@gmail.com" and password"abc@12345"
    When I click on "Registration submit" on registration page
    Then I should see "your registration completed" text on registration page
    And The url should contain with "/registerresult"

  @RegistrationWithDataTable
  Scenario:Valid registration using datatable
    Given I am on home page
    When I click on "Registration"
    And I select "Female"
    And I entre following data for registration
      | firstname | lastname |email | password |                confirmpassword |
      | Brita   | Vanpariya   |britagajera@gmail.com |abc@12345 | abc@12345 |
    When I click on "Registration submit" on registration page
    Then I should see "your registration completed" text on registration page
    And The url should contain with "/registerresult"
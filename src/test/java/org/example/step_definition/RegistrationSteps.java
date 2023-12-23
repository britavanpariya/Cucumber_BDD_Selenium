package org.example.step_definition;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class RegistrationSteps extends DriverManager {
    List<Map<String, String>> data;

    DriverManager driverManager = new DriverManager();
    RegistrationPage registrationPage = new RegistrationPage();


    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String arg1) throws Throwable {
        registrationPage.clickHomePageRegistration();

    }

    @When("^I select \"([^\"]*)\"$")
    public void i_select(String arg1) throws Throwable {
        registrationPage.selectGenderRadioButton();

    }

    @When("^I entre my first name \"([^\"]*)\" and last name \"([^\"]*)\"$")
    public void i_entre_my_first_name_and_last_name(String arg1, String arg2) throws Throwable {
        registrationPage.firstNameInputBox();
        registrationPage.lastNameInputBox();
    }

    @When("^I entre my email \"([^\"]*)\" and password\"([^\"]*)\"$")
    public void i_entre_my_email_and_password(String arg1, String arg2) throws Throwable {
        registrationPage.emailIdInputField();
        registrationPage.passwordInputField();
        registrationPage.setConfirmPasswordInputField();
    }

    @When("^I click on \"([^\"]*)\" on registration page$")
    public void i_click_on_on_registration_page(String arg1) throws Throwable {
        registrationPage.lastRegistrationButton();

    }

    @Then("^I should see \"([^\"]*)\" text on registration page$")
    public void i_should_see_text_on_registration_page(String arg1) throws Throwable {
        registrationPage.confirmRegistrationCompletedText();

    }

    @And("^The url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain_with(String expectedTextInUrl) throws Throwable {
        String myActualURL = driverManager.getCurrentURL();
        assertThat(myActualURL, containsString(expectedTextInUrl));
    }

    @When("^I entre following data for registration$")
    public void i_entre_following_data_for_registration(DataTable dataTable) throws Throwable {
        List<Map<String, String>> myData = dataTable.asMaps(String.class, String.class);
        System.out.println(myData);
        registrationPage.entreRegistrationDetails(
                myData.get(0).get("firstname"),
                myData.get(0).get("latname"),
                myData.get(0).get("email"),
                myData.get(0).get("password"),
                myData.get(0).get("confirmpassword")
        );

    }
}
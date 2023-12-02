package org.example.step_definition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;


import java.util.List;
import java.util.Map;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class RegistrationSteps extends DriverManager {
    List<Map<String, String>> data;
    RegistrationPage registrationPage = new RegistrationPage();
    DriverManager driverManager = new DriverManager();

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        

    }

    @When("^I click on the \"([^\"]*)\"$")
    public void i_click_on_the(String registrationButton) throws Throwable {
        registrationPage.clickOnRegistrationButtonOnHeader();

    }

    @When("^I select gender \"([^\"]*)\"$")
    public void i_select_gender(String gender) throws Throwable {
        switch (gender) {
            case "Male":
                registrationPage.selectMale();
                break;
            case "Female":
                registrationPage.selectFemale();
                break;
            default:
                throw new IllegalAccessException("Unexpected gender");
        }
    }


    @When("^I click on the \"([^\"]*)\" on registration page$")
    public void i_click_on_the_on_registration_page(String regSubmitButton) throws Throwable {
        registrationPage.clickOnRegistrationButtonForSubmit();
    }

    @Then("^I should see \"([^\"]*)\" text on registration page$")
    public void i_should_see_text_on_registration_page(String expText) throws Throwable {
        String actualRegiSuccessText = registrationPage.getTextFromRegistrationResult();

    }

    @When("^I enter following data for registration$")
    public void i_enter_following_data_for_registration(DataTable dataTable) throws Throwable {
        List<Map<String,String>> myData = dataTable.asMaps(String.class,String.class);
        System.out.println(myData);
        registrationPage.enterRegistrationDetails(
                myData.get(0).get("firstname"),
                myData.get(0).get("latname"),
                myData.get(0).get("email"),
                myData.get(0).get("password"),
                myData.get(0).get("confirmpassword")
        );
    }

    @Then("^the url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain_with(String expectedTextInURL) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String myActualURL = driverManager.getCurrentURL();
        assertThat(myActualURL,containsString(expectedTextInURL));
    }

    @When("^I enter my firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
    public void i_enter_my_firstname_and_lastname(String enterFirstName, String enterLastName) throws Throwable {
        registrationPage.enterFirstnameAndLastname(enterFirstName,enterLastName);
    }

    @When("^I enter my emailid \"([^\"]*)\"$")
    public void i_enter_my_emailid(String enterEmail) throws Throwable {
        registrationPage.enterEmail(enterEmail);
    }

    @When("^I enter my password \"([^\"]*)\"$")
    public void i_enter_my_password(String password) throws Throwable {
        registrationPage.enterPassword(password);
        int length = password.length();
    }

    @When("^I enter confirm Password \"([^\"]*)\"$")
    public void i_enter_confirm_Password(String confirmPassword) throws Throwable {
        registrationPage.enterConfirmPassword(confirmPassword);
        int length = confirmPassword.length();
    }

    @And("^I Select gender \"([^\"]*)\"$")
    public void iSelectGender(String arg0) throws Throwable {
        registrationPage.femaleCheckBox.click();
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

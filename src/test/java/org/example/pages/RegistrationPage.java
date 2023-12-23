package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends DriverManager{
    DriverManager driverManager=new DriverManager();

    @FindBy(className="ico-register")
    public WebElement homepageRegistration;

    @FindBy(id="gender-female")
    public WebElement genderFemale;

    @FindBy(id="FirstName")
    public WebElement firstName;

    @FindBy(id="LastName")
    public WebElement lastName;

    @FindBy(id="Email")
    public WebElement emailId;

    @FindBy(id="Password")
    public WebElement firstPassword;

    @FindBy(id="ConfirmPassword")
    public WebElement confirmPasswordInputBox;

    @FindBy(id="register-button")
    public WebElement registrationButton;

    @FindBy(className = "result")
    public WebElement registrationCompleted;

    public void clickHomePageRegistration(){
        homepageRegistration.click();}

    public void selectGenderRadioButton(){
        genderFemale.isSelected();}

    public void firstNameInputBox(){
        firstName.clear();
        firstName.sendKeys("Brita");}
    public void lastNameInputBox(){
        lastName.clear();
        lastName.sendKeys("Vanpariya");}

    public void emailIdInputField(){
        emailId.clear();
        emailId.sendKeys("britagajera@gmail.com");}
    public void passwordInputField(){
        firstPassword.clear();
        firstPassword.sendKeys("abc@12345");}

    public void setConfirmPasswordInputField(){
        confirmPasswordInputBox.clear();
        confirmPasswordInputBox.sendKeys("abc@12345");}
    public void lastRegistrationButton(){
        registrationButton.click();}

    public void confirmRegistrationCompletedText(){
        registrationCompleted.getText();
    }
    public void entreRegistrationDetails(String firstname,String lastname,String email,String password,String confirmPassword) throws InterruptedException {
        firstName.clear();
        firstName.sendKeys(firstname);
        lastName.clear();
        lastName.sendKeys(lastname);
        emailId.clear();
        int myRandomNumber= driverManager.generateRandomNumber();
        emailId.sendKeys(myRandomNumber+ email);
        firstPassword.clear();
        firstPassword.sendKeys(password);
        confirmPasswordInputBox.clear();
        confirmPasswordInputBox.sendKeys(confirmPassword);
        driverManager.sleepBrowser(4000);

    }





}
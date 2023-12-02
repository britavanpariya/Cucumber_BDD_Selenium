package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {

    @FindBy(css = ".page-title")
    public WebElement welcomeLoginText;

    public String getWelcomeTextOnLoginPage(){
        return welcomeLoginText.getText();
    }
}

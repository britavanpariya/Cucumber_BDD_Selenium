package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {
<<<<<<<<< Temporary merge branch 1
=========
    DriverManager driverManager = new DriverManager();
>>>>>>>>> Temporary merge branch 2
    @FindBy(css = ".ico-login")
    public WebElement loginButton;

    public void clickOnLoginButton(){
<<<<<<<<< Temporary merge branch 1
=========
        driverManager.waitForElementVisibility(loginButton,10, "Login Button is not visible");
>>>>>>>>> Temporary merge branch 2
        loginButton.click();
    }

}

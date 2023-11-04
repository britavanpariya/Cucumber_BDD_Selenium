package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

import java.security.PublicKey;

public class Hooks {
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUpMethod() throws IllegalAccessException {
        driverManager.runOnLocalBrowser();
        driverManager.maxBrowser();
        driverManager.openUrl();
        driverManager.applyImplicitWait();
    }


    @After
    public void tearDownMethod() throws InterruptedException {
        driverManager.sleepBrowser(8000);
        driverManager.closeBrowser();
    }
}

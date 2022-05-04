package com.orangehrmlive.opensource_demo.testsuite;


import com.orangehrmlive.opensource_demo.pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.setUserNameField("Admin");
        loginPage.setPasswordField("admin123");
        loginPage.clickOnLoginButton();
        String expectedText = "Welcome";
        String actualText = loginPage.getWelcomeText().substring(0, 7);
        Assert.assertEquals(actualText, expectedText);
    }

}

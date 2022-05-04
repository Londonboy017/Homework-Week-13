package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnSignInLink();
        String expectedText = "Welcome Back!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyTheErrorMessage() {
        homePage.clickOnSignInLink();
        loginPage.setEmailField("tomsmith@gmail.com");
        loginPage.setPasswordField("SuperSecret");
        loginPage.clickOnLoginButton();
        String expectedText = "Invalid email or password.";
        String actualText = loginPage.getErrorText();
        Assert.assertEquals(actualText, expectedText);
    }


}

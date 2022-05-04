package com.herokuapp.the_internet.testsuite;

import com.herokuapp.the_internet.pages.LoginPage;
import com.herokuapp.the_internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
    loginPage.setUserNameField("tomsmith");
    loginPage.setPasswordField("SuperSecretPassword!");
    loginPage.clickOnLoginButton();
    String expectedText = "Secure Area";
    String actualText = loginPage.getSecureAreaText();
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        loginPage.setUserNameField("jay12");
        loginPage.setPasswordField("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText ="Your username is invalid!";
        String actualText=loginPage.getUserNameErrorText().substring(0,25);
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void  verifyThePasswordErrorMessage(){
        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("sdlfd");
        loginPage.clickOnLoginButton();
        String actualText= loginPage.getPasswordErrorText().substring(0,25);
        String expectedText = "Your password is invalid!";
        Assert.assertEquals(actualText,expectedText);
    }

}

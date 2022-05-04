package com.parasoft.parabank.testsuite;


import com.parasoft.parabank.pages.AccountOverviewPage;
import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    AccountOverviewPage accountOverviewPage = new AccountOverviewPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        loginPage.clickOnRegisterLink();
        String actualText = registerPage.getSignUpText();
        String expectedText = "Signing up is easy!";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        loginPage.clickOnRegisterLink();
        registerPage.setFirstNameField("Jaydev");
        registerPage.setLastNameField("Patel");
        registerPage.setAddressField("34,Oxford Street");
        registerPage.setCityField("London");
        registerPage.setStateField("Ohio");
        registerPage.setZipCodeField("3452");
        registerPage.setPhoneNumberField("9867564392");
        registerPage.setSsnNumberField("N/A");
        registerPage.setUserNameField("Jay178");
        registerPage.setPasswordField("Jason@018");
        registerPage.setConfirmPasswordField("Jason@018");
        registerPage.clickOnRegisterButton();
        String actualText1 = accountOverviewPage.getLoggedInText();
        String expectedText1 = "Your account was created successfully. You are now logged in.";
        Assert.assertEquals(actualText1, expectedText1);
    }


}

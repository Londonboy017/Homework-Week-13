package com.parasoft.parabank.testsuite;


import com.parasoft.parabank.pages.AccountOverviewPage;
import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.testbase.TestBase;
import com.sun.org.apache.xalan.internal.xsltc.dom.StepIterator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    AccountOverviewPage accountOverviewPage =new AccountOverviewPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
    loginPage.setUserNameField("Keshal23");
    loginPage.setPasswordField("Find@134");
    loginPage.clickOnLoginButton();
    String expectedText = "Accounts Overview";
    String actualText = accountOverviewPage.getWelcomeText();
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void verifyTheErrorMessage(){
        loginPage.setUserNameField("Keshav23");
        loginPage.setPasswordField("check134");
        loginPage.clickOnLoginButton();
        String expectedText = "The username and password could not be verified.";
        String actualText = loginPage.getErrorText();
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        loginPage.setUserNameField("Keshal23");
        loginPage.setPasswordField("Find@134");
        loginPage.clickOnLoginButton();
        accountOverviewPage.clickOnLogoutLink();
        String actualText=loginPage.getCustomerText();
        String expectedText ="Customer Login";
        Assert.assertEquals(actualText,expectedText);
    }

}

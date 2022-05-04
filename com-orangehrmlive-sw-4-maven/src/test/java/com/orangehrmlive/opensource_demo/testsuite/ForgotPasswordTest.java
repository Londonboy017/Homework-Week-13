package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        loginPage.clickOnForgetPasswordLink();
        String actualText = loginPage.getForgetPasswordText();
        String expectedText = "Forgot Your Password?";
        Assert.assertEquals(actualText, expectedText);
    }
}

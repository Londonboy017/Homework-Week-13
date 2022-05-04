package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPageTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage =new RegisterPage();
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.selectGenderRadio();
        registerPage.sendTextToFirstNameField("James");
        registerPage.sendTextToLastNameField("Roy");
        registerPage.selectDOBDropDown("12","November","1987");
        registerPage.sendTextToEmailField("jamesroy1@gmail.com");
        registerPage.sendTextToPasswordField("Roy123");
        registerPage.sendTextToConfirmPasswordField("Roy123");
        registerPage.clickOnRegisterButton();

        String actualMessage =registerPage.registrationMessage();

        String expectedMessage = "Your registration completed";
        Assert.assertEquals(actualMessage,expectedMessage,"Registration not completed");

    }


}

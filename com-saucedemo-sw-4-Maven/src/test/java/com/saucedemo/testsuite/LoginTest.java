package com.saucedemo.testsuite;

import com.saucedemo.pages.Inventory;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    Inventory inventory = new Inventory();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
    loginPage.setUserNameField("standard_user");
    loginPage.setPasswordField("secret_sauce");
    loginPage.clickOnLoginButton();
    String expectedText = "PRODUCTS";
    String actualText = loginPage.getCheckText();
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.setUserNameField("standard_user");
        loginPage.setPasswordField("secret_sauce");
        loginPage.clickOnLoginButton();
        Integer expectedProductsCount =6;
        Integer actualProductsCount=inventory.getCountsOfProducts();
        Assert.assertEquals(actualProductsCount,expectedProductsCount);
    }

}

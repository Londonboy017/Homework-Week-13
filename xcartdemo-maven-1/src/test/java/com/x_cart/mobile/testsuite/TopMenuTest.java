package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    ShippingPage shippingPage = new ShippingPage();
    NewArrivals newArrivals = new NewArrivals();
    ContactUs contactUs = new ContactUs();
    CommingSoon commingSoon = new CommingSoon();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnShippingLink();
        String actualText = "Shipping";
        String expectedText = shippingPage.getShippingText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to the page");
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewLink();
        String expectedText = "New arrivals";
        String actualText = newArrivals.getNewText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to the page");
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        homePage.clickOnComingSoonLink();
        String actualText = "Coming soon";
        String expectedText = commingSoon.getComingSoonText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to the page");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUsLink();
        String actualText = "Contact us";
        String expectedText = contactUs.getContactUsText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to the page");
    }


}

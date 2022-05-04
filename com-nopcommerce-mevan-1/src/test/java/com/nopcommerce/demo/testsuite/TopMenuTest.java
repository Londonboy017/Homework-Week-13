package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.utility.Utility;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
//object of all classes
Computers computers =new Computers();
GiftCards giftCards =new GiftCards();
Jewelry jewelry = new Jewelry();
Books books = new Books();
Electronics electronics = new Electronics();
Apparel apparel = new Apparel();
DigitalDownloads digitalDownloads =new DigitalDownloads();

HomePage homePage = new HomePage();
@Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        homePage.clickOnComputers();
        String actualText = "Computers";
        String expectedText = computers.getComputersText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to the page");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homePage.clickOnGiftCards();
        String actualText = "Gift Cards";
        String expectedText = giftCards.getGiftCardsText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to the page");
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homePage.clickOnCJewelry();
        String actualText = "Jewelry";
        String expectedText = jewelry.getJewelryText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to the page");
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homePage.clickOnBooks();
        String actualText = "Books";
        String expectedText = books.getBooksText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to the page");
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        homePage.clickOnElectronics();
        String actualText = "Electronics";
        String expectedText = electronics.getElectronicsText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to the page");
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        homePage.clickOnApparel();
        String actualText = "Apparel";
        String expectedText = apparel.getApparelText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to the page");
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        homePage.clickOnDigitalDownloads();
        String actualText = "Digital downloads";
        String expectedText =digitalDownloads.getDigitalDownloadText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to the page");
    }

}

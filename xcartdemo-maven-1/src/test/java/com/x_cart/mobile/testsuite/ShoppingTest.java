package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestsellersPage;
import com.x_cart.mobile.pages.CartPage;
import com.x_cart.mobile.pages.CheckoutPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HomePage homePage = new HomePage();
    BestsellersPage bestsellersPage =new BestsellersPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();



    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForVinylIdolzGhostbusters() throws InterruptedException {
        homePage.mouseHoverOnHotDeal();
        homePage.clickOnBestSellers();
        String expectedText = "Bestsellers";
        String actualText = bestsellersPage.getTextBestsellers();
        Assert.assertEquals(actualText,expectedText,"Not navigated to Bestsellers Page");
        bestsellersPage.setSortAtoZ();
        bestsellersPage.productAddToCart();
        String actualText1 = bestsellersPage.getTextAddToCart();
        String expectedText1 = "Product has been added to your cart";
        Assert.assertEquals(actualText1,expectedText1);
        bestsellersPage.closePopUpMessage();
        bestsellersPage.viewCart();
        String actualText2 = cartPage.getTextPage();
        String expectedText2 ="Your shopping cart - 1 item";
        Assert.assertEquals(actualText2,expectedText2);
        String  actualTextSubTotal =cartPage.getTextSubTotal();
        String  expectedTextSubTotal = "$19.99";
        Assert.assertEquals(actualTextSubTotal,expectedTextSubTotal);
        String actualTotal = cartPage.getTextTotal();
        String expectedTotal ="$25.84";
        Assert.assertEquals(actualTotal,expectedTotal);
        cartPage.clickOnCheckOutButton();
        String expectedLoginText = checkoutPage.getPageText();
        String actualLoginText = "Log in to your account";
        Assert.assertEquals(actualLoginText,expectedLoginText);
        checkoutPage.setEmailField("Stuart1@gmail.com");
        checkoutPage.clickOnContinue();
        String expectedText3 = checkoutPage.getSecureCheckOutText();
        String actualText3 ="Secure Checkout";
        Assert.assertEquals(actualText3,expectedText3);
        checkoutPage.setFirstNameField("Stuart");
        checkoutPage.setLastNameField("Parker");
        checkoutPage.setAddressField("3,Oxford Street");
        checkoutPage.setCityField("London");
        checkoutPage.clickOnCheckBox();
        checkoutPage.setPasswordField("Surrey12");
        checkoutPage.clickOnLocalShipping();
        checkoutPage.clickOnCODPaymentMethod();
        String actualTotalPrice = checkoutPage.getTotalPriceText();
        String expectedTotalPrice = "$26.86";
        Assert.assertEquals(actualTotalPrice,expectedTotalPrice);
        checkoutPage.clickOnPlaceOrder();
        String actualConfirmText= checkoutPage.getConformationText();
        String expectedConfirmText = "Thank you for your order";
        Assert.assertEquals(actualConfirmText,expectedConfirmText);

    }
    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnHotDeal();
        homePage.clickOnBestSellers();
        String expectedText = "Bestsellers";
        String actualText = bestsellersPage.getTextBestsellers();
        Assert.assertEquals(actualText,expectedText,"Not navigated to Bestsellers Page");
        bestsellersPage.setSortAtoZ();
        bestsellersPage.productAddToCart();
        String actualText1 = bestsellersPage.getTextAddToCart();
        String expectedText1 = "Product has been added to your cart";
        Assert.assertEquals(actualText1,expectedText1);
        bestsellersPage.closePopUpMessage();
        bestsellersPage.viewCart();
        String actualText2 = cartPage.getTextPage();
        String expectedText2 ="Your shopping cart - 1 item";
        Assert.assertEquals(actualText2,expectedText2);
        cartPage.clickOnEmptyCart();
        Alert alert = driver.switchTo().alert();
        String actualAlertText= alert.getText();
        String expectedAlertText = "Are you sure you want to clear your cart?";
        Assert.assertEquals(actualAlertText,expectedAlertText);
        acceptAlert();
        String expectedPopUpText = cartPage.getDeletePopUpMessageText();
        String actualPopUpText = "Item(s) deleted from your cart";
        Assert.assertEquals(actualPopUpText,expectedPopUpText);
        String expectedEmptyCartText = cartPage.getEmptyCartText();
        String actualEmptyCartText = "Your cart is empty";
        Assert.assertEquals(actualEmptyCartText,expectedEmptyCartText);

    }

}

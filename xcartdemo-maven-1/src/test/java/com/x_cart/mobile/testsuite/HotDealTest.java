package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestsellersPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.SaleProductsPage;
import com.x_cart.mobile.testbase.TestBase;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class HotDealTest extends TestBase {

    HomePage homePage = new HomePage();
    SaleProductsPage saleProductsPage =new SaleProductsPage();
    BestsellersPage bestsellersPage = new BestsellersPage();

    @Test
    public void verifySaleProductsArrangeAlphabetically(){
        homePage.mouseHoverOnHotDeal();
        homePage.clickOnSale();
        String expectedText = "Sale";
        String actualText = saleProductsPage.getSaleText();
        Assert.assertEquals(actualText,expectedText,"Not navigated to Sale Page");
        saleProductsPage.sortAtoZ();
        String actualText3=saleProductsPage.getTextSortAtoZ();
        String expectedText3 ="Name A - Z";
        Assert.assertEquals(actualText3,expectedText3,"Not sorted by a to z");

    }
@Test
    public void verifySaleProductsPriceArrangeLowToHigh(){
    homePage.mouseHoverOnHotDeal();
    homePage.clickOnSale();
    String expectedText = "Sale";
    String actualText = saleProductsPage.getSaleText();
    Assert.assertEquals(actualText,expectedText,"Not navigated to Sale Page");
    saleProductsPage.setSortLowToHigh();
    String actualText1=saleProductsPage.getTextSortLowToHigh();
    String expectedText1 ="Price Low - High";
    Assert.assertEquals(actualText1,expectedText1,"Not sorted by Low To High");

}
@Test
public void verifySaleProductsArrangeByRates(){
    homePage.mouseHoverOnHotDeal();
    homePage.clickOnSale();
    String expectedText = "Sale";
    String actualText = saleProductsPage.getSaleText();
    Assert.assertEquals(actualText,expectedText,"Not navigated to Sale Page");
    saleProductsPage.setSortByRates();
    String actualText2=saleProductsPage.getTextRates();
    String expectedText2 ="Rates";
    Assert.assertEquals(actualText2,expectedText2,"Not sorted by Rates");

}
@Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
    homePage.mouseHoverOnHotDeal();
    homePage.clickOnBestSellers();
    String expectedText = "Bestsellers";
    String actualText = bestsellersPage.getTextBestsellers();
    Assert.assertEquals(actualText,expectedText,"Not navigated to Bestsellers Page");
    List<String> originalList= bestsellersPage.originalProductList();
    Collections.sort(originalList, Collections.reverseOrder());
    bestsellersPage.setSortZtoA();
    List<String> sortedList= bestsellersPage.sortedProductList();
    org.junit.Assert.assertEquals(originalList,sortedList);
    }
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        homePage.mouseHoverOnHotDeal();
        homePage.clickOnBestSellers();
        String expectedText = "Bestsellers";
        String actualText = bestsellersPage.getTextBestsellers();
        Assert.assertEquals(actualText,expectedText,"Not navigated to Bestsellers Page");
        List<Double> originalList= bestsellersPage.originalProductList1();
        Collections.sort(originalList, Collections.reverseOrder());
        bestsellersPage.setSortLowToHigh();
        List<Double> sortedList= bestsellersPage.sortLowToHighProductList();
        org.junit.Assert.assertEquals(originalList,sortedList);

    }
    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        homePage.mouseHoverOnHotDeal();
        homePage.clickOnBestSellers();
        String expectedText = "Bestsellers";
        String actualText = bestsellersPage.getTextBestsellers();
        Assert.assertEquals(actualText, expectedText, "Not navigated to Bestsellers Page");
        List<Object> originalList = bestsellersPage.originalProductRatesList();
        Collections.sort(originalList, Collections.reverseOrder());
        List<Object> sortedList = bestsellersPage.sortedProductsRatesList();
        org.junit.Assert.assertEquals(originalList, sortedList);
    }


}

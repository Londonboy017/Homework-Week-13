package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class BestsellersPage extends Utility {

    By textBestsellers = By.tagName("h1");
    By productsList = By.xpath("//ul[@class='products-grid grid-list']/child::li/child::div/h5/a");
    By sortZtoA = By.partialLinkText("Name Z -");
    By sortByLabel = By.className("sort-by-label");
    By sortLowToHigh = By.partialLinkText("Price High - L");
    By sortRates = By.xpath("//*[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[6]/a");
    By priceList = By.xpath("//ul[@class='products-grid grid-list']/child::li/child::div/descendant::span[@class='price product-price']");
    By starsWidth =By.xpath("//div[@class='stars-row full']");
    By sortAtoZ = By.linkText("Name A - Z");
    By xyz = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[3]/ul/li[7]/div/div[1]/a/img");
    By addToCart =By.xpath("//ul[@class = 'products-grid grid-list']/li[8]/div/div[2]/div[4]/div/button");
    By textAddedCart = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeX =By.xpath("//div[@id='status-messages']/a");
    By yourCartIcon =By.xpath("//div[@title='Your cart']");
    By viewCartButton = By.linkText("View cart");

    public String getTextAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(textAddedCart);
    }
    public void closePopUpMessage(){
        clickOnElement(closeX);
    }
    public void viewCart() throws InterruptedException {
        clickOnElement(yourCartIcon);
        Thread.sleep(2000);
        clickOnElement(viewCartButton);
    }

    public void productAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverOnElement(xyz);
       Thread.sleep(1000);
        clickOnMouseHoverOnElement(addToCart);
    }


    public void setSortZtoA() {
        mouseHoverOnElement(sortByLabel);
        clickOnElement(sortZtoA);
    }
    public void setSortAtoZ() {
        mouseHoverOnElement(sortByLabel);
        clickOnElement(sortAtoZ);
    }

    public void setSortLowToHigh() {
        mouseHoverOnElement(sortByLabel);
        clickOnElement(sortLowToHigh);
    }

    public void setSortRates() throws InterruptedException, StaleElementReferenceException {

        mouseHoverOnElement(sortByLabel);
        Thread.sleep(1000);
        clickOnElement(sortRates);
    }

    public String getTextBestsellers() {
        return getTextFromElement(textBestsellers);
    }
    public List<Object> originalProductRatesList() {
   List<WebElement> originalProductList = driver.findElements(starsWidth);
        //create the list object
        List<Object> originalRatesList = new ArrayList();
        /*add all web element value to list object
        & Get width of rating*/
        for (WebElement element : originalProductList) {
            originalRatesList.add(String.valueOf(element.getAttribute("style")));
        }
        return originalRatesList;
        }
    public List<Object> sortedProductsRatesList() throws InterruptedException {
        mouseHoverOnElement(sortByLabel);
        clickOnElement(sortRates);
        Thread.sleep(1000);
        List<WebElement> actualProductListElements = driver.findElements(starsWidth);
        //create the list object
        List<Object> sortedRatesList = new ArrayList();
        /*
        add all web element value to list object*/
        for (WebElement element : actualProductListElements) {
            sortedRatesList.add(element.getAttribute("style"));
        }
        return sortedRatesList;
    }
    public List<String> originalProductList() {
        List<WebElement> ProductList = driver.findElements(productsList);
        //create the list
        List<String> originalProductList = new ArrayList();
        //add all web element value to list object
        for (WebElement element : ProductList) {
            originalProductList.add(element.getText());
        }
        return originalProductList;
    }

    public List<String> sortedProductList() throws InterruptedException {
        mouseHoverOnElement(sortByLabel);
        clickOnElement(sortZtoA);
        Thread.sleep(1000);
        List<WebElement> actualProductListElements = driver.findElements(productsList);
        //create the list
        List<String> sortedProductsList = new ArrayList();
        //add all web element value to list object
        for (WebElement element : actualProductListElements) {
            sortedProductsList.add(element.getText());
        }
        return sortedProductsList;
    }

    public List<Double> originalProductList1() {
        List<WebElement> ProductList = driver.findElements(priceList);
        //create the list object
        List<Double> originalProductList = new ArrayList();
        /*remove $ sign and add the sortPriceList
        //add all web element value to list object*/
        for (WebElement element : ProductList) {
            originalProductList.add(Double.valueOf(element.getText().replace("$", "")));
        }
        //Collections.sort(sortPriceList, Collections.reverseOrder());
        return originalProductList;
    }

    public List<Double> sortLowToHighProductList() throws InterruptedException {
        mouseHoverOnElement(sortByLabel);
        //select “Price: Low to High”
        clickOnElement(sortLowToHigh);
        Thread.sleep(1000);
        List<WebElement> productListElements = driver.findElements(priceList);
        //create the list object
        List<Double> sortedProductList = new ArrayList();
        /*remove $ sign and add the sortPriceList
        add all web element value to list object*/
        for (WebElement element : productListElements) {
            sortedProductList.add(Double.valueOf(element.getText().replace("$", "")));
        }
        return sortedProductList;
    }
}

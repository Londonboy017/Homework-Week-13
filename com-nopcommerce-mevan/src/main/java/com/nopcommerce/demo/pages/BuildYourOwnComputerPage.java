package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    By buildYourOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processorDropdown = By.id("product_attribute_1");
    By ramDropDown = By.cssSelector("select#product_attribute_2");

    public String getBuildYourOwnComputerText() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectTextFromProcessorDropDown(String str) {
        selectByVisibleTextFromDropDown(processorDropdown, str);
    }

    public void selectTextFromPRamDropDown(String str) {
        selectByVisibleTextFromDropDown(ramDropDown, str);
    }

    public void clickOnHDD400GBRadioButton() {
        clickOnElement(By.cssSelector("input#product_attribute_3_7"));
    }

    public void clickOnOSVistaPremiumRadioButton() {
        clickOnElement(By.cssSelector("input#product_attribute_4_9"));
    }

    public void clickOnTotalCommanderCheckBox()
    {
        clickOnElement(By.cssSelector("input#product_attribute_5_12"));
    }

    public String getPriceText()
    {
        return getTextFromElement(By.cssSelector("span#price-value-1"));
    }

    public void clickOnAddToCartButton()
    {
        clickOnElement(By.cssSelector("button#add-to-cart-button-1"));
    }

    public String getProductAddedToCartText()
    {
        return getTextFromElement(By.xpath("//div[@id='bar-notification']/div/p"));
    }

    public void clickOnCrossButton()
    {
        clickOnElement(By.cssSelector("span.close"));
    }


    public void mouseHoverOnShoppingCart()
    {
        mouseHoverOnElement(By.xpath("//li[@id='topcartlink']/a/span[1]"));

    }

    public void clickOnGoToCart()
    {
        clickOnElement(By.xpath("//button[text() = 'Go to cart']"));
    }
}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class NokiaLumia1020Page  extends Utility {
    public String getNokiaLumiaText() {
        return getTextFromElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
    }

    public String getPriceText() {
        return getTextFromElement(By.xpath("//span[@id='price-value-20']"));
    }

    public void changeQuantity(String qty) {
        Actions action = new Actions(driver);
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).sendKeys(Keys.CONTROL + "a");
        //updating the qty to 2
        sendTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"), qty);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-20']"));
    }

    public String getAddtoCartMessage() {
        return getTextFromElement(By.xpath("//div[@id='bar-notification']/div/p"));
    }

    public void clickOncrossButtonOfAddToCartMessage() {
        clickOnElement(By.cssSelector("span.close"));

    }

    public void mouseHoveronShoppingCart() {
        mouseHoverOnElement(By.xpath("//li[@id='topcartlink']/a/span[1]"));
    }

    public void clickOnGoToCart() {
        clickOnElement(By.xpath("//button[contains(text(),'Go to cart')]"));
    }

}

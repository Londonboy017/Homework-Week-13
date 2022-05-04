package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class GoToCartPage extends Utility {

    public String getShoppingCartText()
    {
        return getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
    }

    public void changeQuantity(String qty) throws InterruptedException {
        Actions action = new Actions(driver);
        driver.findElement(By.xpath("//tbody/tr/td[5]/input")).clear();
        Thread.sleep(2000);

        sendTextToElement(By.xpath("//tbody/tr/td[5]/input"), qty);
    }

    public void clickOnUpdateCart()
    {
        clickOnElement(By.cssSelector("button#updatecart"));
    }

    public String getverifyPriceAfterUpdate()
    {
        return getTextFromElement(By.xpath("//tr/td[6]/span"));
    }

    public void clickOnTermsandConditionsCheckBox()
    {
        clickOnElement((By.id("termsofservice")));
    }

    public void clickOnCheckOutButton()
    {
        clickOnElement(By.id("checkout"));
    }

    public String getNokiaLumiaPriceText()
    {
        return getTextFromElement(By.xpath("//td[@class='subtotal']/span"));
    }

}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class ShippingMethodPage extends Utility {

    public void clickOnNextDayAirRadioButton()
    {
        clickOnElement(By.id("shippingoption_1"));
    }

    public void clickOn2ndDayAir()
    {
        clickOnElement(By.id("shippingoption_2"));
    }

    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
    }

}

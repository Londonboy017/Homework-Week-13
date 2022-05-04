package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {

    public String getPaymentMethodtext()
    {
        return getTextFromElement(By.xpath("//li[@class='payment-method']/span[2]"));
    }

    public String getShippingText()
    {
        return  getTextFromElement(By.xpath("//li[@class='shipping-method']/span[2]"));
    }
    public String getVerifyTheTotal()
    {
        return getTextFromElement(By.xpath("//td[@class='subtotal']/span"));
    }

    public void clickOnConfirmButton()
    {
        clickOnElement(By.xpath("//button[text()='Confirm']"));
    }

}

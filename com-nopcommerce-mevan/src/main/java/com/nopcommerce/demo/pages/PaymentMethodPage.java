package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class PaymentMethodPage extends Utility {

    public void clickOnCreditCardRadioButton() {
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
    }

    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(By.xpath("//div[@id='checkout-step-payment-method']/div/button"));
    }
}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class PaymentInformationPage extends Utility
{
    public void selectCreditCardTypeFromTheDropdown(String type)
    {
        selectByVisibleTextFromDropDown(By.id("CreditCardType"),type);
    }

    public void selectVisaCardTypeFromDropDown(String type)
    {
        selectByVisibleTextFromDropDown(By.id("CreditCardType"),type);
    }
    public void enterCardHolderName(String name)
    {
        sendTextToElement(By.id("CardholderName"),name);
    }

    public void enterCardNumbre(String number)
    {
        sendTextToElement(By.id("CardNumber"),"5232 1478 4876 3353");
    }

    public void selectExpiryMonth(String month)
    {
        selectByVisibleTextFromDropDown(By.id("ExpireMonth"),month);
    }

    public void selectExpiryYear(String year)
    {
        selectByVisibleTextFromDropDown(By.id("ExpireYear"),year);
    }

    public void enterCardCode(String code)
    {
        sendTextToElement(By.id("CardCode"),code);
    }

    public void clickOncontinue()
    {
        clickOnElement(By.xpath("//div[@id='payment-info-buttons-container']/button"));
    }
}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BillingAddressPage extends Utility {

    public void firstName(String fname)
    {
        sendTextToElement(By.id("BillingNewAddress_FirstName"),fname);

    }

    public void lastName(String lname)
    {
        sendTextToElement(By.id("BillingNewAddress_LastName"),lname);
    }

    public void email(String e)
    {
        sendTextToElement(By.id("BillingNewAddress_Email"),e);
    }

    public void selectCounty(String str)
    {
        WebElement cnt = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select country = new Select(cnt);
        List<WebElement> allOptions =  country.getOptions();

        for(WebElement element : allOptions)
        {

            if(element.getText().equalsIgnoreCase(str))
            {
                element.click();
            }
        }
    }

    public void city(String c)
    {
        sendTextToElement(By.id("BillingNewAddress_City"),c);
    }

    public void address(String add)
    {
        sendTextToElement(By.id("BillingNewAddress_Address1"),add);
    }

    public void zipCode(String zc)
    {
        sendTextToElement(By.id("BillingNewAddress_ZipPostalCode"),zc);
    }

    public void phoneNumber(String pn)
    {
        sendTextToElement(By.id("BillingNewAddress_PhoneNumber"),pn);
    }

    public void clickOnContinueButton()
    {
        clickOnElement(By.xpath("//button[text() = 'Continue']"));
    }
}

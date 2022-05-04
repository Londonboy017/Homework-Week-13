package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class RegistrationPage  extends Utility {

    By registrationText = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]");

    public String getRegistrationCompleteText()
    {
        return getTextFromElement(registrationText);
    }

    public void clickOnContinueButton()
    {
        clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));
    }
}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility
{
    By giftCarsdsText = By.linkText("Gift Cards");

    public String getGiftCardsText()
    {
        return getTextFromElement(giftCarsdsText);
    }
}

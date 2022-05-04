package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCards extends Utility {
    By giftCardsAfterClick =By.xpath("//h1[contains(text(),'Gift Cards')]");
    public String  getGiftCardsText(){
        return getTextFromElement(giftCardsAfterClick);
    }
}

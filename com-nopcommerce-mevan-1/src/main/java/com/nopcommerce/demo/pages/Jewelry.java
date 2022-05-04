package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Jewelry extends Utility {
    By jeweleryAfterClick = By.xpath("//h1[contains(text(),'Jewelry')]");
    public String getJewelryText(){
        return getTextFromElement(jeweleryAfterClick);
    }
}

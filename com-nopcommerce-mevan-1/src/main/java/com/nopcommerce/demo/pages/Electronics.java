package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {
    By electronicsAfterClick = By.tagName("h1");
    public String getElectronicsText(){
        return getTextFromElement(electronicsAfterClick);
    }
}

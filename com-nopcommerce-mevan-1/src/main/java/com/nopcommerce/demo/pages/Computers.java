package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computers extends Utility {
    By computersAfterClick = By.tagName("h1");
    public String getComputersText(){
        return getTextFromElement(computersAfterClick);
    }
}

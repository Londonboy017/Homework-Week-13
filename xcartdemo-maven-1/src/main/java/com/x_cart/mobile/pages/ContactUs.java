package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUs extends Utility {
    By contactUSAfterClick =By.xpath("//h1[@id='page-title']");
    public String getContactUsText(){
        return getTextFromElement(contactUSAfterClick);
    }
}

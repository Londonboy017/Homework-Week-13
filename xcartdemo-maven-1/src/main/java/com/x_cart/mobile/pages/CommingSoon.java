package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CommingSoon extends Utility {
    By comingSoonAfterClick = By.xpath("//h1[@id='page-title']");
    public String getComingSoonText(){
        return getTextFromElement(comingSoonAfterClick);
    }
}

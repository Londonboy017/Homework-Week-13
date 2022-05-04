package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewArrivals  extends Utility {
    By newAfterClick = By.xpath("//h1[@id='page-title']");
    public String getNewText(){
        return getTextFromElement(newAfterClick);
    }
}

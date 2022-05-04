package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Apparel extends Utility {
    By apparelAfterClick = By.xpath("//h1[contains(text(),'Apparel')]");
    public String getApparelText(){
        return getTextFromElement(apparelAfterClick);
    }

}

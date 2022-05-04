package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage  extends Utility {
    By apperaltext =By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1");

    public String getApparelText()
    {
        return getTextFromElement(apperaltext);
    }

}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By electronicstext = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");

    public String getElectronicsText()
    {
        return getTextFromElement(electronicstext);
    }
}

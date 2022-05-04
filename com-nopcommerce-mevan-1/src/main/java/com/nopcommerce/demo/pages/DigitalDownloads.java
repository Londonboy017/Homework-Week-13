package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownloads extends Utility {
    By digitalDownloadAfterClick =By.xpath ("//h1[contains(text(),'Digital downloads')]");
    public String getDigitalDownloadText(){
        return getTextFromElement(digitalDownloadAfterClick);
    }
}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadsPage extends Utility {

    By digitalDownloadText = By.linkText("Digital downloads");

    public String getDigitalDownloadText() {
        return getTextFromElement(digitalDownloadText);
    }
}

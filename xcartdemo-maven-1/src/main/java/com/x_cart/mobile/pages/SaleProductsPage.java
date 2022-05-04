package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SaleProductsPage extends Utility {
    By saleText = By.tagName("h1");
    By sortByLabel = By.className("sort-by-label");
    By sortAtoZ = By.partialLinkText("Name A -");
    By textAtoZ = By.xpath("//span[contains(text(),'Name A - Z')]");
    By sortLowToHigh = By.partialLinkText("Price Low");
    By textLowToHigh = By.xpath("//span[contains(text(),'Price Low - High')]");
    By sortByRates =By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[7]/child::a");
    By textRates = By.xpath("//span[contains(text(),'Rates')]");


    public String getSaleText() {
        return getTextFromElement(saleText);
    }

    public void sortAtoZ() {
        mouseHoverOnElement(sortByLabel);
        clickOnElement(sortAtoZ);
    }

    public String getTextSortAtoZ() {
        return getTextFromElement(textAtoZ);
    }


    public void setSortLowToHigh() {
        mouseHoverOnElement(sortByLabel);
        clickOnElement(sortLowToHigh);
    }

    public String getTextSortLowToHigh() {
        return getTextFromElement(textLowToHigh);
    }
    public void  setSortByRates(){
        mouseHoverOnElement(sortByLabel);
        clickOnElement(sortByRates);
    }
    public String getTextRates(){
        return getTextFromElement(textRates);
    }


}

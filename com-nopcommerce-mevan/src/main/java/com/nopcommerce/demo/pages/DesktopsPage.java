package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    By selectPriceLowtoHigh = By.id("products-orderby");
    By addToCartButton = By.xpath("//div[@class='products-wrapper']//div/div/div[1]//div[@class='buttons']/button[1]");

    By PriceList = By.xpath("//span[contains(@class, 'actual-price')]");

    public List<Double> getOriginalPriceList(){
        List<WebElement> beforeFilter = driver.findElements(PriceList);
        List<Double> beforeSortPriceList = new ArrayList();

        for (WebElement p : beforeFilter) {
            beforeSortPriceList.add(Double.parseDouble(p.getText().trim().replace("$", "").replace(",", "")));
        }

        return  beforeSortPriceList;
    }
    public  List<Double> getSortPriceList() throws InterruptedException {
      //  selectByVisibleTextFromDropDown(selectPriceLowtoHigh,"Price: Low to High");
        Thread.sleep(1000);
        List<WebElement> afterFilter = driver.findElements(PriceList);
        List<Double> sortPriceList = new ArrayList();

        for (WebElement p : afterFilter) {
            sortPriceList.add(Double.parseDouble(p.getText().trim().replace("$", "").replace(",", "")));
        }
        return sortPriceList;
    }


    public void selectFromSortByDropDown(String text) {
        selectByVisibleTextFromDropDown(selectPriceLowtoHigh, text);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

}

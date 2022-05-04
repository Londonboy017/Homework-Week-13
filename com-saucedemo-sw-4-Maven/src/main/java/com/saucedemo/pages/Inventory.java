package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Inventory extends Utility {
    By productsCount =By.cssSelector("div.inventory_item");

    public Integer getCountsOfProducts(){
        List<WebElement> productsList = driver.findElements(productsCount);
   int sizeOfList = productsList.size();
   return sizeOfList;
    }
}

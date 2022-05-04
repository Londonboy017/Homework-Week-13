package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    public void clickOnListView() throws InterruptedException {
        clickOnElement(By.xpath("//a[contains(text(),'List')]"));
        Thread.sleep(2000);
    }

    public void clickOnNokiaLumiaLink() {
        clickOnElement(By.xpath("//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]"));

    }

}

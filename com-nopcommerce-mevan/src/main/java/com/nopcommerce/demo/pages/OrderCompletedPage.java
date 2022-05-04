package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class OrderCompletedPage extends Utility {

    public String getyourOrderHasBeenSuceffullyProcessedText()
    {
        return getTextFromElement(By.xpath("//div[@class='section order-completed']//strong"));

    }

    public void clickOnContinue()
    {
        clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));

    }

}

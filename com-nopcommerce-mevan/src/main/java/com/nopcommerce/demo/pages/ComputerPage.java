package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility
{
    By computerText = By.className("page-title");


    public String getComputerText()
    {
        return getTextFromElement(computerText);
    }
}

package com.sauce.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {

    private By productHeader = By.xpath("//span[text()='Products']");

    public boolean isProductHeaderDisplay() {
        return find(productHeader).isDisplayed();
    }
}

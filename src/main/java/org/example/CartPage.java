package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{
    private WebElement SUB_TOTAL;
    public CartPage() {
        super();

    }
    public String getSubtotalText() {
        // Locate the subtotal element by its ID
        return driver.findElement(By.id("sc-subtotal-label-activecart")).getText();

        // Get the text of the subtotal element

    }



}

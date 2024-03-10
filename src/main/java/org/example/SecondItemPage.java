package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SecondItemPage extends BasePage {
    public WebElement ADD_TO_CART_BTN;

    public SecondItemPage() {
        super();
        ADD_TO_CART_BTN = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
    }

    public void addToCart() {
        ADD_TO_CART_BTN.click();
    }
}

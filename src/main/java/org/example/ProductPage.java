package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {
    private WebElement ADD_TO_CART_BTN;
    private WebElement CART_ICON;

    public ProductPage() {
        super();
    }

    public void initializeElements() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
    }

    public void clickAddToCart() {
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

    }

    public CartPage clickCartBtn() {
        driver.findElement(By.id("nav-cart")).click();
        return new CartPage();
    }
}

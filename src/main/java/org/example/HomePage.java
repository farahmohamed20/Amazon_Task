package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {
    public Actions action;

    public HomePage() {
        super();
        action = new Actions(driver); // Initialize the Actions object
    }

    public SearchResultPage searchForItem(String itemName) {
        WebElement item = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        item.sendKeys(itemName);
        action.sendKeys(item, Keys.ENTER).perform();
        return new SearchResultPage();
    }

    public TodayDealsPage openTodayDeals() {
        WebElement todayBtn = driver.findElement(By.xpath("//*[@data-csa-c-slot-id='nav_cs_0']\n"));
        todayBtn.click();
        return new TodayDealsPage();
    }
}

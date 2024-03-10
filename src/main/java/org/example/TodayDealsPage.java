package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TodayDealsPage extends BasePage {
    public Actions action;

    public WebElement HEADPHONES;
    public WebElement GROCERY;
    public WebElement DISCOUNT;

    public TodayDealsPage() {
        super();
    }

    public void selectMobilePhonesAndGrocery() {
        scrollDown();
        driver.findElement(By.xpath("//*[@data-csa-c-element-id='filter-department-21832868031']\n")).click();
        driver.findElement(By.xpath("//*[@data-csa-c-element-id='filter-department-18020637031']\n")).click();
    }

    public FilterPage selectDiscount() {
        scrollDown();
        driver.findElement(By.xpath("//span[normalize-space()='10% off or more']")).click();
        return new FilterPage();
    }

    private void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}

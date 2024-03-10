package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterPage extends BasePage {
    private WebElement PAGE_NUMBER;
    private WebElement ITEM;

    public FilterPage() {
        super();

    }


    public void selectItem () {
        driver.findElement(By.xpath("//div[@aria-label='Deal: Amazon Ramadan Box; Deal price: EGP419.00']//a[@class='a-link-normal DealCard-module__linkOutlineOffset_2fc037WfeGSjbFp1CAhOUn']")).click();


    }
}
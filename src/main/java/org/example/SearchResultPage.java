package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends BasePage {
    public WebElement FIRST_ITEM;

    public SearchResultPage() {
        super();
        FIRST_ITEM = driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]"));
//        FIRST_ITEM = driver.findElement(By.xpath("  FIRST_ITEM = driver.findElement(By.xpath(\"(//span[normalize-space()='EcoNour Car Windshield Sun Shade with Storage Pouch | Made of 240T Material | Guards from UV Rays & Hot Temperature | Car Accessories for Superior Interior Sun Protection | Large Plus (70x42 inches)'])[1]\"));\n"));


        }
    public ProductPage clickFirstItem () {
        FIRST_ITEM.click();
       return new ProductPage();
    }

}

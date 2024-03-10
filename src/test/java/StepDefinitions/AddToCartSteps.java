package StepDefinitions;

import io.cucumber.java.en.*;
import net.sourceforge.tess4j.TesseractException;
import org.example.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;



public class AddToCartSteps {

    public WebDriver driver;
    @Given("The user is on the Amazon homepage")
    public void the_user_is_on_the_amazon_homepage() throws IOException, TesseractException {
        BasePage baseObj = new BasePage();
        BasePage.goHome();
    }

    @When("The user search for {string}")
    public void the_user_search_for(String searchItem) {
        searchItem = "Car accessories";
        HomePage homeObj = new HomePage();
        homeObj.searchForItem(searchItem);
    }

    @When("The user select the first item from the search results")
    public void the_user_select_the_first_item_from_the_search_results() {
        SearchResultPage searchPageObj = new SearchResultPage();
        searchPageObj.clickFirstItem();
    }
    @When("The user add the item to the cart")
    public void the_user_add_the_item_to_the_cart() {
        ProductPage productObj = new ProductPage();
        productObj.clickAddToCart();
    }
    @When("The user go to the cart")
    public void the_user_go_to_the_cart() {
        ProductPage productObj = new ProductPage();
        productObj.clickCartBtn();
    }
    @Then("The user should see the item added successfully")
    public void the_user_should_see_the_item_added_successfully() {
        CartPage cartObj = new CartPage();
        String subtotalText = cartObj.getSubtotalText();
        Assert.assertTrue("Subtotal text does not contain 'Subtotal (1 item)'", subtotalText.contains("Subtotal (1 item)"));
    }
}

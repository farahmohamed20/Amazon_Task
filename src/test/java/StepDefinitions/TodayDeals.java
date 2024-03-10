package StepDefinitions;

import io.cucumber.java.en.*;
import org.example.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TodayDeals  {
    TodayDealsPage todayDealsObj= new TodayDealsPage();
    public WebDriver driver;

    @Given("The user is on the homepage of the shopping website")
    public void the_user_is_on_the_homepage_of_the_shopping_website() {
        BasePage.goHome();
    }
    @When("The user opens today deals")
    public void theUserOpensTodayDeals() {
        HomePage homeObj = new HomePage();
        homeObj.openTodayDeals();
    }
    @When("The user selects MobilePhones and Grocery from the left side filters")
    public void the_user_selects_mobile_phones_and_grocery_from_the_left_side_filters() {
        todayDealsObj.selectMobilePhonesAndGrocery();
    }
    @When("The user chooses {int}% off or more from the discount options")
    public void the_user_chooses_off_or_more_from_the_discount_options(Integer int1) {
        todayDealsObj.selectDiscount();
    }

    @When("The user selects any item")
    public void the_user_selects_any_item() {
        FilterPage filterObj = new FilterPage();
        filterObj.selectItem();
    }
    @When("The user adds the item to the cart")
    public void the_user_adds_the_item_to_the_cart() {
        SecondItemPage secondItemObj = new SecondItemPage();
        secondItemObj.addToCart();
        ProductPage productObj = new ProductPage();
        productObj.clickCartBtn();
    }
    @Then("The user should see the item added to the cart successfully")
    public void the_user_should_see_the_item_added_to_the_cart_successfully() {
        CartPage cartObj = new CartPage();
        String subtotalText = cartObj.getSubtotalText();
        Assert.assertTrue("Subtotal text does not contain 'Subtotal (1 item)'", subtotalText.contains("Subtotal (1 item)"));
    }




}

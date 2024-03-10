Feature: Open Today's Deals and filter by MobilePhones and Grocery, then select items with 10% off or more, and add an item from the fourth page to the cart

  Scenario Outline: Filter Today's Deals and add item to cart
    Given The user is on the homepage of the shopping website
    When The user opens today deals
    And The user selects MobilePhones and Grocery from the left side filters
    And The user chooses <int1>% off or more from the discount options
    And The user selects any item
    And The user adds the item to the cart
    Then The user should see the item added to the cart successfully
    Examples:
      | int1 |
      | 10   |

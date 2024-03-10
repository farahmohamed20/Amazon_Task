Feature: Add car accessories to the cart on Amazon

  Scenario: Add car accessories to the cart
    Given The user is on the Amazon homepage
    When The user search for "car accessories"
    And The user select the first item from the search results
    And The user add the item to the cart
    And The user go to the cart
    Then The user should see the item added successfully
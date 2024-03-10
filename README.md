# Amazon Shopping Scenarios

This project contains automated test scenarios for shopping on Amazon.

## Scenarios

### Scenario 1: Search for Car Accessories, Add to Cart, and Verify

1. Open the Amazon website by navigating to [https://www.amazon.eg/-/en/](https://www.amazon.eg/-/en/).
2. Type "car accessories" in the search bar.
3. Select the first item from the search results.
4. Add the selected item to the cart.
5. Go to the cart and verify that the item is successfully added.

### Scenario 2: Filter Today's Deals for Headphones and Grocery

1. Open the Today's Deals section on the Amazon website.
2. From the left-side filters, select "Headphones" and "Grocery".
3. Choose "10% off or more" from the discount options.
4. Navigate to the fourth page of deals.
5. Select any item from the fourth page and add it to the cart.

## Getting Started

To run these automated test scenarios, you need to have the necessary automation tools set up on your local machine also extract the valid locators. Follow the steps below to get started:

### Prerequisites

- Java Development Kit (JDK)
- Selenium WebDriver
- Test automation framework (Cucumber)
- WebDriver compatible with your preferred browser (e.g., ChromeDriver for Google Chrome)

### Installation

1. Clone this repository to your local machine.
2. Set up the cucumber java and selenium java dependencies as mentioned in the prerequisites.
3. Configure your test environment and update any necessary paths or configurations in the test scripts.

## Usage

1. Run the test scenarios using cucumber
2. Monitor the execution to ensure that the scenarios complete successfully.
3. Review the test results to identify any issues or failures.

## Contributing

If you encounter any bugs or would like to suggest improvements, feel free to open an issue or submit a pull request.


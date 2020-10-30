@ebay
Feature: US1005_price_of_product_ebay_test
  Scenario: Verify in eBay website whether the price of product is "$190.00"
    Given User is signal-telecom homepage
    And the user click on the button of eBay Page
    And the user selects the newly opened Signal Telecom's eBay Page
    And the user search in eBay Store for "GRANDSTREAM GXW4104"
    Then verify  the product is same
    Then verify whether the price of product is "$190.00"


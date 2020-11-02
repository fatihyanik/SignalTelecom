Feature: US_011_product_list_in_shop_page_should_be_high_to_low_order_feature

  Background:
    Given the user is on the shop page
    And the user select "Sort by price: high to low" from dd menu

  Scenario: TC_001_Testing_the_first_product_costet_4,999.00
    Then verify the first product_costet "$4,999.00"

  Scenario: TC_001_Testing_if_the_product_list_really_in_high_to_low_order
    Then verify the product list in high to low order

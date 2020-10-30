$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US1004_price_of_product_ebay_test.feature");
formatter.feature({
  "name": "US1005_price_of_product_ebay_test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ebay"
    }
  ]
});
formatter.scenario({
  "name": "Verify in eBay website whether the price of product is \"$190.00\"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ebay"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is signal-telecom homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayTestStepDefinition.user_is_signal_telecom_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on the button of eBay Page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.EbayTestStepDefinition.the_user_click_on_the_button_of_eBay_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects the newly opened Signal Telecom\u0027s eBay Page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.EbayTestStepDefinition.the_user_selects_the_newly_opened_Signal_Telecom_s_eBay_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user search in eBay Store for \"GRANDSTREAM GXW4104\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.EbayTestStepDefinition.the_user_search_in_eBay_Store_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify  the product is same",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.EbayTestStepDefinition.verify_the_product_is_same()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify whether the price of product is \"$190.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.EbayTestStepDefinition.verify_whether_the_price_of_product_is_$190(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
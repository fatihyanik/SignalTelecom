$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_016_verify_all_banners_are_accessible_without_click.feature");
formatter.feature({
  "name": "US_015_verify_all_banners_are_accessible_without_click",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@banners2"
    }
  ]
});
formatter.background({
  "name": "User go to home page",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "TC_01 User wait all banners and click the LEARN MORE button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@banners2"
    }
  ]
});
formatter.step({
  "name": "the user click on LEARN MORE button on 2th banner",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.BannersStepDefinition.the_user_click_on_LEARN_MORE_button_on_2th_banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the pages that open match the 2th banner",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.BannersStepDefinition.verify_the_pages_that_open_match_the_2th_banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user back to first page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.BannersStepDefinition.the_user_back_to_first_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on LEARN MORE button on 3th banner",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.BannersStepDefinition.the_user_click_on_LEARN_MORE_button_on_3th_banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the pages that open match the 3th banner",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.BannersStepDefinition.verify_the_pages_that_open_match_the_3th_banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user back to first page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.BannersStepDefinition.the_user_back_to_first_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on LEARN MORE button on 4th banner",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.BannersStepDefinition.the_user_click_on_LEARN_MORE_button_on_4th_banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the pages that open match the 4th banner",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.BannersStepDefinition.verify_the_pages_that_open_match_the_4th_banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user back to first page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.BannersStepDefinition.the_user_back_to_first_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on LEARN MORE button on 5th banner",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.BannersStepDefinition.the_user_click_on_LEARN_MORE_button_on_5th_banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the pages that open match the 5th banner",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.BannersStepDefinition.verify_the_pages_that_open_match_the_5th_banner()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[TURKNEY TECHNOLOGY CONSULTING]\u003e but was:\u003c[Oops! That page can’t be found.]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepdefinitions.BannersStepDefinition.verify_the_pages_that_open_match_the_5th_banner(BannersStepDefinition.java:80)\r\n\tat ✽.verify the pages that open match the 5th banner(file:///C:/Users/yavuz/IdeaProjects/SignalTelecom/src/test/resources/features/US_016_verify_all_banners_are_accessible_without_click.feature:21)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshotsdd/mm/yyyy");
formatter.after({
  "status": "passed"
});
});
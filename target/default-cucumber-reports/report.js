$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US1004_price_of_product_ebay_test.feature");
formatter.feature({
  "name": "US1004_price_of_product_ebay_test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ebay"
    }
  ]
});
formatter.background({
  "name": "User go to signal-telecom homepage",
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
  "error_message": "org.openqa.selenium.InvalidArgumentException: invalid argument\n  (Session info: chrome\u003d86.0.4240.111)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-7L5D1SM\u0027, ip: \u0027192.168.0.53\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.111, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\yavuz\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51425}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: ada8c094b45e13a295374195eb57d02c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat stepdefinitions.EbayTestStepDefinition.user_is_signal_telecom_homepage(EbayTestStepDefinition.java:19)\r\n\tat ✽.User is signal-telecom homepage(file:///C:/Users/yavuz/IdeaProjects/SignalTelecom/src/test/resources/features/US1004_price_of_product_ebay_test.feature:5)\r\n",
  "status": "failed"
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
formatter.step({
  "name": "the user click on the button of eBay Page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.EbayTestStepDefinition.the_user_click_on_the_button_of_eBay_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user selects the newly opened Signal Telecom\u0027s eBay Page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.EbayTestStepDefinition.the_user_selects_the_newly_opened_Signal_Telecom_s_eBay_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user search in eBay Store for \"GRANDSTREAM GXW4104\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.EbayTestStepDefinition.the_user_search_in_eBay_Store_for(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify  the product is same",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.EbayTestStepDefinition.verify_the_product_is_same()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify whether the price of product is \"$190.00\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.EbayTestStepDefinition.verify_whether_the_price_of_product_is_$190(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshots");
formatter.after({
  "status": "passed"
});
});
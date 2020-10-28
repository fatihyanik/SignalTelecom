$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/example.feature");
formatter.feature({
  "name": "Signal Telecom",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@example"
    }
  ]
});
formatter.scenario({
  "name": "TC01_user want to go signal telecom",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@example"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user go to \"http://www.signal-telecom.com/\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Demo feature.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Signup facebook page",
  "description": "",
  "id": "facebook-login;signup-facebook-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "he enter the value in all mandatory fields \"\u003cuserid\u003e\" , \"\u003cPasword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on Create Account button",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "facebook-login;signup-facebook-page;",
  "rows": [
    {
      "cells": [
        "userid",
        "Password"
      ],
      "line": 9,
      "id": "facebook-login;signup-facebook-page;;1"
    },
    {
      "cells": [
        "abc",
        "xyz"
      ],
      "line": 10,
      "id": "facebook-login;signup-facebook-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Signup facebook page",
  "description": "",
  "id": "facebook-login;signup-facebook-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "he enter the value in all mandatory fields \"abc\" , \"\u003cPasword\u003e\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on Create Account button",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoStepDefination.user_is_on_facebook_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 44
    },
    {
      "val": "\u003cPasword\u003e",
      "offset": 52
    }
  ],
  "location": "DemoStepDefination.he_enter_the_value_in_all_mandatory_fields(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DemoStepDefination.click_on_Create_Account_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("SDET.feature");
formatter.feature({
  "line": 1,
  "name": "Google search functionality",
  "description": "",
  "id": "google-search-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Serach value in Google",
  "description": "",
  "id": "google-search-functionality;serach-value-in-google",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigate to Google page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enter value in search box \"\u003cvalue\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Result will display \"\u003cSample\u003e\" , \"\u003cSample2\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "google-search-functionality;serach-value-in-google;",
  "rows": [
    {
      "cells": [
        "value",
        "Sample",
        "Sample2"
      ],
      "line": 9,
      "id": "google-search-functionality;serach-value-in-google;;1"
    },
    {
      "cells": [
        "IBM",
        "String1",
        "String2"
      ],
      "line": 10,
      "id": "google-search-functionality;serach-value-in-google;;2"
    },
    {
      "cells": [
        "Manipal",
        "String3",
        "String3"
      ],
      "line": 11,
      "id": "google-search-functionality;serach-value-in-google;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Serach value in Google",
  "description": "",
  "id": "google-search-functionality;serach-value-in-google;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigate to Google page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enter value in search box \"IBM\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Result will display \"String1\" , \"String2\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_navigate_to_Google_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "IBM",
      "offset": 32
    }
  ],
  "location": "StepDefination.user_Enter_value_in_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "String1",
      "offset": 21
    },
    {
      "val": "String2",
      "offset": 33
    }
  ],
  "location": "StepDefination.result_will_display(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "Serach value in Google",
  "description": "",
  "id": "google-search-functionality;serach-value-in-google;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigate to Google page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enter value in search box \"Manipal\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Result will display \"String3\" , \"String3\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_navigate_to_Google_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Manipal",
      "offset": 32
    }
  ],
  "location": "StepDefination.user_Enter_value_in_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "String3",
      "offset": 21
    },
    {
      "val": "String3",
      "offset": 33
    }
  ],
  "location": "StepDefination.result_will_display(String,String)"
});
formatter.result({
  "status": "skipped"
});
});
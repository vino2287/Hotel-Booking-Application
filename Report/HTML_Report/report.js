$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking Functionality",
  "description": "",
  "id": "hotel-booking-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 305800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User want to login the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter the \"vinovicky\" valid username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter the \"GMN630\" valid password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User validate the username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "Stedefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 3226342800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinovicky",
      "offset": 16
    }
  ],
  "location": "Stedefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 243590400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GMN630",
      "offset": 16
    }
  ],
  "location": "Stedefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 160382500,
  "status": "passed"
});
formatter.match({
  "location": "Stedefinition.user_validate_the_username_and_password()"
});
formatter.result({
  "duration": 1382987900,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User want to login the application",
  "description": "",
  "id": "hotel-booking-functionality;user-want-to-login-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User enter the \"vinovicky\" valid username",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User enter the \"GMN630\" valid password",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User validate the username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "Stedefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 421670300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinovicky",
      "offset": 16
    }
  ],
  "location": "Stedefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 151512800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GMN630",
      "offset": 16
    }
  ],
  "location": "Stedefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 146394400,
  "status": "passed"
});
formatter.match({
  "location": "Stedefinition.user_validate_the_username_and_password()"
});
formatter.result({
  "duration": 520515600,
  "status": "passed"
});
formatter.after({
  "duration": 234800,
  "status": "passed"
});
});
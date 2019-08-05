$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Test Suites For AdactinHotel",
  "description": "",
  "id": "test-suites-for-adactinhotel",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1565801,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify Valid LogIn Details",
  "description": "",
  "id": "test-suites-for-adactinhotel;verify-valid-login-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launches The AdactinHotel Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enters The Username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enters The Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks LogIn Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Verify The Title Hello Username",
  "keyword": "Then "
});
formatter.match({
  "location": "AdacTestDefinition.user_Launches_The_AdactinHotel_Application()"
});
formatter.result({
  "duration": 3331144569,
  "status": "passed"
});
formatter.match({
  "location": "AdacTestDefinition.user_Enters_The_Username()"
});
formatter.result({
  "duration": 927820202,
  "status": "passed"
});
formatter.match({
  "location": "AdacTestDefinition.user_Enters_The_Password()"
});
formatter.result({
  "duration": 322597943,
  "status": "passed"
});
formatter.match({
  "location": "AdacTestDefinition.user_Clicks_LogIn_Button()"
});
formatter.result({
  "duration": 1926964094,
  "status": "passed"
});
formatter.match({
  "location": "AdacTestDefinition.user_Verify_The_Title_Hello_Username()"
});
formatter.result({
  "duration": 174958932,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cHello k[]gandhi!\u003e but was:\u003cHello k[k]gandhi!\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.adactin.testdefinition.AdacTestDefinition.user_Verify_The_Title_Hello_Username(AdacTestDefinition.java:52)\r\n\tat ✽.Then User Verify The Title Hello Username(Adactin.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 987061390,
  "status": "passed"
});
});
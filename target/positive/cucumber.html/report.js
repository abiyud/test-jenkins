$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchCars.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate Search Cars Page is working.",
  "description": "In order to validate that \r\nthe Search Cars page is working\r\nDoing the Acceptance Testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 3248919917,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Home Page \"https://www.carsguide.com.au\" of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click sell my car",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au",
      "offset": 23
    }
  ],
  "location": "SearchCarsSteps.i_am_on_the_Home_Page_of_CarsGuide_Website(String)"
});
formatter.result({
  "duration": 12659674334,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_click_sell_my_car()"
});
formatter.result({
  "duration": 5336472250,
  "status": "passed"
});
formatter.after({
  "duration": 481289583,
  "status": "passed"
});
});
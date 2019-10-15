$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RunFeatures.feature");
formatter.feature({
  "line": 1,
  "name": "form submition application",
  "description": "",
  "id": "form-submition-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10499891139,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "fill the form",
  "description": "",
  "id": "form-submition-application;fill-the-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Load 1 row data from Excel",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Fill the form",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Submit the form",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "verify the dropdown",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 5
    }
  ],
  "location": "FormDefination.load_row_data_from_Excel(int)"
});
formatter.result({
  "duration": 594403039,
  "status": "passed"
});
formatter.match({
  "location": "FormDefination.fill_the_form()"
});
formatter.result({
  "duration": 12229713673,
  "status": "passed"
});
formatter.match({
  "location": "FormDefination.Submit_the_form()"
});
formatter.result({
  "duration": 51053562,
  "status": "passed"
});
formatter.match({
  "location": "FormDefination.verify_the_dropdown()"
});
formatter.result({
  "duration": 76374,
  "status": "passed"
});
formatter.after({
  "duration": 117791,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 2,
  "name": "Demo Borland",
  "description": "",
  "id": "demo-borland",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@borland"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "Entergmo",
  "description": "",
  "id": "demo-borland;entergmo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@Entergmo"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I launch Borland URL",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I Click on Enter GMO online button in GMO online page",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I Enter quantity as \"10\" in Onlinecatlog page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef_pom.Launch()"
});
formatter.result({
  "duration": 12558857000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef_pom.Click()"
});
formatter.result({
  "duration": 555173400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 21
    }
  ],
  "location": "Stepdef_pom.Enter(String)"
});
formatter.result({
  "duration": 107690900,
  "status": "passed"
});
});
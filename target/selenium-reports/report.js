$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Features/ourSupplier.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Harneek Singh"
    },
    {
      "line": 2,
      "value": "#Your Supplier Feature"
    }
  ],
  "line": 4,
  "name": "Verify Functionality of Your Supplier Page",
  "description": "I want to verify that the user can select various option on Your Supplier page as per their requirements.",
  "id": "verify-functionality-of-your-supplier-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Find post code funtionality",
  "description": "",
  "id": "verify-functionality-of-your-supplier-page;find-post-code-funtionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the your supplier page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter postcode as \"PE26YS\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on Find Postcode button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Who supplies your energy? section is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "one energy supplier is highlighted",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Change Post Code hyperlink is displayed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "What do you want to compare functionality\twith Gas \u0026 Electricity option selected",
  "description": "",
  "id": "verify-functionality-of-your-supplier-page;what-do-you-want-to-compare-functionality-with-gas-\u0026-electricity-option-selected",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I select Do you have your bill handy? as \"Yes, I have my Bill\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Select What do you want to compare?  option as \"Gas \u0026 Electricity\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Select Is your gas \u0026 electricity from the same supplier? option as \"No\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Who supplies your gas? and Who supplies your electricity? section is displayed with six popular suppliers and a drop down to select other suppliers",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 23,
  "name": "What do you want to compare functionality with Gas only option selected",
  "description": "",
  "id": "verify-functionality-of-your-supplier-page;what-do-you-want-to-compare-functionality-with-gas-only-option-selected",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I select Do you have your bill handy? as \"Yes, I have my Bill\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Select What do you want to compare?  option as \"Gas\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Who supplies your gas? section is displayed with six popular suppliers and a drop down to select other suppliers",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 28,
  "name": "Navigate to your energy page",
  "description": "",
  "id": "verify-functionality-of-your-supplier-page;navigate-to-your-energy-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "I select Do you have your bill handy? as \"Yes, I have my Bill\"",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Select What do you want to compare?  option as \"Gas \u0026 Electricity\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Select Is your gas \u0026 electricity from the same supplier? option as \"Yes\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I select my energy supplier as E-ON and Click Next",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I should be navigate to \"Your Energy\" page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
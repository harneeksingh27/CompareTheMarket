$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ourSupplier.feature");
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
formatter.uri("yourDetails.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Harneek Singh"
    },
    {
      "line": 2,
      "value": "#Your Details Feature"
    }
  ],
  "line": 4,
  "name": "Select and verify various options on Your Details Page",
  "description": "I want to select various options available on Your Details Page and navigate to Your Results page to see the results based on my selection",
  "id": "select-and-verify-various-options-on-your-details-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Selection of various options at Your Details page",
  "description": "",
  "id": "select-and-verify-various-options-on-your-details-page;selection-of-various-options-at-your-details-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the Your Details page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I select \"All tariffs\", payment type as \"Monthly direct debit\" in Your Prefences section",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter my email address as \"email@gmail.com\" in Your Contact Details section",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I check the Terms and Conditions checkbox and click Goto Prices",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be navigated to Your Result page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I am able to see the results based on the options I selected on the previous pages",
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
  "line": 15,
  "name": "Verification of Results Displayed at Your Reults Page",
  "description": "",
  "id": "select-and-verify-various-options-on-your-details-page;verification-of-results-displayed-at-your-reults-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I am on the Your Results page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I should be able to view my options selected on Top of page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I should be able to refine my results",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should be able to view results based on my section",
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
formatter.uri("yourEnergy.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Harneek Singh"
    },
    {
      "line": 2,
      "value": "#Your Energy Feature"
    }
  ],
  "line": 4,
  "name": "Verify Functionality of Your Energy Page",
  "description": "I want to verify that the I can select various option on Your Energy page for both electricity and gas",
  "id": "verify-functionality-of-your-energy-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Navigate to your energy page",
  "description": "",
  "id": "verify-functionality-of-your-energy-page;navigate-to-your-energy-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on the your supplier page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I enter postcode as \"PE26YS\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on Find Postcode button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select Do you have your bill handy? as \"Yes, I have my Bill\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Select What do you want to compare?  option as \"Gas \u0026 Electricity\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Select Is your gas \u0026 electricity from the same supplier? option as \"Yes\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select my energy supplier as E-ON and Click Next",
  "keyword": "And "
});
formatter.step({
  "line": 16,
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
  "line": 18,
  "name": "Complete \"Your Energy\" Form for electricity",
  "description": "",
  "id": "verify-functionality-of-your-energy-page;complete-\"your-energy\"-form-for-electricity",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I am on your energy for electricity page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I select the electricity tarrif as \"Age UK Fixed 1 Year\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I select Economy Seven meter as \"No\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Payment method as \"Monthly Direct Debit\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I Select electricity as main source of heating? option as \"Yes\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter Current Electricity usage as \"Pound\" and enter the ammount as \"300\", frequency as \"Monthly\" and bill date as \"1 September,2016\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click next button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I should be navigated to Your Energy page for gas",
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
  "line": 30,
  "name": "Complete \"Your Energy\" Form for Gas",
  "description": "",
  "id": "verify-functionality-of-your-energy-page;complete-\"your-energy\"-form-for-gas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "I am on your energy for gas page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I select the electricity tarrif as \"Age UK Fixed 1 Year\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Payment method as \"Monthly Direct Debit\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I Select gas as main source of heating? option as \"Yes\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I enter Current gas usage as \"Pound\" and enter the ammount as \"300\", frequency as \"Monthly\" and bill date as \"1 September,2016\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click next button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I should be navigated to Your Details page",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
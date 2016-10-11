#Author: Harneek Singh
#Your Details Feature

Feature: Select and verify various options on Your Details Page
	I want to select various options available on Your Details Page and navigate to Your Results page to see the results based on my selection
	
Scenario: Selection of various options at Your Details page
Given I am on the Your Details page
When I select "All tariffs", payment type as "Monthly direct debit" in Your Prefences section
And I enter my email address as "email@gmail.com" in Your Contact Details section
And I check the Terms and Conditions checkbox and click Goto Prices
Then I should be navigated to Your Result page
And I am able to see the results based on the options I selected on the previous pages

Scenario: Verification of Results Displayed at Your Reults Page
Given I am on the Your Results page
Then I should be able to view my options selected on Top of page
And I should be able to refine my results
And I should be able to view results based on my section




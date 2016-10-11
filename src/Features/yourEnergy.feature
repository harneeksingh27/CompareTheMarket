#Author: Harneek Singh
#Your Energy Feature

Feature: Verify Functionality of Your Energy Page
	I want to verify that the I can select various option on Your Energy page for both electricity and gas
	
	
Scenario:  Navigate to your energy page 
Given I am on the your supplier page
When I enter postcode as "PE26YS"
And click on Find Postcode button
And I select Do you have your bill handy? as "Yes, I have my Bill"
And Select What do you want to compare?  option as "Gas & Electricity"
And Select Is your gas & electricity from the same supplier? option as "Yes"
And I select my energy supplier as E-ON and Click Next 
Then I should be navigate to "Your Energy" page 
	
Scenario: Complete "Your Energy" Form for electricity 

Given I am on your energy for electricity page
When I select the electricity tarrif as "Age UK Fixed 1 Year"
And I select Economy Seven meter as "No"
And Payment method as "Monthly Direct Debit"
And I Select electricity as main source of heating? option as "Yes"
And I enter Current Electricity usage as "Pound" and enter the ammount as "300", frequency as "Monthly" and bill date as "1 September,2016"
And I click next button
Then I should be navigated to Your Energy page for gas


Scenario: Complete "Your Energy" Form for Gas 
Given  I am on your energy for gas page
When I select the electricity tarrif as "Age UK Fixed 1 Year"
And Payment method as "Monthly Direct Debit"
And I Select gas as main source of heating? option as "Yes"
And I enter Current gas usage as "Pound" and enter the ammount as "300", frequency as "Monthly" and bill date as "1 September,2016"
And I click next button
Then I should be navigated to Your Details page
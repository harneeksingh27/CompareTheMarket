#Author: Harneek Singh
#Your Supplier Feature

Feature: Verify Functionality of Your Supplier Page
	I want to verify that the user can select various option on Your Supplier page as per their requirements.

Scenario: Find post code funtionality
Given I am on the your supplier page
When I enter postcode as "PE26YS"
And click on Find Postcode button
Then Who supplies your energy? section is displayed
And one energy supplier is highlighted
And Change Post Code hyperlink is displayed


Scenario: What do you want to compare functionality	with Gas & Electricity option selected
When I select Do you have your bill handy? as "Yes, I have my Bill"
And Select What do you want to compare?  option as "Gas & Electricity"
And Select Is your gas & electricity from the same supplier? option as "No"
Then Who supplies your gas? and Who supplies your electricity? section is displayed with six popular suppliers and a drop down to select other suppliers


Scenario:  What do you want to compare functionality with Gas only option selected
When I select Do you have your bill handy? as "Yes, I have my Bill"
And Select What do you want to compare?  option as "Gas"
Then Who supplies your gas? section is displayed with six popular suppliers and a drop down to select other suppliers

Scenario:  Navigate to your energy page 
When I select Do you have your bill handy? as "Yes, I have my Bill"
And Select What do you want to compare?  option as "Gas & Electricity"
And Select Is your gas & electricity from the same supplier? option as "Yes"
And I select my energy supplier as E-ON and Click Next 
Then I should be navigate to "Your Energy" page
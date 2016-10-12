# CompareTheMarket

Compare the Market – Automation Framework
Description and how to run tests

Index
1.	Specifications

2.	Pre Requisites

3.	Framework

4.	How to Run Test

5.	Technical Challenges

Specifications-
Language Used	Java 
Eclipse used	Luna
Selenium 	2.39
Cucumber 	1.2.5
Framework	BDD - Cucumber
JDK	1.8
	
	

Pre Requisites – 
1.	Java 8 ( JRE 1.8)
2.	Jar download not required all the jars are  in lib folder
3.	Cucumber Plug-in
4.	Junit
5.	Eclipse Luna
6.	Selenium 2.39
7.	Cucumber 1.2.5
8.	Gherkin 2.12
9.	Cucumber –HTML




Framework – 

For this project cucumber framework ( BDD is used) along with Page Object model.
Three feature files are written covering the three main feature in scope- 1. Our supplier, 2.your energy and 3. Your details and your results
Three step definition classes are created to provide step definition to all the three feature
The Feature and Scenario are as below . There are 3 features and 9 Scenarios

 Feature: Verify Functionality of Your Supplier Page
Scenario: Find post code functionality
Scenario: What do you want to compare functionality	with Gas & Electricity option selected
Scenario:  What do you want to compare functionality with Gas only option selected
Scenario:  Navigate to your energy page
Feature: Select and verify various options on Your Details Page
Scenario: Selection of various options at Your Details page
Scenario: Verification of Results Displayed at Your Reults Page
Feature: Verify Functionality of Your Energy Page
Scenario:  Navigate to your energy page
Scenario: Complete "Your Energy" Form for electricity
Scenario: Complete "Your Energy" Form for Gas
















Structure of Framework – The structure of framework is as below
 
The framework has following components – 
•	Page Objects – This is the object repository of all the pages in scope for application under test.
Page objects contains the elements and methods which will perform basic operations on those elements.
As there are three pages under test so we have three page objects, OurSupplier, YourEnergy and Yourdetails page

•	Base Page Object – Base page object is a class which has all the methods responsible for initialization of drivers, launching of URL and driver quit.

•	Step Definitions - Step Definitions extend BasePageObject class and they have objects of the respective pages.
Step definitions extend all the page object methods and contain modular methods to perform various operations. 

•	Test Runner – Test runner is the class which runs the cucumber features.

•	Features – Features is the folder which contains all the feature files for the project. In this project we have three feature files – ourSupplier, yourEnergy and YourDetails

•	Utils – This is a package which contains PropertReader class which reads the config file.

•	Config File – is the file which contains various static properties like URL, Browser USED, Data connections and other static properties to be used in future.
•	Lib – lib is library for all the the jars ( Due to some technical issue was not able to set up Maven)

•	Test-Output and Target – are the default Cucumber and TestNG reporting folder. After successful run user can check the folder for result generated
How to run the tests- 
There are two ways to run tests
1.	Running the Features- Each feature file is capable of running individually, users can run the feature file as below
Open feature file>click on Run > Go to Run As > Select “Cucumber Feature” as shown below

 


2.	Run the Features through JUnit  Test Runner class- If user wishes to run all the features, user can do as below
Open Test Runner Class > Goto Run > Click Run As > Select Junit Runner
As shown below-
 




Technical Challenges – 

1.	There is a warning in yourDetails Scenario that a step is not implemented but the step is implemented. Unable to remove warning
2.	Due to some technical issue set up of Maven was not Possible
3.	Sometime run configuration needs a set up.

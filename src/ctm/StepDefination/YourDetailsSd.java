package ctm.StepDefination;

import ctm.pageObjects.BasePageObject;
import ctm.pageObjects.YourDetailsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class YourDetailsSd extends BasePageObject {
	
	// object creation of Your Details page
	YourDetailsPage yourDetailPgObj = new YourDetailsPage(driver);
	
	/*
	 * ****************************************************************************************************************************
	 * Verify that user is on details Page 
	 * ****************************************************************************************************************************
	 */
	@Given("^I am on the Your Details page$")
	public void verifyOnDetailsPage() 
	{
		assertTrue(yourDetailPgObj.isDetailsPageDisplayed());
		
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This method selects the payment type and frequency
	 * Arguments: 
	 * args1 - Payment Type
	 * args2 - Payment Frequency
	 * ****************************************************************************************************************************
	 */

	@When("^I select \"([^\"]*)\", payment type as \"([^\"]*)\" in Your Prefences section$")
	public void selectPaymentTypeAndFreq(String arg1, String arg2) 
	{	
		//Select Payment Type    
		yourDetailPgObj.selPaymentTyp(arg1);
		//Select Payment Frequency
		yourDetailPgObj.selPaymentFreq(arg2);
	}

	/*
	 * ****************************************************************************************************************************
	 * This method inputs the email address in input box for email
	 * Arguments:
	 * args1 - email address
	 * ****************************************************************************************************************************
	 */
	@When("^I enter my email address as \"([^\"]*)\" in Your Contact Details section$")
	public void enterEmail(String arg1) 
	{
		yourDetailPgObj.enterEmail(arg1); 
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This method Selects the Terms and conditions check box
	 * Arguments:
	 * NA
	 * ****************************************************************************************************************************
	 */
	@When("^I check the Terms and Conditions checkbox and click Goto Prices$")
	public void checkTermsAndCond()
	{ 
		yourDetailPgObj.chkTermsNCond();
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This method waits until the progress bar for your results page is complete
	 * Arguments:
	 * NA
	 * ****************************************************************************************************************************
	 */
	@Then("^I should be navigated to Your Result page$")
	public void isYourResultPageDisplayed() 
	{
	    
		assertTrue(yourDetailPgObj.yourResultPageDisplayed());
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This method verifies that your energy provider and tariff are same as selected by user
	 * Arguments:
	 * NA
	 * ****************************************************************************************************************************
	 */
	@Then("^I am able to see the results based on the options I selected on the previous pages$")
	public void verifyValidResultsDisplayed() 
	{
	   //verify that energy provider is EON
	   assertEquals(yourDetailPgObj.yourResultSuppDisplayed(), "E.ON");
	   //Verify that the tariff tenure is Fixed 1 year
	   assertEquals(yourDetailPgObj.yourResultTarrifDisplayed(), "Age UK Fixed 1 year");
	   
	}

	/*
	 * ****************************************************************************************************************************
	 * This method verifies that the refine result page is displayed
	 * Arguments:
	 * NA
	 * ****************************************************************************************************************************
	 */
	@Then("^I should be able to refine my results$")
	public void refineResultsDisplayed() 
	{
		assertTrue(yourDetailPgObj.refineResultDisplayed());
	   
	}

	/*
	 * ****************************************************************************************************************************
	 * This method verifies that the result table is displayed
	 * Arguments:
	 * NA
	 * ****************************************************************************************************************************
	 */
	@Then("^I should be able to view results based on my section$")
	public void verifyResultSectionDisplayed()
	{
		assertTrue(yourDetailPgObj.tableResultDisplayed()); 
		// Close the web browser
		destroyDriver();
	}
	
}

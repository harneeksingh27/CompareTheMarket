package ctm.StepDefination;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import ctm.pageObjects.BasePageObject;
import ctm.pageObjects.YourSupplierPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YourSupplierSd extends BasePageObject{
	
	
	/*
	 * ****************************************************************************************************************************
	 *  Your Supplier Page Elements
	 * ****************************************************************************************************************************
	 */
	@Given("^I am on the your supplier page$")
	public void launchApplication()
	{
		launchCTMApplication();
	}
	
	YourSupplierPage supPageObj = new YourSupplierPage(driver);

	/*
	 * ****************************************************************************************************************************
	 * This method inputs the post code
	 * Arguments: 
	 * args1 - post code
	 * ****************************************************************************************************************************
	 */
	@When("^I enter postcode as \"([^\"]*)\"$")
	public void i_enter_postcode_as(String args1)
	{		
		supPageObj.enterPostCd(args1);
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This method clicks find post code button
	 * Arguments:NA
	 * ****************************************************************************************************************************
	 */
	@When("^click on Find Postcode button$")
	public void clickFindPstCde()
	{
		supPageObj.clickFindPcode();
	}

	/*
	 * ****************************************************************************************************************************
	 * This method verifies if energy section is visible
	 * Arguments : NA
	 * ****************************************************************************************************************************
	 */
	@Then("^Who supplies your energy\\? section is displayed$")
	public void energySupplierSectn()
	{
		assertTrue(supPageObj.isEnergySupplySectionDisplayed());
		    
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This method verifies if Energy supplier is highlighted
	 * Arguments:NA
	 * ****************************************************************************************************************************
	 */
	@Then("^one energy supplier is highlighted$")
	public void engSuppHighlighted()
	{
		assertEquals(supPageObj.isSupplierSelected(), "true");
	}

	/*
	 * ****************************************************************************************************************************
	 * This method verifies if change post code link is diplayed
	 * Arguments:NA
	 * ****************************************************************************************************************************
	 */
	@Then("^Change Post Code hyperlink is displayed$")
	public void changePostCodeDisplayed() 
	{
		assertTrue(supPageObj.isChangePcDisplayed());   
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This method selects yes or no if bill is handy
	 * Arguments: 
	 * args1 -YES or No
	 * ****************************************************************************************************************************
	 */
	@When("^I select Do you have your bill handy\\? as \"([^\"]*)\"$")
	public void selectBillHandyOptn(String arg1){
		if(arg1 != null && arg1.equals("No") )
		{
			supPageObj.clickBillHandyYes();
		}
	    
	}

	/*
	 * ****************************************************************************************************************************
	 * This method selects one of the option between Gas of Electricity and gas
	 * Arguments: 
	 * args1 - Gas & Electricity or Gas
	 * ****************************************************************************************************************************
	 */
	@When("^Select What do you want to compare\\?  option as \"([^\"]*)\"$")
	public void selectCompareEnegy(String arg1)
	{   
		if(arg1.equalsIgnoreCase("Gas & Electricity"))
		{
		supPageObj.compBothGasElecSelect();
		}
		// Check for user input
		if(arg1 != null && arg1.equalsIgnoreCase("Gas"))
		{
			supPageObj.clickGasOnly();
		}
	}

	/*
	 * ****************************************************************************************************************************
	 * This method selects if supplier is same check box
	 * Arguments: 
	 * args1 - Yes or No
	 * ****************************************************************************************************************************
	 */
	@When("^Select Is your gas & electricity from the same supplier\\? option as \"([^\"]*)\"$")
	public void selectGasElecSameQuestion(String arg1)
	{
		if(arg1.equalsIgnoreCase("No"))
		supPageObj.selGasElecSameSuppNo();
		else
			try 
				 {
				 //Page was showing intermittent behavior 
					Thread.sleep(5000);
				 } 
	 catch (InterruptedException e) 
				 {
					e.printStackTrace();
				 }
	supPageObj.selGasElecSameSuppYes();
			
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This method verifies various Section displayed as expected
	 * Arguments: 
	 * args1 - NA
	 * ****************************************************************************************************************************
	 */

	@Then("^Who supplies your gas\\? and Who supplies your electricity\\? section is displayed with six popular suppliers and a drop down to select other suppliers$")
	public void supplierGasEnergyDisplayed()
	{
		assertTrue(supPageObj.isElectricEnergySectionDisplayed());
		assertTrue(supPageObj.isGasEnergySectionDisplayed());
		// six supplier are displayed
		assertEquals(supPageObj.topSixElecSupplier(),6); 
		assertEquals(supPageObj.topSixGasSupplier(),6);
		assertTrue(supPageObj.isElecOtherDrpDwnDisplayed());
		assertTrue(supPageObj.isGasOtherDrpDwnDisplayed());
	}

	/*
	 * ****************************************************************************************************************************
	 * This method verifies gas only section
	 * Arguments: NA
	 * ****************************************************************************************************************************
	 */
	@Then("^Who supplies your gas\\? section is displayed with six popular suppliers and a drop down to select other suppliers$")
	public void supplierGasonlyDisplayed() {
		
		assertTrue(supPageObj.isGasEnergySectionDisplayed());
		
		assertEquals(supPageObj.topSixGasSupplier(),6);
		
		assertTrue(supPageObj.isGasOtherDrpDwnDisplayed());
	   
	}

	/*
	 * ****************************************************************************************************************************
	 * This method selects Next Button
	 * Arguments;NA
	 * ****************************************************************************************************************************
	 */

	@When("^I select my energy supplier as E-ON and Click Next$")
	public void selectGasElecSameQuestionNo() 
	{	
		supPageObj.clickBtnNext();
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This method verifies user navigated to next page
	 * Arguments: NA
	 * ****************************************************************************************************************************
	 */
	@Then("^I should be navigate to \"([^\"]*)\" page$")
	public void i_should_be_navigate_to_page(String arg1) 
	{
		supPageObj.yourEnergHeaderDisp();
	}
	
	
}

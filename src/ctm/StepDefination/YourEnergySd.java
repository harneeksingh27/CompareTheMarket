package ctm.StepDefination;
import ctm.pageObjects.BasePageObject;
import ctm.pageObjects.yourEnergyPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;


public class YourEnergySd extends BasePageObject {
	
	
	/*
	 * ****************************************************************************************************************************
	 * This Class is the Step Definition class for Your Energy Page
	 * This class extends Base Page object Class
	 * This class uses engProvidPageObj class which is Your Energy Page Object class
	 * ****************************************************************************************************************************
	 */
	
	//Create object of engProvidPageObj page
	yourEnergyPage engProvidPageObj = new yourEnergyPage(driver);
	
	
	/*
	 * ****************************************************************************************************************************
	 * This Method Verifies that user is on Your energy Page for electricity
	 * Arguments : NA
	 * ****************************************************************************************************************************
	 */
	@Given("^I am on your energy for electricity page$")
	public void i_am_on_your_energy_for_electricity_page()
	{ 
		assertTrue(engProvidPageObj.yourEnergHeaderDisp());
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This Method selects electricity tariff
	 * Arguments : tariff type
	 * ****************************************************************************************************************************
	 */

	@When("^I select the electricity tarrif as \"([^\"]*)\"$")
	public void yeElecTarrif(String arg1) 
	{	
		engProvidPageObj.selTarrifOptn(arg1);  
	}

	/*
	 * ****************************************************************************************************************************
	 * This Method checks Yes or No for seven economy meter
	 * Arguments : Yes or No
	 * ****************************************************************************************************************************
	 */
	@When("^I select Economy Seven meter as \"([^\"]*)\"$")
	public void i_select_Economy_meter_as(String arg1)
	{
		engProvidPageObj.isSevnEcoMeter(arg1);
	}

	/*
	 * ****************************************************************************************************************************
	 * This Method Selects the Payment method
	 * Arguments : Method Of Payment e.g Monthly payment
	 * ****************************************************************************************************************************
	 */
	@When("^Payment method as \"([^\"]*)\"$")
	public void payment_method_as(String arg1)
	{
		engProvidPageObj.selElecPaymentMeth(arg1);
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This Method checks if electricity is main source of heating
	 * Arguments : Yes or No
	 * ****************************************************************************************************************************
	 */
	@When("^I Select electricity as main source of heating\\? option as \"([^\"]*)\"$")
	public void selElectricityMainSrcOfHeat(String arg1)
	{
		engProvidPageObj.selMainSourceHeatElec(arg1);
		
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This Method selects spending on electricity, payment method and bill date
	 * Arguments : arg1 = Pound or KWH, 
	 * arg2 = Amount
	 * arg3 = Frequency(Monthly)
	 * arg4 = Bill Date
	 * ****************************************************************************************************************************
	 */
	@When("^I enter Current Electricity usage as \"([^\"]*)\" and enter the ammount as \"([^\"]*)\", frequency as \"([^\"]*)\" and bill date as \"([^\"]*)\"$")
	public void enterElectricitySpends(String arg1, String arg2, String arg3, String arg4)
	{
		// type of spend
		engProvidPageObj.elecSpend(arg1);
		//amount
		engProvidPageObj.pndSpendAmt(arg2);
		engProvidPageObj.selElecPaymentMeth(arg3);
		engProvidPageObj.enterBillDate(arg4);
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This Method clicks NEXT button
	 * Arguments NA
	 * ****************************************************************************************************************************
	 */
	@When("^I click next button$")
	public void i_click_next_button()
	{
		engProvidPageObj.clickNext();
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This Method verifies that user has been navigated to Energy Gas Page
	 * Arguments NA
	 * ****************************************************************************************************************************
	 */
	@Then("^I should be navigated to Your Energy page for gas$")
	public void isNavigatedToGasPage()
	{
		assertTrue(engProvidPageObj.gasPageHeaderPresent());
	}
	
	/*
	 * ****************************************************************************************************************************
	 * This Method verifies that user has been navigated to Energy Gas Page
	 * Arguments NA
	 * ****************************************************************************************************************************
	 */
	@Given("^I am on your energy for gas page$")
	public void onGasPage()
	{
		isNavigatedToGasPage();
	}

	/*
	 * ****************************************************************************************************************************
	 * This Method selects main source of heating as Yes or No
	 * Arguments : yes or No
	 * ****************************************************************************************************************************
	 */
	@When("^I Select gas as main source of heating\\? option as \"([^\"]*)\"$")
	public void selGasMainSrcOfHeat(String arg1)
	{
		engProvidPageObj.selMainSourceHeatGas(arg1);
	    
	}

	/*
	 * ****************************************************************************************************************************
	 This Method selects spending on gas, payment method and bill date
	 * Arguments : arg1 = Pound or KWH, 
	 * arg2 = Amount
	 * arg3 = Frequency(Monthly)
	 * arg4 = Bill Date
	 * ****************************************************************************************************************************
	 */
	@When("^I enter Current gas usage as \"([^\"]*)\" and enter the ammount as \"([^\"]*)\", frequency as \"([^\"]*)\" and bill date as \"([^\"]*)\"$")
	public void enterGasSpends(String arg1, String arg2, String arg3, String arg4)
	{
		engProvidPageObj.gasSpend(arg1);
		engProvidPageObj.gasSpendAmt(arg2);
		engProvidPageObj.selGasPaymentMeth(arg3);
		engProvidPageObj.enterGasBillDate(arg4);
	}
	
	/*
	 * ****************************************************************************************************************************
	 This Method verifies if user has been navigated to your details page
	 * Arguments : NA
	 * ****************************************************************************************************************************
	 */
	@Then("^I should be navigated to Your Details page$")
	public void i_should_be_navigated_to_Your_Details_page()
	{
			assertTrue(engProvidPageObj.isSupplierDetailsPageDisplayed());
	}
}

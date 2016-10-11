package ctm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class yourEnergyPage {
	
	
	WebDriver driver;
	
	/**
	 * Initiate page elements 
	 * @param driver : Web Driver object is passed
	 */
	public yourEnergyPage(WebDriver driver) 
	{
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	/*
	 * ****************************************************************************************************************************
	 *  Electric Energy Page Elements
	 * ****************************************************************************************************************************
	 */

	@FindBy(xpath = "//div [@id = 'electricity_tariff_additional_info_chosen']/div/ul/li")
	 private WebElement listTarrif;
	
	@FindBy(xpath = "//h2[contains(text(), 'Your Energy')]")
	 private WebElement elemHeaderYourEng;
	
	@FindBy(xpath = "//div [@id = 'electricity_payment_method_dropdown_link_chosen']/div/ul/li")
	 private WebElement listPaymentElec;
	
	@FindBy(xpath = "//input[@id = 'economy-7-yes']")
	 private WebElement chkBoxEc7Yes;
	
	@FindBy(xpath = "//input[@id = 'economy-7-no']")
	 private WebElement chkBoxEc7No;
	
	@FindBy(xpath = "//input[@id = 'electricity-main-heating-yes']")
	 private WebElement elecMainHeatingYes;
	
	@FindBy(xpath = "//input[@id = 'electricity-main-heating-yes']")
	 private WebElement elecMainHeatingNo;
	
	@FindBy(xpath = "//input[@id = 'kwhSpend']")
	 private WebElement elecKwhSpnd;
	
	@FindBy(xpath = "//input[@id = 'poundSpend']")
	 private WebElement elecPoundSpnd;
	
	@FindBy(xpath = "//input[@id = 'electricity-spend']")
	 private WebElement inputElecSpend;
	
	@FindBy(xpath = "//div [@id = 'electricity_spend_dropdown_chosen']/div/ul/li")
	 private WebElement listElecUsage;
	
	 
	@FindBy(xpath = "//input[@id = 'electricity-bill-day']")
	 private WebElement inputElecBill;
	
	@FindBy(xpath = "//button[@id = 'goto-your-energy']")
	 private WebElement btnGotoEnergy;
	
	
	/*
	 * ****************************************************************************************************************************
	 *  Gas Energy Page Elements
	 * ****************************************************************************************************************************
	 */
	
	@FindBy(xpath = "//span[@class = 'icon energy-gas']")
	 private WebElement elemGasPage;
	
	@FindBy(xpath = "//div [@id = 'gas_tariff_additional_info_chosen']/div/ul/li")
	 private WebElement listTarrifGas;
	
	@FindBy(xpath = "//div [@id = 'gas_payment_method_dropdown_link_chosen']/div/ul/li")
	 private WebElement listPaymentGas;
	
	@FindBy(xpath = "//input[@id = 'gas-main-heating-yes']")
	 private WebElement gasMainHeatingYes;
	
	@FindBy(xpath = "//input[@id = 'gas-main-heating-yes']")
	 private WebElement gasMainHeatingNo;
	
	@FindBy(xpath = "//input[@id = 'kwhSpendG']")
	 private WebElement gasKwhSpnd;
	
	@FindBy(xpath = "//input[@id = 'poundSpendG']")
	 private WebElement gasPoundSPnd;
	
	@FindBy(xpath = "//input[@id = 'gas-spend']")
	 private WebElement inputGasSpend;
	
	@FindBy(xpath = "//div [@id = 'gas_spend_dropdown_chosen']/div/ul/li")
	 private WebElement listGasUsage;
		 
	@FindBy(xpath = "//input[@id = 'gas-bill-day']")
	 private WebElement inputGasBill;
	
	@FindBy(xpath = "//h2[contains(text(), 'Your Preferences')]")
	 private WebElement elemHeaderYourDetails;
	

	/*
	 * ****************************************************************************************************************************
	 * These method perform basic operations on elements of Gas Page
	 * ****************************************************************************************************************************
	 */
	
	//Select one options among many available
	 public void selTarrifOptnGas(String strOptn)
	 {
		  
		 Select oSelect = new Select(listTarrifGas);
		 
		 oSelect.selectByVisibleText(strOptn);
	 }
	 
	 // Based on the argument click the specific element
	 public void isSevnEcoMeter(String strMeter)
	 {
		 // if user wants to click YES
		 if(strMeter.equalsIgnoreCase("Yes"))
			 chkBoxEc7Yes.click();
		 else
			 chkBoxEc7Yes.click();	 
	 }
	 
	 public void selElecPaymentMeth(String strpayMeth)
	 {
		 Select oSelect = new Select(listPaymentElec);
		 
		 oSelect.selectByVisibleText(strpayMeth);
	 }
	 
	 public void selMainSourceHeatElec(String strOptn)
	 {
		 if (strOptn.equalsIgnoreCase("Yes"))
			 elecMainHeatingYes.click();
		 else
			 elecMainHeatingNo.click();
	 }
	 
	 public void elecSpend(String strSpentyp)
	 { 
		 if(strSpentyp.equalsIgnoreCase("Pound"))
			 elecPoundSpnd.click();			 
		 else
			 elecKwhSpnd.click();
	 }
	 
	 public void pndSpendAmt(String strAmt)
	 { 
		 inputElecSpend.sendKeys(strAmt);
	 }
	 
	 
	 public void selElecUsage(String strUsage)
	 {
		 Select oSelect = new Select(listElecUsage);
		 
		 oSelect.selectByVisibleText(strUsage);
	 }
	 
	 public void enterBillDate(String strDate)
	 {
		 inputElecBill.sendKeys(strDate);
	 }
	 
	 
	 /*
	 * ****************************************************************************************************************************
	 * These method perform basic operations on elements of Gas Page
	 * ****************************************************************************************************************************
	 */
 
	 public boolean yourEnergHeaderDisp()
	 {
		 return elemHeaderYourEng.isDisplayed();
		 
	 }
	 
	 public void selTarrifOptn(String strOptn)
	 {	 
		 Select oSelect = new Select(listTarrif);
		 
		 oSelect.selectByVisibleText(strOptn); 
	 }
	 
	 
	 public void selGasPaymentMeth(String strpayMeth)
	 {
		 Select oSelect = new Select(listPaymentGas);
		 
		 oSelect.selectByVisibleText(strpayMeth);
	 }
	 
	 public void selMainSourceHeatGas(String strOptn)
	 {
		 if (strOptn.equalsIgnoreCase("Yes"))
			 gasMainHeatingYes.click();
		 else
			 gasMainHeatingNo.click();
	 }
	 
	 public void gasSpend(String strSpentyp)
	 { 
		 if(strSpentyp.equalsIgnoreCase("Pound"))
			 gasPoundSPnd.click();			 
		 else
			 gasKwhSpnd.click();
	 }
	 
	 public void gasSpendAmt(String strAmt)
	 { 
		 inputGasSpend.sendKeys(strAmt);
	 }
	 
	 
	 public void selGasUsage(String strUsage)
	 {
		 Select oSelect = new Select(listGasUsage);
		 
		 oSelect.selectByVisibleText(strUsage);
	 }
	 
	 public void enterGasBillDate(String strDate)
	 {
		 inputElecBill.sendKeys(strDate);
	 }
	 
	 public void clickNext()
	 {
		 btnGotoEnergy.sendKeys();
	 }
	 
	 public boolean isSupplierDetailsPageDisplayed()
	 {
		 return elemHeaderYourDetails.isDisplayed();
	 }
	 
	 public boolean gasPageHeaderPresent()
	 {
		 return elemGasPage.isDisplayed();
	 }
	 

}

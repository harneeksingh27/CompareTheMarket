package ctm.pageObjects;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourSupplierPage {
	
	/*
	 * ****************************************************************************************************************************
	 * This Class contains all the elements of your supplier page and basic operations on them
	 * ****************************************************************************************************************************
	 */
	
	WebDriver driver;
	
	/**
	 * Initiate page elements 
	 * @param driver : Web Driver object is passed
	 */
	public YourSupplierPage(WebDriver driver) 
	{
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	/*
	 * ****************************************************************************************************************************
	 *  Your Supplier Page Elements
	 * ****************************************************************************************************************************
	 */
	 @FindBy(id = "your-postcode")
	 private WebElement txtPostCode;
	 
	 @FindBy(id = "find-postcode")
	 private WebElement btnPostCode;
	 
	 @FindBy(id = "dual-energy-suppliers-question")
	 private WebElement enrgySupplierSectn;
	 
	 @FindBy(id = "dual-top-six-eon")
	 private WebElement suppSelected;
	 
	 @FindBy(id = "change-postcode")
	 private WebElement lnkChangePC;
	 	 
	 @FindBy(id = "have-bill-label")
	 private WebElement btnHaveBill;
	  
	 @FindBy(id = "no-bill-label")
	 private WebElement btnHaveNoBill;
	 
	 @FindBy(id = "compare-both-label")
	 private WebElement selCompareBoth;
	 
	 @FindBy(xpath = "//fieldset[@id = 'same-supplier-question']/div/div/label[2]")
	 private WebElement chkSameSuppNo;
	 
	 @FindBy(id = "elec-energy-suppliers-question")
	 private WebElement elemElecEnergy;
	 
	 @FindBy(id = "gas-energy-suppliers-question")
	 private WebElement elemGasEnergy;
	 
	 @FindBy(xpath = "//fieldset[@id = 'elec-energy-suppliers-question']/div/div/div/label")
	 private List<WebElement> elecTopSix;
	 
	 
	 @FindBy(xpath = "//fieldset[@id = 'gas-energy-suppliers-question']/div/div/div/label")
	 private List<WebElement> gasTopSix;
	 
	 @FindBy(id = "electricity-supplier-dropdown-control")
	 private WebElement drpDownElecOtherSupp;
	 
	 @FindBy(id = "gas-supplier-dropdown-control")
	 private WebElement drpDownGasOtherSupp;
	 	 
	 @FindBy(id = "electricity-top-six-eon")
	 private WebElement elemElecEON;
	 
	 @FindBy(id = "gas-top-six-eon")
	 private WebElement elemGasEON;
	 
	 
	 @FindBy(id = "compare-gas-label")
	 private WebElement elemGasOnly;
	 
	 
	 
	 @FindBy(id = "compare-electricity-label")
	 private WebElement elemElecOnly;
	 
	 @FindBy(xpath = "//fieldset[@id = 'same-supplier-question']/div/div/label")
	 private WebElement chkSameSuppYes;
	 
	
	 @FindBy(id = "goto-your-supplier-details")
	 private WebElement btnNext;
	 
	 @FindBy(xpath = "//h2[contains(text(), 'Your Energy')]")
	 private WebElement elemHeaderYourEng;
	
	 /*
	 * ****************************************************************************************************************************
	 *  Methods which perform basic operations on your your supplier elements
	 * ****************************************************************************************************************************
	 */
	
	 public void enterPostCd(String txtPostCod)
	 {
		 txtPostCode.sendKeys(txtPostCod);
	 }
	 
	 public void clickFindPcode()
	 {
		 btnPostCode.click();
	 }
	 
	 public boolean isEnergySupplySectionDisplayed()
	 {
		 try 
			 {
			 //Page was showing intermittent behavior 
				Thread.sleep(5000);
			 } 
		 catch (InterruptedException e) 
			 {
				e.printStackTrace();
			 }
		 //Scroll ELement to view
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", enrgySupplierSectn);
		 
		 return enrgySupplierSectn.isDisplayed();
		 
	 }
	 
	 public String isSupplierSelected()
	 {
		 return suppSelected.getAttribute("Checked");
	 }
	 
	 public boolean isChangePcDisplayed()
	 {
		 return lnkChangePC.isDisplayed();
	 }
	 
	 public void clickBillHandyYes()
	 {
		 btnHaveBill.click();
	 }
	 
	 public void compBothGasElecSelect()
	 {
		 selCompareBoth.click();
	 }
	 
	 public void selGasElecSameSuppNo()
	 {
		 chkSameSuppNo.click();
	 }
	 
	 public boolean isElectricEnergySectionDisplayed()
	 {
		 return elemElecEnergy.isDisplayed();
	 }
	 
	 public boolean isGasEnergySectionDisplayed()
	 {
		 return elemGasEnergy.isDisplayed();
	 }
	 
	 public int topSixElecSupplier()
	 {
		 return elecTopSix.size()-1;
	 }
	 
	 public int topSixGasSupplier()
	 {
		 return gasTopSix.size()-1;
	 }
	 	 
	 public String isEonElecSelected()
	 {
		 return elemElecEON.getAttribute("Checked");
	 }
	 
	 public String isEonGasSelected()
	 {
		 return elemGasEON.getAttribute("Checked");
	 }
	 
	 public boolean isElecOtherDrpDwnDisplayed()
	 {
		 return drpDownElecOtherSupp.isDisplayed();
	 }
	 
	 public boolean isGasOtherDrpDwnDisplayed()
	 {
		 return drpDownGasOtherSupp.isDisplayed();
	 }
	 
	 public void clickGasOnly()
	 {
		 elemGasOnly.click();
	 }
	 
	 public void clickElecOnly()
	 {
		 elemElecOnly.click();
	 }
	 
	 public void selGasElecSameSuppYes()
	 {
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", chkSameSuppYes);
		 chkSameSuppYes.click();
	 }
	 
	 public void selEnergyProvEon()
	 {
		 elemGasEON.click();
	 }
	 
	 
	 public void clickBtnNext()
	 {
		 btnNext.click();
	 }
	 
	 public void yourEnergHeaderDisp()
	 {
		 elemHeaderYourEng.isDisplayed();
	 }
	 
	 
	 
	 
	

}

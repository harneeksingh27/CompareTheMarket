package ctm.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourDetailsPage {
	
	//Web driver reference 
	WebDriver driver;
	
	//Constructor initiate page object elements
	public YourDetailsPage(WebDriver driver) 
	{
		this.driver = driver;
	    PageFactory.initElements(driver, this);   
	}
	
	//Web Driver Wait object initialization
	WebDriverWait wt = new WebDriverWait(driver, 30);
	
	/**
	 * Your Detail Page element 
	 */
	
	@FindBy(xpath = "//h2[contains(text(), 'Your Preferences')]")
	 private WebElement elemHeaderYourDetails;
	
	@FindBy(xpath = "//input[@id = 'pre-select-all']")
	 private WebElement btnAllTarrifs;
	
	@FindBy(xpath = "//input[@id = 'pre-select-payment-monthly']")
	 private WebElement btnMonthlydd;
	
	@FindBy(xpath = "//input[@id = 'Email']")
	 private WebElement txtEmail;
	
	@FindBy(xpath = "//label[@id = 'terms-label']")
	 private WebElement chkTnC;
	
	@FindBy(xpath = "//buttton[@id = 'email-submit']")
	 private WebElement btnSubmit;
	
	/**
	 * Your Result page elements
	 */
	
	@FindBy(xpath = "//span[@data-bind = 'text:ElectricitySupplierName']")
	 private WebElement ySuppEngName;
	
	@FindBy(xpath = "//span[@data-bind = 'text:ElectricityTariffName']")
	 private WebElement ySuppTarrifName;
	
	@FindBy(xpath = "//span[contains(text(), 'Refine your results')]")
	 private WebElement ySuppRefineResult;
	
	@FindBy(xpath = "//div[@class = 'list-view-title-row']")
	 private WebElement ySuppResultTable;
	
	/*
	 * Methods to action on web elements
	 */
		
	public boolean isDetailsPageDisplayed()
	 {
		 return elemHeaderYourDetails.isDisplayed();
	 }
	
	public void selPaymentFreq(String strFreq)
	{
		if (strFreq.equalsIgnoreCase("All tariffs"))
		btnAllTarrifs.click();
	}
	
	public void selPaymentTyp(String strTyp)
	{
		if (strTyp.equalsIgnoreCase("Monthly direct debit"))
			btnMonthlydd.click();	
	}
	
	public void enterEmail(String strEmail)
	{
		txtEmail.sendKeys(strEmail);
	}
	
	public void chkTermsNCond()
	{
		chkTnC.click();
	}
	
	public void clickGotoPrices()
	{
		btnSubmit.click();
	}

	public boolean yourResultPageDisplayed()
	{
		//wait for element to disappear 
		return wt.until(ExpectedConditions.invisibilityOfElementLocated(By.id("//div[@id = 'prices-summary-panel']")));
	}
	
	public String yourResultSuppDisplayed()
	{
		return ySuppEngName.getText();
	}
	
	public String yourResultTarrifDisplayed()
	{
		return ySuppTarrifName.getText();
	}
	
	public boolean refineResultDisplayed()
	{
		return ySuppRefineResult.isEnabled();
	}
	
	public boolean tableResultDisplayed()
	{
		return ySuppResultTable.isEnabled();
	}
	
 }

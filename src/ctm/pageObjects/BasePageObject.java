package ctm.pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import ctm.Utils.PropertyReader;

public class BasePageObject {
	
	/*
	 * ****************************************************************************************************************************
	 * This is a Base Page object class which is responsible for initializing drivers
	 * This class will be extended by all Step Definitions
	 * ****************************************************************************************************************************
	 */
	
	// Create Web driver type variable
	protected static WebDriver driver;
	
	// Create Property Reader Config
	PropertyReader objProp = new PropertyReader();
	
	// path for IE driver
	static String driverPath = System.getProperty("user.dir")+"\\lib\\";
	/*
	 * ****************************************************************************************************************************
	 * constructor to initialize drivers 
	 * ****************************************************************************************************************************
	 */
    public BasePageObject() {
        initialize();
    }
    
    /*
	 * ****************************************************************************************************************************
	 * This method calls createNewDriverInstance() method 
	 * ****************************************************************************************************************************
	 */
    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }

    /*
	 * ****************************************************************************************************************************
	 * This method creates web driver instance of IE driver type
	 * ****************************************************************************************************************************
	 */
    private void createNewDriverInstance() 
    {
    	if(objProp.readProperty("browser").equalsIgnoreCase("IE"))
    	{
    	System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
    	}
    }

    /*
	 * ****************************************************************************************************************************
	 * This method returns Web Driver 
	 * ****************************************************************************************************************************
	 */
    public WebDriver getDriver() {
        return driver;
    }
    
    /*
	 * ****************************************************************************************************************************
	 * Verify method destroys the web driver
	 * ****************************************************************************************************************************
	 */
    public void destroyDriver() {
        driver.quit();
        //release driver object
        driver = null;
    }
    
    public void launchCTMApplication()
	{
    	// Read the AppURL from COnfig file
    	String applicationURL = objProp.readProperty("AppURL");
        driver.get(applicationURL);
        // Give a default timeout for every element
        driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
	}

}

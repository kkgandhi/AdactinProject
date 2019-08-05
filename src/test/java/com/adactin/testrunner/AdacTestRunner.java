package com.adactin.testrunner;

import java.io.File;
import java.io.FileReader;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\mavencucumber\\reports\\extentreports.html","pretty","html:src\\test\\resource\\com\\mavencucumber\\reports",
		"json:src\\test\\resource\\com\\mavencucumber\\reports\\report.json",
		"junit:src\\test\\resource\\com\\mavencucumber\\reports\\report.xml"},
		
		features="src\\test\\java\\com\\adactin\\feature\\",
		glue="com.adactin.testdefinition",
		tags="@1",
		strict=false,
		dryRun=false, 
		monochrome=true
		)

public class AdacTestRunner  {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception {
		        try {
					String browserName = FileReaderManager.getInstance().getCr().getBrowserName();
      driver = BaseClass.getBrowser(browserName);
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception("BrowserName is Invalid");
				}
	}
	
	@AfterClass
	public static void driverQuit() {
          driver.quit();
          Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\cucumber\\properties\\Extent-Config.xml"));
	}
	
}

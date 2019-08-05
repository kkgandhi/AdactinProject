package com.adactin.testdefinition;

import java.io.File;
import java.io.IOException;

import com.adactin.baseclass.BaseClass;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public  void beforeHooks() {

		
	}

	@After
	public void afterHooks(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
		File takeScreenShot = BaseClass.takeScreenShot(scenario.getName());
        Reporter.addScreenCaptureFromPath(takeScreenShot.getAbsolutePath());
	   }
	}
}

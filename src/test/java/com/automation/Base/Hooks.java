package com.automation.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void browserSetUp() {
		DriverFactory.initializeDriver();
		
	}
	
	
	@After
	public void safeDriverClose() {
		DriverFactory.getWebDriver().quit();
	}
}

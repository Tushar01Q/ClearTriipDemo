package com.automation.Base;

import java.util.Collections;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver = null;
	
	public DriverFactory() {
	}
		
	public static void initializeDriver() {
		
		String browserName = System.getProperty("browser");
		
		if(browserName.toLowerCase().equals("chrome")) {
			WebDriverManager.chromedriver().setup();
     		ChromeOptions options = new ChromeOptions();
     		options.addArguments("disable-popup-blocking");
     		options.setExperimentalOption("useAutomationExtension", false);
     		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation")); 
     		driver = new ChromeDriver(options);
		}
		else if(browserName.toLowerCase().equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
     		FirefoxOptions options1 = new FirefoxOptions();
     		driver = new FirefoxDriver(options1);
		}
		driver.manage().window().maximize();
	}
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
}

package com.adactin.runner;

import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.properties.File_Reader_Manager;
import com.adaction.baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\stepdefinition", monochrome = true, tags = {
		"@Login" }, plugin = { "pretty", 
				"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReports.html" ,
				"html:Report/HTML_Report" , "json:Report1/cucumberJSON_Report.json"})

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver = BaseClass.getDriver(browser);
	}

}

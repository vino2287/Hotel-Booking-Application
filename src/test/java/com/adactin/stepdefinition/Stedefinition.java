package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.properties.File_Reader_Manager;
import com.adactin.properties.Page_Object_Manager;
import com.adactin.runner.Runner;
import com.adaction.baseclass.BaseClass;
import cucumber.api.java.en.*;

public class Stedefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
	}

	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@When("^User enter the \"([^\"]*)\" valid username$")
	public void user_enter_the_valid_username(String arg1) throws Throwable {
		inputValueElement(pom.getInstanceLogin().getUsername(), arg1);
	}

	@When("^User enter the \"([^\"]*)\" valid password$")
	public void user_enter_the_valid_password(String arg1) throws Throwable {
		inputValueElement(pom.getInstanceLogin().getPassword(), arg1);
	}

	@Then("^User validate the username and password$")
	public void user_validate_the_username_and_password() throws Throwable {
		clickOnElement(pom.getInstanceLogin().getLogin());
	}

}

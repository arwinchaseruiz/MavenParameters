package PracticeLang.stepDefinitions;

import PageFactories.composeEmailPageFactory;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.driverFactory;

public class composeEmailStepDefinition extends driverFactory{


composeEmailPageFactory compose;


	@Then("^User will be redirected to Yahoo Mail Home Page$")
	public void user_is_on_ymail_homepage()
	{
		compose = new composeEmailPageFactory(driver);
	}
	
	@And("User clicks on Compose")
	public void user_clicks_on_Compose() {
	   
		compose.clickComposeButton();
	}

	@And("User inputs To field")
	public void user_inputs_To_field() {
		compose.setEmail();
	}

	@And("User inputs Subject Field")
	public void user_inputs_Subject_Field() {
		compose.setSubject();
	}

	@And("User inputs Message")
	public void user_inputs_Message() {
		compose.setMessage();
	}

	@Then("User clicks send")
	public void user_clicks_send() {
		compose.sendMessage();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}

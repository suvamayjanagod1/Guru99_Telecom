package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.AddCustomerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddCustomerSteps extends BaseClass {

	private static AddCustomerPage addCustomerPage;
	
	public static String CusId;
	
	@Given("User is on Telecom Domain Project Page")
	public void user_is_on_telecom_domain_project_page() {
	    
		initialization();
		
		
	}
	@Then("Click on Add Customer Link")
	public void click_on_add_customer_link() {
	    
		addCustomerPage = new AddCustomerPage();
		addCustomerPage.addCustomerClick();
		
	}
	@Then("Click on Background radio button")
	public void click_on_background_radio_button() {
	    
		addCustomerPage.clickRadioButton("Done");
		
	}
	@Then("User enter firstname lastname email address  and mobileNo")
	public void user_enter_firstname_lastname_email_address_and_mobile_no() {
	    
		addCustomerPage.addCustInfo("su", "ja", "s@gmail.com", "kol", "1234");
		
	}
	@Then("Click on submit button")
	public void click_on_submit_button() {
	    
		addCustomerPage.clickOnSubmitButton();
		
		
	}
	@Then("Capture customerID")
	public void capture_customer_id() {
	    
		CusId = addCustomerPage.captureCustomerId();
		
	}
	@Then("Click on Home button")
	public void click_on_home_button() {
	    
		addCustomerPage.clickOnHome();
	}
}

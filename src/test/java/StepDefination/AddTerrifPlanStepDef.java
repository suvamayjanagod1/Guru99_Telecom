package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.AddTerifPlanPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTerrifPlanStepDef extends BaseClass{
	
	private static AddTerifPlanPage addTerif;
	
	@When("User click on Add Terif Plan link")
	public void user_click_on_add_terif_plan_link() {
		addTerif = new AddTerifPlanPage();
		addTerif.clickOnAddTerrifPlan();
	    
	}
	@Then("enter monthly rental and pre local mins and free international mins and free local free min charges and international min charges and sms per charges")
	public void enter_monthly_rental_and_pre_local_mins_and_free_international_mins_and_free_local_free_min_charges_and_international_min_charges_and_sms_per_charges() {
		addTerif.addTerrifPlanDetails("2000", "4", "456", "6754", "678", "8463", "453");
		
	}
	@Then("click on submit button")
	public void click_on_submit_button() {
		addTerif.clickOnSubmit();
	    	}
	@Then("click on home button")
	public void click_on_home_button() {
		addTerif.clickOnHome();
	    	}

}

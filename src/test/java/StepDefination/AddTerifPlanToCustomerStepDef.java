package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.AddTerifPlanToCustomerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTerifPlanToCustomerStepDef extends BaseClass {
	 public static AddTerifPlanToCustomerPage addcusttarif;
	@When("click on Add Tarif plan to customer Link")
	public void click_on_add_tarif_plan_to_customer_link() {
		addcusttarif=new AddTerifPlanToCustomerPage();
		addcusttarif.clickonaddterifcustplanklink();
	}

	@Then("user enter CustomerId")
	public void user_enter_customer_id() {
   addcusttarif.entercustid(AddCustomerSteps.CusId);
	}

	@Then("click on submit Button")
	public void click_on_submit_button() {
    addcusttarif.clickonsubmit();
	}

	@Then("Select terif plan and click terif plan to customer")
	public void select_terif_plan_and_click_terif_plan_to_customer() {
     addcusttarif.radiobtb();
	}

	@Then("click on Home Button")
	public void click_on_home_button() {
    addcusttarif.clickhomebtn();
	}
}

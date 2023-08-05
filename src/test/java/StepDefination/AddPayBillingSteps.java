package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.PayBillingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddPayBillingSteps extends BaseClass{

	public static PayBillingPage paybillpage;
	
	@When("user click on pay billing link")
	public void user_click_on_pay_billing_link() {
	    paybillpage =  new PayBillingPage();
	    paybillpage.paybillingLink();
	}
	@Then("user enter on customer id")
	public void user_enter_on_customer_id() {
				
	    paybillpage.entercustId(AddCustomerSteps.CusId);
	}
	@Then("user click on submit Button")
	public void user_click_on_submit_button() {
		paybillpage.clickonsubmitButton();
	}
	@Then("capture the total amount of billing")
	public void capture_the_total_amount_of_billing() {
		
		System.out.println(paybillpage.captureTotalAmount());
	}
}

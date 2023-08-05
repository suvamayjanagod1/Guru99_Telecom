package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.UtilsClass.*;

import BaseLayer.BaseClass;

public class AddTerifPlanPage extends BaseClass{
	
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement addTerifLink;
	
	@FindBy(name="rental")
	private WebElement rental;
	
	@FindBy(name="local_minutes")
	private WebElement localminutes;
	
	@FindBy(name="inter_minutes")
	private WebElement interminutes;
	
	@FindBy(name="sms_pack")
	private WebElement smspack;
	
	@FindBy(name="minutes_charges")
	private WebElement minutescharges;
	
	@FindBy(name="inter_charges")
	private WebElement intercharges;
	
	@FindBy(name="sms_charges")
	private WebElement smscharges;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	@FindBy(xpath="//a[text()='Home']")
	private WebElement home;
	
	public AddTerifPlanPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddTerrifPlan() {
		click(addTerifLink);
		
	}
	
	public void addTerrifPlanDetails(String Rental, String localM, String interM, String SmsPack, String MinCharges, String InterCha, String SMSCharge) {
		sendData(rental,Rental);
		sendData(localminutes,localM);
		sendData(interminutes,interM);
		sendData(smspack,SmsPack);
		sendData(minutescharges,MinCharges);
		sendData(intercharges,InterCha);
		sendData(smscharges,SMSCharge);
		
	}
	
	public void clickOnSubmit() {
		click(submit);
	}
	
	public void clickOnHome() {
		click(home);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

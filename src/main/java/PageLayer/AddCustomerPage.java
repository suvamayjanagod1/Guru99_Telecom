package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilsClass;

public class AddCustomerPage extends BaseClass {

	@FindBy(xpath = "(//a[text()='Add Customer'])[1]")
	private WebElement addCustomer;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> radioBtn;

	@FindBy(name = "fname")
	private WebElement fName;

	@FindBy(name = "lname")
	private WebElement lName;

	@FindBy(name = "emailid")
	private WebElement emailId;

	@FindBy(name = "addr")
	private WebElement address;

	@FindBy(name = "telephoneno")
	private WebElement telephoneNo;

	@FindBy(name = "submit")
	private WebElement submitBtn;

	@FindBy(xpath = "//b[text()='Customer ID']/following::h3")
	private WebElement captureCustomerId;

	@FindBy(xpath = "(//a[text()='Home'])[1]")
	private WebElement clickHomeBtn;

	public AddCustomerPage() {

		PageFactory.initElements(driver, this);
	}

	public void addCustomerClick() {

		UtilsClass.click(addCustomer);

	}

	public void clickRadioButton(String name) {

		UtilsClass.selectRadioButton(radioBtn, name);

	}

	public void addCustInfo(String firstname, String lastname, String emailId1, String address1, String mobileNo1) {

		UtilsClass.sendData(fName, firstname);
		UtilsClass.sendData(lName, lastname);
		UtilsClass.sendData(emailId, emailId1);
		UtilsClass.sendData(address, address1);

		UtilsClass.sendData(telephoneNo, mobileNo1);

	}

	public void clickOnSubmitButton() {

		UtilsClass.click(submitBtn);

	}
	
	public String captureCustomerId() {

		return captureCustomerId.getText();

	}
	
	public void clickOnHome() {

		UtilsClass.click(clickHomeBtn);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.UtilsClass.*;

import BaseLayer.BaseClass;

public class PayBillingPage extends BaseClass{

	@FindBy(xpath="(//a[text()='Pay Billing'])[1]")
	private WebElement paybillinglink;
	
	@FindBy(name = "customer_id")
	private WebElement Custid;
	
	@FindBy(name="submit")
	private WebElement suBmitbutton;
	
	@FindBy(xpath="//b[text()='Total Bill']/following::b")
	private WebElement captureamount;
	
	public PayBillingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void paybillingLink() {
		click(paybillinglink);
	}
	
	public void entercustId(String cID) {
		sendData(Custid, cID);
	}
	
	public void clickonsubmitButton() {
		click(suBmitbutton);
	}
	
	public String captureTotalAmount() {
		return captureTotalamount(captureamount);
	}
}

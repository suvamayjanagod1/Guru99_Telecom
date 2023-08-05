package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilsClass;

public class AddTerifPlanToCustomerPage extends BaseClass{

	
	@FindBy(xpath="(//a[text()='Add Tariff Plan to Customer'])[1]")
	private WebElement AddcustomerteriftocustLink;
	
	@FindBy(name="customer_id")
	private WebElement custId;
	
	@FindBy(name="submit")
	private WebElement submitbtn;
	
 @FindBy(name="tariff_plan")
	private WebElement radiobtn;
	
	@FindBy(xpath="(//a[text()='Home'])[1]")
	private WebElement Homebtn;
	
	@FindBy(name="submit")
	private WebElement submitbtn1;
	
	public AddTerifPlanToCustomerPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonaddterifcustplanklink()
	{
		UtilsClass.click(AddcustomerteriftocustLink);
	}
	public void entercustid(String cId )
	{
		UtilsClass.sendData(custId, cId);
	}
	
	public void clickonsubmit()
	{
		UtilsClass.click(submitbtn);
	}
	public void radiobtb()
	{
		UtilsClass.click(radiobtn);
		UtilsClass.click(submitbtn1);
	}
	
	public void clickhomebtn()
	{
		UtilsClass.click(Homebtn);
	}
	
	
}

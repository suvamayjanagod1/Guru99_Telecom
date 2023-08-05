package UtilityLayer;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void click(WebElement wb) {

		if (wb.isDisplayed() && wb.isEnabled()) {

			wb.click();
		}
	}

	public static void sendData(WebElement wb, String value) {

		if (wb.isDisplayed() && wb.isEnabled()) {

			wb.sendKeys(value);
		}
	}

	public static void selectRadioButton(List<WebElement> wb, String name) {

		for (WebElement abc : wb) {

			String a = abc.getAttribute("value");
			String b = null;
			if (name.equalsIgnoreCase("ACTIVE")) {
				b = "Done";
			} else {

				b = "Pending";
			}

			if (a.equalsIgnoreCase(b)) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", abc);
			}

		}
		
	}
	
	public static String captureTotalamount(WebElement wb) {
	
		return wb.getText();
	}

}

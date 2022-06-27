package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.SellMyCarPageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class SellMyCarPageActions {
	SellMyCarPageLocators sellMyCarPageLocators = null;
	SeleniumHelper seleniumHelper;
	public SellMyCarPageActions() {
		this.sellMyCarPageLocators = new SellMyCarPageLocators();
		
		PageFactory.initElements(SeleniumDriver.getDriver(), sellMyCarPageLocators);
	}
	public void inputOnNumberPlate()
	{
		//moveToCarsForSaleMenu();
		sellMyCarPageLocators.inptNumberPlate.sendKeys("1231312312");
		
	}
	public void clickOnStartMyAd() {
		sellMyCarPageLocators.btnStartMyAd.click();
	}

}

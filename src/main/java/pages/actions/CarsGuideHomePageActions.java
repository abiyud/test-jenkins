package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	SeleniumHelper seleniumHelper;
	public CarsGuideHomePageActions()
	{
		
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	public void moveToCarsForSaleMenu()
	{
		Actions action= new Actions(SeleniumDriver.getDriver());
		seleniumHelper.isElementPresent(null);
		action.moveToElement(carsGuideHomePageLocators.carsForSaleLink).perform();
	}
	public void clickOnSearchCarsMenu()
	{
		//moveToCarsForSaleMenu();
		carsGuideHomePageLocators.searchCarsLink.click();
		
	}
	public void clickOnUsedSearchCarsMenu()
	{
		//moveToCarsForSaleMenu();
		carsGuideHomePageLocators.usedSearchCarsLink.click();
		
	}
	
	public void clickSellMyCar() {
		carsGuideHomePageLocators.sellMyCarLink.click();
	}

}

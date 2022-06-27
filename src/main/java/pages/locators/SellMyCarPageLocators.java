package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SellMyCarPageLocators {
	@FindBy(how=How.NAME,using="number_plate")
	public WebElement inptNumberPlate;
	
	@FindBy(how=How.CSS,using=".select--input")
	public WebElement slctStateCarRegistration;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using = "NSW")
	public WebElement chooseNsw;
	
	@FindBy(how=How.CSS,using = ".sellACarForm--buttonContent")
	public WebElement btnStartMyAd;
}

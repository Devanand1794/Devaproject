package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedbusPOM extends BaseClass {

	public RedbusPOM() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="src")
	private WebElement FromSources;
	
	@FindBy(id="dest")
	private WebElement ToDesgination;
	
	@FindBy(id="onward_cal")
	private WebElement datee;
	
	@FindBy(xpath="//td[@class='next']")
	private WebElement movedate;
	
	@FindBy(xpath="//td[text()='13']")
	private WebElement monthclick;
	
	@FindBy(id="search_btn")
	private WebElement search;
	
	@FindBy(xpath="(//label[@class='custom-checkbox'])[7]")
	private WebElement Acwant;
	
	@FindBy(xpath="(//span[@class='fl'])[1]")
	private WebElement wifi;
	
	@FindBy(xpath="//span[@title='Water Bottle']")
	private WebElement bottle;
	
	@FindBy(xpath="//span[@title='Charging Point']")
	private WebElement chargingpoint;
	
	@FindBy(xpath="(//div[text()='View Seats'])[2]")
	private WebElement seatbook;
	
	@FindBy(xpath="//canvas[@class='pointer']")
	private WebElement seatclick;
	
	@FindBy(xpath="(//div[@class='radio-unchecked'])[1]")
	private WebElement radiobtn;
	
	@FindBy(xpath="(//div[@class='radio-unchecked'])[2]")
	private WebElement timerado;
	
	@FindBy(xpath="//button[text()='Proceed to book']")
	private WebElement proceedtobook;
	
	@FindBy(xpath="//div[@class='close-primo']")
	private WebElement closee;
	
	@FindBy(xpath="(//div[text()='View Seats'])[1]")
	private WebElement viewseat;

	
	public WebElement getViewseat() {
		return viewseat;
	}

	public WebElement getClosee() {
		return closee;
	}

	public WebElement getFromSources() {
		return FromSources;
	}

	public WebElement getToDesgination() {
		return ToDesgination;
	}

	public WebElement getDatee() {
		return datee;
	}

	public WebElement getMovedate() {
		return movedate;
	}

	public WebElement getMonthclick() {
		return monthclick;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getAcwant() {
		return Acwant;
	}

	public WebElement getWifi() {
		return wifi;
	}

	public WebElement getBottle() {
		return bottle;
	}

	public WebElement getChargingpoint() {
		return chargingpoint;
	}

	public WebElement getSeatbook() {
		return seatbook;
	}

	public WebElement getSeatclick() {
		return seatclick;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getTimerado() {
		return timerado;
	}

	public WebElement getProceedtobook() {
		return proceedtobook;
	}
	
	
	   
}

package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirindiaPOM extends BaseClass{
public AirindiaPOM() {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="(//div[@class='iradio'])[1]")
	private WebElement round;
	
	@FindBy(id="from")
	private WebElement from;
	
	@FindBy(id="to")
	private WebElement to;
	
	@FindBy(name="_depdateeu1")
	private WebElement depart;
	
	@FindBy(name="_retdateeu1")
	private WebElement returnn;
	
	
	
	public WebElement getReturnn() {
		return returnn;
	}

	@FindBy(xpath="(//a[text()='24'])[1]")
	private WebElement junemonth;
	
	@FindBy(xpath="//a[text()='4']")
	private WebElement julymonth;
	
	@FindBy(id="ddladult1")
	private WebElement adult;
	
	@FindBy(id="ddlchildren1")
	private WebElement children;
	
	@FindBy(id="ddlinfants1")
	private WebElement infants;
	
	@FindBy(id="_classType1")
	private WebElement classs;
	
	@FindBy(id="concessionaryType1")
	private WebElement concess;
	
	@FindBy(id="pcode1")
	private WebElement promationcode;
	
	@FindBy(id="btnbooking")
	private WebElement btnbooking;

	@FindBy(xpath="//a[text()='Chennai, Chennai International Airport, MAA, India']")
	private WebElement chennai;
	
	@FindBy(xpath="//a[text()='Delhi, Indira Gandhi International Airport, DEL, India']")
	private WebElement delhi;
	
	@FindBy(xpath="(//a[text()='View  Flight Details'])[1]")
	private WebElement viewdetails;
	
	@FindBy(xpath="//span[text()='Close']")
	private WebElement close;
	
	@FindBy(xpath="(//div[@class='flight-price-section'])[1]")
	private WebElement down;
	
	@FindBy(xpath="(//div[@class=\"bottom-section-container\"])[2]")
	private WebElement supervalue;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement supercontinue;
	
	
	public WebElement getViewdetails() {
		return viewdetails;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getDown() {
		return down;
	}

	public WebElement getSupervalue() {
		return supervalue;
	}

	public WebElement getSupercontinue() {
		return supercontinue;
	}

	public WebElement getDelhi() {
		return delhi;
	}

	public WebElement getChennai() {
		return chennai;
	}

	public WebElement getRound() {
		return round;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getDepart() {
		return depart;
	}

	public WebElement getJunemonth() {
		return junemonth;
	}

	public WebElement getJulymonth() {
		return julymonth;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getInfants() {
		return infants;
	}

	public WebElement getClasss() {
		return classs;
	}

	public WebElement getConcess() {
		return concess;
	}

	public WebElement getPromationcode() {
		return promationcode;
	}

	public WebElement getBtnbooking() {
		return btnbooking;
	}
	
	
}

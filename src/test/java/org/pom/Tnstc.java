package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tnstc extends BaseClass {
public Tnstc() {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//a[text()='E-Ticket Login']")
	private WebElement eTicketLogin;
	
	@FindBy(name="txtUserLoginID")
	private WebElement username;
	
	@FindBy(name="txtPassword")
	private WebElement password;
	
	@FindBy(xpath="(//a[@class='dboxheader'])[1]")
	private WebElement btnlogin;
	
	@FindBy(id="matchStartPlace")
	private WebElement startingpoint;
	
	@FindBy(id="matchEndPlace")
	private WebElement destinationpoint;
	
	@FindBy(xpath="//div[@class='cal']")
	private WebElement dates;
	
	@FindBy(xpath="//td[text()='June, 2022']")
	private WebElement monthyear;
	
	@FindBy(xpath="//td[text()='15']")
	private WebElement date;
	
	@FindBy(id="selectOnwardTimeSlab")
	private WebElement time;
	

   @FindBy(id="txtAdultMales")
   private WebElement adultMales;
   
   @FindBy(id="txtAdultFemales")
   private WebElement adultfemale;
   
   @FindBy(id="txtChildMales")
   private WebElement childMales;
   
   @FindBy(id="selectClass")
   private WebElement serviceClass;
   
   @FindBy(xpath="//a[@class='btnTxt']")
   private WebElement searchavaiable;
   
   @FindBy(xpath="(//a[text()='Book'])[2]")
   private WebElement book;



public WebElement geteTicketLogin() {
	return eTicketLogin;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getBtnlogin() {
	return btnlogin;
}

public WebElement getStartingpoint() {
	return startingpoint;
}

public WebElement getDestinationpoint() {
	return destinationpoint;
}

public WebElement getDates() {
	return dates;
}

public WebElement getMonthyear() {
	return monthyear;
}

public WebElement getDate() {
	return date;
}

public WebElement getTime() {
	return time;
}

public WebElement getAdultMales() {
	return adultMales;
}

public WebElement getAdultfemale() {
	return adultfemale;
}

public WebElement getChildMales() {
	return childMales;
}

public WebElement getServiceClass() {
	return serviceClass;
}

public WebElement getSearchavaiable() {
	return searchavaiable;
}

public WebElement getBook() {
	return book;
}
   
}



















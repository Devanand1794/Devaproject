package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel extends BaseClass {
	
	public Hotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement passwordd;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	@FindBy(id="location")
	private WebElement loca;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement nosroom;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement searchhotelclick;
	
	@FindBy(id="continue")
	private WebElement continuee;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement addresss;
	
	@FindBy(id="cc_num")
	private WebElement creditcard;
	
	@FindBy(id="cc_type")
	private WebElement credittype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	@FindBy(id="order_no")
	private WebElement ordernumber;
	
    @FindBy(name="order_no")
    private WebElement tabless;
    
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPasswordd() {
		return passwordd;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getLoca() {
		return loca;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNosroom() {
		return nosroom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearchhotelclick() {
		return searchhotelclick;
	}

	public WebElement getContinuee() {
		return continuee;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddresss() {
		return addresss;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCredittype() {
		return credittype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getOrdernumber() {
		return ordernumber;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getTabless() {
		return tabless;
	}

	

	
	
	

	
	

	
	
	
}

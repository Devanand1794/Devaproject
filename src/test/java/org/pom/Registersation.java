package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registersation extends BaseClass{
	public Registersation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement mobilenumber;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement newpassword;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement genders;
	
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement create;

	public WebElement getCreate() {
		return create;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGenders() {
		return genders;
	}
	
}

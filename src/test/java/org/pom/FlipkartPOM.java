package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPOM extends BaseClass{

	public FlipkartPOM() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
	private WebElement search;
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement close;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement clicksearch;
	
	@FindBy(xpath="//div[@class='_1YokD2 _3Mn1Gg']")
	private WebElement printall;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (Black, 128 GB)']")
	private WebElement iphone1;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (Purple, 128 GB)']")
	private WebElement iphone2;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (White, 64 GB)']")
	private WebElement iphone3;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (White, 128 GB)']")
	private WebElement iphone4;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (Black, 64 GB)']")
	private WebElement iphone5;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (Purple, 64 GB)']")
	private WebElement iphone6;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 12 (Black, 128 GB)']")
	private WebElement iphone7;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 12 (Green, 128 GB)']")
	private WebElement iphone8;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 12 (White, 64 GB)']")
	private WebElement iphone9;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 12 (White, 128 GB)']")
	private WebElement iphone10;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (Red, 128 GB)']")
	private WebElement iphone11;
	@FindBy(xpath="//div[text()='APPLE iPhone 13 (Pink, 128 GB)']")
	private WebElement iphone12;
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (Red, 64 GB)']")
	private WebElement iphone13;
	@FindBy(xpath="//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']")
	private WebElement iphone14;
	@FindBy(xpath="//div[text()='APPLE iPhone 12 (Purple, 64 GB)']")
	private WebElement iphone15;
	@FindBy(xpath="//div[text()='APPLE iPhone 12 (Blue, 128 GB)']")
	private WebElement iphone16;
	@FindBy(xpath="//div[text()='APPLE iPhone 13 (Blue, 128 GB)']")
	private WebElement iphone17;
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (Yellow, 64 GB)']")
	private WebElement iphone18;
	@FindBy(xpath="//div[text()='APPLE iPhone 12 (Red, 64 GB)']")
	private WebElement iphone19;
	@FindBy(xpath="//div[text()='APPLE iPhone 12 (Black, 64 GB)']")
	private WebElement iphone20;
	
	
	
	public WebElement getIphone12() {
		return iphone12;
	}

	public WebElement getIphone13() {
		return iphone13;
	}

	public WebElement getIphone14() {
		return iphone14;
	}

	public WebElement getIphone15() {
		return iphone15;
	}

	public WebElement getIphone16() {
		return iphone16;
	}

	public WebElement getIphone17() {
		return iphone17;
	}

	public WebElement getIphone18() {
		return iphone18;
	}

	public WebElement getIphone19() {
		return iphone19;
	}

	public WebElement getIphone20() {
		return iphone20;
	}

	public WebElement getIphone2() {
		return iphone2;
	}

	public WebElement getIphone3() {
		return iphone3;
	}

	public WebElement getIphone4() {
		return iphone4;
	}

	public WebElement getIphone5() {
		return iphone5;
	}

	public WebElement getIphone6() {
		return iphone6;
	}

	public WebElement getIphone7() {
		return iphone7;
	}

	public WebElement getIphone8() {
		return iphone8;
	}

	public WebElement getIphone9() {
		return iphone9;
	}

	public WebElement getIphone10() {
		return iphone10;
	}

	public WebElement getIphone11() {
		return iphone11;
	}

	public WebElement getIphone1() {
		return iphone1;
	}

	public WebElement getPrintall() {
		return printall;
	}

	public WebElement getClicksearch() {
		return clicksearch;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
}

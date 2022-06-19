package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookMyShowPOM extends BaseClass{
      public WebElement getVikrammovie() {
		return vikrammovie;
	}


	public WebElement getBookmovie() {
		return bookmovie;
	}


	public WebElement getWorkconfirm() {
		return workconfirm;
	}


	public BookMyShowPOM() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getMovieDate() {
		return movieDate;
	}


	public WebElement getMovieTime() {
		return movieTime;
	}


	public WebElement getAccept() {
		return accept;
	}

	@FindBy(xpath="(//div[@class='sc-133848s-3 cWbeuJ'])[2]")
	private WebElement vikrammovie;
	

    @FindBy(xpath="(//span[text()='Book tickets'])[1]")
    private WebElement bookmovie;
    
    @FindBy(id="wzrk-confirm")
    private WebElement workconfirm;
    
    @FindBy(xpath="(//a[@class='date-href'])[3]")
    private WebElement movieDate;
    
    @FindBy(xpath="//div[text()='							03:35 PM					']")
    private WebElement movieTime;
    
    @FindBy(id="btnPopupAccept")
    private WebElement accept;
    
    @FindBy(xpath="//a[text()='AGS Cinemas OMR: Navlur']")
    private WebElement threatreSelect;

	public WebElement getThreatreSelect() {
		return threatreSelect;
	}
    
    @FindBy(xpath="//a[text()='Vikram (UA)']")
    private WebElement movieSelect;

	public WebElement getMovieSelect() {
		return movieSelect;
	}
    
    public WebElement getSeat() {
		return Seat;
	}


	public WebElement getSelectSeats() {
		return SelectSeats;
	}


	public WebElement getSeatno1() {
		return seatno1;
	}


	public WebElement getSeatno2() {
		return seatno2;
	}


	public WebElement getSeatno3() {
		return seatno3;
	}


	public WebElement getSeatno4() {
		return seatno4;
	}

	public WebElement getPay() {
		return pay;
	}

	@FindBy(id="pop_4")
    private WebElement Seat;
    
    @FindBy(id="proceed-Qty")
    private WebElement SelectSeats;
    
    @FindBy(xpath="(//a[text()='                            7                        '])[2]")
    private WebElement seatno1;
    
    @FindBy(xpath="(//a[text()='                            8                        '])[2]")
    private WebElement seatno2;
    
    @FindBy(xpath="(//a[text()='                            9                        '])[2]")
    private WebElement seatno3;
    
    @FindBy(xpath="(//a[text()='                            10                        '])[2]")
    private WebElement seatno4;
    
    @FindBy(id="btmcntbook")
    private WebElement pay;
}

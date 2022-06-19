package org.test;

import java.awt.AWTException;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.support.ui.Select;
import org.pom.Tnstc;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TnstcTest extends BaseClass {

	@BeforeClass
	private void browserlaunch() {
		chromeBrowser();
		urlLanch("https://www.tnstc.in/home.html");
		implicityWait(20);
		System.out.println("Browser Launch is Completed");
	}
	@AfterClass
	private void quitBrowser() {
		
	}
	
	@BeforeMethod
	private void testcasestarttime() {
		System.out.println("Test Case Starting time is"+new Date());
	}
	
	@AfterMethod
	private void testcaseendtime() {
		System.out.println("Test Case Ending Time is"+new Date());
	}
	
	@Test(priority=1)
	private void eTicketLogin() {
		Tnstc de=new Tnstc();
		click(de.geteTicketLogin());
		sendKeys(de.getUsername(), "tashok2694@gmail.com");
		sendKeys(de.getPassword(), "Ashok123");
        click(de.getBtnlogin());
        System.out.println("Login completed");
	}
	
	@Test(priority=2)
	private void from() throws AWTException, InterruptedException {
		Tnstc de=new Tnstc();
		click(de.getStartingpoint());
		sendKeys(de.getStartingpoint(), "ney");
        keyPress2();
        keyrelease2();
        keypress3();
        keyrelease3();
        System.out.println("From Address is completed");
        
	}
	
	@Test(priority=3)
	private void to() throws AWTException, InterruptedException {
		Tnstc de=new Tnstc();
		javascriptClick(de.getDestinationpoint());
		sendKeys(de.getDestinationpoint(), "che");
	
		keyPress2();
	    keyrelease2();
		keypress3();
		keyrelease3();
        System.out.println("To Address is completed");
	}
	
	@Test
	private void jounetdate() {
		Tnstc de=new Tnstc();
		click(de.getDates());
		click(de.getDate());

	}
	
}

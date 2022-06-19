package org.test;

import java.awt.AWTException;
import java.util.Date;

import org.base.BaseClass;
import org.pom.RedbusPOM;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedBusTest extends BaseClass {

	@BeforeClass
	private void browserlaunch() {
		chromeBrowser();
		urlLanch("https://www.redbus.in/");
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
	@Test(priority=0)
	private void Testcase1() throws AWTException, InterruptedException {
		urlLanch("https://www.redbus.in/");
		RedbusPOM de= new RedbusPOM();
		click(de.getFromSources());
		sendKeys(de.getFromSources(), "tan");
		Thread.sleep(2000);
		keypress3();
		keyrelease3();
	}
	
	@Test(priority=1)
	private void TestCase2() throws AWTException, InterruptedException {
		RedbusPOM de= new RedbusPOM();
        click(de.getToDesgination());
        sendKeys(de.getToDesgination(), "che");
        Thread.sleep(2000);
        keypress3();
        keyrelease3();
	}
	@Test(priority=2)
	private void TestCase3() {
		RedbusPOM de= new RedbusPOM();
		click(de.getDatee());
		click(de.getMovedate());
		click(de.getMonthclick());
		click(de.getSearch());
	}
	@Test(priority=3)
	private void comfotabale() throws InterruptedException {
		RedbusPOM de= new RedbusPOM();
		Thread.sleep(2000);
		click(de.getClosee());
	    click(de.getViewseat());
	    
	    
	    

	}
	
	
}

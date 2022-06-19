package org.test;

import java.awt.AWTException;
import java.util.Date;

import org.base.BaseClass;
import org.pom.AirindiaPOM;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AirIndiaTest extends BaseClass{

	
	@BeforeClass
	private void browserlaunch() {
		chromeBrowser();
		urlLanch("https://www.airindia.in/");
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
	private void TestCase1() throws AWTException, InterruptedException {
		AirindiaPOM de=new AirindiaPOM();
		javascriptClick(de.getRound());
		sendKeys(de.getFrom(), "che");
		   click(de.getChennai());
	        System.out.println("TestCase1 is completed");
	}
	@Test(priority=1)
	private void TestCase2() throws AWTException {
		AirindiaPOM de=new AirindiaPOM();
		sendKeys(de.getTo(), "del");
		click(de.getDelhi());
	     System.out.println("TestCase2 is Completed");
	}
	@Test(priority=2)
	private void testcase3() {
		AirindiaPOM de=new AirindiaPOM();
		javascriptClick(de.getDepart());
		javascriptClick(de.getJunemonth());
		javascriptClick(de.getReturnn());
		javascriptClick(de.getJulymonth());
		System.out.println("testCase 3 is completed");
	}
	@Test(priority=3)
	private void testCase4() {
		AirindiaPOM de=new AirindiaPOM();
		click(de.getAdult());
		selectByIndex(de.getAdult(), 2);
		click(de.getChildren());
		selectByIndex(de.getChildren(), 0);
		click(de.getInfants());
		selectByIndex(de.getInfants(), 1);
		click(de.getClasss());
		selectByIndex(de.getClasss(), 1);
		click(de.getConcess());
		selectByIndex(de.getConcess(), 6);
		clear(de.getPromationcode());
		sendKeys(de.getPromationcode(), "devanand");
		click(de.getBtnbooking());
		System.out.println("Test Case 4 is Completed");
	}
	@Test
	private void testCase5() {
		AirindiaPOM de=new AirindiaPOM();
		javascriptClick(de.getViewdetails());
		click(de.getClose());
		click(de.getDown());
		click(de.getSupervalue());
		click(de.getSupercontinue());

	}
	
}

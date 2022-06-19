package org.test;

import java.io.IOException;
import java.sql.Time;
import java.util.Date;

import org.base.BaseClass;
import org.pom.Hotel;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNg extends BaseClass {
	@BeforeClass
	private void browserLaunch() {
		chromeBrowser();
		urlLanch("https://adactinhotelapp.com/");
		String currentUrl = getCurrentUrl();
		boolean contains = currentUrl.contains("adactinhotel");
		Assert.assertTrue(contains);
		implicityWait(20);
	}
	@AfterClass
	private void quitbrowser() {
		quit();
	}
	@BeforeMethod
     private void startTime() {
		Date w=new Date();
		System.out.println("Test Start Time is"+w);
	}
	@AfterMethod
	private void endTime() {
		System.out.println("Test End Time is"+new Date());
	}
	@Test(priority=0)
	private void testCases1() throws IOException {
		Hotel de=new Hotel();
		sendKeys(de.getUsername(), readExcel("Book2", "sheet2", 1, 0));
		String attribute = getAttribute(de.getUsername());
		Assert.assertEquals(attribute, "Devanand1794","verify username");
		sendKeys(de.getPasswordd(), readExcel("Book2", "sheet2", 1, 1));
		String attribute2 = getAttribute(de.getPasswordd());
		Assert.assertEquals(attribute2, "368WZ5","verify password");
		
		click(de.getBtnlogin());
		String currentUrl = getCurrentUrl();
		boolean contains = currentUrl.contains("SearchHotel");
		Assert.assertTrue(contains);
		System.out.println("testCases1 is completed");
	}
	@Test(priority=1,enabled=false)
	private void testCases2() throws IOException {
		Hotel de=new Hotel();
		click(de.getLoca());
		selectByIndex(de.getLoca(), 3);
		
		click(de.getHotel());
		selectByIndex(de.getHotel(), 2);
		
		click(de.getRoom());
		selectByIndex(de.getRoom(), 2);
		
		click(de.getNosroom());
		selectByIndex(de.getNosroom(), 3);
		
		click(de.getCheckin());
		clear(de.getCheckin());
		sendKeys(de.getCheckin(),readExcel("Book2", "sheet2", 3, 2));
		
		click(de.getCheckout());
		clear(de.getCheckout());
		sendKeys(de.getCheckout(),readExcel("Book2", "sheet2", 3, 3));
		
		click(de.getAdultroom());
		selectByIndex(de.getAdultroom(), 3);
		
		click(de.getChildroom());
		selectByIndex(de.getChildroom(), 2);
		
		click(de.getSubmit());
	
}}
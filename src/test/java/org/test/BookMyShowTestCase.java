package org.test;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.pom.BookMyShowPOM;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BookMyShowTestCase extends BaseClass{

	@BeforeClass
	private void browserLaunch() {
		browserLaunch("chrome");
		urlLanch("https://in.bookmyshow.com/explore/home/chennai");
		implicityWait(20);
	}
	@AfterClass
	private void quitBrowser() {
	
	}
	@BeforeMethod
	private void testStarting() {
		System.out.println("Test Starting Time is"+new Date());
	}
	@AfterMethod
	private void testEnding() {
		System.out.println("Test Ending Time is"+new Date());
	}
	@Test
	private void testCases1() throws IOException {
		SoftAssert h=new SoftAssert();
		urlLanch("https://in.bookmyshow.com/explore/home/chennai");
		h.assertTrue(getCurrentUrl().contains("bookmyshow"));
		BookMyShowPOM de=new BookMyShowPOM();
		click(de.getWorkconfirm());
		click(de.getVikrammovie());
		click(de.getBookmovie());
		click(de.getThreatreSelect());
		click(de.getMovieDate());
		click(de.getMovieTime());
		click(de.getAccept());
		click(de.getSeat());
		click(de.getSelectSeats());
		click(de.getSeatno1());
		click(de.getPay());
		screenShots(de.getPay());
		currenttimeMillis();
		
		
		
		System.out.println("test Completed");
		

	}
	
	
}

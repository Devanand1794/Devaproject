package org.test;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.support.ui.Select;
import org.pom.Loginpage;
import org.pom.Registersation;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebook extends BaseClass {

	@BeforeClass
	private void browserLaunch() {
		chromeBrowser();
		urlLanch("https://www.facebook.com/");
		implicityWait(20);
	}
	@AfterClass
	private void quitbrowser() {
		quit();
	}
	@BeforeMethod
	private void testCaseStartTime() {
		Date f=new Date();
        System.out.println("TestCase Start Time is"+f);
	}
	@AfterMethod
	private void testcaseEndTime() {
		System.out.println("TestCase End Time is"+new Date());
	}
	@Test(priority=1,dataProvider="login",dataProviderClass=dataproviderrr.class)
	private void loginPage() throws InterruptedException, IOException {
		urlLanch("https://www.facebook.com/");
		SoftAssert e=new SoftAssert();
		e.assertTrue(getCurrentUrl().contains("facebook"),"verify url");
		Loginpage de=new Loginpage();
		sendKeys(de.getTxtUsername(), readExcel("Book2", "sheet2", 1, 1));
		e.assertEquals(getAttribute(de.getTxtUsername()), "368WZ5","verify username");
		sendKeys(de.getTxtPassword(), readExcel("Book2", "sheet2", 1, 0));
		e.assertEquals(getAttribute(de.getTxtPassword()), "Devanand1794","verify password");
		click(de.getBtnLogin());
		Thread.sleep(5000);
		e.assertTrue(getCurrentUrl().contains("privacy"),"verify invalid url");	
		System.out.println("I am in Invalid Page");
		e.assertAll();
	}
	@Test(priority=0)
	private void Registeration() throws InterruptedException {
		urlLanch("https://www.facebook.com/");
		SoftAssert e=new SoftAssert();
		e.assertTrue(getCurrentUrl().contains("facebook"),"verify url");
		Registersation gg=new Registersation();
		click(gg.getCreate());
		e.assertTrue(getCurrentUrl().contains("face"),"verify url");
		sendKeys(gg.getFirstname(), "Devanand");
		e.assertEquals(getAttribute(gg.getFirstname()), "Devanand","verify firstname");
		sendKeys(gg.getLastname(), "Pughazhendi");
		e.assertEquals(getAttribute(gg.getLastname()), "Pughazhendi","verify lastname");
		sendKeys(gg.getMobilenumber(), "8610374044");
		e.assertEquals(getAttribute(gg.getMobilenumber()), "8610374044","verify mobile number");
		sendKeys(gg.getNewpassword(), "darshan");
		e.assertEquals(getAttribute(gg.getNewpassword()), "darshan","verify newpassword");
		selectByVisibleText(gg.getDay(), "1");
		e.assertEquals(getAttribute(gg.getDay()), "1","verify Day");
		selectByVisibleText(gg.getMonth(), "Jul");
		e.assertEquals(getAttribute(gg.getMonth()), "7","verify month");
		selectByVisibleText(gg.getYear(), "1994");
		e.assertEquals(getAttribute(gg.getYear()), "1994","verify year");
		e.assertAll();
	}
	@Test(enabled=false)
	private void test3() {
		System.out.println("Test3 is completed");

	}
}

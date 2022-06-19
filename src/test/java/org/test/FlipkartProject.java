package org.test;

import java.util.HashMap;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.FlipkartPOM;
import org.testng.annotations.Test;

public class FlipkartProject extends BaseClass {

	@Test
	private void testcase1() throws InterruptedException {
		chromeBrowser();
		urlLanch("https://www.flipkart.com/");
		FlipkartPOM de=new FlipkartPOM();
		click(de.getClose());
		sendKeys(de.getSearch(), "iphone");
		click(de.getClicksearch());
		Thread.sleep(5000);
		
		
		
		List<WebElement> fin = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		HashMap<Integer, String>asc=new HashMap<Integer, String>();
		for(int i=0;i<fin.size();i++) {
			
		}
		
	}
	
}

package org.test;

import java.io.IOException;

import org.base.BaseClass;
import org.pom.Hotel;
import org.testng.annotations.Test;

public class TestNG2 extends BaseClass{

	@Test
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
		
		System.out.println("testCases2 is completed");

	}
}

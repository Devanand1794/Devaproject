package org.para;

import org.testng.annotations.Test;

public class grouping {

	
	@Test(groups="smoke")
	private void testA1() {
		System.out.println("Test A1 is completed");

	}
	@Test(groups="smoke")
	private void testA2() {
		System.out.println("Test A2 is completed");
		
	}
	@Test(groups="smoke")
	private void testA3() {
		System.out.println("Test A3 is completed");
		
	}
	@Test(groups="smoke")
	private void testA4() {
		System.out.println("Test A4 is completed");
		
	}
	@Test(groups="smoke")
	private void testA5() {
		System.out.println("Test A5 is completed");
		
	}
	@Test(groups="sanitary")
	private void testA6() {
		System.out.println("Test A6 is completed");
		
	}
	@Test(groups="sanitary")
	private void testA7() {
		System.out.println("Test A7 is completed");
		
	}
	@Test(groups="sanitary")
	private void testA8() {
		System.out.println("Test A8 is completed");
		
	}
	@Test(groups="sanitary")
	private void testA9() {
		System.out.println("Test A9 is completed");
		
	}
	@Test(priority=10,groups="regression")
	private void testA10() {
		System.out.println("Test A10 is completed");
		
	}
	@Test(priority=11,groups="regression")
	private void testA11() {
		System.out.println("Test A11 is completed");
		
	}
	@Test(priority=12,groups="regression")
	private void testA12() {
		System.out.println("Test A12 is completed");
		
	}
	@Test(priority=13,groups="regression")
	private void testA13() {
		System.out.println("Test A13 is completed");
		
	}
	@Test(priority=14,groups="retest")
	private void testA14() {
		System.out.println("Test A14 is completed");
		
	}
	@Test(priority=15,groups="retest")
	private void testA15() {
		System.out.println("Test A15 is completed");
		
	}
}

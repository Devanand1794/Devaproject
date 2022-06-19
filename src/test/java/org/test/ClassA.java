package org.test;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassA {
    @Parameters({"email","mobilenumber"})
	@Test()
	private void testA1(@Optional("megalapushpa94@gmail.com")String a, @Optional("8675822923")String b) {
		System.out.println(a);
		System.out.println(b);
	}
	@Test()
	private void testA2() {
		System.out.println("Test A2 is completed");
	}
	@Test()
	private void testA3() {
		Assert.assertTrue(true);
		System.out.println("Test A3 is completed");
		System.out.println("Test A4 is completed");
		System.out.println("Test A5 is completed");
		System.out.println("Test A6 is completed");
		System.out.println("Test A6 is completed");
		System.out.println("Test A7 is completed");
		System.out.println("Test A 6 is completed");

	}
	
}

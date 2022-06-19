package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Devanand {

	@BeforeClass
	private void beforeclass() {
		System.out.println("Before class");

	}
	@AfterClass
	private void afterclass() {
		System.out.println("after classs");

	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("before method");

	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("after method");

	}
	@Test(priority=1)
	private void testA1() {
		System.out.println("Test a1 is done");

	}
	@Test(priority=0,invocationCount=3)
	private void testA2() {
		System.out.println("Test a1 is done");
	}	

	@Test(priority=3,enabled=false)
	private void testA3() {
		System.out.println("Test a1 is done");
}}
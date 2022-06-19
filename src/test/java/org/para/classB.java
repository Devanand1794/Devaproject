package org.para;

import org.testng.annotations.Test;

public class classB {

	@Test(dataProvider="cl",dataProviderClass=dataproviderrr.class)
	private void testB1(String a, String b) {
		System.out.println("TestB1 is completed and email is"+a);
		System.out.println("TestB1 is completed and password is"+b);
	}
	@Test
	private void testB2() {
		System.out.println("TestB2");
}
	@Test(dataProvider="cl",dataProviderClass=dataproviderrr.class)
	private void testB3(String a, String b) {
		System.out.println("TestB3 is complted and email is"+a);
		System.out.println("TestB3 is complted and password is"+b);
	}
}




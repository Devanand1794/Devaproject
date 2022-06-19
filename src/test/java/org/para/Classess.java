package org.para;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Classess {
    
	
	@Test(dataProvider="cl1",dataProviderClass=dataproviderrr.class)
	private void testA1(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
	@Test(dataProvider="cl1",dataProviderClass=dataproviderrr.class)
	private void testA2(String a,String b) {
		System.out.println("TestA2 is completed and email is"+a);
		System.out.println("TestA2 is completed and password is"+b);
}
	@Test
	private void testA3() {
		System.out.println("TestA3");
	}
}
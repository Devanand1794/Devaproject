package org.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderrr {

	@DataProvider(name="login")
	private Object[][] Login() {
		Object[][] obj= new Object[][] {
			{"devanand1794@gmail.com","456467583656"},
			{"megalapushpa94@gmail.com","568798654546"},
			{"wsdwedwsd@gmail.com","5688655"}
		};
		return obj;
}
}
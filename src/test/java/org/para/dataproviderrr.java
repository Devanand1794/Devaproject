package org.para;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class dataproviderrr {

	
	@DataProvider(name="cl")
	private Object[][] classBb() {
		Object[][] obj=new Object[][] {
			{"devanand1794@gmail","6585565"},
			{"megalapushpa94@gmail.com","68798565"},
			{"anand2022@gmail.com","54455"}
		};
		return obj;

	}	
		
		
		
		
	@DataProvider(name="cl1")
	private Object[][] Classesss() {
		Object[][] obj=new Object[][] {
			{"8610374044","vandalur"},
			{"8675822923","kelampakkam"},
			{"9942182657","chennai"}
		};
		return obj;

	}
		
		
		
		
		
		
	
}

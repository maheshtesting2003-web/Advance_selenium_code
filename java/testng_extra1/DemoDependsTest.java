package testng_extra1;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DemoDependsTest {

	@Test
	
	public void createcity(){
		Assert.assertTrue(true);
		System.out.println("noida created");
		
	}
    
	@Test(dependsOnMethods ="createcity")
	public void modifycity(){
		
		Assert.assertTrue(false);
		System.out.println("modified to greater noida");
	}
	
	
	@Test(dependsOnMethods  ="modifycity" , alwaysRun = true)
	public void deletecity(){
		
		Assert.assertTrue(true);
		System.out.println("greater noida deleted");
	}
	

}

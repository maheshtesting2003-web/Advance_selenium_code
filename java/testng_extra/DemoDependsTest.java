package testng_extra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoDependsTest {
	@Test
	public void createCity() {
		Assert.assertTrue(true);
		System.out.println("noida created");
	}

	/*
	 * if modifyCity() is dependent on createCity() then,
	 * 1> if createCity passes, modifyCity() will run,
	 * 2> if createCity fails, modifyCity() will be skipped...
	*/	
	@Test(dependsOnMethods = "createCity")	
	public void modifyCity() {
		Assert.assertTrue(false);		
		System.out.println("modified to greater noida");
	}
	
	@Test(dependsOnMethods = "modifyCity", alwaysRun = true)
	public void deleteCity() {
		Assert.assertTrue(true);
		System.out.println("greater noida deleted");
	}
}
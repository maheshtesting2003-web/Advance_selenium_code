package testng_extra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	@Test(priority = -1)
	public void createCity() {
		Assert.assertTrue(true);
		System.out.println("noida created");
	}
	
	@Test
	public void modifyCity() {
		Assert.assertTrue(false);
		System.out.println("modified to greater noida");
	}
	
	@Test(priority = 1)
	public void deleteCity() {
		Assert.assertTrue(true);
		System.out.println("greater noida deleted");
	}
}
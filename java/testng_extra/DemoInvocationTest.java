package testng_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoInvocationTest {
	
	WebDriver driver = null;
	
	@Test(invocationCount = 3, threadPoolSize = 3)
	public void loginToFB() throws InterruptedException {
		driver = new ChromeDriver();
		Assert.assertTrue(true);
		System.out.println("logged-in in fb");
		driver.get("http://www.facebook.com/");
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(invocationCount = 2, threadPoolSize = 2)
	public void loginToInsta() throws InterruptedException {
		driver = new ChromeDriver();
		Assert.assertTrue(true);
		System.out.println("logged-in in insta");
		driver.get("http://www.instagram.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}
package testng_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoDisabledTest {
	
	WebDriver driver = null;
	
	@Test(enabled = false)
	public void loginToFB() throws InterruptedException {
		driver = new ChromeDriver();
		Assert.assertTrue(true);
		System.out.println("logged-in in fb");
		driver.get("http://www.facebook.com/");
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(invocationCount = 0)
	public void loginToInsta() throws InterruptedException {
		driver = new ChromeDriver();
		Assert.assertTrue(true);
		System.out.println("logged-in in insta");
		driver.get("http://www.instagram.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}
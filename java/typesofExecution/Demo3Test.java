package typesofExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo3Test {

	@Test(groups = "smoke")
	public void case1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();
	}

	@Test(groups = "smoke")
	public void case11() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();
	}

	/*
	 * dependsOnGroups: is method ka group ("regression") tabhi chalega
	 * jab "smoke" group ke saare tests pass ho chuke honge.
	 * Agar smoke group mein koi bhi test fail hota hai,
	 * to ye method skip ho jayega.
	 */
	@Test(groups = "regression", dependsOnGroups = "smoke")
	public void case2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();
	}
}
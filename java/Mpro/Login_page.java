package Mpro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://mprouat.axismaxlife.com");
		
		driver.findElement(By.id("userId")).sendKeys("121939");
		driver.findElement(By.id("password")).sendKeys("Login!2347");
				
		driver.findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("YOUR_XPATH"))).click();
		
			
		
		
		driver.findElement(By.cssSelector("svg.MuiSvgIcon-root-622.NavBox__addIconSize__2AG4r")).click();		
		
		
		
	}
}

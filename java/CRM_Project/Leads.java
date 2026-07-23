package CRM_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import object_repository.Homepage;
import object_repository.Loginpage;

public class Leads {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888");

//       driver.findElement(By.name("user_name")).sendKeys("admin");
//       driver.findElement(By.name("user_password")).sendKeys("manager");
//       driver.findElement(By.id("submitButton")).click();
       

		Loginpage lp = new Loginpage(driver);

		lp.getun().sendKeys("admin");
		lp.getpwd().sendKeys("manager");
		lp.getsubmitbutton().click();

//       driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();

		Homepage hp = new Homepage(driver);

		hp.getleadlink().click();

		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();

		driver.findElement(By.name("firstname")).sendKeys("Manish");

		driver.findElement(By.name("lastname")).sendKeys("ramesh");

		driver.findElement(By.name("company")).sendKeys("Axis max life insurane pvt ltd");

		WebElement LS = driver.findElement(By.name("leadsource"));
		Select sel = new Select(LS);
		sel.selectByVisibleText("Cold Call");

		driver.findElement(By.name("email")).sendKeys("maheshsinghgariya2003@gmail.com");

		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		WebElement hower = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));

		Actions act = new Actions(driver);

		act.moveToElement(hower).build().perform();

		driver.findElement(By.xpath("//a[@href=\"index.php?module=Users&action=Logout\"]")).click();

	}
}

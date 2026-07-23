package CRM_Project;
import java.io.IOException;
import java.time.Duration;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import generic_utility.FileUtility;
import generic_utility.java_utility;

public class Contacts {

	public static void main(String[] args) throws InterruptedException, IOException, ParseException {

		
		 WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		
//	        FileUtility futil = new FileUtility();
//
//	        String URL = futil.getdataFromJsonFile("url");
//	        String USERNAME = futil.getdataFromJsonFile("un");
//	        String PASSWORD = futil.getdataFromJsonFile("pwd");

		FileUtility futil = new FileUtility();

		String URL = futil.getdataFromJsonFile("url");
		String USERNAME = futil.getdataFromJsonFile("un");
		String PASSWORD = futil.getdataFromJsonFile("pwd");

		System.out.println("URL : " + URL);
		System.out.println("USERNAME : " + USERNAME);
		System.out.println("PASSWORD : " + PASSWORD);

//	        
//	        String lastname = futil.getdatafromexcelfile("Contacts", 1, 0);
//	        String leadsource = futil.getdatafromexcelfile("Contacts", 1, 1);
//	        String email = futil.getdatafromexcelfile("Contacts", 1, 2);
//	        String assistant = futil.getdatafromexcelfile("Contacts", 1, 3);
//	        
//	        System.out.println("Lastname : " + lastname);
//	        System.out.println("Lead Source : " + leadsource);
//	        System.out.println("Email : " + email);
//	        System.out.println("Assistant : " + assistant);

		// java utility //

		// Java Utility
		int randomNum = java_utility.getrandomnumber();

		// Read data from Excel
		String lastname = futil.getdatafromexcelfile("Contacts", 1, 0) + randomNum;
		String leadsource = futil.getdatafromexcelfile("Contacts", 1, 1);
		String email = futil.getdatafromexcelfile("Contacts", 1, 2);
		String assistant = futil.getdatafromexcelfile("Contacts", 1, 3);

		System.out.println("Lastname : " + lastname);
		System.out.println("Lead Source : " + leadsource);
		System.out.println("Email : " + email);
		System.out.println("Assistant : " + assistant);

		driver.get(URL);
		System.out.println(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		System.out.println(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		System.out.println(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();

//	        driver.findElement(By.name("firstname")).sendKeys("Manish");
//
//	        driver.findElement(By.name("lastname")).sendKeys("kumar");
//	        
//	        
//	      WebElement   LS  = driver.findElement(By.name("leadsource"));
//	        
//	        Select sel = new Select(LS);
//	        sel.selectByVisibleText("Cold Call");
//	        
//	        driver.findElement(By.id("email")).sendKeys("maheshsinghgariya2003@gmail.com");
//	        driver.findElement(By.id("assistant")).sendKeys("Ramesh");

		driver.findElement(By.name("firstname")).sendKeys("Manish");

		driver.findElement(By.name("lastname")).sendKeys(lastname);

		WebElement LS = driver.findElement(By.name("leadsource"));
		Select sel = new Select(LS);
		sel.selectByVisibleText(leadsource);

		driver.findElement(By.id("email")).sendKeys(email);

		driver.findElement(By.id("assistant")).sendKeys(assistant);

		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

//	       driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		Thread.sleep(3000);
		driver.quit();
	}
}

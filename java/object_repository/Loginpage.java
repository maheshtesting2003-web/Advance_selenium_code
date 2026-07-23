package object_repository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	 @FindBy(name = "user_name")
	 public WebElement un;
	 
	 public WebElement getun(){
		 
		 return un;
	 }
	 
	 
	 @FindBy(name = "user_password")
	 public WebElement pwd;
	 
	 public WebElement getpwd(){	
		 
		 return pwd;
	 }
	 
	 @FindBy(id = "submitButton")
	 public WebElement sb;
	 
	 public WebElement getsubmitbutton(){
		 
		 return sb;
		 
		 
	 }
	
	
	

	public Loginpage(WebDriver driver){
		
		PageFactory .initElements(driver, this);
		
		
	}
	
}

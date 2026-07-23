package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
	
	public WebElement leadlink;
	
	public WebElement getleadlink(){
		
		return leadlink;
	}
	
	
    public Homepage(WebDriver driver){
    	
    	PageFactory.initElements(driver, this); 
    	
    }
	
	
}

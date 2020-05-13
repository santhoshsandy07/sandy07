package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_pom {
	
	
	@FindBy (xpath="//span[text()='Customers']")   // In the findby we shouldnot specify the tag name lieks input tag,anchor tag a like that an dall     //input[@id="customer"]
    private WebElement customer;
	
	
	@FindBy (xpath="//div[text()=\"Calls\"]")
	private WebElement call;
	
	public WebElement getcustomer()
	{
		return customer;
		
	}
	

  
  
 

}

package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class NewCustomerCreationPage_pom {

	@FindBy (xpath="//div[text()=\"New\"]")
    private WebElement Newbuttonforcustomer;
	
	@FindBy (id="11:1426;a")
	private WebElement customername;
	
	
	@FindBy (id="66:1426;a")
	private WebElement customernumber;
	
	public WebElement getcustomername()
	{
		return customername;
		
	}
	
	public WebElement getcustomernumber()
	{
		return customernumber;
		
	}
	
	public WebElement getNewbuttonforcustomer()
	{
		return Newbuttonforcustomer;
		
	}
	
}

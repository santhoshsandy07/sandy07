package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pom {

	@FindBy(name="username")  // This the attributes name (id,name,class,link text) -> values "" ->>> name (attribute name) and "username" is the attribute value
    private WebElement username;  //any name User Defined WebElement name
	
	@FindBy(id="password")
	private WebElement password;
	
	public WebElement getusername()
	{
		return username;                 // here we are directly access the output > like here we are getting the username 	 
	}
	
	public WebElement getpassword()
	{
		return password;
	}
	
	@FindBy (id="Login")
	
	private WebElement Login;
	
	public WebElement getLogin()
	{
		return Login;
		
	}
	
//	public void click()
//	{
//		Login.click();
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

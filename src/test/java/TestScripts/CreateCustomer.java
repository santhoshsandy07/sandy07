package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ObjectRepository.HomePage_pom;
import ObjectRepository.NewCustomerCreationPage_pom;

public class CreateCustomer extends BaseClass {

	@Test
	public void CreateCustomerinSF() throws EncryptedDocumentException, IOException
	{
		HomePage_pom Home_Customer=PageFactory.initElements(driver, HomePage_pom.class); // evry time when we use those pom.jave we need to us this pagefactory is a class
		Home_Customer.getcustomer().click();
        
		NewCustomerCreationPage_pom customerpom=PageFactory.initElements(driver, NewCustomerCreationPage_pom.class); // evry time when we use those pom.jave we need to us this pagefactory is a class
        
		customerpom.getNewbuttonforcustomer().click();
		
		String customername=flb.FetchingdatafromExcel("Customer", 3, 1);   //string return
		customerpom.getcustomername().sendKeys(customername);
		
        
        String customernumber=flb.FetchingdatafromExcel("Customer", 3, 2);
        customerpom.getcustomernumber().sendKeys(customernumber);
	}
}

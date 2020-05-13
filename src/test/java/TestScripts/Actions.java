package TestScripts;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.BrowserConfigurationOptions;



import org.openqa.selenium.interactions.Action;

public class Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Java\\geckodriver.exe");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Java/sample%20(2).html");
		
		driver.findElement(By.xpath("//input[@id=\"uname\"]")).sendKeys("Santhosh");
		driver.findElement(By.xpath("//input[@id=\"pwd\"]")).sendKeys("123");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
	driver.findElement(By.xpath("//input[@id=\"rep\"]")).click();
	boolean Chkboxstatus=driver.findElement(By.xpath("//input[@id=\"rep\"]")).isSelected();
	System.out.println(Chkboxstatus);
		
		driver.findElement(By.xpath("(//input[@name=\"gender\"])[2]")).click();
		
		//------------------------------------
		
		/*      //Select Dropdown
		
//		Select sel=new Select(driver.findElement(By.xpath("//select[@id=\"city\"]")));
//		sel.selectby(0);
 *
//
//		List<WebElement>alloptions =sel.getoptions();
//		int si=alloptions.size();
//		System.out.println(si);
//		
//		for(int i=0;i<si;i++)
//		{
//			WebElement option=alloptions.get(i);
//			String te=option.getText();
//			System.out.println(te);
//		}
*/		
		
		driver.get("https://vmmobilefwdev.cas.com:8081/IBE/WAS/?wtrealm=urn%3aidsrv3&wctx=WsFedOwinState%3dAQAAANCMnd8BFdERjHoAwE_Cl-sBAAAAKYqQI0tuyEybDUm-s8rFZgAAAAACAAAAAAAQZgAAAAEAACAAAACQ2Jr1Wg1-jGDFDYub1o0RVaWNXwPAUaljbF5HQEn6ggAAAAAOgAAAAAIAACAAAADa007nD9qB9Bs2Jhw9lWLlfTS5GoQUvZm234LfiPe0VHAAAAD4U8c2k9-JRLupRN8GnvDsBlWVNs0bQPqePTlm9bKW91FuotzRYrlgmuR6TKCnzL0GZX9BN0yFLBuLFqjEDxqehnU8FP5QrEOVFpTUR3NltQ_eMmOkdzMlk-uDGEoWbvN4AqsdXhcST6apNRAsHq8IQAAAADdE157rHBNg4Z_MkhSFYsM2wnt1GeC2xeipILcpRADjJgCu7Rq0vGWDKRZRToJIJtkp-xNKOn-Mrrqlrf6DjTU&wa=wsignin1.0");
		driver.findElement(By.xpath("//button[@id=\"details-button\"]")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//a[text()=\"Proceed to vmmobilefwdev.cas.com (unsafe)\"]")).click();
		
		//Thread.sleep(30000);
		//driver.get( "http://santhosh.ravikumar:jaisairam@011293@https://vmmobilefwdev.cas.com:8081/IBE/WAS/?wtrealm=urn%3aidsrv3&wctx=WsFedOwinState%3dAQAAANCMnd8BFdERjHoAwE_Cl-sBAAAAKYqQI0tuyEybDUm-s8rFZgAAAAACAAAAAAAQZgAAAAEAACAAAACQ2Jr1Wg1-jGDFDYub1o0RVaWNXwPAUaljbF5HQEn6ggAAAAAOgAAAAAIAACAAAADa007nD9qB9Bs2Jhw9lWLlfTS5GoQUvZm234LfiPe0VHAAAAD4U8c2k9-JRLupRN8GnvDsBlWVNs0bQPqePTlm9bKW91FuotzRYrlgmuR6TKCnzL0GZX9BN0yFLBuLFqjEDxqehnU8FP5QrEOVFpTUR3NltQ_eMmOkdzMlk-uDGEoWbvN4AqsdXhcST6apNRAsHq8IQAAAADdE157rHBNg4Z_MkhSFYsM2wnt1GeC2xeipILcpRADjJgCu7Rq0vGWDKRZRToJIJtkp-xNKOn-Mrrqlrf6DjTU&wa=wsignin1.0");
	    //	Thread.sleep(30000);
	    //	driver.switchTo().alert().accept();
		
		
		//------------------------------------
		        //Pop UPS
//		
//		Alert alt1=driver.switchTo().alert();
//			alt1.accept();
//			String letter=alt.getText();
//			System.out.println(letter);
//			
	//------------------------------------	
			//File Download
			
//		FirefoxProfile prof=new FirefoxProfile();
//		prof.setpreferences("browser.HelperApps.NeverAsk.SavetoDisk","application/zip");
//		prof.setpreferences("browser.downloads.folderlist",1); ->Downloads
//		prof.setpreferences("browser.downloads.folderlist",0);  -> Desktop
//		prof.setpreferences("browser.downloads.folderlist",2); ->Custom Folder
//		prof.setpreferences("browser.downloads.dir","path");
			
     //------------------------------------
			
			//Windows Handling
			
		
		 driver.get("https://www.air.irctc.co.in/"); 
		 driver.findElement(By.xpath("//a[text()=\"Hotel Stay\"]")).click();
		 
		 Set<String>allwindows=driver.getWindowHandles();
		Iterator<String>window=allwindows.iterator();
		String irtctc=window.next();
		System.out.println(irtctc);
		String hotel=window.next();
		System.out.println(hotel);
		
		driver.switchTo().window(hotel);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter hotel name or city name\"]")).sendKeys("Bangalore");
		WebElement Banghotel=driver.findElement(By.xpath("//div[@class=\"left_city\"]"));
		
		
			
	
		
		
		
		
		
		
	}

}

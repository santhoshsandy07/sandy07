package TestScripts;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.Login_pom;



public class BaseClass {

	public static File_Lib flb=new File_Lib();//This the Global Reference object of the Fil_Lib Class and with the help of this by using this object in the any of the below methods of the testNg methods we will be able to access the methods of the FIle Lib class 
	public static WebDriver driver;  //The driver here used as a static Reference (Globally variable)
	
	@BeforeSuite
    public void connectDB()
    {
        System.out.println("-----DB connection -----");
    }
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); /// certain action -> time waste will be the there even after the web element is found-> monitors the page loading to load all the elements in the web page -> implicit wait we have to define  the initial steps of the test scripts
		
		
	    //Explicit wait -> based on the condition -> if the particular condition is satisfied then it goes to the next webelement it wont montior the page overall or something but if the part web element is loaded then it will perform the action -> In the middle of the test script we can use it scrolling down > it wont wait for the entire  
		
		//Thread.sleep -> not for the good programming 	
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
	String Url=flb.Fetchingdatafromproperty("url");
	System.out.println(flb.Fetchingdatafromproperty("url")); // -> This print the URL
    driver.get(Url);
	System.out.println("The URL opened successfully");
	
	
	String Un=flb.Fetchingdatafromproperty("username");
	
	Login_pom lp = PageFactory.initElements(driver, Login_pom.class);  // to initialize the Webelemts in the POM we have to use the page factory class with the  initElemnts method
    lp.getusername().sendKeys(Un);
	
	//driver.findElement(By.xpath("//a[text()=\"Log In with a Different Username\"]")).click();
	//driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(Un);   
	System.out.println("The User Entered successfully");
	
	String pwd=flb.Fetchingdatafromproperty("password");
	lp.getpassword().sendKeys(pwd);
	//driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pwd);
	System.out.println("The Pwd Entered successfully");
	
	lp.getLogin().click();
	//driver.findElement(By.xpath("//input[@id=\"Login\"]")).click();
	
	//Thread.sleep(10000);
	//driver.switchTo().alert().dismiss(); 
	
	
	
	
	
	}
	
	
}

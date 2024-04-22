package handson;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountTest {
	
	WebDriver driver;
	
	AccountCreation ac;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 1)
	void login()
	{
		ac=new AccountCreation(driver);
		ac.setUserName("vedha@cognizant.com");
		ac.setPassword("sakthi@33");
		ac.setLogin();
	}
	
	@Test(priority = 2)
	void account()
	{
		ac.clickAccount();
		ac.clickNew();
		ac.setAccName("sivanika");
		ac.clickSave();
	}
	
 
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}

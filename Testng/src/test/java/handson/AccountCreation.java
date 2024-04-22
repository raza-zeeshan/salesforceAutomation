package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreation {
	
	public WebDriver driver;
	
	//constructor
	AccountCreation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElements Locators+identification
	@FindBy(id="username")
	WebElement txt_userName;
	
	@FindBy(id="password")
	WebElement txt_passWord;
	
	@FindBy(id="Login")
	WebElement btn_login;
	
	@FindBy(xpath ="//a[normalize-space()='Accounts']")
	WebElement btn_account;
	
	@FindBy(xpath ="//input[@title='New']")
	WebElement btn_new;
	
	@FindBy(xpath ="//input[@id='acc2']")
	WebElement txt_name;
	
	@FindBy(xpath ="//td[@id='topButtonRow']//input[@title='Save']")
	WebElement btn_save;
	
	
	//action Methods
	
	public void setUserName(String username)
	{
		txt_userName.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txt_passWord.sendKeys(password);
	}
	
	public void setLogin()
	{
		btn_login.click();
	}
	
	public void clickAccount()
	{
		btn_account.click();
	}
	
	public void clickNew()
	{
		btn_new.click();
	}
	
	public void setAccName(String name)
	{
		txt_name.sendKeys(name);
	}
	
	public void clickSave()
	{
		btn_save.click();
	}
	
	
	

	

}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//WebDriver driver;
	 public static LoginPage base;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	public WebElement UN()
	{
		return username;
	}
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	public WebElement PW()
	{
		return password;
	}
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	public WebElement Login()
	{
		return login;
	}
	
}

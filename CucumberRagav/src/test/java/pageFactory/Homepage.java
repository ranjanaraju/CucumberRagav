package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	WebDriver driver;
	@FindBy(id="logout")
	WebElement btn_logout;
	Homepage home;
	public Homepage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public void checkLogoutIsDisplayed()
	{
		if(btn_logout.isDisplayed())
		{
			System.out.println("LOGOUT IS DISPLAYED");

		}
		
	}
	

}

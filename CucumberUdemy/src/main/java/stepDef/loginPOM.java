package stepDef;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginPOM
{

		public static WebDriver driver=null;
		public static LoginPage L=null;

	@Given("^Entering the valid credentials$")
	public void entering_the_valid_credentials() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		L=new LoginPage(driver);
		driver.navigate().to("http://localhost/login.do");
	}

	@When("^Enter username and password$")
	public void enter_username_and_password() throws InterruptedException 
	{
		L.UN().sendKeys("admin");
		L.PW().sendKeys("manager");
		
	}
	@Then("^Click on login$")
	public void click_on_login() 
	{
	
		L.Login();
		driver.close();
	}


}

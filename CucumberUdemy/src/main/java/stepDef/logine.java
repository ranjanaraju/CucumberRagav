/*package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logine 
{
	WebDriver ch;

	@Given("^Entering the valid credentials$")
	public void entering_the_valid_credentials() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.navigate().to("http://localhost/login.do");
	}

	@When("^Enter username and password$")
	public void enter_username_and_password(DataTable table) 
	{
		List<List<String>> ss=table.raw();
		ch.findElement(By.name("username")).sendKeys(ss.get(0).get(0));
		ch.findElement(By.name("pwd")).sendKeys(ss.get(0).get(1));
	}

	@Then("^Click on login$")
	public void click_on_login() 
	{
		ch.findElement(By.xpath("//div[text()='Login ']")).click();
	}



}
*/
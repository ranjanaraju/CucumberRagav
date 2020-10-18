/*package stepDef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login2 
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

	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_username_and_password(String UN, String PW) throws InterruptedException 
	{
		Thread.sleep(2000);
		ch.findElement(By.name("username")).sendKeys(UN);
		ch.findElement(By.name("pwd")).sendKeys(PW);
	}

	@Then("^Click on login$")
	public void click_on_login() 
	{
		ch.findElement(By.xpath("//div[text()='Login ']")).click();
		ch.close();
	}




}
*/
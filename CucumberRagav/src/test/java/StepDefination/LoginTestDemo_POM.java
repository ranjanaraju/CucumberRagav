/*package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.loginclass;

public class LoginTestDemo_POM {
	WebDriver driver;
	loginclass login;
	@Given("browser is is open")
	public void browser_is_is_open() {
		System.out.println("=====I am inside LoginDemo_POM====");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://example.testproject.io/web/");

	}

	@Given("user is on Llogin page")
	public void user_is_on_Llogin_page() {
		 login=new loginclass(driver);
		System.out.println("User is sucessfull on the Login pg");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password ) throws InterruptedException {
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(2000);
		login.clickHere();
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("User Successfully Logged In");
		driver.close();
		driver.quit();
	}

}
*/
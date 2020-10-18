package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.Homepage;
import pageFactory.LoginPage_PF;

public class LoginTestDemo_PF {
	WebDriver driver;
	LoginPage_PF login;
	Homepage home;

	@Given("browser is is open")
	public void browser_is_is_open() {
		System.out.println("====i am inside login page factory===");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://example.testproject.io/web/");

	}

	@Given("user is on Llogin page")
	public void user_is_on_Llogin_page() {
		System.out.println("User is sucessfull on the Login pg");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password ) throws InterruptedException {
		
		login=new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(2000);
		login.clickBtn();
		/*driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
*/
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("User Successfully Logged In");
		Homepage home;
		home=new Homepage(driver);
		home.checkLogoutIsDisplayed();
		driver.close();
		driver.quit();
	}

}

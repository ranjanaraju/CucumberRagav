/*package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginTestDemo {
	WebDriver ch;
	@Given("browser is is open")
	public void browser_is_is_open() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.navigate().to("https://example.testproject.io/web/");

	}

	@Given("user is on Llogin page")
	public void user_is_on_Llogin_page() {
		System.out.println("User is sucessfull on the Login pg");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password ) throws InterruptedException {
		ch.findElement(By.id("name")).sendKeys(username);
		ch.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		ch.findElement(By.id("login")).sendKeys(Keys.ENTER);

	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("User Successfully Logged In");
		ch.close();
		ch.quit();
	}

}
*/
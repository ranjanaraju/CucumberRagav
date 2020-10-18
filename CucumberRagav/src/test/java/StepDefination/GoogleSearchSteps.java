/*package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	WebDriver ch;
	@Given("browser is open")
	public void browser_is_open() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.navigate().to("https://www.google.com/");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() 
	{
		System.out.println("User is on search page");
		String str=ch.getTitle();
		Assert.assertEquals(str, "Google");
		
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() {
		ch.findElement(By.name("q")).sendKeys("Krishna god images download");
	}

	@And("hits enters")
	public void hits_enters() {
		ch.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Search Results Displayed Sucessfully");
	}

}
*/
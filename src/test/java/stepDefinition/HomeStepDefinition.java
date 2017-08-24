package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeStepDefinition {

	WebDriver driver;
	
	@Given("^I go to Crazy Hat$")
	public void i_go_to_Crazy_Hat() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://ec2-35-176-202-196.eu-west-2.compute.amazonaws.com/CrazyHatProject/");
	}

	@Then("^I should be on Crazy Hat Home Page$")
	public void i_should_be_on_Crazy_Hat_Home_Page() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("CRAZY HATS")); 
		driver.close();
	}
	
}
